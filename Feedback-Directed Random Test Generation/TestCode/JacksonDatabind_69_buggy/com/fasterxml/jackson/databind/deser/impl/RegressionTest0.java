package com.fasterxml.jackson.databind.deser.impl;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla.TYPE_MAP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla.TYPE_HASH_MAP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_PROPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla.TYPE_COLLECTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_STRING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_DELEGATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createUsingDefault(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromLong(deserializationContext5, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDefault(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromString(deserializationContext5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        boolean boolean9 = vanilla7.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla7.getDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createUsingDelegate(deserializationContext5, (java.lang.Object) annotatedWithParams10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromLong(deserializationContext3, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla7.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingArrayDelegate();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10.0d, annotatedWithParams8, boolean12, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromObjectWith(deserializationContext4, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10.0, null, false, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10.0, null, false, 100, 10]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createUsingDelegate(deserializationContext5, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingArrayDelegate(deserializationContext4, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromInt(deserializationContext5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromLong(deserializationContext4, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromInt(deserializationContext3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromInt(deserializationContext6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromDouble(deserializationContext7, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingArrayDelegate(deserializationContext3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromString(deserializationContext8, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.String[] strArray6 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromObjectWith(deserializationContext5, (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDefault(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.String[] strArray7 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromObjectWith(deserializationContext6, (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromLong(deserializationContext8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromInt(deserializationContext3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromInt(deserializationContext4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDefault(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla8.getIncompleteParameter();
        boolean boolean10 = vanilla8.canCreateUsingDefault();
        boolean boolean11 = vanilla8.canCreateFromDouble();
        boolean boolean12 = vanilla8.canInstantiate();
        boolean boolean13 = vanilla8.canCreateFromObjectWith();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext6, (java.lang.Object) vanilla8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromBoolean(deserializationContext7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla6 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla6.getIncompleteParameter();
        boolean boolean8 = vanilla6.canCreateFromLong();
        boolean boolean9 = vanilla6.canCreateFromObjectWith();
        boolean boolean10 = vanilla6.canCreateFromDouble();
        boolean boolean11 = vanilla6.canCreateUsingArrayDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingDelegate(deserializationContext4, (java.lang.Object) vanilla6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromDouble(deserializationContext8, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromLong(deserializationContext5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDelegate(deserializationContext7, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.C_ARRAY_DELEGATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromBoolean(deserializationContext2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromInt(deserializationContext5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        boolean boolean13 = vanilla10.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla10.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla16 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter17 = vanilla16.getIncompleteParameter();
        java.lang.Object[] objArray19 = new java.lang.Object[] { vanilla10, annotatedParameter17, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createFromObjectWith(deserializationContext8, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNull(annotatedParameter17);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingArrayDelegate(deserializationContext5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla9.getDelegateType(deserializationConfig11);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla9.getDelegateType(deserializationConfig13);
        boolean boolean15 = vanilla9.canCreateFromLong();
        boolean boolean16 = vanilla9.canCreateFromObjectWith();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) vanilla9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDefault(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromDouble(deserializationContext11, (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromBoolean(deserializationContext7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromBoolean(deserializationContext4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla9.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla9.canCreateFromInt();
        boolean boolean14 = vanilla9.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla9.getDelegateCreator();
        boolean boolean16 = vanilla9.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingDelegate(deserializationContext7, (java.lang.Object) vanilla9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromBoolean(deserializationContext5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla8.getIncompleteParameter();
        boolean boolean10 = vanilla8.canInstantiate();
        boolean boolean11 = vanilla8.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) vanilla8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        boolean boolean14 = vanilla12.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla12.getWithArgsCreator();
        boolean boolean16 = vanilla12.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla12.getArrayDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext10, (java.lang.Object) vanilla12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(annotatedWithParams17);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.String[] strArray4 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromObjectWith(deserializationContext3, (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla11.getArrayDelegateCreator();
        boolean boolean13 = vanilla11.canCreateUsingArrayDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingArrayDelegate(deserializationContext9, (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromString(deserializationContext5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.String[] strArray10 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromObjectWith(deserializationContext9, (java.lang.Object[]) strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromString(deserializationContext7, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla4 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingArrayDelegate(deserializationContext2, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromString(deserializationContext7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromBoolean(deserializationContext8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.String[] strArray12 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromObjectWith(deserializationContext11, (java.lang.Object[]) strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromDouble(deserializationContext4, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromLong(deserializationContext3, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromDouble(deserializationContext3, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla7.getDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla7.canCreateFromInt();
        boolean boolean12 = vanilla7.canCreateUsingDefault();
        boolean boolean13 = vanilla7.canCreateFromObjectWith();
        boolean boolean14 = vanilla7.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingArrayDelegate(deserializationContext5, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromLong(deserializationContext9, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        boolean boolean14 = vanilla11.canCreateFromDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) vanilla11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        boolean boolean11 = vanilla9.canCreateFromLong();
        boolean boolean12 = vanilla9.canCreateFromObjectWith();
        boolean boolean13 = vanilla9.canCreateFromDouble();
        boolean boolean14 = vanilla9.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        java.lang.Class<?> wildcardClass10 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla13.getIncompleteParameter();
        boolean boolean15 = vanilla13.canCreateFromLong();
        boolean boolean16 = vanilla13.canCreateFromObjectWith();
        boolean boolean17 = vanilla13.canCreateFromInt();
        boolean boolean18 = vanilla13.canCreateFromString();
        boolean boolean19 = vanilla13.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createUsingArrayDelegate(deserializationContext11, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromString(deserializationContext6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        boolean boolean14 = vanilla12.canCreateUsingDefault();
        boolean boolean15 = vanilla12.canCreateFromDouble();
        boolean boolean16 = vanilla12.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingDelegate(deserializationContext10, (java.lang.Object) vanilla12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createUsingDelegate(deserializationContext5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDefault(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromString(deserializationContext8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromString(deserializationContext9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromDouble(deserializationContext10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createUsingArrayDelegate(deserializationContext2, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla9.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla9.canCreateFromInt();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext7, (java.lang.Object) vanilla9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.Class<?> wildcardClass5 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromBoolean(deserializationContext11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        java.lang.Class<?> wildcardClass5 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromString(deserializationContext7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromLong();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingArrayDelegate(deserializationContext10, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromLong(deserializationContext4, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(6);
        boolean boolean2 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromDouble(deserializationContext3, (double) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromDouble(deserializationContext7, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromString(deserializationContext8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDelegate(deserializationContext3, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromInt(deserializationContext8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDelegate(deserializationContext6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromString(deserializationContext7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromBoolean(deserializationContext3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromInt(deserializationContext3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        boolean boolean14 = vanilla12.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla12.getWithArgsCreator();
        boolean boolean16 = vanilla12.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingDelegate(deserializationContext10, (java.lang.Object) vanilla12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla12.getDelegateType(deserializationConfig14);
        boolean boolean16 = vanilla12.canCreateFromInt();
        boolean boolean17 = vanilla12.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter18 = vanilla12.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = vanilla1.createUsingArrayDelegate(deserializationContext10, (java.lang.Object) annotatedParameter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(annotatedParameter18);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingArrayDelegate(deserializationContext9, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromString(deserializationContext9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromString(deserializationContext2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.String[] strArray9 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromObjectWith(deserializationContext8, (java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        java.lang.Class<?> wildcardClass9 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromDouble(deserializationContext9, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromDouble(deserializationContext10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromBoolean(deserializationContext10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedParameter9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateFromString();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla10.getArrayDelegateCreator();
        boolean boolean12 = vanilla10.canCreateFromObjectWith();
        java.lang.String str13 = vanilla10.getValueTypeDesc();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Object" + "'", str13, "java.lang.Object");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        java.lang.String str4 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDefault(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Object" + "'", str4, "java.lang.Object");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromBoolean(deserializationContext6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromString(deserializationContext2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(6);
        boolean boolean2 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla5 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla5.getIncompleteParameter();
        boolean boolean7 = vanilla5.canCreateFromLong();
        boolean boolean8 = vanilla5.canCreateFromObjectWith();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingArrayDelegate(deserializationContext3, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla1.getDelegateType(deserializationConfig12);
        boolean boolean14 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createFromDouble(deserializationContext15, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromString(deserializationContext6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromString(deserializationContext8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getArrayDelegateType(deserializationConfig11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromInt(deserializationContext13, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromLong(deserializationContext5, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromBoolean(deserializationContext8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingArrayDelegate(deserializationContext6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromLong(deserializationContext5, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromBoolean(deserializationContext7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createUsingDefault(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        java.lang.Class<?> wildcardClass6 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromBoolean(deserializationContext6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        boolean boolean14 = vanilla12.canCreateFromLong();
        boolean boolean15 = vanilla12.canCreateFromObjectWith();
        boolean boolean16 = vanilla12.canCreateFromInt();
        boolean boolean17 = vanilla12.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = vanilla12.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter19 = vanilla12.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter20 = vanilla12.getIncompleteParameter();
        boolean boolean21 = vanilla12.canCreateUsingArrayDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = vanilla1.createUsingDelegate(deserializationContext10, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(annotatedWithParams18);
        org.junit.Assert.assertNull(annotatedParameter19);
        org.junit.Assert.assertNull(annotatedParameter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromString(deserializationContext9, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        boolean boolean11 = vanilla9.canCreateFromLong();
        boolean boolean12 = vanilla9.canCreateFromObjectWith();
        boolean boolean13 = vanilla9.canCreateFromInt();
        boolean boolean14 = vanilla9.canCreateFromString();
        boolean boolean15 = vanilla9.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromLong();
        boolean boolean5 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        boolean boolean5 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla8.getIncompleteParameter();
        boolean boolean10 = vanilla8.canCreateUsingDefault();
        boolean boolean11 = vanilla8.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla8.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla8.getArrayDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext6, (java.lang.Object) vanilla8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedWithParams13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromBoolean(deserializationContext7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromLong(deserializationContext5, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) vanilla8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromDouble(deserializationContext2, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromString(deserializationContext7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.String[] strArray13 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromObjectWith(deserializationContext12, (java.lang.Object[]) strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromLong(deserializationContext2, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromLong(deserializationContext10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createUsingDefault(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromString(deserializationContext6, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canCreateFromLong();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla16 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(4);
        boolean boolean17 = vanilla16.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = vanilla16.getDelegateType(deserializationConfig18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createUsingDelegate(deserializationContext14, (java.lang.Object) deserializationConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(javaType19);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla7.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla7.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla7.canCreateFromLong();
        boolean boolean14 = vanilla7.canCreateFromObjectWith();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingArrayDelegate(deserializationContext5, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromLong(deserializationContext10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla5 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla5.getIncompleteParameter();
        boolean boolean7 = vanilla5.canCreateUsingDefault();
        boolean boolean8 = vanilla5.canCreateFromDouble();
        boolean boolean9 = vanilla5.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingArrayDelegate(deserializationContext3, (java.lang.Object) vanilla5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromString(deserializationContext6, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        boolean boolean11 = vanilla9.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla9.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla9.getIncompleteParameter();
        boolean boolean14 = vanilla9.canInstantiate();
        boolean boolean15 = vanilla9.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createUsingDelegate(deserializationContext7, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canCreateFromLong();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromInt(deserializationContext14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray11 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromObjectWith(deserializationContext10, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla8.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla8.getFromObjectArguments(deserializationConfig10);
        boolean boolean12 = vanilla8.canCreateUsingDefault();
        boolean boolean13 = vanilla8.canCreateFromDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) vanilla8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.String[] strArray12 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromObjectWith(deserializationContext11, (java.lang.Object[]) strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromBoolean(deserializationContext6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromString(deserializationContext12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla9.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla9.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla9.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) annotatedParameter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedParameter14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla6 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla8.getIncompleteParameter();
        boolean boolean10 = vanilla8.canCreateUsingDefault();
        boolean boolean11 = vanilla8.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla8.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla8.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla15 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = vanilla15.getIncompleteParameter();
        boolean boolean17 = vanilla15.canCreateFromLong();
        boolean boolean18 = vanilla15.canCreateFromObjectWith();
        boolean boolean19 = vanilla15.canCreateFromInt();
        boolean boolean20 = vanilla15.canCreateFromString();
        boolean boolean21 = vanilla15.canCreateFromString();
        java.lang.String str22 = vanilla15.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig23 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray24 = vanilla15.getFromObjectArguments(deserializationConfig23);
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla26 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter27 = vanilla26.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = vanilla26.getDelegateType(deserializationConfig28);
        boolean boolean30 = vanilla26.canCreateFromInt();
        boolean boolean31 = vanilla26.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams32 = vanilla26.getDelegateCreator();
        java.lang.String str33 = vanilla26.getValueTypeDesc();
        boolean boolean34 = vanilla26.canCreateFromString();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla36 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter37 = vanilla36.getIncompleteParameter();
        boolean boolean38 = vanilla36.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams39 = vanilla36.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig40 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray41 = vanilla36.getFromObjectArguments(deserializationConfig40);
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla43 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter44 = vanilla43.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig45 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray46 = vanilla43.getFromObjectArguments(deserializationConfig45);
        boolean boolean47 = vanilla43.canCreateUsingDefault();
        boolean boolean48 = vanilla43.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig49 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray50 = vanilla43.getFromObjectArguments(deserializationConfig49);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (byte) -1, annotatedWithParams13, deserializationConfig23, vanilla26, deserializationConfig40, vanilla43 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = vanilla1.createFromObjectWith(deserializationContext4, objArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedParameter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.Object" + "'", str22, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray24);
        org.junit.Assert.assertNull(annotatedParameter27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(annotatedWithParams32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.Object" + "'", str33, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(annotatedParameter37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(annotatedWithParams39);
        org.junit.Assert.assertNull(settableBeanPropertyArray41);
        org.junit.Assert.assertNull(annotatedParameter44);
        org.junit.Assert.assertNull(settableBeanPropertyArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray50);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createUsingArrayDelegate(deserializationContext9, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = vanilla1.createUsingDefault(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla6 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla6.getIncompleteParameter();
        boolean boolean8 = vanilla6.canCreateUsingDefault();
        boolean boolean9 = vanilla6.canCreateFromDouble();
        boolean boolean10 = vanilla6.canCreateFromString();
        java.lang.String str11 = vanilla6.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla6.getWithArgsCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla14 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = vanilla14.getIncompleteParameter();
        boolean boolean16 = vanilla14.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla14.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray19 = vanilla14.getFromObjectArguments(deserializationConfig18);
        boolean boolean20 = vanilla14.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = vanilla14.getDelegateCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla23 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter24 = vanilla23.getIncompleteParameter();
        boolean boolean25 = vanilla23.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams26 = vanilla23.getWithArgsCreator();
        boolean boolean27 = vanilla23.canInstantiate();
        java.lang.String str28 = vanilla23.getValueTypeDesc();
        boolean boolean29 = vanilla23.canCreateFromString();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla31 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(4);
        java.lang.Object[] objArray32 = new java.lang.Object[] { vanilla6, annotatedWithParams21, vanilla23, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = vanilla1.createFromObjectWith(deserializationContext4, objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertNull(settableBeanPropertyArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(annotatedWithParams21);
        org.junit.Assert.assertNull(annotatedParameter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(annotatedWithParams26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.Object" + "'", str28, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla14 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = vanilla14.getIncompleteParameter();
        boolean boolean16 = vanilla14.canCreateFromLong();
        boolean boolean17 = vanilla14.canCreateFromObjectWith();
        boolean boolean18 = vanilla14.canCreateFromDouble();
        boolean boolean19 = vanilla14.canCreateUsingArrayDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createUsingDelegate(deserializationContext12, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        boolean boolean13 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla1.getArrayDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla18 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter19 = vanilla18.getIncompleteParameter();
        boolean boolean20 = vanilla18.canCreateUsingDefault();
        boolean boolean21 = vanilla18.canCreateFromDouble();
        boolean boolean22 = vanilla18.canCreateFromString();
        java.lang.String str23 = vanilla18.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = vanilla18.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = vanilla18.getDelegateType(deserializationConfig25);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = vanilla18.getDefaultCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla29 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter30 = vanilla29.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = vanilla29.getDelegateType(deserializationConfig31);
        boolean boolean33 = vanilla29.canCreateFromInt();
        boolean boolean34 = vanilla29.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams35 = vanilla29.getDelegateCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla37 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter38 = vanilla37.getIncompleteParameter();
        boolean boolean39 = vanilla37.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams40 = vanilla37.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter41 = vanilla37.getIncompleteParameter();
        boolean boolean42 = vanilla37.canInstantiate();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla44 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter45 = vanilla44.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = vanilla44.getDelegateType(deserializationConfig46);
        boolean boolean48 = vanilla44.canCreateFromInt();
        boolean boolean49 = vanilla44.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams50 = vanilla44.getDelegateCreator();
        boolean boolean51 = vanilla44.canCreateUsingDefault();
        boolean boolean52 = vanilla44.canCreateUsingArrayDelegate();
        java.lang.Object[] objArray53 = new java.lang.Object[] { vanilla18, annotatedWithParams35, vanilla37, vanilla44 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = vanilla1.createFromObjectWith(deserializationContext16, objArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(annotatedParameter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.Object" + "'", str23, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams24);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(annotatedWithParams27);
        org.junit.Assert.assertNull(annotatedParameter30);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(annotatedWithParams35);
        org.junit.Assert.assertNull(annotatedParameter38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(annotatedWithParams40);
        org.junit.Assert.assertNull(annotatedParameter41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(annotatedParameter45);
        org.junit.Assert.assertNull(javaType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(annotatedWithParams50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromDouble(deserializationContext7, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromString(deserializationContext8, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromLong();
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromBoolean(deserializationContext6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromBoolean(deserializationContext7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromLong(deserializationContext13, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromDouble(deserializationContext3, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean9 = vanilla8.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) vanilla8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        boolean boolean9 = vanilla7.canCreateUsingDefault();
        boolean boolean10 = vanilla7.canCreateFromDouble();
        boolean boolean11 = vanilla7.canCreateFromString();
        java.lang.String str12 = vanilla7.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla7.getWithArgsCreator();
        java.lang.Object[] objArray14 = new java.lang.Object[] { vanilla7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromObjectWith(deserializationContext5, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromString(deserializationContext12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromDouble(deserializationContext8, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateFromString();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla10.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla10.getArrayDelegateType(deserializationConfig14);
        java.lang.String str16 = vanilla10.getValueTypeDesc();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingArrayDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Object" + "'", str16, "java.lang.Object");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromLong(deserializationContext8, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromBoolean(deserializationContext8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla9.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla9.canCreateFromInt();
        boolean boolean14 = vanilla9.canCreateUsingDefault();
        boolean boolean15 = vanilla9.canCreateUsingDefault();
        boolean boolean16 = vanilla9.canCreateFromBoolean();
        boolean boolean17 = vanilla9.canCreateUsingArrayDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) vanilla9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla1.getDelegateType(deserializationConfig12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromBoolean(deserializationContext14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        boolean boolean14 = vanilla11.canCreateFromDouble();
        boolean boolean15 = vanilla11.canCreateFromString();
        java.lang.String str16 = vanilla11.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla11.getWithArgsCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) annotatedWithParams17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Object" + "'", str16, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams17);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        boolean boolean8 = vanilla1.canInstantiate();
        java.lang.Class<?> wildcardClass9 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.String[] strArray12 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromObjectWith(deserializationContext11, (java.lang.Object[]) strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromInt(deserializationContext2, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromInt();
        boolean boolean10 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromInt(deserializationContext5, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canInstantiate();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromString(deserializationContext4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromInt(deserializationContext10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        java.lang.Class<?> wildcardClass7 = vanilla1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canCreateFromLong();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingDefault(deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromLong(deserializationContext4, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromLong(deserializationContext10, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla9.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla9.canCreateFromObjectWith();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingArrayDelegate(deserializationContext10, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromString(deserializationContext3, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.String[] strArray9 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromObjectWith(deserializationContext8, (java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.String[] strArray9 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromObjectWith(deserializationContext8, (java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromDouble(deserializationContext8, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canInstantiate();
        java.lang.Class<?> wildcardClass9 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla15 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = vanilla15.getIncompleteParameter();
        boolean boolean17 = vanilla15.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams18 = vanilla15.getWithArgsCreator();
        boolean boolean19 = vanilla15.canInstantiate();
        boolean boolean20 = vanilla15.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = vanilla15.getWithArgsCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = vanilla1.createUsingArrayDelegate(deserializationContext13, (java.lang.Object) vanilla15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedParameter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(annotatedWithParams18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(annotatedWithParams21);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.Class<?> wildcardClass8 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromDouble(deserializationContext12, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        boolean boolean13 = vanilla11.canCreateFromLong();
        boolean boolean14 = vanilla11.canCreateFromObjectWith();
        boolean boolean15 = vanilla11.canCreateFromInt();
        boolean boolean16 = vanilla11.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray18 = vanilla11.getFromObjectArguments(deserializationConfig17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) settableBeanPropertyArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        java.lang.Class<?> wildcardClass8 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla11.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla11.getDefaultCreator();
        boolean boolean14 = vanilla11.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla11.getArrayDelegateCreator();
        boolean boolean16 = vanilla11.canCreateFromString();
        boolean boolean17 = vanilla11.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        boolean boolean13 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla16 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter17 = vanilla16.getIncompleteParameter();
        boolean boolean18 = vanilla16.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = vanilla16.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter20 = vanilla16.getIncompleteParameter();
        boolean boolean21 = vanilla16.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = vanilla1.createUsingDelegate(deserializationContext14, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedParameter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(annotatedWithParams19);
        org.junit.Assert.assertNull(annotatedParameter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canInstantiate();
        boolean boolean10 = vanilla1.canInstantiate();
        boolean boolean11 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromString(deserializationContext12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        boolean boolean5 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createUsingDefault(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla10.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray15 = vanilla10.getFromObjectArguments(deserializationConfig14);
        boolean boolean16 = vanilla10.canCreateFromDouble();
        boolean boolean17 = vanilla10.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingArrayDelegate(deserializationContext8, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(settableBeanPropertyArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromBoolean(deserializationContext2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromBoolean(deserializationContext8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromLong(deserializationContext9, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromString(deserializationContext9, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingDefault(deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla12.getDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla12.getDelegateType(deserializationConfig16);
        boolean boolean18 = vanilla12.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = vanilla12.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = vanilla12.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = vanilla12.getDefaultCreator();
        java.lang.Class<?> wildcardClass22 = vanilla12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = vanilla1.createUsingDelegate(deserializationContext10, (java.lang.Object) vanilla12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(annotatedWithParams19);
        org.junit.Assert.assertNull(annotatedWithParams20);
        org.junit.Assert.assertNull(annotatedWithParams21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromDouble(deserializationContext9, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla13.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla13.getDelegateType(deserializationConfig15);
        boolean boolean17 = vanilla13.canCreateFromInt();
        boolean boolean18 = vanilla13.canCreateUsingDefault();
        boolean boolean19 = vanilla13.canCreateFromObjectWith();
        java.lang.Class<?> wildcardClass20 = vanilla13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = vanilla1.createUsingArrayDelegate(deserializationContext11, (java.lang.Object) vanilla13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = annotatedParameter11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla11.getDelegateType(deserializationConfig13);
        boolean boolean15 = vanilla11.canCreateFromInt();
        boolean boolean16 = vanilla11.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla11.getDelegateCreator();
        boolean boolean18 = vanilla11.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getArrayDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromInt(deserializationContext14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        boolean boolean4 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromInt(deserializationContext5, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedParameter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromInt(deserializationContext8, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(4);
        boolean boolean2 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromBoolean(deserializationContext3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromLong(deserializationContext8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla5 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla5.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla5.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla5.getDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla5.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla5.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla5.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla5.getDefaultCreator();
        java.lang.Class<?> wildcardClass15 = vanilla5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createUsingArrayDelegate(deserializationContext3, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        boolean boolean13 = vanilla10.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla10.getDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla10.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla10.getArrayDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext8, (java.lang.Object) annotatedWithParams17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertNull(annotatedWithParams17);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.String[] strArray6 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromObjectWith(deserializationContext5, (java.lang.Object[]) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 100);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createFromString(deserializationContext2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canCreateFromLong();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromDouble(deserializationContext14, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateFromString();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        java.lang.Class<?> wildcardClass8 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromString(deserializationContext3, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean14 = vanilla13.canCreateFromDouble();
        boolean boolean15 = vanilla13.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla13.getDelegateCreator();
        boolean boolean17 = vanilla13.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext11, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray11 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromObjectWith(deserializationContext10, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla13.getIncompleteParameter();
        boolean boolean15 = vanilla13.canCreateFromLong();
        boolean boolean16 = vanilla13.canCreateFromObjectWith();
        boolean boolean17 = vanilla13.canCreateFromDouble();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla19 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter20 = vanilla19.getIncompleteParameter();
        boolean boolean21 = vanilla19.canCreateUsingDefault();
        boolean boolean22 = vanilla19.canCreateFromDouble();
        boolean boolean23 = vanilla19.canInstantiate();
        boolean boolean24 = vanilla19.canCreateFromObjectWith();
        boolean boolean25 = vanilla19.canCreateFromBoolean();
        java.lang.Class<?> wildcardClass26 = vanilla19.getClass();
        java.lang.Object[] objArray27 = new java.lang.Object[] { vanilla13, wildcardClass26 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = vanilla1.createFromObjectWith(deserializationContext11, objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(annotatedParameter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDefault(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla10.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla10.getDefaultCreator();
        boolean boolean13 = vanilla10.canCreateFromInt();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromLong();
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromLong(deserializationContext8, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromString(deserializationContext6, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(annotatedWithParams5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla13.getIncompleteParameter();
        boolean boolean15 = vanilla13.canCreateUsingDefault();
        boolean boolean16 = vanilla13.canCreateFromDouble();
        boolean boolean17 = vanilla13.canInstantiate();
        boolean boolean18 = vanilla13.canCreateFromDouble();
        java.lang.String str19 = vanilla13.getValueTypeDesc();
        boolean boolean20 = vanilla13.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = vanilla1.createUsingArrayDelegate(deserializationContext11, (java.lang.Object) vanilla13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.Object" + "'", str19, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canInstantiate();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromDouble(deserializationContext4, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        boolean boolean13 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla1.getArrayDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createFromString(deserializationContext16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromLong();
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(2);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromLong(deserializationContext4, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter3);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromLong(deserializationContext9, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.Class<?> wildcardClass5 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromString(deserializationContext9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromLong(deserializationContext12, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingArrayDelegate(deserializationContext6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromString(deserializationContext7, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean4 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        boolean boolean9 = vanilla7.canCreateUsingDefault();
        boolean boolean10 = vanilla7.canCreateFromDouble();
        boolean boolean11 = vanilla7.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla7.getDelegateType(deserializationConfig12);
        boolean boolean14 = vanilla7.canCreateFromBoolean();
        boolean boolean15 = vanilla7.canCreateFromLong();
        boolean boolean16 = vanilla7.canCreateFromDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingArrayDelegate(deserializationContext5, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        boolean boolean11 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromInt(deserializationContext12, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canInstantiate();
        boolean boolean3 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromBoolean(deserializationContext5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromLong();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromInt(deserializationContext11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromString(deserializationContext5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromString(deserializationContext7, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromBoolean(deserializationContext11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(8);
        java.lang.Class<?> wildcardClass2 = vanilla1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        boolean boolean12 = vanilla1.canCreateUsingDelegate();
        boolean boolean13 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.String[] strArray15 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromObjectWith(deserializationContext14, (java.lang.Object[]) strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromDouble(deserializationContext9, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromInt(deserializationContext12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromBoolean(deserializationContext5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        boolean boolean9 = vanilla7.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla7.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla7.getFromObjectArguments(deserializationConfig11);
        boolean boolean13 = vanilla7.canCreateUsingArrayDelegate();
        boolean boolean14 = vanilla7.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingArrayDelegate(deserializationContext5, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromLong(deserializationContext5, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromInt(deserializationContext8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = annotatedWithParams9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromDouble(deserializationContext9, (double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(4);
        boolean boolean2 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla1.createUsingDefault(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromBoolean(deserializationContext7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromDouble(deserializationContext7, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromDouble(deserializationContext12, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(6);
        boolean boolean2 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createFromString(deserializationContext3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla15 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = vanilla15.getIncompleteParameter();
        boolean boolean17 = vanilla15.canCreateFromLong();
        boolean boolean18 = vanilla15.canCreateFromObjectWith();
        boolean boolean19 = vanilla15.canCreateFromDouble();
        boolean boolean20 = vanilla15.canCreateFromString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = vanilla1.createUsingDelegate(deserializationContext13, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = settableBeanPropertyArray4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla10.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla10.getDefaultCreator();
        boolean boolean13 = vanilla10.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla10.getArrayDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingArrayDelegate(deserializationContext8, (java.lang.Object) annotatedWithParams14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla13.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla13.getDelegateType(deserializationConfig15);
        boolean boolean17 = vanilla13.canCreateFromInt();
        boolean boolean18 = vanilla13.canCreateUsingDefault();
        boolean boolean19 = vanilla13.canCreateFromObjectWith();
        java.lang.String str20 = vanilla13.getValueTypeDesc();
        boolean boolean21 = vanilla13.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = vanilla13.getArrayDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = vanilla1.createUsingDelegate(deserializationContext11, (java.lang.Object) annotatedWithParams22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Object" + "'", str20, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(annotatedWithParams22);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = annotatedParameter2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla9.getArrayDelegateCreator();
        boolean boolean11 = vanilla9.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla9.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla9.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext7, (java.lang.Object) vanilla9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedParameter13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        boolean boolean12 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromInt(deserializationContext14, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromDouble(deserializationContext9, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromDouble(deserializationContext7, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDelegate(deserializationContext4, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean10 = vanilla9.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla9.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla9.canCreateFromObjectWith();
        java.lang.Object[] objArray14 = new java.lang.Object[] { vanilla9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromObjectWith(deserializationContext7, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        java.lang.Class<?> wildcardClass11 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromLong(deserializationContext10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object[] objArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromObjectWith(deserializationContext7, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canInstantiate();
        boolean boolean10 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromDouble(deserializationContext10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        boolean boolean4 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla7.getDelegateType(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla7.getDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla7.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla7.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla7.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter16 = vanilla7.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla7.getDefaultCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla19 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter20 = vanilla19.getIncompleteParameter();
        boolean boolean21 = vanilla19.canCreateFromLong();
        boolean boolean22 = vanilla19.canCreateFromObjectWith();
        boolean boolean23 = vanilla19.canCreateFromInt();
        boolean boolean24 = vanilla19.canCreateFromString();
        boolean boolean25 = vanilla19.canCreateFromString();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla27 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter28 = vanilla27.getIncompleteParameter();
        boolean boolean29 = vanilla27.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter30 = vanilla27.getIncompleteParameter();
        java.lang.Object[] objArray31 = new java.lang.Object[] { vanilla7, boolean25, annotatedParameter30 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = vanilla1.createFromObjectWith(deserializationContext5, objArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedParameter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertNull(annotatedParameter16);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertNull(annotatedParameter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(annotatedParameter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(annotatedParameter30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedWithParams6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromBoolean(deserializationContext10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getDelegateCreator();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        java.lang.String str14 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Object" + "'", str14, "java.lang.Object");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromString(deserializationContext8, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean13 = vanilla12.canInstantiate();
        boolean boolean14 = vanilla12.canCreateFromInt();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingDelegate(deserializationContext10, (java.lang.Object) vanilla12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromDouble(deserializationContext5, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromString();
        java.lang.String str12 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromDouble(deserializationContext13, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla11.getDelegateType(deserializationConfig13);
        boolean boolean15 = vanilla11.canCreateFromInt();
        boolean boolean16 = vanilla11.canCreateUsingDefault();
        boolean boolean17 = vanilla11.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromLong();
        java.lang.Class<?> wildcardClass7 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromDouble(deserializationContext7, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        boolean boolean14 = vanilla11.canCreateFromDouble();
        boolean boolean15 = vanilla11.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla11.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = vanilla11.getArrayDelegateType(deserializationConfig17);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = vanilla11.getDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) vanilla11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(annotatedWithParams19);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        boolean boolean11 = vanilla9.canCreateFromLong();
        boolean boolean12 = vanilla9.canCreateFromObjectWith();
        boolean boolean13 = vanilla9.canCreateFromInt();
        boolean boolean14 = vanilla9.canCreateFromString();
        boolean boolean15 = vanilla9.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla9.getArrayDelegateType(deserializationConfig16);
        boolean boolean18 = vanilla9.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = vanilla1.createUsingArrayDelegate(deserializationContext7, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromInt(deserializationContext12, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedParameter11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla10.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla10.getWithArgsCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        boolean boolean13 = vanilla10.canCreateFromDouble();
        boolean boolean14 = vanilla10.canInstantiate();
        boolean boolean15 = vanilla10.canCreateFromDouble();
        java.lang.String str16 = vanilla10.getValueTypeDesc();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingArrayDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Object" + "'", str16, "java.lang.Object");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromBoolean(deserializationContext11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canInstantiate();
        boolean boolean3 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromDouble(deserializationContext5, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) 10);
        boolean boolean2 = vanilla1.canCreateFromObjectWith();
        boolean boolean3 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromDouble(deserializationContext4, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) -1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla4 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla4.getIncompleteParameter();
        boolean boolean6 = vanilla4.canCreateUsingDefault();
        boolean boolean7 = vanilla4.canCreateFromDouble();
        boolean boolean8 = vanilla4.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla4.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean12 = vanilla11.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla11.getIncompleteParameter();
        boolean boolean14 = vanilla11.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla16 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter17 = vanilla16.getIncompleteParameter();
        boolean boolean18 = vanilla16.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter19 = vanilla16.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams20 = vanilla16.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig21 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray22 = vanilla16.getFromObjectArguments(deserializationConfig21);
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla24 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = vanilla24.getArrayDelegateCreator();
        boolean boolean26 = vanilla24.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams27 = vanilla24.getDefaultCreator();
        boolean boolean28 = vanilla24.canCreateUsingDelegate();
        java.lang.Object[] objArray29 = new java.lang.Object[] { vanilla4, boolean14, settableBeanPropertyArray22, boolean28 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = vanilla1.createFromObjectWith(deserializationContext2, (java.lang.Object[]) settableBeanPropertyArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(annotatedParameter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(annotatedParameter19);
        org.junit.Assert.assertNull(annotatedWithParams20);
        org.junit.Assert.assertNull(settableBeanPropertyArray22);
        org.junit.Assert.assertNull(annotatedWithParams25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(annotatedWithParams27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        boolean boolean14 = vanilla12.canCreateFromLong();
        boolean boolean15 = vanilla12.canCreateFromObjectWith();
        boolean boolean16 = vanilla12.canCreateFromDouble();
        boolean boolean17 = vanilla12.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla19 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter20 = vanilla19.getIncompleteParameter();
        boolean boolean21 = vanilla19.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = vanilla19.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla24 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter25 = vanilla24.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = vanilla24.getDelegateType(deserializationConfig26);
        boolean boolean28 = vanilla24.canCreateFromInt();
        boolean boolean29 = vanilla24.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams30 = vanilla24.getDelegateCreator();
        java.lang.String str31 = vanilla24.getValueTypeDesc();
        boolean boolean32 = vanilla24.canCreateFromBoolean();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla34 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean35 = vanilla34.canCreateFromLong();
        boolean boolean36 = vanilla34.canCreateUsingArrayDelegate();
        java.lang.Object[] objArray37 = new java.lang.Object[] { boolean17, vanilla19, boolean32, boolean36 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = vanilla1.createFromObjectWith(deserializationContext10, objArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(annotatedParameter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(annotatedWithParams22);
        org.junit.Assert.assertNull(annotatedParameter25);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(annotatedWithParams30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.Object" + "'", str31, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDefault(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        boolean boolean12 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDefault(deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getWithArgsCreator();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        java.lang.Class<?> wildcardClass8 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        boolean boolean13 = vanilla11.canCreateFromLong();
        boolean boolean14 = vanilla11.canCreateFromObjectWith();
        boolean boolean15 = vanilla11.canCreateFromInt();
        boolean boolean16 = vanilla11.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla11.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter18 = vanilla11.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter19 = vanilla11.getIncompleteParameter();
        boolean boolean20 = vanilla11.canCreateFromObjectWith();
        boolean boolean21 = vanilla11.canCreateUsingDelegate();
        boolean boolean22 = vanilla11.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) vanilla11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertNull(annotatedParameter18);
        org.junit.Assert.assertNull(annotatedParameter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        boolean boolean2 = vanilla1.canInstantiate();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromString(deserializationContext5, "java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromBoolean(deserializationContext10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromLong();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromLong(deserializationContext4, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromBoolean(deserializationContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromBoolean(deserializationContext5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        boolean boolean10 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDelegate(deserializationContext11, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromObjectWith(deserializationContext9, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDelegate(deserializationContext3, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromString(deserializationContext9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDefault(deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromLong(deserializationContext7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromInt(deserializationContext8, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla14 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter15 = vanilla14.getIncompleteParameter();
        boolean boolean16 = vanilla14.canCreateUsingDefault();
        boolean boolean17 = vanilla14.canCreateFromDouble();
        boolean boolean18 = vanilla14.canCreateUsingDelegate();
        boolean boolean19 = vanilla14.canCreateFromInt();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createUsingArrayDelegate(deserializationContext12, (java.lang.Object) vanilla14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        boolean boolean10 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromDouble(deserializationContext12, (double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromInt();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromLong(deserializationContext12, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromObjectWith(deserializationContext9, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingArrayDelegate(deserializationContext8, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromBoolean(deserializationContext6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla11.getDelegateType(deserializationConfig13);
        boolean boolean15 = vanilla11.canCreateFromInt();
        boolean boolean16 = vanilla11.canCreateUsingDefault();
        boolean boolean17 = vanilla11.canCreateUsingDefault();
        boolean boolean18 = vanilla11.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = vanilla11.getDelegateType(deserializationConfig19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) javaType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(javaType20);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateFromLong();
        boolean boolean10 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromInt(deserializationContext11, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        boolean boolean8 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromBoolean(deserializationContext12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canInstantiate();
        boolean boolean3 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        boolean boolean6 = vanilla1.canCreateFromString();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla13.getIncompleteParameter();
        boolean boolean15 = vanilla13.canCreateUsingDefault();
        boolean boolean16 = vanilla13.canCreateFromString();
        java.lang.Class<?> wildcardClass17 = vanilla13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingArrayDelegate(deserializationContext11, (java.lang.Object) vanilla13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromLong(deserializationContext8, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        boolean boolean8 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDefault(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.String[] strArray10 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromObjectWith(deserializationContext9, (java.lang.Object[]) strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = annotatedWithParams8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromDouble(deserializationContext10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean12 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromDouble(deserializationContext13, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla7 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla7.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla7.getDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla7.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingDelegate(deserializationContext5, (java.lang.Object) vanilla7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromInt(deserializationContext11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromDouble(deserializationContext8, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromLong(deserializationContext10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedParameter9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromInt(deserializationContext13, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromInt(deserializationContext7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = vanilla1.createUsingDefault(deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        boolean boolean10 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromLong(deserializationContext5, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (short) -1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla4 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla4.getIncompleteParameter();
        boolean boolean6 = vanilla4.canCreateUsingDefault();
        boolean boolean7 = vanilla4.canCreateFromDouble();
        boolean boolean8 = vanilla4.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla4.getDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla4.canCreateFromBoolean();
        boolean boolean12 = vanilla4.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingArrayDelegate(deserializationContext2, (java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla13 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla13.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla13.getDelegateType(deserializationConfig15);
        boolean boolean17 = vanilla13.canCreateFromInt();
        boolean boolean18 = vanilla13.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams19 = vanilla13.getDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createUsingDelegate(deserializationContext11, (java.lang.Object) annotatedWithParams19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(annotatedWithParams19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromLong();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean13 = vanilla12.canCreateFromObjectWith();
        boolean boolean14 = vanilla12.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingArrayDelegate(deserializationContext10, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromString(deserializationContext12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        boolean boolean13 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromInt(deserializationContext14, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        boolean boolean13 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla1.getArrayDelegateType(deserializationConfig14);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = vanilla1.createFromBoolean(deserializationContext17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(annotatedWithParams16);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createFromDouble(deserializationContext7, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        boolean boolean7 = vanilla1.canCreateFromLong();
        boolean boolean8 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla11.getWithArgsCreator();
        boolean boolean15 = vanilla11.canInstantiate();
        boolean boolean16 = vanilla11.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla11.getDefaultCreator();
        boolean boolean18 = vanilla11.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla20 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter21 = vanilla20.getIncompleteParameter();
        boolean boolean22 = vanilla20.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = vanilla20.getWithArgsCreator();
        boolean boolean24 = vanilla20.canInstantiate();
        boolean boolean25 = vanilla20.canCreateFromDouble();
        boolean boolean26 = vanilla20.canCreateFromLong();
        java.lang.Object[] objArray27 = new java.lang.Object[] { vanilla11, boolean26 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = vanilla1.createFromObjectWith(deserializationContext9, objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(annotatedParameter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(annotatedWithParams23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createUsingArrayDelegate(deserializationContext9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromDouble(deserializationContext9, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createFromLong(deserializationContext4, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromLong(deserializationContext8, (long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        boolean boolean10 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.String[] strArray9 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromObjectWith(deserializationContext8, (java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla10.getDelegateType(deserializationConfig12);
        boolean boolean14 = vanilla10.canCreateFromInt();
        boolean boolean15 = vanilla10.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla10.getDelegateCreator();
        boolean boolean17 = vanilla10.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = vanilla10.getDelegateType(deserializationConfig18);
        boolean boolean20 = vanilla10.canCreateUsingArrayDelegate();
        boolean boolean21 = vanilla10.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = vanilla1.createUsingArrayDelegate(deserializationContext8, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getDelegateType(deserializationConfig11);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canInstantiate();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray11 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromObjectWith(deserializationContext10, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDelegateCreator();
        java.lang.Class<?> wildcardClass11 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromLong(deserializationContext9, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla1.createFromInt(deserializationContext5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateFromLong();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromString(deserializationContext8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        boolean boolean7 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingDelegate(deserializationContext11, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromBoolean(deserializationContext8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        java.lang.Class<?> wildcardClass8 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        boolean boolean12 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = vanilla1.createUsingDefault(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(6);
        java.lang.Class<?> wildcardClass2 = vanilla1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        boolean boolean11 = vanilla9.canInstantiate();
        boolean boolean12 = vanilla9.canInstantiate();
        java.lang.String str13 = vanilla9.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla9.getArrayDelegateCreator();
        boolean boolean15 = vanilla9.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createUsingDelegate(deserializationContext7, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Object" + "'", str13, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getArrayDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla10.getDelegateType(deserializationConfig12);
        boolean boolean14 = vanilla10.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla10.getArrayDelegateType(deserializationConfig15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = vanilla1.createUsingDelegate(deserializationContext8, (java.lang.Object) deserializationConfig15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla8.getIncompleteParameter();
        boolean boolean10 = vanilla8.canCreateUsingDefault();
        boolean boolean11 = vanilla8.canCreateFromDouble();
        boolean boolean12 = vanilla8.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingArrayDelegate(deserializationContext6, (java.lang.Object) vanilla8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateFromLong();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        boolean boolean8 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromLong();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromBoolean(deserializationContext10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromDouble(deserializationContext6, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        java.lang.Class<?> wildcardClass4 = vanilla1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(4);
        boolean boolean2 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createUsingDefault(deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedParameter9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        java.lang.Class<?> wildcardClass11 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateFromLong();
        java.lang.Class<?> wildcardClass10 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean10 = vanilla9.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla9.getFromObjectArguments(deserializationConfig11);
        boolean boolean13 = vanilla9.canCreateFromLong();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext7, (java.lang.Object) vanilla9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla11.getDelegateType(deserializationConfig13);
        boolean boolean15 = vanilla11.canCreateFromInt();
        boolean boolean16 = vanilla11.canCreateUsingDefault();
        boolean boolean17 = vanilla11.canCreateUsingDefault();
        boolean boolean18 = vanilla11.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = vanilla1.createUsingDelegate(deserializationContext9, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla9 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla9.getIncompleteParameter();
        boolean boolean11 = vanilla9.canCreateUsingDefault();
        boolean boolean12 = vanilla9.canCreateFromDouble();
        boolean boolean13 = vanilla9.canCreateFromString();
        java.lang.String str14 = vanilla9.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla9.getWithArgsCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createUsingDelegate(deserializationContext7, (java.lang.Object) vanilla9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Object" + "'", str14, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateFromString();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla12.getDelegateType(deserializationConfig14);
        boolean boolean16 = vanilla12.canCreateFromInt();
        boolean boolean17 = vanilla12.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter18 = vanilla12.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = vanilla12.getDelegateType(deserializationConfig19);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = vanilla12.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams22 = vanilla12.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams23 = vanilla12.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams24 = vanilla12.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams25 = vanilla12.getDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = vanilla1.createUsingArrayDelegate(deserializationContext10, (java.lang.Object) annotatedWithParams25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(annotatedParameter18);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(annotatedWithParams21);
        org.junit.Assert.assertNull(annotatedWithParams22);
        org.junit.Assert.assertNull(annotatedWithParams23);
        org.junit.Assert.assertNull(annotatedWithParams24);
        org.junit.Assert.assertNull(annotatedWithParams25);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromLong(deserializationContext12, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(annotatedParameter10);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDefault(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray11 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.TYPE_DESCS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromObjectWith(deserializationContext10, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createUsingDefault(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromLong(deserializationContext10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromInt();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getArrayDelegateType(deserializationConfig9);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromString(deserializationContext6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        java.lang.Class<?> wildcardClass8 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        boolean boolean10 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingDefault(deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean12 = vanilla1.canInstantiate();
        boolean boolean13 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromDouble(deserializationContext14, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        boolean boolean10 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        boolean boolean12 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromInt(deserializationContext13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createUsingDefault(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = annotatedWithParams9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        boolean boolean7 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromString(deserializationContext10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = vanilla1.createUsingDefault(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla6 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla6.getIncompleteParameter();
        boolean boolean8 = vanilla6.canCreateFromLong();
        boolean boolean9 = vanilla6.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        boolean boolean13 = vanilla11.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla11.getWithArgsCreator();
        boolean boolean15 = vanilla11.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla11.getArrayDelegateCreator();
        boolean boolean17 = vanilla11.canCreateFromString();
        boolean boolean18 = vanilla11.canCreateUsingDefault();
        java.lang.Object[] objArray19 = new java.lang.Object[] { vanilla6, boolean18 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createFromObjectWith(deserializationContext4, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canInstantiate();
        boolean boolean7 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla11 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla11.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createUsingArrayDelegate(deserializationContext9, (java.lang.Object) annotatedParameter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedParameter12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromLong(deserializationContext6, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla10.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla10.getIncompleteParameter();
        boolean boolean15 = vanilla10.canCreateFromLong();
        boolean boolean16 = vanilla10.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla10.getDefaultCreator();
        boolean boolean18 = vanilla10.canCreateFromLong();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = vanilla1.createUsingArrayDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedWithParams17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        boolean boolean11 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromDouble(deserializationContext13, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createUsingDefault(deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla10.getDelegateType(deserializationConfig12);
        boolean boolean14 = vanilla10.canCreateFromBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createUsingDelegate(deserializationContext8, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }
}

