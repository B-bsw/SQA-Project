package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        java.lang.Class<?> wildcardClass46 = inlineVariables45.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables39.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode16 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables44 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables46 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables48 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode16, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables48.process(node49, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode16 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode16.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        java.lang.Class<?> wildcardClass46 = mode15.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode16 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables44 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables46 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables48 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode16, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables48.process(node49, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode16 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode16.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        java.lang.Class<?> wildcardClass22 = inlineVariables21.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, true);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        java.lang.Class<?> wildcardClass22 = mode7.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode16 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables44 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables46 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables48 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode16, false);
        org.junit.Assert.assertTrue("'" + mode16 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode16.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, true);
        java.lang.Class<?> wildcardClass13 = inlineVariables12.getClass();
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables36.process(node37, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        java.lang.Class<?> wildcardClass43 = mode14.getClass();
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        java.lang.Class<?> wildcardClass43 = mode14.getClass();
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode17 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler16, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables47 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables49 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables51 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode17, true);
        org.junit.Assert.assertTrue("'" + mode17 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode17.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables42.process(node43, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, true);
        java.lang.Class<?> wildcardClass16 = inlineVariables15.getClass();
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables21.process(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode17 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler16, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables47 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables49 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables51 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode17, false);
        java.lang.Class<?> wildcardClass52 = mode17.getClass();
        org.junit.Assert.assertTrue("'" + mode17 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode17.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, false);
        java.lang.Class<?> wildcardClass16 = mode5.getClass();
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, false);
        java.lang.Class<?> wildcardClass16 = inlineVariables15.getClass();
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode16 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables44 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables46 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables48 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode16, false);
        org.junit.Assert.assertTrue("'" + mode16 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode16.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        java.lang.Class<?> wildcardClass22 = inlineVariables21.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables42.process(node43, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        java.lang.Class<?> wildcardClass46 = inlineVariables45.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables15.process(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables42.process(node43, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        java.lang.Class<?> wildcardClass19 = inlineVariables18.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = inlineVariables27.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables45.process(node46, node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        java.lang.Class<?> wildcardClass19 = inlineVariables18.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        java.lang.Class<?> wildcardClass22 = inlineVariables21.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        java.lang.Class<?> wildcardClass46 = inlineVariables45.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        java.lang.Class<?> wildcardClass22 = inlineVariables21.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables21.process(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        java.lang.Class<?> wildcardClass22 = mode7.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, true);
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, true);
        java.lang.Class<?> wildcardClass19 = inlineVariables18.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode16 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables44 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables46 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables48 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode16, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables48.process(node49, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode16 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode16.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        java.lang.Class<?> wildcardClass19 = mode6.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        java.lang.Class<?> wildcardClass43 = inlineVariables42.getClass();
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        java.lang.Class<?> wildcardClass46 = mode15.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode16 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode16, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables44 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables46 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode16, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables48 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode16, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables48.process(node49, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode16 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode16.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = mode8.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        java.lang.Class<?> wildcardClass19 = inlineVariables18.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        java.lang.Class<?> wildcardClass22 = mode7.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        java.lang.Class<?> wildcardClass19 = mode6.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables36.process(node37, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode17 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler16, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables47 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables49 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables51 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode17, false);
        org.junit.Assert.assertTrue("'" + mode17 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode17.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        java.lang.Class<?> wildcardClass46 = inlineVariables45.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, true);
        java.lang.Class<?> wildcardClass13 = mode4.getClass();
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, true);
        java.lang.Class<?> wildcardClass16 = mode5.getClass();
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, true);
        java.lang.Class<?> wildcardClass40 = mode13.getClass();
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables39.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        java.lang.Class<?> wildcardClass22 = mode7.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, true);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables39.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, true);
        java.lang.Class<?> wildcardClass19 = mode6.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, true);
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        java.lang.Class<?> wildcardClass46 = inlineVariables45.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = inlineVariables27.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables36.process(node37, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, true);
        java.lang.Class<?> wildcardClass19 = mode6.getClass();
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = inlineVariables24.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        java.lang.Class<?> wildcardClass22 = inlineVariables21.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        java.lang.Class<?> wildcardClass40 = mode13.getClass();
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables42.process(node43, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, true);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        java.lang.Class<?> wildcardClass25 = inlineVariables24.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        java.lang.Class<?> wildcardClass25 = inlineVariables24.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = mode8.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables36.process(node37, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = mode8.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables45.process(node46, node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = inlineVariables27.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        java.lang.Class<?> wildcardClass40 = inlineVariables39.getClass();
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, true);
        java.lang.Class<?> wildcardClass16 = inlineVariables15.getClass();
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        java.lang.Class<?> wildcardClass40 = mode13.getClass();
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        java.lang.Class<?> wildcardClass37 = mode12.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        java.lang.Class<?> wildcardClass28 = inlineVariables27.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables39.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, true);
        java.lang.Class<?> wildcardClass16 = mode5.getClass();
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        java.lang.Class<?> wildcardClass22 = mode7.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, true);
        java.lang.Class<?> wildcardClass40 = mode13.getClass();
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        java.lang.Class<?> wildcardClass22 = inlineVariables21.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        java.lang.Class<?> wildcardClass22 = inlineVariables21.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        java.lang.Class<?> wildcardClass46 = mode15.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables15.process(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode17 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler16, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables47 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables49 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables51 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode17, true);
        org.junit.Assert.assertTrue("'" + mode17 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode17.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, true);
        java.lang.Class<?> wildcardClass22 = mode7.getClass();
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        java.lang.Class<?> wildcardClass34 = inlineVariables33.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        java.lang.Class<?> wildcardClass40 = mode13.getClass();
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = inlineVariables24.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables15.process(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        java.lang.Class<?> wildcardClass25 = mode8.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables39.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, true);
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode13 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode13, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode13, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode13, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables39.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode13 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode13.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        java.lang.Class<?> wildcardClass43 = mode14.getClass();
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        java.lang.Class<?> wildcardClass43 = mode14.getClass();
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = inlineVariables30.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, true);
        java.lang.Class<?> wildcardClass31 = mode10.getClass();
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, true);
        java.lang.Class<?> wildcardClass28 = mode9.getClass();
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = inlineVariables24.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, false);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode14 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables38 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode14, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables40 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode14, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables42 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode14, true);
        org.junit.Assert.assertTrue("'" + mode14 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode14.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode17 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler16, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables47 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables49 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables51 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode17, false);
        java.lang.Class<?> wildcardClass52 = mode17.getClass();
        org.junit.Assert.assertTrue("'" + mode17 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode17.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode6 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode6, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode6, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode6, false);
        org.junit.Assert.assertTrue("'" + mode6 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode6.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, true);
        java.lang.Class<?> wildcardClass34 = mode11.getClass();
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, true);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode9 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode9, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode9, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode9, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode9 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode9.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode11 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode11, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode11, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode11, false);
        org.junit.Assert.assertTrue("'" + mode11 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode11.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }
}

