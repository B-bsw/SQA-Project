package com.fasterxml.jackson.databind.deser;

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
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer5 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, (java.util.Set<java.lang.String>) strSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer2 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext0 = null;
        com.fasterxml.jackson.databind.deser.UnresolvedForwardReference unresolvedForwardReference1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer propertyValueBuffer3 = null;
        com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer.BeanReferring beanReferring5 = new com.fasterxml.jackson.databind.deser.BeanDeserializer.BeanReferring(deserializationContext0, unresolvedForwardReference1, javaType2, propertyValueBuffer3, settableBeanProperty4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer2 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, nameTransformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer2 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, beanPropertyMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer2 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, objectIdReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer1 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer6 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, (java.util.Set<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer5 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, (java.util.Set<java.lang.String>) strSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer2 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer6 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, (java.util.Set<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer6 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, (java.util.Set<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer6 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, (java.util.Set<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBase beanDeserializerBase0 = null;
        java.util.Set<java.lang.String> strSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer2 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBase0, strSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer10 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet6, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.util.HashSet<java.lang.String> strSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer7 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet4, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.util.HashSet<java.lang.String> strSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer7 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet4, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer11 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.util.HashSet<java.lang.String> strSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer7 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet4, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder beanDeserializerBuilder0 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription1 = null;
        com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap beanPropertyMap2 = null;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> strMap3 = null;
        java.util.HashSet<java.lang.String> strSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.BeanDeserializer beanDeserializer7 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(beanDeserializerBuilder0, beanDescription1, beanPropertyMap2, strMap3, strSet4, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

