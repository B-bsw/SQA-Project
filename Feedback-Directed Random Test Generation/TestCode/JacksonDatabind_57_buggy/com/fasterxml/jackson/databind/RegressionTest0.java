package com.fasterxml.jackson.databind;

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
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader2 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 1.0f, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader2 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader2 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, tokenFilter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 100L, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, obj4, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (byte) 1, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (byte) 100, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 10L, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) ' ', formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 0L, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader2 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, jsonFactory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, obj3, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 10.0f, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) '4', formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (byte) 10, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 100.0d, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (short) -1, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        java.lang.Object obj4 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, obj4, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues7 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader9 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) wildcardClass5, formatSchema6, injectableValues7, dataFormatReaders8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (byte) -1, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 100.0f, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, obj3, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) true, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) '#', formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (-1.0f), formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (-1L), formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 1.0d, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (short) 1, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 0L, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (-1L), formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (-1), formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader7 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) wildcardClass4, formatSchema5, injectableValues6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 10L, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (byte) 1, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 100, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader7 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, obj3, formatSchema5, injectableValues6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 10.0f, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 100, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) "hi!", formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 1.0d, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (byte) 0, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) '#', formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 1L, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (short) 1, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) "", formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (short) 0, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (short) 100, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 0, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 10.0d, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (short) -1, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (short) 10, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 10, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 100.0f, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 0.0f, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 1L, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (short) 100, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (short) 0, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (-1.0f), formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 'a', formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (-1), formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) false, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (-1.0d), formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 1.0f, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 1, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (byte) 0, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 0.0f, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 0.0d, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 10, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 0.0d, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) ' ', formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) (-1.0d), formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) "hi!", formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 1, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) '4', formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) false, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (short) 10, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) "", formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) true, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (byte) 10, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 'a', formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 100.0d, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 100L, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = new com.fasterxml.jackson.databind.ObjectReader(objectMapper0, deserializationConfig1, javaType2, (java.lang.Object) 0, formatSchema4, injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (byte) -1, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) (byte) 100, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues7 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader9 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, obj4, formatSchema6, injectableValues7, dataFormatReaders8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        com.fasterxml.jackson.databind.ObjectReader objectReader0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.deser.DataFormatReaders dataFormatReaders7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = new com.fasterxml.jackson.databind.ObjectReader(objectReader0, deserializationConfig1, javaType2, objJsonDeserializer3, (java.lang.Object) 10.0d, formatSchema5, injectableValues6, dataFormatReaders7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

