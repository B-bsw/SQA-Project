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
        com.fasterxml.jackson.core.JsonParser[] jsonParserArray0 = new com.fasterxml.jackson.core.JsonParser[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence1 = new com.fasterxml.jackson.core.util.JsonParserSequence(jsonParserArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserArray0);
        org.junit.Assert.assertArrayEquals(jsonParserArray0, new com.fasterxml.jackson.core.JsonParser[] {});
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jsonParserSequence2.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = jsonParserSequence2.getValueAsDouble((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation3 = jsonParserSequence2.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = jsonParserSequence2.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = jsonParserSequence2.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.Base64Variant base64Variant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = jsonParserSequence2.getBinaryValue(base64Variant3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParserSequence2.overrideFormatFeatures((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            jsonParserSequence2.setCurrentValue((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.JsonParser.Feature feature3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jsonParserSequence2.isEnabled(feature3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jsonParserSequence2.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec4 = jsonParserSequence2.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = jsonParserSequence2.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = jsonParserSequence2.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonParserSequence2.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jsonParserSequence2.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonParserSequence2.overrideStdFeatures(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonParserSequence2.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = jsonParserSequence2.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken4 = jsonParserSequence2.currentToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonParserSequence2.skipChildren();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonParserSequence2.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken3 = jsonParserSequence2.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jsonParserSequence2.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.FormatSchema formatSchema3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParserSequence2.setSchema(formatSchema3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            jsonParserSequence2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean3 = jsonParserSequence2.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParserSequence2.overrideStdFeatures((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonParserSequence2.getValueAsInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec5 = jsonParserSequence2.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload3 = null;
        jsonParserSequence2.setRequestPayloadOnError(requestPayload3);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonParserSequence2.configure(feature5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonParserSequence2.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload3 = null;
        jsonParserSequence2.setRequestPayloadOnError(requestPayload3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jsonParserSequence2.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonParserSequence2.readBinaryValue(base64Variant5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload3 = null;
        jsonParserSequence2.setRequestPayloadOnError(requestPayload3);
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = jsonParserSequence2.getBinaryValue(base64Variant5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = jsonParserSequence2.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version5 = jsonParserSequence2.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = jsonParserSequence2.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        boolean boolean3 = jsonParserSequence2.switchToNext();
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload3 = null;
        jsonParserSequence2.setRequestPayloadOnError(requestPayload3);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParserSequence2.enable(feature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = jsonParserSequence2.nextLongValue((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload3 = null;
        jsonParserSequence2.setRequestPayloadOnError(requestPayload3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonParserSequence2.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonParserSequence2.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            jsonParserSequence2.finishToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jsonParserSequence2.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = jsonParserSequence2.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = jsonParserSequence2.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonParserSequence2.getValueAsString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2._nextParser;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = jsonParserSequence2.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        int int3 = jsonParserSequence2.getFormatFeatures();
        int int4 = jsonParserSequence2.getFormatFeatures();
        int int5 = jsonParserSequence2._nextParser;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParserSequence2.setCodec(objectCodec6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jsonParserSequence2.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.util.JsonParserSequence jsonParserSequence2 = com.fasterxml.jackson.core.util.JsonParserSequence.createFlattened(jsonParser0, jsonParser1);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload3 = null;
        jsonParserSequence2.setRequestPayloadOnError(requestPayload3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonParserSequence2.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParserSequence2);
    }
}

