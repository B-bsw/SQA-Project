package com.fasterxml.jackson.databind.deser.impl;

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
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromObjectWith();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        boolean boolean11 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla1.getIncompleteParameter();
        boolean boolean14 = vanilla1.canCreateFromLong();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromString();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromDouble();
        boolean boolean13 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getArrayDelegateCreator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = annotatedWithParams14.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        boolean boolean4 = vanilla1.canCreateUsingDelegate();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        boolean boolean12 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray14 = vanilla1.getFromObjectArguments(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getDelegateCreator();
        boolean boolean16 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        boolean boolean4 = vanilla1.canInstantiate();
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla8 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla8.getIncompleteParameter();
        boolean boolean10 = vanilla8.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla8.getWithArgsCreator();
        boolean boolean12 = vanilla8.canCreateFromDouble();
        java.lang.String str13 = vanilla8.getValueTypeDesc();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDelegate(deserializationContext6, (java.lang.Object) str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Object" + "'", str13, "java.lang.Object");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean12 = vanilla1.canCreateFromBoolean();
        boolean boolean13 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getDelegateCreator();
        boolean boolean15 = vanilla1.canInstantiate();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getArrayDelegateCreator();
        boolean boolean13 = vanilla1.canCreateFromObjectWith();
        boolean boolean14 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getDefaultCreator();
        boolean boolean14 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla1.getDelegateType(deserializationConfig15);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams17 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(annotatedWithParams17);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
        boolean boolean9 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        boolean boolean12 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla1.getArrayDelegateType(deserializationConfig15);
        boolean boolean17 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        boolean boolean12 = vanilla1.canInstantiate();
        boolean boolean13 = vanilla1.canCreateUsingDefault();
        boolean boolean14 = vanilla1.canCreateFromLong();
        boolean boolean15 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(annotatedWithParams16);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(10);
        boolean boolean2 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter3 = vanilla1.getIncompleteParameter();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getDelegateType(deserializationConfig10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(annotatedParameter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray15 = vanilla12.getFromObjectArguments(deserializationConfig14);
        boolean boolean16 = vanilla12.canCreateUsingDefault();
        boolean boolean17 = vanilla12.canCreateFromDouble();
        java.lang.String str18 = vanilla12.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter19 = vanilla12.getIncompleteParameter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = vanilla1.createUsingArrayDelegate(deserializationContext10, (java.lang.Object) vanilla12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertNull(settableBeanPropertyArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.Object" + "'", str18, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedParameter19);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        java.lang.String str5 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateFromLong();
        boolean boolean10 = vanilla1.canInstantiate();
        boolean boolean11 = vanilla1.canCreateFromDouble();
        boolean boolean12 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.Object" + "'", str5, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        boolean boolean9 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        boolean boolean13 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray15 = vanilla1.getFromObjectArguments(deserializationConfig14);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray15);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla1.createUsingDefault(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter5 = vanilla1.getIncompleteParameter();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDefaultCreator();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedParameter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromLong();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        boolean boolean12 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla1.getIncompleteParameter();
        boolean boolean15 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createFromBoolean(deserializationContext16, true);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromString();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        boolean boolean11 = vanilla1.canCreateFromObjectWith();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        boolean boolean11 = vanilla1.canCreateUsingDelegate();
        boolean boolean12 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, 100L);
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
        org.junit.Assert.assertNull(annotatedParameter9);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        boolean boolean8 = vanilla1.canCreateFromLong();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getWithArgsCreator();
        boolean boolean12 = vanilla1.canCreateFromString();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromLong();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        boolean boolean9 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getArrayDelegateCreator();
        boolean boolean13 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createUsingArrayDelegate(deserializationContext14, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla1.getArrayDelegateType(deserializationConfig12);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getDefaultCreator();
        java.lang.Class<?> wildcardClass15 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        boolean boolean9 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getArrayDelegateCreator();
        boolean boolean13 = vanilla1.canCreateFromBoolean();
        boolean boolean14 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromDouble();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        boolean boolean11 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(4);
        boolean boolean2 = vanilla1.canCreateUsingDefault();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla1.createUsingDefault(deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown type 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getDelegateCreator();
        boolean boolean14 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getDefaultCreator();
        boolean boolean11 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedParameter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getArrayDelegateCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedParameter9);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = vanilla1.createFromLong(deserializationContext8, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromInt();
        boolean boolean9 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        boolean boolean12 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createUsingDefault(deserializationContext13);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla16 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter17 = vanilla16.getIncompleteParameter();
        boolean boolean18 = vanilla16.canCreateFromLong();
        boolean boolean19 = vanilla16.canCreateFromObjectWith();
        boolean boolean20 = vanilla16.canCreateFromDouble();
        boolean boolean21 = vanilla16.canCreateUsingArrayDelegate();
        boolean boolean22 = vanilla16.canCreateUsingArrayDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = vanilla1.createUsingArrayDelegate(deserializationContext14, (java.lang.Object) boolean22);
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
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedParameter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromInt();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray13 = vanilla1.getFromObjectArguments(deserializationConfig12);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(settableBeanPropertyArray13);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromBoolean();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray12 = vanilla1.getFromObjectArguments(deserializationConfig11);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray12);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getArrayDelegateCreator();
        boolean boolean10 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        boolean boolean14 = vanilla1.canCreateFromObjectWith();
        boolean boolean15 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla1.getWithArgsCreator();
        boolean boolean17 = vanilla1.canCreateUsingArrayDelegate();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDefaultCreator();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = vanilla1.getDelegateType(deserializationConfig9);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromBoolean();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        java.lang.String str9 = vanilla1.getValueTypeDesc();
        boolean boolean10 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.Object" + "'", str9, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromBoolean();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromLong();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        boolean boolean12 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray14 = vanilla1.getFromObjectArguments(deserializationConfig13);
        boolean boolean15 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla1.getArrayDelegateType(deserializationConfig16);
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
        org.junit.Assert.assertNull(settableBeanPropertyArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canInstantiate();
        java.lang.Class<?> wildcardClass8 = vanilla1.getClass();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter4 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canCreateFromLong();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla12 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla12.getIncompleteParameter();
        boolean boolean14 = vanilla12.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla12.getWithArgsCreator();
        java.lang.String str16 = vanilla12.getValueTypeDesc();
        boolean boolean17 = vanilla12.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext10, (java.lang.Object) vanilla12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedParameter4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.Object" + "'", str16, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateUsingDefault();
        boolean boolean8 = vanilla1.canCreateFromBoolean();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean11 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getDelegateType(deserializationConfig7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = vanilla1.createFromInt(deserializationContext9, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDefaultCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateFromLong();
        boolean boolean10 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getArrayDelegateType(deserializationConfig11);
        boolean boolean13 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = vanilla1.getArrayDelegateType(deserializationConfig7);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "default", "String", "int", "long", "double", "boolean", "delegate", "property-based" });
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        boolean boolean12 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromInt(deserializationContext13, 0);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        boolean boolean5 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        boolean boolean8 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getDefaultCreator();
        boolean boolean6 = vanilla1.canCreateFromInt();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean8 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(8);
        boolean boolean2 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray4 = vanilla1.getFromObjectArguments(deserializationConfig3);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        boolean boolean7 = vanilla1.canCreateFromString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        boolean boolean6 = vanilla1.canCreateFromDouble();
        boolean boolean7 = vanilla1.canCreateFromDouble();
        boolean boolean8 = vanilla1.canCreateFromInt();
        boolean boolean9 = vanilla1.canCreateFromString();
        boolean boolean10 = vanilla1.canCreateUsingDefault();
        boolean boolean11 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromDouble(deserializationContext12, (double) 0L);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean11 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getDelegateCreator();
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
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedWithParams14);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getArrayDelegateCreator();
        boolean boolean7 = vanilla1.canCreateFromString();
        boolean boolean8 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromBoolean();
        boolean boolean12 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla15 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla15.getArrayDelegateCreator();
        boolean boolean17 = vanilla15.canCreateUsingArrayDelegate();
        java.lang.String str18 = vanilla15.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = vanilla15.getArrayDelegateType(deserializationConfig19);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams21 = vanilla15.getDefaultCreator();
        boolean boolean22 = vanilla15.canInstantiate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = vanilla1.createUsingArrayDelegate(deserializationContext13, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.Object" + "'", str18, "java.lang.Object");
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(annotatedWithParams21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        boolean boolean10 = vanilla1.canCreateUsingArrayDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
            java.lang.Object obj15 = vanilla1.createFromString(deserializationContext13, "java.lang.Object");
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
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        boolean boolean13 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createFromBoolean(deserializationContext14, true);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams6 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDefaultCreator();
        boolean boolean9 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(annotatedWithParams6);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 100);
        boolean boolean2 = vanilla1.canCreateFromDouble();
        boolean boolean3 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = vanilla1.createFromBoolean(deserializationContext6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams3 = vanilla1.getDefaultCreator();
        boolean boolean4 = vanilla1.canInstantiate();
        boolean boolean5 = vanilla1.canCreateFromLong();
        boolean boolean6 = vanilla1.canCreateUsingDelegate();
        boolean boolean7 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getArrayDelegateCreator();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter10 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = vanilla1.createFromLong(deserializationContext11, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertNull(annotatedWithParams3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedParameter10);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter13 = vanilla1.getIncompleteParameter();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedParameter12);
        org.junit.Assert.assertNull(annotatedParameter13);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) -1);
        boolean boolean2 = vanilla1.canInstantiate();
        boolean boolean3 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getDelegateType(deserializationConfig6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getArrayDelegateType(deserializationConfig8);
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        boolean boolean11 = vanilla1.canInstantiate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getDelegateType(deserializationConfig5);
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams2 = vanilla1.getArrayDelegateCreator();
        boolean boolean3 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDefaultCreator();
        boolean boolean5 = vanilla1.canCreateUsingDelegate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = vanilla1.getArrayDelegateType(deserializationConfig6);
        boolean boolean8 = vanilla1.canInstantiate();
        boolean boolean9 = vanilla1.canCreateFromObjectWith();
        org.junit.Assert.assertNull(annotatedWithParams2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        boolean boolean11 = vanilla1.canCreateUsingDelegate();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams8 = vanilla1.getDelegateCreator();
        boolean boolean9 = vanilla1.canCreateUsingDefault();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = vanilla1.getArrayDelegateType(deserializationConfig12);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = vanilla1.getArrayDelegateType(deserializationConfig16);
        boolean boolean18 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNull(annotatedWithParams15);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromString();
        boolean boolean12 = vanilla1.canCreateFromDouble();
        boolean boolean13 = vanilla1.canCreateFromBoolean();
        java.lang.String str14 = vanilla1.getValueTypeDesc();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.Object" + "'", str14, "java.lang.Object");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter7 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = vanilla1.getDelegateType(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getDelegateType(deserializationConfig11);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedParameter7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromObjectWith();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        boolean boolean8 = vanilla1.canCreateFromString();
        boolean boolean9 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = vanilla1.getArrayDelegateType(deserializationConfig5);
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        boolean boolean8 = vanilla1.canCreateFromLong();
        boolean boolean9 = vanilla1.canCreateFromInt();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        java.lang.String str6 = vanilla1.getValueTypeDesc();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        boolean boolean10 = vanilla1.canCreateFromString();
        boolean boolean11 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.Object" + "'", str6, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedParameter12);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromInt();
        boolean boolean8 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getDefaultCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray11 = vanilla1.getFromObjectArguments(deserializationConfig10);
        boolean boolean12 = vanilla1.canCreateFromBoolean();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotatedWithParams9);
        org.junit.Assert.assertNull(settableBeanPropertyArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromLong();
        boolean boolean7 = vanilla1.canCreateFromBoolean();
        boolean boolean8 = vanilla1.canInstantiate();
        boolean boolean9 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams10 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        boolean boolean13 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla1.getDelegateType(deserializationConfig14);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.Object" + "'", str12, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromDouble();
        boolean boolean6 = vanilla1.canCreateFromString();
        java.lang.String str7 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray9 = vanilla1.getFromObjectArguments(deserializationConfig8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = vanilla1.getArrayDelegateType(deserializationConfig10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = vanilla1.createFromLong(deserializationContext12, 100L);
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
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromString();
        java.lang.String str10 = vanilla1.getValueTypeDesc();
        boolean boolean11 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray10 = vanilla1.getFromObjectArguments(deserializationConfig9);
        boolean boolean11 = vanilla1.canCreateFromString();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla1.getWithArgsCreator();
        boolean boolean14 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = vanilla1.createUsingDefault(deserializationContext15);
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
        org.junit.Assert.assertNull(settableBeanPropertyArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateFromLong();
        boolean boolean4 = vanilla1.canCreateFromObjectWith();
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromString();
        boolean boolean7 = vanilla1.canCreateFromString();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        boolean boolean10 = vanilla1.canCreateFromObjectWith();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams11 = vanilla1.getArrayDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter12 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromBoolean(deserializationContext13, true);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(annotatedWithParams11);
        org.junit.Assert.assertNull(annotatedParameter12);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateFromBoolean();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray8 = vanilla1.getFromObjectArguments(deserializationConfig7);
        boolean boolean9 = vanilla1.canCreateFromDouble();
        boolean boolean10 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(settableBeanPropertyArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        java.lang.String str11 = vanilla1.getValueTypeDesc();
        boolean boolean12 = vanilla1.canCreateFromInt();
        boolean boolean13 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean14 = vanilla1.canCreateUsingDelegate();
        boolean boolean15 = vanilla1.canCreateUsingDelegate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla(100);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = vanilla1.getDelegateType(deserializationConfig2);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canCreateFromLong();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter6 = vanilla1.getIncompleteParameter();
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(annotatedParameter6);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray6 = vanilla1.getFromObjectArguments(deserializationConfig5);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getArrayDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertNull(annotatedWithParams7);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams12 = vanilla1.getDefaultCreator();
        boolean boolean13 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean14 = vanilla1.canCreateFromLong();
        boolean boolean15 = vanilla1.canCreateFromInt();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedWithParams8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedWithParams12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = vanilla1.getArrayDelegateType(deserializationConfig11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = vanilla1.createFromBoolean(deserializationContext13, false);
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
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        boolean boolean11 = vanilla1.canCreateUsingDelegate();
        boolean boolean12 = vanilla1.canCreateFromDouble();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = vanilla1.getArrayDelegateType(deserializationConfig13);
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams15 = vanilla1.getDelegateCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(annotatedWithParams15);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams5 = vanilla1.getWithArgsCreator();
        boolean boolean6 = vanilla1.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams7 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla10 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter11 = vanilla10.getIncompleteParameter();
        boolean boolean12 = vanilla10.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams13 = vanilla10.getDelegateCreator();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter14 = vanilla10.getIncompleteParameter();
        boolean boolean15 = vanilla10.canCreateUsingArrayDelegate();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams16 = vanilla10.getArrayDelegateCreator();
        boolean boolean17 = vanilla10.canCreateUsingDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = vanilla1.createUsingDelegate(deserializationContext8, (java.lang.Object) vanilla10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(annotatedWithParams5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedWithParams7);
        org.junit.Assert.assertNull(annotatedParameter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(annotatedWithParams13);
        org.junit.Assert.assertNull(annotatedParameter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(annotatedWithParams16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        boolean boolean13 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams14 = vanilla1.getWithArgsCreator();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = vanilla1.getArrayDelegateType(deserializationConfig15);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(annotatedWithParams14);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        boolean boolean11 = vanilla1.canCreateUsingDelegate();
        boolean boolean12 = vanilla1.canInstantiate();
        boolean boolean13 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = vanilla1.getDelegateType(deserializationConfig14);
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertNull(settableBeanPropertyArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(annotatedWithParams10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams4 = vanilla1.getWithArgsCreator();
        boolean boolean5 = vanilla1.canInstantiate();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray7 = vanilla1.getFromObjectArguments(deserializationConfig6);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter8 = vanilla1.getIncompleteParameter();
        boolean boolean9 = vanilla1.canCreateUsingArrayDelegate();
        boolean boolean10 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(annotatedWithParams4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(settableBeanPropertyArray7);
        org.junit.Assert.assertNull(annotatedParameter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        boolean boolean3 = vanilla1.canCreateUsingDefault();
        boolean boolean4 = vanilla1.canCreateFromDouble();
        boolean boolean5 = vanilla1.canCreateFromString();
        boolean boolean6 = vanilla1.canCreateFromInt();
        boolean boolean7 = vanilla1.canCreateUsingArrayDelegate();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedWithParams annotatedWithParams9 = vanilla1.getWithArgsCreator();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Object" + "'", str8, "java.lang.Object");
        org.junit.Assert.assertNull(annotatedWithParams9);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        boolean boolean11 = vanilla1.canInstantiate();
        org.junit.Assert.assertNull(annotatedParameter2);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla vanilla1 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla((int) (byte) 0);
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter2 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = vanilla1.getDelegateType(deserializationConfig3);
        boolean boolean5 = vanilla1.canCreateFromInt();
        boolean boolean6 = vanilla1.canCreateUsingDefault();
        boolean boolean7 = vanilla1.canCreateFromObjectWith();
        java.lang.String str8 = vanilla1.getValueTypeDesc();
        com.fasterxml.jackson.databind.introspect.AnnotatedParameter annotatedParameter9 = vanilla1.getIncompleteParameter();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = vanilla1.createFromString(deserializationContext10, "java.util.ArrayList");
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
        org.junit.Assert.assertNull(annotatedParameter9);
    }
}

