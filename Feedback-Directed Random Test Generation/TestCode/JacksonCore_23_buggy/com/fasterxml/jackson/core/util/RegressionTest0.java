package com.fasterxml.jackson.core.util;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter1.writeEndObject(jsonGenerator2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter1.writeRootValueSeparator(jsonGenerator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter1.writeEndObject(jsonGenerator4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3.withRootSeparator(serializableString4);
        boolean boolean6 = defaultPrettyPrinter3._spacesInObjectEntries;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter3.writeEndObject(jsonGenerator7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3.withRootSeparator(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter nopIndenter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter();
        defaultPrettyPrinter3.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) nopIndenter6);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3._withSpaces(false);
        boolean boolean6 = defaultPrettyPrinter3._spacesInObjectEntries;
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3._withSpaces(false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter5.beforeArrayValues(jsonGenerator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        boolean boolean4 = defaultPrettyPrinter1._spacesInObjectEntries;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter nopIndenter5 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter.instance;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        nopIndenter5.writeIndentation(jsonGenerator6, (int) '4');
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter9 = defaultPrettyPrinter1.withObjectIndenter((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) nopIndenter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nopIndenter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter nopIndenter0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter.instance;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = null;
        nopIndenter0.writeIndentation(jsonGenerator1, (int) '4');
        java.lang.Class<?> wildcardClass4 = nopIndenter0.getClass();
        org.junit.Assert.assertNotNull(nopIndenter0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3.withRootSeparator(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = defaultPrettyPrinter3.withSpacesInObjectEntries();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter3.writeObjectFieldValueSeparator(jsonGenerator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.core.util.Separators separators0 = com.fasterxml.jackson.core.PrettyPrinter.DEFAULT_SEPARATORS;
        org.junit.Assert.assertNotNull(separators0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter0.writeArrayValueSeparator(jsonGenerator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3.withRootSeparator(serializableString4);
        com.fasterxml.jackson.core.SerializableString serializableString6 = defaultPrettyPrinter5._rootSeparator;
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertNull(serializableString6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        int int2 = defaultPrettyPrinter1._nesting;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withoutSpacesInObjectEntries();
        int int2 = defaultPrettyPrinter0._nesting;
        java.lang.Class<?> wildcardClass3 = defaultPrettyPrinter0.getClass();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter nopIndenter0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter.instance;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = null;
        nopIndenter0.writeIndentation(jsonGenerator1, (int) '4');
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        nopIndenter0.writeIndentation(jsonGenerator4, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        nopIndenter0.writeIndentation(jsonGenerator7, (int) (byte) 0);
        org.junit.Assert.assertNotNull(nopIndenter0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3._withSpaces(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = defaultPrettyPrinter5.withSpacesInObjectEntries();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter6.writeEndArray(jsonGenerator7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withoutSpacesInObjectEntries();
        int int2 = defaultPrettyPrinter0._nesting;
        java.lang.String str3 = defaultPrettyPrinter0._objectFieldValueSeparatorWithSpaces;
        org.junit.Assert.assertNotNull(defaultPrettyPrinter1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " : " + "'", str3, " : ");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3._withSpaces(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter1.writeEndArray(jsonGenerator4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3._withSpaces(false);
        com.fasterxml.jackson.core.SerializableString serializableString6 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter3, serializableString6);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter9 = defaultPrettyPrinter7._withSpaces(false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter7.writeEndArray(jsonGenerator10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3.withRootSeparator(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = defaultPrettyPrinter3.withSpacesInObjectEntries();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter7 = defaultPrettyPrinter6.withSpacesInObjectEntries();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter6);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3._withSpaces(false);
        com.fasterxml.jackson.core.SerializableString serializableString6 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter3, serializableString6);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter nopIndenter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        nopIndenter8.writeIndentation(jsonGenerator9, (int) (short) 0);
        defaultPrettyPrinter3._arrayIndenter = nopIndenter8;
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        boolean boolean4 = defaultPrettyPrinter1._spacesInObjectEntries;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter1.writeStartArray(jsonGenerator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0._spacesInObjectEntries = false;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter nopIndenter3 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = defaultPrettyPrinter0.withArrayIndenter((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) nopIndenter3);
        org.junit.Assert.assertNotNull(nopIndenter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = defaultPrettyPrinter1.withoutSpacesInObjectEntries();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter1.withObjectIndenter(indenter2);
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = defaultPrettyPrinter3.withRootSeparator(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = defaultPrettyPrinter3.withSpacesInObjectEntries();
        defaultPrettyPrinter6._nesting = (byte) 0;
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter5);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter6);
    }
}

