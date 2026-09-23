package com.fasterxml.jackson.databind.node;

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
        java.lang.Object obj0 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator2 = null;
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode4 = new com.fasterxml.jackson.databind.node.POJONode(obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = pOJONode1.equals(jsonNodeComparator2, (com.fasterxml.jackson.databind.JsonNode) pOJONode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode3 = pOJONode1.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode3 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Object obj0 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode3 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Object obj0 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = baseJsonNode3.size();
        boolean boolean5 = baseJsonNode3.isBinary();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = jsonNode4.isMissingNode();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNode4.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator9, serializerProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonNode4.isPojo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNumber();
        int int5 = pOJONode1.asInt((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.at(jsonPointer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator6, serializerProvider7, typeSerializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonNode8.isLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNull(jsonNode8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.at(jsonPointer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isFloat();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.at(jsonPointer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.Class<?> wildcardClass7 = pOJONode1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = jsonNode6.findValues("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        boolean boolean8 = pOJONode1.isInt();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = pOJONode1.equals(jsonNodeComparator9, jsonNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        java.lang.Class<?> wildcardClass6 = jsonNode5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        java.lang.String str9 = pOJONode1.asText();
        java.math.BigDecimal bigDecimal10 = pOJONode1.decimalValue();
        java.lang.Object obj11 = pOJONode1._value;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get((int) '4');
        long long10 = pOJONode1.asLong((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator9, serializerProvider10, typeSerializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator6 = null;
        java.lang.Object obj7 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode(obj7);
        int int9 = pOJONode8.intValue();
        boolean boolean10 = pOJONode8.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double14 = pOJONode13.doubleValue();
        boolean boolean16 = pOJONode13.hasNonNull("hi!");
        java.lang.Object obj18 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode19 = new com.fasterxml.jackson.databind.node.POJONode(obj18);
        boolean boolean20 = pOJONode19.asBoolean();
        java.lang.Object obj22 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode(obj22);
        boolean boolean24 = pOJONode23.asBoolean();
        boolean boolean25 = pOJONode23.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor28 = pOJONode27.elements();
        boolean boolean29 = pOJONode27.isFloatingPointNumber();
        java.lang.String str30 = pOJONode27.toString();
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        byte[] byteArray34 = pOJONode32.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode36 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = pOJONode36.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor39 = pOJONode36.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode41 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = pOJONode41.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode45 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor46 = pOJONode45.elements();
        boolean boolean47 = pOJONode45.isFloatingPointNumber();
        java.lang.String str48 = pOJONode45.toString();
        java.lang.Object obj49 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode50 = new com.fasterxml.jackson.databind.node.POJONode(obj49);
        boolean boolean51 = pOJONode50.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray52 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode23, pOJONode27, pOJONode32, pOJONode36, pOJONode41, pOJONode45, pOJONode50 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53, jsonNodeArray52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = pOJONode19.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = pOJONode13.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = pOJONode8.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = pOJONode1.equals(jsonNodeComparator6, (com.fasterxml.jackson.databind.JsonNode) pOJONode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertNotNull(strEntryItor39);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNodeItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "-1" + "'", str48, "-1");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNodeList57);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        double double4 = pOJONode1.asDouble();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator5, serializerProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = pOJONode1.iterator();
        java.lang.Class<?> wildcardClass7 = jsonNodeItor6.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean8 = pOJONode1.isBoolean();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator9 = null;
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        int int12 = pOJONode11.intValue();
        boolean boolean13 = pOJONode11.isNull();
        int int15 = pOJONode11.asInt((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = pOJONode11.numberType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = pOJONode1.equals(jsonNodeComparator9, (com.fasterxml.jackson.databind.JsonNode) pOJONode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(numberType16);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonNode13.isTextual();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.withArray("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator6 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode8.deepCopy();
        java.util.Iterator<java.lang.String> strItor12 = pOJONode8.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = pOJONode8.traverse();
        boolean boolean15 = pOJONode8.has("-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = pOJONode1.equals(jsonNodeComparator6, (com.fasterxml.jackson.databind.JsonNode) pOJONode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator6, serializerProvider7, typeSerializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.isObject();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse(objectCodec6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at(jsonPointer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonNode8.isNull();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        java.lang.Class<?> wildcardClass4 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        boolean boolean9 = pOJONode1.isLong();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator10, serializerProvider11, typeSerializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        boolean boolean12 = pOJONode6.isBoolean();
        boolean boolean13 = pOJONode6.isMissingNode();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        java.lang.String str6 = pOJONode1.textValue();
        boolean boolean8 = pOJONode1.hasNonNull(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        boolean boolean5 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path((int) (byte) 10);
        short short8 = jsonNode7.shortValue();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.math.BigInteger bigInteger9 = pOJONode1.bigIntegerValue();
        boolean boolean10 = pOJONode1.isBigInteger();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator8, serializerProvider9, typeSerializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.findPath("-1");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.isNumber();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        java.lang.Number number7 = pOJONode1.numberValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        boolean boolean5 = pOJONode1.isDouble();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = pOJONode1.findValuesAsText("", (java.util.List<java.lang.String>) strList11);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        boolean boolean4 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode5.get("-1");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.String> strItor8 = jsonNode7.fieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonNode7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.Class<?> wildcardClass4 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = jsonNode4.isMissingNode();
        boolean boolean6 = jsonNode4.canConvertToLong();
        boolean boolean7 = jsonNode4.asBoolean();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNode4.at(jsonPointer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        boolean boolean6 = pOJONode1.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode1.findParents("-1");
        java.lang.Class<?> wildcardClass9 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        java.lang.Object obj5 = pOJONode1._value;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.get((int) (short) 100);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double7 = pOJONode6.doubleValue();
        boolean boolean9 = pOJONode6.hasNonNull("hi!");
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.asBoolean();
        java.lang.Object obj15 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode(obj15);
        boolean boolean17 = pOJONode16.asBoolean();
        boolean boolean18 = pOJONode16.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor21 = pOJONode20.elements();
        boolean boolean22 = pOJONode20.isFloatingPointNumber();
        java.lang.String str23 = pOJONode20.toString();
        java.lang.Object obj24 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode25 = new com.fasterxml.jackson.databind.node.POJONode(obj24);
        boolean boolean26 = pOJONode25.asBoolean();
        byte[] byteArray27 = pOJONode25.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode29 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = pOJONode29.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor32 = pOJONode29.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode34 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList36 = pOJONode34.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor39 = pOJONode38.elements();
        boolean boolean40 = pOJONode38.isFloatingPointNumber();
        java.lang.String str41 = pOJONode38.toString();
        java.lang.Object obj42 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode43 = new com.fasterxml.jackson.databind.node.POJONode(obj42);
        boolean boolean44 = pOJONode43.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray45 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode16, pOJONode20, pOJONode25, pOJONode29, pOJONode34, pOJONode38, pOJONode43 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46, jsonNodeArray45);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = pOJONode12.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = pOJONode6.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        boolean boolean52 = pOJONode1.hasNonNull((int) (short) 10);
        java.lang.Class<?> wildcardClass53 = pOJONode1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(strEntryItor32);
        org.junit.Assert.assertNotNull(jsonNodeList36);
        org.junit.Assert.assertNotNull(jsonNodeItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-1" + "'", str41, "-1");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        java.math.BigInteger bigInteger5 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (byte) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean7 = pOJONode1.isEmpty(serializerProvider6);
        java.lang.String str8 = pOJONode1.textValue();
        java.lang.Class<?> wildcardClass9 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        java.lang.Object obj4 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode(obj4);
        boolean boolean6 = pOJONode5.asBoolean();
        boolean boolean7 = pOJONode5.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode9.elements();
        boolean boolean11 = pOJONode9.isFloatingPointNumber();
        java.lang.String str12 = pOJONode9.toString();
        java.lang.Object obj13 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode(obj13);
        boolean boolean15 = pOJONode14.asBoolean();
        byte[] byteArray16 = pOJONode14.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode18.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor21 = pOJONode18.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = pOJONode23.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor28 = pOJONode27.elements();
        boolean boolean29 = pOJONode27.isFloatingPointNumber();
        java.lang.String str30 = pOJONode27.toString();
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray34 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode5, pOJONode9, pOJONode14, pOJONode18, pOJONode23, pOJONode27, pOJONode32 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList35, jsonNodeArray34);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode1.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList35);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode39 = pOJONode1.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(strEntryItor21);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(jsonNodeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jsonNodeList37);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        int int7 = jsonNode6.intValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = pOJONode6.asToken();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode6.serializeWithType(jsonGenerator13, serializerProvider14, typeSerializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        long long9 = pOJONode1.asLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        java.lang.Object obj9 = pOJONode1.getPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.path(1);
        java.util.Iterator<java.lang.String> strItor12 = jsonNode11.fieldNames();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        boolean boolean6 = pOJONode1.canConvertToLong();
        java.lang.Class<?> wildcardClass7 = pOJONode1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode1.findValues("");
        java.math.BigInteger bigInteger11 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(bigInteger11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        boolean boolean3 = pOJONode1.asBoolean();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = pOJONode1.equals(jsonNodeComparator4, jsonNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNode8.at("");
        boolean boolean11 = jsonNode10.isNumber();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator12 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = pOJONode14.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode14.deepCopy();
        double double19 = pOJONode14.asDouble(1.0d);
        boolean boolean21 = pOJONode14.asBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = jsonNode10.equals(jsonNodeComparator12, (com.fasterxml.jackson.databind.JsonNode) pOJONode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.isBigInteger();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get("-1");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.with("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.booleanValue();
        double double8 = pOJONode1.asDouble();
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        int int12 = pOJONode11.intValue();
        boolean boolean13 = pOJONode11.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double17 = pOJONode16.doubleValue();
        boolean boolean19 = pOJONode16.hasNonNull("hi!");
        java.lang.Object obj21 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode(obj21);
        boolean boolean23 = pOJONode22.asBoolean();
        java.lang.Object obj25 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode(obj25);
        boolean boolean27 = pOJONode26.asBoolean();
        boolean boolean28 = pOJONode26.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor31 = pOJONode30.elements();
        boolean boolean32 = pOJONode30.isFloatingPointNumber();
        java.lang.String str33 = pOJONode30.toString();
        java.lang.Object obj34 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode(obj34);
        boolean boolean36 = pOJONode35.asBoolean();
        byte[] byteArray37 = pOJONode35.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = pOJONode39.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor42 = pOJONode39.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = pOJONode44.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode48 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor49 = pOJONode48.elements();
        boolean boolean50 = pOJONode48.isFloatingPointNumber();
        java.lang.String str51 = pOJONode48.toString();
        java.lang.Object obj52 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode53 = new com.fasterxml.jackson.databind.node.POJONode(obj52);
        boolean boolean54 = pOJONode53.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray55 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode26, pOJONode30, pOJONode35, pOJONode39, pOJONode44, pOJONode48, pOJONode53 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56, jsonNodeArray55);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = pOJONode22.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = pOJONode16.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList60 = pOJONode11.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList61 = pOJONode1.findParents("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = pOJONode1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor64 = jsonNode63.elements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertNotNull(jsonNodeList41);
        org.junit.Assert.assertNotNull(strEntryItor42);
        org.junit.Assert.assertNotNull(jsonNodeList46);
        org.junit.Assert.assertNotNull(jsonNodeItor49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-1" + "'", str51, "-1");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jsonNodeList58);
        org.junit.Assert.assertNotNull(jsonNodeList59);
        org.junit.Assert.assertNotNull(jsonNodeList60);
        org.junit.Assert.assertNotNull(jsonNodeList61);
        org.junit.Assert.assertNull(jsonNode63);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator14 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = pOJONode16.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = pOJONode16.deepCopy();
        java.math.BigDecimal bigDecimal20 = pOJONode16.decimalValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = pOJONode1.equals(jsonNodeComparator14, (com.fasterxml.jackson.databind.JsonNode) pOJONode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(bigDecimal20);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = pOJONode1.findParents("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = pOJONode1.traverse(objectCodec8);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(bigDecimal8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get((int) '4');
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        boolean boolean12 = pOJONode11.asBoolean();
        byte[] byteArray13 = pOJONode11.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor17 = pOJONode16.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode18 = pOJONode16.deepCopy();
        int int19 = baseJsonNode18.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = baseJsonNode18.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode11.findValues("-1", jsonNodeList21);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = pOJONode1.findValues("hi!", jsonNodeList21);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType24 = pOJONode1.numberType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator25, serializerProvider26, typeSerializer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(jsonNodeItor17);
        org.junit.Assert.assertNotNull(baseJsonNode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertNull(numberType24);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) jsonToken8);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode9.elements();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode9.serializeWithType(jsonGenerator11, serializerProvider12, typeSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNodeItor10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode10.fields();
        boolean boolean12 = pOJONode10.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = pOJONode10.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor17 = pOJONode16.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode16.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode10.findValues("hi!", jsonNodeList19);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = pOJONode1.findParents("hi!", jsonNodeList20);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode23 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor17);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(jsonNodeList21);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jsonNode5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonNode5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.booleanValue();
        long long9 = pOJONode1.asLong((long) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = pOJONode1.findParent("");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        boolean boolean14 = pOJONode1.isIntegralNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.findValue("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (byte) 10);
        boolean boolean6 = pOJONode1.isInt();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType6 = pOJONode1.getNodeType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + jsonNodeType6 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType6.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        java.lang.String str5 = pOJONode1.toString();
        boolean boolean6 = pOJONode1.asBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        double double6 = pOJONode1.asDouble();
        java.lang.Object obj8 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode(obj8);
        int int10 = pOJONode9.intValue();
        boolean boolean12 = pOJONode9.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor15 = pOJONode14.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor16 = pOJONode14.iterator();
        boolean boolean17 = pOJONode9.equals((java.lang.Object) pOJONode14);
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double21 = pOJONode20.doubleValue();
        boolean boolean23 = pOJONode20.hasNonNull("hi!");
        java.lang.Object obj25 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode(obj25);
        boolean boolean27 = pOJONode26.asBoolean();
        java.lang.Object obj29 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode(obj29);
        boolean boolean31 = pOJONode30.asBoolean();
        boolean boolean32 = pOJONode30.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode34 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor35 = pOJONode34.elements();
        boolean boolean36 = pOJONode34.isFloatingPointNumber();
        java.lang.String str37 = pOJONode34.toString();
        java.lang.Object obj38 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode(obj38);
        boolean boolean40 = pOJONode39.asBoolean();
        byte[] byteArray41 = pOJONode39.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode43 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList45 = pOJONode43.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor46 = pOJONode43.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode48 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode48.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode52 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor53 = pOJONode52.elements();
        boolean boolean54 = pOJONode52.isFloatingPointNumber();
        java.lang.String str55 = pOJONode52.toString();
        java.lang.Object obj56 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode57 = new com.fasterxml.jackson.databind.node.POJONode(obj56);
        boolean boolean58 = pOJONode57.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray59 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode30, pOJONode34, pOJONode39, pOJONode43, pOJONode48, pOJONode52, pOJONode57 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList60 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList60, jsonNodeArray59);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList62 = pOJONode26.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList60);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList63 = pOJONode20.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList60);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList64 = pOJONode9.findValues("hi!", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList60);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList65 = pOJONode1.findParents("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList60);
        com.fasterxml.jackson.core.JsonPointer jsonPointer66 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode67 = pOJONode1.at(jsonPointer66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strEntryItor15);
        org.junit.Assert.assertNotNull(jsonNodeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1" + "'", str37, "-1");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertNotNull(jsonNodeList45);
        org.junit.Assert.assertNotNull(strEntryItor46);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertNotNull(jsonNodeItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1" + "'", str55, "-1");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jsonNodeList62);
        org.junit.Assert.assertNotNull(jsonNodeList63);
        org.junit.Assert.assertNotNull(jsonNodeList64);
        org.junit.Assert.assertNotNull(jsonNodeList65);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        boolean boolean9 = jsonNode8.asBoolean();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        boolean boolean6 = pOJONode1.isObject();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator9 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = pOJONode11.elements();
        boolean boolean13 = pOJONode11.isFloatingPointNumber();
        java.lang.String str14 = pOJONode11.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode11.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode11.findValue("");
        boolean boolean19 = pOJONode11.isContainerNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = pOJONode1.equals(jsonNodeComparator9, (com.fasterxml.jackson.databind.JsonNode) pOJONode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = pOJONode1.findParent("");
        java.lang.String str14 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator15, serializerProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        byte[] byteArray12 = pOJONode6.binaryValue();
        java.lang.Number number13 = pOJONode6.numberValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (byte) 10);
        boolean boolean6 = pOJONode1.isBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        boolean boolean5 = pOJONode1.isObject();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode(obj6);
        boolean boolean8 = pOJONode7.asBoolean();
        byte[] byteArray9 = pOJONode7.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor13 = pOJONode12.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode14 = pOJONode12.deepCopy();
        int int15 = baseJsonNode14.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = baseJsonNode14.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = pOJONode7.findValues("-1", jsonNodeList17);
        boolean boolean19 = pOJONode1.equals((java.lang.Object) "-1");
        boolean boolean20 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = pOJONode22.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode22.deepCopy();
        boolean boolean26 = pOJONode22.isBinary();
        boolean boolean27 = pOJONode1._pojoEquals(pOJONode22);
        boolean boolean28 = pOJONode1.isArray();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(jsonNodeItor13);
        org.junit.Assert.assertNotNull(baseJsonNode14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        int int6 = pOJONode1.intValue();
        boolean boolean7 = pOJONode1.isValueNode();
        boolean boolean8 = pOJONode1.isShort();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.at(jsonPointer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor9 = pOJONode1.fields();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator10 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor13 = pOJONode12.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode14 = pOJONode12.deepCopy();
        boolean boolean15 = baseJsonNode14.isObject();
        java.math.BigInteger bigInteger16 = baseJsonNode14.bigIntegerValue();
        boolean boolean17 = baseJsonNode14.isValueNode();
        boolean boolean18 = baseJsonNode14.isArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = pOJONode1.equals(jsonNodeComparator10, (com.fasterxml.jackson.databind.JsonNode) baseJsonNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(strEntryItor9);
        org.junit.Assert.assertNotNull(jsonNodeItor13);
        org.junit.Assert.assertNotNull(baseJsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.get("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator6, serializerProvider7, typeSerializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonNode5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = baseJsonNode3.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = baseJsonNode3.findParents("hi!");
        boolean boolean7 = baseJsonNode3.isNumber();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType8 = baseJsonNode3.numberType();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(numberType8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.isContainerNode();
        boolean boolean5 = pOJONode1.isShort();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.math.BigInteger bigInteger9 = pOJONode1.bigIntegerValue();
        java.lang.Class<?> wildcardClass10 = pOJONode1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator5, serializerProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator7 = pOJONode1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.path("hi!");
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator10 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = pOJONode12.findValues("hi!");
        java.lang.String str15 = pOJONode12.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode17.deepCopy();
        boolean boolean21 = pOJONode17.isPojo();
        boolean boolean22 = pOJONode12._pojoEquals(pOJONode17);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = pOJONode17.asToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = pOJONode1.equals(jsonNodeComparator10, (com.fasterxml.jackson.databind.JsonNode) pOJONode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        boolean boolean9 = pOJONode1.isLong();
        boolean boolean11 = pOJONode1.has("-1");
        boolean boolean12 = pOJONode1.isValueNode();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.at(jsonPointer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        java.lang.String str9 = pOJONode1.asText();
        java.math.BigDecimal bigDecimal10 = pOJONode1.decimalValue();
        int int11 = pOJONode1.asInt();
        java.lang.Object obj12 = pOJONode1._value;
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.String> strItor7 = jsonNode6.fieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal6 = pOJONode1.decimalValue();
        long long7 = pOJONode1.longValue();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at(jsonPointer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean14 = pOJONode12.hasNonNull("hi!");
        int int15 = pOJONode12.intValue();
        boolean boolean16 = pOJONode12.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = pOJONode12.traverse();
        java.lang.String str18 = pOJONode12.toString();
        boolean boolean20 = pOJONode12.has((int) (short) 10);
        java.util.List<java.lang.String> strList22 = pOJONode12.findValuesAsText("");
        java.util.List<java.lang.String> strList23 = pOJONode1.findValuesAsText("", strList22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode1.with("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.get("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNull(jsonNode7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        boolean boolean4 = baseJsonNode3.isObject();
        java.math.BigInteger bigInteger5 = baseJsonNode3.bigIntegerValue();
        boolean boolean6 = baseJsonNode3.isValueNode();
        boolean boolean7 = baseJsonNode3.booleanValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode4 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = pOJONode4.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode6 = pOJONode4.deepCopy();
        boolean boolean7 = pOJONode1._pojoEquals(pOJONode4);
        com.fasterxml.jackson.databind.node.ValueNode valueNode8 = pOJONode4.deepCopy();
        boolean boolean9 = valueNode8.isShort();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertNotNull(baseJsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(valueNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = pOJONode1.findParents("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator8, serializerProvider9, typeSerializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNodeList7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = pOJONode1.findParent("-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objectNode11.isLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        boolean boolean6 = pOJONode1.isMissingNode();
        boolean boolean7 = pOJONode1.isBigDecimal();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("hi!");
        double double11 = jsonNode10.doubleValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        java.util.List<java.lang.String> strList7 = pOJONode1.findValuesAsText("-1");
        boolean boolean8 = pOJONode1.isArray();
        boolean boolean9 = pOJONode1.isTextual();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator10 = pOJONode1.spliterator();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.findPath("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = pOJONode1.findParent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objectNode8.isArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double7 = pOJONode6.doubleValue();
        boolean boolean9 = pOJONode6.hasNonNull("hi!");
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.asBoolean();
        java.lang.Object obj15 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode(obj15);
        boolean boolean17 = pOJONode16.asBoolean();
        boolean boolean18 = pOJONode16.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor21 = pOJONode20.elements();
        boolean boolean22 = pOJONode20.isFloatingPointNumber();
        java.lang.String str23 = pOJONode20.toString();
        java.lang.Object obj24 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode25 = new com.fasterxml.jackson.databind.node.POJONode(obj24);
        boolean boolean26 = pOJONode25.asBoolean();
        byte[] byteArray27 = pOJONode25.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode29 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = pOJONode29.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor32 = pOJONode29.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode34 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList36 = pOJONode34.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor39 = pOJONode38.elements();
        boolean boolean40 = pOJONode38.isFloatingPointNumber();
        java.lang.String str41 = pOJONode38.toString();
        java.lang.Object obj42 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode43 = new com.fasterxml.jackson.databind.node.POJONode(obj42);
        boolean boolean44 = pOJONode43.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray45 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode16, pOJONode20, pOJONode25, pOJONode29, pOJONode34, pOJONode38, pOJONode43 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46, jsonNodeArray45);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = pOJONode12.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = pOJONode6.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        boolean boolean52 = pOJONode1.hasNonNull((int) (short) 10);
        boolean boolean53 = pOJONode1.isBigDecimal();
        com.fasterxml.jackson.core.JsonPointer jsonPointer54 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode55 = pOJONode1.at(jsonPointer54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(strEntryItor32);
        org.junit.Assert.assertNotNull(jsonNodeList36);
        org.junit.Assert.assertNotNull(jsonNodeItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-1" + "'", str41, "-1");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonNode7.isTextual();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(jsonNode7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.has("");
        boolean boolean7 = pOJONode1.isDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = pOJONode1.findParent("");
        long long13 = pOJONode1.asLong((long) 10);
        boolean boolean15 = pOJONode1.asBoolean(true);
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = pOJONode18.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode20 = pOJONode18.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean22 = pOJONode18.isEmpty(serializerProvider21);
        double double23 = pOJONode18.asDouble();
        boolean boolean24 = pOJONode18.isBinary();
        java.lang.Object obj26 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode(obj26);
        int int28 = pOJONode27.intValue();
        java.lang.String str29 = pOJONode27.asText();
        boolean boolean30 = pOJONode27.booleanValue();
        boolean boolean31 = pOJONode27.isDouble();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.String> strList39 = pOJONode27.findValuesAsText("", (java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.String> strList40 = pOJONode18.findValuesAsText("hi!", strList39);
        java.util.List<java.lang.String> strList41 = pOJONode1.findValuesAsText("hi!", strList39);
        int int42 = pOJONode1.intValue();
        boolean boolean43 = pOJONode1.isObject();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertNotNull(baseJsonNode20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        short short5 = pOJONode1.shortValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse(objectCodec6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (byte) 10);
        boolean boolean6 = pOJONode1.isBoolean();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode3 = pOJONode1.withArray("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode6.at(jsonPointer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        java.lang.Object obj10 = pOJONode1.getPojo();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = pOJONode1.elements();
        java.lang.Number number7 = pOJONode1.numberValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = jsonNode6.elements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        double double6 = pOJONode1.asDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode8.fields();
        boolean boolean12 = pOJONode8.isArray();
        java.lang.Object obj13 = pOJONode8.getPojo();
        boolean boolean14 = pOJONode8.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = pOJONode8.asToken();
        boolean boolean16 = pOJONode1._pojoEquals(pOJONode8);
        boolean boolean18 = pOJONode1.has("-1");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode1.with("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        short short2 = pOJONode1.shortValue();
        boolean boolean3 = pOJONode1.isLong();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double8 = pOJONode7.doubleValue();
        boolean boolean10 = pOJONode7.hasNonNull("hi!");
        java.lang.Object obj12 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode(obj12);
        boolean boolean14 = pOJONode13.asBoolean();
        java.lang.Object obj16 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode(obj16);
        boolean boolean18 = pOJONode17.asBoolean();
        boolean boolean19 = pOJONode17.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode21 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor22 = pOJONode21.elements();
        boolean boolean23 = pOJONode21.isFloatingPointNumber();
        java.lang.String str24 = pOJONode21.toString();
        java.lang.Object obj25 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode(obj25);
        boolean boolean27 = pOJONode26.asBoolean();
        byte[] byteArray28 = pOJONode26.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = pOJONode30.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor33 = pOJONode30.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode35.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor40 = pOJONode39.elements();
        boolean boolean41 = pOJONode39.isFloatingPointNumber();
        java.lang.String str42 = pOJONode39.toString();
        java.lang.Object obj43 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode(obj43);
        boolean boolean45 = pOJONode44.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray46 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode17, pOJONode21, pOJONode26, pOJONode30, pOJONode35, pOJONode39, pOJONode44 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47, jsonNodeArray46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = pOJONode13.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode7.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor52 = pOJONode1.fields();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertNotNull(strEntryItor33);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(jsonNodeItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertNotNull(strEntryItor52);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.math.BigInteger bigInteger5 = jsonNode4.bigIntegerValue();
        boolean boolean6 = jsonNode4.isArray();
        boolean boolean7 = jsonNode4.isDouble();
        int int8 = jsonNode4.size();
        boolean boolean9 = jsonNode4.isShort();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        float float9 = pOJONode1.floatValue();
        boolean boolean10 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.path("hi!");
        boolean boolean13 = pOJONode1.isPojo();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.has("-1");
        boolean boolean9 = pOJONode1.isBigInteger();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        boolean boolean12 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.path("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNode14.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.MissingNode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        java.lang.Object obj4 = pOJONode1._value;
        long long5 = pOJONode1.longValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        boolean boolean9 = pOJONode1.canConvertToLong();
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode12.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode12.path("hi!");
        boolean boolean18 = pOJONode12.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        boolean boolean20 = pOJONode12.isEmpty(serializerProvider19);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode12.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = pOJONode1.findParents("-1", jsonNodeList22);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor24 = pOJONode1.iterator();
        int int26 = pOJONode1.asInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertNotNull(jsonNodeItor24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.canConvertToInt();
        java.lang.Object obj7 = pOJONode1.getPojo();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator8, serializerProvider9, typeSerializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path("hi!");
        java.util.Iterator<java.lang.String> strItor8 = jsonNode7.fieldNames();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode1.findParents("hi!");
        boolean boolean10 = pOJONode1.hasNonNull(1);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        int int6 = pOJONode1.intValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at("");
        boolean boolean9 = jsonNode8.isLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.ValueNode valueNode5 = pOJONode1.deepCopy();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.at(jsonPointer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(valueNode5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        boolean boolean9 = pOJONode1.isLong();
        boolean boolean11 = pOJONode1.has("-1");
        boolean boolean12 = pOJONode1.isValueNode();
        boolean boolean13 = pOJONode1.isDouble();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor9 = jsonNode8.fields();
        double double10 = jsonNode8.asDouble();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(strEntryItor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        java.lang.String str3 = pOJONode1.textValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        short short2 = pOJONode1.shortValue();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        java.math.BigDecimal bigDecimal6 = pOJONode1.decimalValue();
        boolean boolean8 = pOJONode1.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = pOJONode1.asToken();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken9.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        boolean boolean4 = baseJsonNode3.isObject();
        java.math.BigInteger bigInteger5 = baseJsonNode3.bigIntegerValue();
        boolean boolean6 = baseJsonNode3.isValueNode();
        boolean boolean7 = baseJsonNode3.isArray();
        boolean boolean8 = baseJsonNode3.canConvertToInt();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = baseJsonNode3.size();
        boolean boolean5 = baseJsonNode3.asBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = baseJsonNode3.traverse();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = pOJONode1.findParent("");
        int int9 = pOJONode1.asInt((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.lang.Object obj9 = pOJONode1.getPojo();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.withArray("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.canConvertToLong();
        java.lang.String str9 = pOJONode1.textValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        java.lang.String str6 = pOJONode1.asText("");
        java.lang.Class<?> wildcardClass7 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor3 = pOJONode1.fields();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(strEntryItor3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        short short9 = pOJONode1.shortValue();
        int int10 = pOJONode1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = pOJONode6.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode6.iterator();
        boolean boolean9 = pOJONode1.equals((java.lang.Object) pOJONode6);
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double13 = pOJONode12.doubleValue();
        boolean boolean15 = pOJONode12.hasNonNull("hi!");
        java.lang.Object obj17 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode(obj17);
        boolean boolean19 = pOJONode18.asBoolean();
        java.lang.Object obj21 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode(obj21);
        boolean boolean23 = pOJONode22.asBoolean();
        boolean boolean24 = pOJONode22.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor27 = pOJONode26.elements();
        boolean boolean28 = pOJONode26.isFloatingPointNumber();
        java.lang.String str29 = pOJONode26.toString();
        java.lang.Object obj30 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode31 = new com.fasterxml.jackson.databind.node.POJONode(obj30);
        boolean boolean32 = pOJONode31.asBoolean();
        byte[] byteArray33 = pOJONode31.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode35.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor38 = pOJONode35.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode40 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList42 = pOJONode40.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor45 = pOJONode44.elements();
        boolean boolean46 = pOJONode44.isFloatingPointNumber();
        java.lang.String str47 = pOJONode44.toString();
        java.lang.Object obj48 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode49 = new com.fasterxml.jackson.databind.node.POJONode(obj48);
        boolean boolean50 = pOJONode49.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray51 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode22, pOJONode26, pOJONode31, pOJONode35, pOJONode40, pOJONode44, pOJONode49 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52, jsonNodeArray51);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList54 = pOJONode18.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = pOJONode12.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = pOJONode1.findValues("hi!", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52);
        boolean boolean58 = pOJONode1.hasNonNull("-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryItor7);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(strEntryItor38);
        org.junit.Assert.assertNotNull(jsonNodeList42);
        org.junit.Assert.assertNotNull(jsonNodeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jsonNodeList54);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        short short4 = pOJONode1.shortValue();
        boolean boolean5 = pOJONode1.isLong();
        float float6 = pOJONode1.floatValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        boolean boolean12 = pOJONode6.isBoolean();
        long long13 = pOJONode6.asLong();
        boolean boolean14 = pOJONode6.isShort();
        boolean boolean15 = pOJONode6.canConvertToLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType6 = pOJONode1.getNodeType();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + jsonNodeType6 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType6.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        boolean boolean6 = pOJONode1.isLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.math.BigInteger bigInteger9 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.node.ValueNode valueNode10 = pOJONode1.deepCopy();
        boolean boolean11 = pOJONode1.isBinary();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(valueNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean6 = pOJONode1.canConvertToLong();
        boolean boolean7 = pOJONode1.isLong();
        boolean boolean8 = pOJONode1.isValueNode();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator9 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = pOJONode11.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode11.deepCopy();
        boolean boolean15 = pOJONode11.canConvertToLong();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = pOJONode1.equals(jsonNodeComparator9, (com.fasterxml.jackson.databind.JsonNode) pOJONode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.has("-1");
        boolean boolean9 = pOJONode1.isBigInteger();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        boolean boolean12 = pOJONode6.isBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode6.get((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonNode14.isBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonNode14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode4 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = pOJONode4.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode6 = pOJONode4.deepCopy();
        boolean boolean7 = pOJONode1._pojoEquals(pOJONode4);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator8, serializerProvider9, typeSerializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertNotNull(baseJsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        java.lang.String str5 = pOJONode1.asText("-1");
        java.lang.Class<?> wildcardClass6 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = pOJONode1.findParent("-1");
        boolean boolean12 = pOJONode1.hasNonNull("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.get(100);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonNode14);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.has("-1");
        boolean boolean9 = pOJONode1.isBigInteger();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        boolean boolean12 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.path("");
        java.lang.Object obj15 = pOJONode1._value;
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        double double6 = pOJONode1.asDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode8.fields();
        boolean boolean12 = pOJONode8.isArray();
        java.lang.Object obj13 = pOJONode8.getPojo();
        boolean boolean14 = pOJONode8.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = pOJONode8.asToken();
        boolean boolean16 = pOJONode1._pojoEquals(pOJONode8);
        java.lang.Class<?> wildcardClass17 = pOJONode8.getClass();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = pOJONode6.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode6.path("");
        boolean boolean15 = pOJONode6.isContainerNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = pOJONode6.numberType();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(numberType16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = pOJONode1.findParent("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objectNode8.isObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        boolean boolean12 = pOJONode6.isBoolean();
        long long13 = pOJONode6.asLong();
        byte[] byteArray14 = pOJONode6.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode6.get("");
        // The following exception was thrown during execution in test generation
        try {
            long long17 = jsonNode16.longValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNull(jsonNode16);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        boolean boolean6 = pOJONode1.isShort();
        boolean boolean7 = pOJONode1.isValueNode();
        boolean boolean8 = pOJONode1.canConvertToLong();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = pOJONode1.numberType();
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(numberType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isInt();
        java.math.BigDecimal bigDecimal4 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNull(jsonNode6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double8 = pOJONode7.doubleValue();
        boolean boolean10 = pOJONode7.hasNonNull("hi!");
        java.lang.Object obj12 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode(obj12);
        boolean boolean14 = pOJONode13.asBoolean();
        java.lang.Object obj16 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode(obj16);
        boolean boolean18 = pOJONode17.asBoolean();
        boolean boolean19 = pOJONode17.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode21 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor22 = pOJONode21.elements();
        boolean boolean23 = pOJONode21.isFloatingPointNumber();
        java.lang.String str24 = pOJONode21.toString();
        java.lang.Object obj25 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode(obj25);
        boolean boolean27 = pOJONode26.asBoolean();
        byte[] byteArray28 = pOJONode26.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = pOJONode30.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor33 = pOJONode30.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode35.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor40 = pOJONode39.elements();
        boolean boolean41 = pOJONode39.isFloatingPointNumber();
        java.lang.String str42 = pOJONode39.toString();
        java.lang.Object obj43 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode(obj43);
        boolean boolean45 = pOJONode44.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray46 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode17, pOJONode21, pOJONode26, pOJONode30, pOJONode35, pOJONode39, pOJONode44 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47, jsonNodeArray46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = pOJONode13.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode7.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser53 = pOJONode1.traverse(objectCodec52);
        double double54 = pOJONode1.doubleValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertNotNull(strEntryItor33);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(jsonNodeItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        java.lang.Object obj5 = pOJONode1.getPojo();
        byte[] byteArray6 = pOJONode1.binaryValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode1.findParents("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNotNull(jsonNodeList8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.findPath("");
        boolean boolean7 = jsonNode6.isPojo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.has("");
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = pOJONode1.traverse();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = pOJONode1.traverse(objectCodec9);
        long long11 = pOJONode1.asLong();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator5, serializerProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        boolean boolean12 = pOJONode1.isArray();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator13, serializerProvider14, typeSerializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = pOJONode1.findParent("");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        java.util.List<java.lang.String> strList15 = pOJONode1.findValuesAsText("");
        boolean boolean16 = pOJONode1.isMissingNode();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        java.lang.String str7 = pOJONode1.asText("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = pOJONode6.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode6.path("");
        boolean boolean15 = pOJONode6.isContainerNode();
        boolean boolean16 = pOJONode6.isInt();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonNode8.canConvertToLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str10 = pOJONode1.asText("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        boolean boolean10 = pOJONode1.canConvertToInt();
        boolean boolean11 = pOJONode1.isDouble();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        double double7 = pOJONode1.asDouble((double) (short) 10);
        boolean boolean8 = pOJONode1.isValueNode();
        java.lang.Class<?> wildcardClass9 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double5 = pOJONode1.doubleValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        int int4 = pOJONode1.size();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get("-1");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean10 = pOJONode8.hasNonNull("hi!");
        int int11 = pOJONode8.intValue();
        boolean boolean12 = pOJONode8.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = pOJONode8.traverse();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = pOJONode8.findParent("");
        boolean boolean16 = pOJONode1.equals((java.lang.Object) pOJONode8);
        boolean boolean17 = pOJONode8.isIntegralNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        short short9 = pOJONode1.shortValue();
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        int int12 = pOJONode11.intValue();
        boolean boolean14 = pOJONode11.hasNonNull("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = pOJONode11.traverse(objectCodec15);
        boolean boolean17 = pOJONode11.isValueNode();
        int int18 = pOJONode11.asInt();
        java.lang.String str19 = pOJONode11.textValue();
        boolean boolean20 = pOJONode1._pojoEquals(pOJONode11);
        boolean boolean21 = pOJONode1.canConvertToInt();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNode8.at("");
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator11 = jsonNode8.spliterator();
        boolean boolean12 = jsonNode8.isBinary();
        boolean boolean13 = jsonNode8.isBigDecimal();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.path((int) (byte) -1);
        java.math.BigDecimal bigDecimal11 = jsonNode10.decimalValue();
        boolean boolean12 = jsonNode10.isValueNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double8 = pOJONode7.doubleValue();
        boolean boolean10 = pOJONode7.hasNonNull("hi!");
        java.lang.Object obj12 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode(obj12);
        boolean boolean14 = pOJONode13.asBoolean();
        java.lang.Object obj16 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode(obj16);
        boolean boolean18 = pOJONode17.asBoolean();
        boolean boolean19 = pOJONode17.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode21 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor22 = pOJONode21.elements();
        boolean boolean23 = pOJONode21.isFloatingPointNumber();
        java.lang.String str24 = pOJONode21.toString();
        java.lang.Object obj25 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode(obj25);
        boolean boolean27 = pOJONode26.asBoolean();
        byte[] byteArray28 = pOJONode26.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = pOJONode30.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor33 = pOJONode30.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode35.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor40 = pOJONode39.elements();
        boolean boolean41 = pOJONode39.isFloatingPointNumber();
        java.lang.String str42 = pOJONode39.toString();
        java.lang.Object obj43 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode(obj43);
        boolean boolean45 = pOJONode44.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray46 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode17, pOJONode21, pOJONode26, pOJONode30, pOJONode35, pOJONode39, pOJONode44 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47, jsonNodeArray46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = pOJONode13.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode7.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList47);
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator52 = null;
        java.lang.Object obj53 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode54 = new com.fasterxml.jackson.databind.node.POJONode(obj53);
        int int55 = pOJONode54.intValue();
        boolean boolean56 = pOJONode54.isNull();
        int int58 = pOJONode54.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor59 = pOJONode54.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = pOJONode54.get((int) '4');
        java.lang.Object obj63 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode64 = new com.fasterxml.jackson.databind.node.POJONode(obj63);
        boolean boolean65 = pOJONode64.asBoolean();
        byte[] byteArray66 = pOJONode64.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode69 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor70 = pOJONode69.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode71 = pOJONode69.deepCopy();
        int int72 = baseJsonNode71.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = baseJsonNode71.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList75 = pOJONode64.findValues("-1", jsonNodeList74);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList76 = pOJONode54.findValues("hi!", jsonNodeList74);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType77 = pOJONode54.numberType();
        boolean boolean78 = pOJONode54.canConvertToInt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = pOJONode1.equals(jsonNodeComparator52, (com.fasterxml.jackson.databind.JsonNode) pOJONode54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertNotNull(strEntryItor33);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(jsonNodeItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(strEntryItor59);
        org.junit.Assert.assertNull(jsonNode61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(byteArray66);
        org.junit.Assert.assertNotNull(jsonNodeItor70);
        org.junit.Assert.assertNotNull(baseJsonNode71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNotNull(jsonNodeList75);
        org.junit.Assert.assertNotNull(jsonNodeList76);
        org.junit.Assert.assertNull(numberType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = baseJsonNode3.traverse(objectCodec4);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertNotNull(jsonParser5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        boolean boolean10 = pOJONode1.isLong();
        java.math.BigInteger bigInteger11 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bigInteger11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        long long4 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType5 = pOJONode1.getNodeType();
        java.util.Iterator<java.lang.String> strItor6 = pOJONode1.fieldNames();
        double double7 = pOJONode1.asDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + jsonNodeType5 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType5.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!");
        java.lang.Number number12 = pOJONode1.numberValue();
        boolean boolean14 = pOJONode1.hasNonNull("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.asBoolean();
        boolean boolean4 = pOJONode1.isValueNode();
        boolean boolean6 = pOJONode1.asBoolean(true);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        boolean boolean10 = pOJONode1.has((int) (short) -1);
        boolean boolean11 = pOJONode1.isValueNode();
        boolean boolean12 = pOJONode1.isPojo();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        boolean boolean7 = pOJONode1.isNumber();
        boolean boolean9 = pOJONode1.asBoolean(true);
        boolean boolean10 = pOJONode1.isLong();
        boolean boolean12 = pOJONode1.has((-1));
        boolean boolean14 = pOJONode1.has((int) '#');
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator15 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double18 = pOJONode17.doubleValue();
        boolean boolean19 = pOJONode17.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = pOJONode17.asToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = pOJONode1.equals(jsonNodeComparator15, (com.fasterxml.jackson.databind.JsonNode) pOJONode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        boolean boolean3 = pOJONode1.asBoolean();
        boolean boolean4 = pOJONode1.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = pOJONode1.findValues("-1");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator7, serializerProvider8, typeSerializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNodeList6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (short) 0);
        boolean boolean6 = jsonNode5.isShort();
        boolean boolean7 = jsonNode5.isArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!");
        java.lang.Number number12 = pOJONode1.numberValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = pOJONode1.findParent("-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = objectNode14.isPojo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(objectNode14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        boolean boolean6 = pOJONode1.isBoolean();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        double double7 = pOJONode1.asDouble((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        boolean boolean5 = pOJONode1.isObject();
        boolean boolean7 = pOJONode1.has((int) (short) 100);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor9 = pOJONode1.fields();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEntryItor9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        boolean boolean6 = pOJONode1.isArray();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.canConvertToLong();
        java.math.BigInteger bigInteger6 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        boolean boolean5 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.findPath("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        boolean boolean4 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = pOJONode5.findParent("-1");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode5.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        boolean boolean8 = pOJONode1.isInt();
        boolean boolean10 = pOJONode1.asBoolean(false);
        boolean boolean11 = pOJONode1.asBoolean();
        java.lang.Number number12 = pOJONode1.numberValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.get("hi!");
        boolean boolean6 = pOJONode1.isTextual();
        java.lang.String str7 = pOJONode1.asText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.lang.Number number8 = pOJONode7.numberValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal7 = pOJONode1.decimalValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigDecimal7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean14 = pOJONode12.hasNonNull("hi!");
        int int15 = pOJONode12.intValue();
        boolean boolean16 = pOJONode12.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = pOJONode12.traverse();
        java.lang.String str18 = pOJONode12.toString();
        boolean boolean20 = pOJONode12.has((int) (short) 10);
        java.util.List<java.lang.String> strList22 = pOJONode12.findValuesAsText("");
        java.util.List<java.lang.String> strList23 = pOJONode1.findValuesAsText("", strList22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode1.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        boolean boolean7 = pOJONode1.isValueNode();
        int int8 = pOJONode1.asInt();
        java.lang.Object obj9 = pOJONode1._value;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.path("hi!");
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.path("hi!");
        short short14 = jsonNode13.shortValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = pOJONode1.findParent("");
        java.lang.Class<?> wildcardClass13 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        java.lang.Object obj8 = pOJONode1._value;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = pOJONode1.numberType();
        boolean boolean10 = pOJONode1.isNull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(numberType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = pOJONode6.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode6.path("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode6.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonNode4.isObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        int int5 = pOJONode1.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path((int) (byte) 100);
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator8 = pOJONode1.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        boolean boolean3 = pOJONode1.isInt();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType4 = pOJONode1.numberType();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(numberType4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        double double7 = pOJONode1.asDouble((double) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.findValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonNode9.isInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        int int6 = pOJONode1.intValue();
        boolean boolean7 = pOJONode1.isValueNode();
        boolean boolean8 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = pOJONode1.findParent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode10.findPath("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        boolean boolean12 = pOJONode1.isBinary();
        java.lang.Object obj14 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode(obj14);
        boolean boolean16 = pOJONode15.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode15.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode15.path("hi!");
        boolean boolean21 = pOJONode15.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        boolean boolean23 = pOJONode15.isEmpty(serializerProvider22);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = pOJONode15.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode1.findParents("-1", jsonNodeList25);
        boolean boolean27 = pOJONode1.canConvertToLong();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (short) 0);
        long long7 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean8 = pOJONode1.isEmpty(serializerProvider7);
        int int9 = pOJONode1.size();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator10 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = pOJONode12.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor15 = pOJONode12.fields();
        double double16 = pOJONode12.asDouble();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = pOJONode1.equals(jsonNodeComparator10, (com.fasterxml.jackson.databind.JsonNode) pOJONode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertNotNull(strEntryItor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        java.lang.Object obj5 = pOJONode1._value;
        boolean boolean6 = pOJONode1.canConvertToInt();
        int int7 = pOJONode1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isPojo();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = pOJONode1.numberType();
        boolean boolean10 = pOJONode1.isNumber();
        boolean boolean11 = pOJONode1.isInt();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNull(numberType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.has("");
        boolean boolean7 = pOJONode1.canConvertToInt();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator8 = pOJONode1.spliterator();
        boolean boolean9 = pOJONode1.canConvertToInt();
        boolean boolean10 = pOJONode1.isBigDecimal();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.isShort();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.iterator();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pOJONode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.booleanValue();
        long long9 = pOJONode1.asLong((long) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        java.lang.Class<?> wildcardClass12 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get(100);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        java.lang.Object obj12 = pOJONode6._value;
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        java.math.BigDecimal bigDecimal12 = pOJONode6.decimalValue();
        boolean boolean13 = pOJONode6.isInt();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode6.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isInt();
        java.math.BigDecimal bigDecimal4 = pOJONode1.decimalValue();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator5 = pOJONode1.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        java.lang.Object obj9 = pOJONode1.getPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.path(1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNode11.at(jsonPointer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        java.util.Iterator<java.lang.String> strItor7 = pOJONode1.fieldNames();
        java.lang.Object obj9 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode(obj9);
        int int11 = pOJONode10.intValue();
        java.lang.String str12 = pOJONode10.asText();
        boolean boolean13 = pOJONode10.booleanValue();
        boolean boolean14 = pOJONode10.isDouble();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = pOJONode10.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList23 = pOJONode1.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator24, serializerProvider25, typeSerializer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        java.lang.Object obj8 = pOJONode1._value;
        boolean boolean9 = pOJONode1.isArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean4 = pOJONode1.isMissingNode();
        boolean boolean5 = pOJONode1.isNumber();
        java.lang.Class<?> wildcardClass6 = pOJONode1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        boolean boolean10 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get("hi!");
        int int14 = pOJONode1.asInt((int) (byte) -1);
        byte[] byteArray15 = pOJONode1.binaryValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(byteArray15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = pOJONode1.findParents("-1");
        boolean boolean7 = pOJONode1.booleanValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isInt();
        java.math.BigDecimal bigDecimal4 = pOJONode1.decimalValue();
        double double6 = pOJONode1.asDouble((double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        boolean boolean6 = pOJONode1.isBigInteger();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) boolean6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        float float9 = pOJONode1.floatValue();
        boolean boolean10 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.path("hi!");
        boolean boolean13 = pOJONode1.isIntegralNumber();
        boolean boolean14 = pOJONode1.isBigInteger();
        int int15 = pOJONode1.asInt();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = pOJONode1.findParent("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.get(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonNode10.isBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(jsonNode10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        boolean boolean7 = pOJONode1.has(10);
        long long9 = pOJONode1.asLong((long) (short) 100);
        java.lang.Number number10 = pOJONode1.numberValue();
        boolean boolean11 = pOJONode1.isNull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        boolean boolean7 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = pOJONode1.findParent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objectNode9.isValueNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = pOJONode1.findParent("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        boolean boolean6 = pOJONode1.isPojo();
        boolean boolean7 = pOJONode1.isLong();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType8 = pOJONode1.numberType();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(numberType8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        java.lang.Object obj7 = pOJONode1.getPojo();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator8 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode10.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode10.deepCopy();
        boolean boolean14 = pOJONode10.isPojo();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = pOJONode10.iterator();
        boolean boolean16 = pOJONode10.canConvertToInt();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = pOJONode1.equals(jsonNodeComparator8, (com.fasterxml.jackson.databind.JsonNode) pOJONode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("hi!");
        java.lang.Number number11 = pOJONode1.numberValue();
        boolean boolean13 = pOJONode1.hasNonNull("");
        boolean boolean14 = pOJONode1.isObject();
        boolean boolean15 = pOJONode1.asBoolean();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        boolean boolean6 = pOJONode1.isValueNode();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator7 = null;
        java.lang.Object obj8 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode(obj8);
        boolean boolean10 = pOJONode9.asBoolean();
        byte[] byteArray11 = pOJONode9.binaryValue();
        java.lang.Object obj12 = pOJONode9._value;
        java.lang.Object obj14 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode(obj14);
        int int16 = pOJONode15.intValue();
        java.lang.String str17 = pOJONode15.asText();
        boolean boolean18 = pOJONode15.booleanValue();
        boolean boolean19 = pOJONode15.isDouble();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = pOJONode15.findValuesAsText("", (java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList28 = pOJONode9.findValuesAsText("hi!", strList27);
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = pOJONode9.at("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = pOJONode1.equals(jsonNodeComparator7, jsonNode30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(jsonNode30);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        java.lang.String str5 = pOJONode1.textValue();
        java.lang.Object obj6 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode(obj6);
        int int8 = pOJONode7.intValue();
        boolean boolean9 = pOJONode7.isNull();
        boolean boolean10 = pOJONode7.isPojo();
        java.math.BigDecimal bigDecimal11 = pOJONode7.decimalValue();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator12 = pOJONode7.spliterator();
        boolean boolean13 = pOJONode1.equals((java.lang.Object) pOJONode7);
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator14 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = pOJONode16.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = pOJONode16.deepCopy();
        double double21 = pOJONode16.asDouble(1.0d);
        boolean boolean22 = pOJONode16.isShort();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = pOJONode7.equals(jsonNodeComparator14, (com.fasterxml.jackson.databind.JsonNode) pOJONode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) jsonToken8);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode9.elements();
        java.lang.Class<?> wildcardClass11 = jsonNodeItor10.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNodeItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = pOJONode6.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode6.path("");
        boolean boolean15 = pOJONode6.isFloatingPointNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.isContainerNode();
        java.util.List<java.lang.String> strList5 = pOJONode1.findValuesAsText("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isObject();
        boolean boolean6 = pOJONode1.has((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor9 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode1.elements();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(strEntryItor9);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        double double7 = pOJONode1.asDouble((double) (short) 10);
        boolean boolean8 = pOJONode1.isBinary();
        java.lang.Object obj9 = pOJONode1.getPojo();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        boolean boolean7 = pOJONode1.isValueNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.get("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonNode9.asInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        boolean boolean9 = pOJONode1.isBinary();
        java.lang.Object obj10 = null;
        boolean boolean11 = pOJONode1.equals(obj10);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean8 = pOJONode1.isEmpty(serializerProvider7);
        long long9 = pOJONode1.asLong();
        boolean boolean10 = pOJONode1.isObject();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.math.BigInteger bigInteger5 = jsonNode4.bigIntegerValue();
        boolean boolean6 = jsonNode4.isArray();
        boolean boolean7 = jsonNode4.isBigInteger();
        boolean boolean8 = jsonNode4.canConvertToLong();
        boolean boolean9 = jsonNode4.isTextual();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = jsonNode4.findParents("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (short) 0);
        boolean boolean6 = jsonNode5.isShort();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = jsonNode5.fields();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strEntryItor7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        long long9 = pOJONode7.asLong((long) (short) 100);
        long long10 = pOJONode7.longValue();
        boolean boolean11 = pOJONode7.isFloat();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        boolean boolean4 = baseJsonNode3.isObject();
        java.math.BigInteger bigInteger5 = baseJsonNode3.bigIntegerValue();
        boolean boolean6 = baseJsonNode3.isValueNode();
        boolean boolean7 = baseJsonNode3.isArray();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = baseJsonNode3.findValues("hi!");
        boolean boolean10 = baseJsonNode3.isNumber();
        boolean boolean11 = baseJsonNode3.isBoolean();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.get("");
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertNull(jsonNode10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        boolean boolean9 = jsonNode8.isIntegralNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = pOJONode1.findParents("hi!");
        boolean boolean5 = pOJONode1.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = pOJONode1.numberType();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(numberType6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        boolean boolean5 = pOJONode1.isTextual();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double7 = pOJONode6.doubleValue();
        boolean boolean9 = pOJONode6.hasNonNull("hi!");
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.asBoolean();
        java.lang.Object obj15 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode(obj15);
        boolean boolean17 = pOJONode16.asBoolean();
        boolean boolean18 = pOJONode16.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor21 = pOJONode20.elements();
        boolean boolean22 = pOJONode20.isFloatingPointNumber();
        java.lang.String str23 = pOJONode20.toString();
        java.lang.Object obj24 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode25 = new com.fasterxml.jackson.databind.node.POJONode(obj24);
        boolean boolean26 = pOJONode25.asBoolean();
        byte[] byteArray27 = pOJONode25.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode29 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = pOJONode29.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor32 = pOJONode29.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode34 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList36 = pOJONode34.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor39 = pOJONode38.elements();
        boolean boolean40 = pOJONode38.isFloatingPointNumber();
        java.lang.String str41 = pOJONode38.toString();
        java.lang.Object obj42 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode43 = new com.fasterxml.jackson.databind.node.POJONode(obj42);
        boolean boolean44 = pOJONode43.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray45 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode16, pOJONode20, pOJONode25, pOJONode29, pOJONode34, pOJONode38, pOJONode43 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46, jsonNodeArray45);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = pOJONode12.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = pOJONode6.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList46);
        boolean boolean52 = pOJONode1.hasNonNull((int) (short) 10);
        double double53 = pOJONode1.doubleValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(strEntryItor32);
        org.junit.Assert.assertNotNull(jsonNodeList36);
        org.junit.Assert.assertNotNull(jsonNodeItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-1" + "'", str41, "-1");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        boolean boolean5 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path((int) (byte) 10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.at(jsonPointer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        int int8 = pOJONode1.asInt();
        boolean boolean10 = pOJONode1.hasNonNull((int) (byte) 100);
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator11 = pOJONode1.spliterator();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = pOJONode1.elements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator11);
        org.junit.Assert.assertNotNull(jsonNodeItor12);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.isMissingNode();
        boolean boolean9 = pOJONode1.isFloatingPointNumber();
        java.math.BigInteger bigInteger10 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNode8.at(jsonPointer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        com.fasterxml.jackson.core.JsonToken jsonToken5 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.get((int) (byte) 0);
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator8 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode10.findValues("hi!");
        java.lang.String str13 = pOJONode10.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = pOJONode15.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode15.deepCopy();
        boolean boolean19 = pOJONode15.isPojo();
        boolean boolean20 = pOJONode10._pojoEquals(pOJONode15);
        byte[] byteArray21 = pOJONode15.binaryValue();
        java.lang.String str22 = pOJONode15.asText();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = pOJONode1.equals(jsonNodeComparator8, (com.fasterxml.jackson.databind.JsonNode) pOJONode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1" + "'", str22, "-1");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        boolean boolean7 = pOJONode1.isNumber();
        boolean boolean9 = pOJONode1.asBoolean(true);
        boolean boolean10 = pOJONode1.isLong();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        java.util.Iterator<java.lang.String> strItor7 = pOJONode1.fieldNames();
        java.lang.String str8 = pOJONode1.toString();
        java.lang.String str10 = pOJONode1.asText("-1");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.at("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        int int8 = pOJONode1.asInt();
        boolean boolean9 = pOJONode1.canConvertToLong();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator10, serializerProvider11, typeSerializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        boolean boolean9 = pOJONode1.isObject();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get("hi!");
        java.lang.String str13 = pOJONode1.asText("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        long long10 = pOJONode1.asLong((long) (short) 100);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        java.math.BigDecimal bigDecimal6 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get("-1");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonNode8.intValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNull(jsonNode8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        boolean boolean5 = pOJONode1.isObject();
        java.lang.Object obj7 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode(obj7);
        int int9 = pOJONode8.intValue();
        boolean boolean10 = pOJONode8.isNull();
        int int12 = pOJONode8.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor13 = pOJONode8.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor14 = pOJONode8.elements();
        java.lang.Object obj15 = pOJONode8._value;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = pOJONode8.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = pOJONode1.findParents("-1", jsonNodeList17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode1.at(jsonPointer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(strEntryItor13);
        org.junit.Assert.assertNotNull(jsonNodeItor14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(jsonNodeList18);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode1.elements();
        double double9 = pOJONode1.doubleValue();
        long long11 = pOJONode1.asLong((-1L));
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        java.lang.Object obj6 = pOJONode1._value;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode1.findParents("");
        java.lang.String str10 = pOJONode1.asText("");
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = jsonNode4.isMissingNode();
        boolean boolean6 = jsonNode4.isValueNode();
        long long7 = jsonNode4.asLong();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNode4.at(jsonPointer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        java.lang.String str9 = pOJONode1.asText();
        java.math.BigDecimal bigDecimal10 = pOJONode1.decimalValue();
        int int11 = pOJONode1.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonNode13.isPojo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonNode13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        boolean boolean4 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.lang.Object obj6 = pOJONode1.getPojo();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean9 = pOJONode1.isEmpty(serializerProvider8);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.path((int) (byte) 10);
        double double12 = pOJONode1.doubleValue();
        java.lang.Number number13 = pOJONode1.numberValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        boolean boolean9 = pOJONode1.isObject();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get("hi!");
        java.lang.Object obj12 = pOJONode1._value;
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        java.util.Iterator<java.lang.String> strItor6 = pOJONode1.fieldNames();
        java.lang.String str7 = pOJONode1.asText();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        byte[] byteArray14 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode17.deepCopy();
        java.util.Iterator<java.lang.String> strItor21 = pOJONode17.fieldNames();
        boolean boolean22 = pOJONode17.canConvertToInt();
        boolean boolean23 = pOJONode17.booleanValue();
        double double24 = pOJONode17.asDouble();
        java.lang.Object obj26 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode(obj26);
        int int28 = pOJONode27.intValue();
        boolean boolean29 = pOJONode27.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double33 = pOJONode32.doubleValue();
        boolean boolean35 = pOJONode32.hasNonNull("hi!");
        java.lang.Object obj37 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode(obj37);
        boolean boolean39 = pOJONode38.asBoolean();
        java.lang.Object obj41 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode42 = new com.fasterxml.jackson.databind.node.POJONode(obj41);
        boolean boolean43 = pOJONode42.asBoolean();
        boolean boolean44 = pOJONode42.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode46 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor47 = pOJONode46.elements();
        boolean boolean48 = pOJONode46.isFloatingPointNumber();
        java.lang.String str49 = pOJONode46.toString();
        java.lang.Object obj50 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode51 = new com.fasterxml.jackson.databind.node.POJONode(obj50);
        boolean boolean52 = pOJONode51.asBoolean();
        byte[] byteArray53 = pOJONode51.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode55 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = pOJONode55.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor58 = pOJONode55.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode60 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList62 = pOJONode60.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode64 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor65 = pOJONode64.elements();
        boolean boolean66 = pOJONode64.isFloatingPointNumber();
        java.lang.String str67 = pOJONode64.toString();
        java.lang.Object obj68 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode69 = new com.fasterxml.jackson.databind.node.POJONode(obj68);
        boolean boolean70 = pOJONode69.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray71 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode42, pOJONode46, pOJONode51, pOJONode55, pOJONode60, pOJONode64, pOJONode69 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList72 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72, jsonNodeArray71);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = pOJONode38.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList75 = pOJONode32.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList76 = pOJONode27.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList77 = pOJONode17.findParents("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList78 = pOJONode1.findParents("hi!", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        boolean boolean79 = pOJONode1.isLong();
        long long81 = pOJONode1.asLong((long) (-1));
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider82 = null;
        boolean boolean83 = pOJONode1.isEmpty(serializerProvider82);
        java.lang.Object obj84 = pOJONode1.getPojo();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1" + "'", str49, "-1");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(jsonNodeList57);
        org.junit.Assert.assertNotNull(strEntryItor58);
        org.junit.Assert.assertNotNull(jsonNodeList62);
        org.junit.Assert.assertNotNull(jsonNodeItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "-1" + "'", str67, "-1");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNotNull(jsonNodeList75);
        org.junit.Assert.assertNotNull(jsonNodeList76);
        org.junit.Assert.assertNotNull(jsonNodeList77);
        org.junit.Assert.assertNotNull(jsonNodeList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (byte) -1 + "'", obj84, (byte) -1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.findPath("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNode5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        java.lang.String str5 = pOJONode1.toString();
        java.lang.Object obj7 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode(obj7);
        int int9 = pOJONode8.intValue();
        boolean boolean10 = pOJONode8.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double14 = pOJONode13.doubleValue();
        boolean boolean16 = pOJONode13.hasNonNull("hi!");
        java.lang.Object obj18 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode19 = new com.fasterxml.jackson.databind.node.POJONode(obj18);
        boolean boolean20 = pOJONode19.asBoolean();
        java.lang.Object obj22 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode(obj22);
        boolean boolean24 = pOJONode23.asBoolean();
        boolean boolean25 = pOJONode23.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor28 = pOJONode27.elements();
        boolean boolean29 = pOJONode27.isFloatingPointNumber();
        java.lang.String str30 = pOJONode27.toString();
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        byte[] byteArray34 = pOJONode32.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode36 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = pOJONode36.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor39 = pOJONode36.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode41 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = pOJONode41.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode45 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor46 = pOJONode45.elements();
        boolean boolean47 = pOJONode45.isFloatingPointNumber();
        java.lang.String str48 = pOJONode45.toString();
        java.lang.Object obj49 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode50 = new com.fasterxml.jackson.databind.node.POJONode(obj49);
        boolean boolean51 = pOJONode50.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray52 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode23, pOJONode27, pOJONode32, pOJONode36, pOJONode41, pOJONode45, pOJONode50 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53, jsonNodeArray52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = pOJONode19.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = pOJONode13.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = pOJONode8.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = pOJONode1.findParents("", jsonNodeList57);
        boolean boolean59 = pOJONode1.isLong();
        boolean boolean60 = pOJONode1.isNull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertNotNull(strEntryItor39);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNodeItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "-1" + "'", str48, "-1");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNodeList57);
        org.junit.Assert.assertNotNull(jsonNodeList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = pOJONode1.deepCopy();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pOJONode8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.math.BigInteger bigInteger9 = pOJONode1.bigIntegerValue();
        boolean boolean10 = pOJONode1.isMissingNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        boolean boolean4 = pOJONode1.isBinary();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path((int) (short) 0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = pOJONode1.findParent("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = pOJONode1.findParent("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objectNode10.isIntegralNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.canConvertToLong();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.withArray("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = pOJONode1.numberType();
        boolean boolean7 = pOJONode1.isDouble();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator8 = pOJONode1.spliterator();
        boolean boolean9 = pOJONode1.isBoolean();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findParents("-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(numberType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        boolean boolean4 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = pOJONode5.findParent("-1");
        long long8 = pOJONode5.asLong();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        boolean boolean12 = pOJONode1.isBinary();
        boolean boolean13 = pOJONode1.isTextual();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        boolean boolean7 = pOJONode1.isNumber();
        boolean boolean9 = pOJONode1.asBoolean(true);
        boolean boolean10 = pOJONode1.isLong();
        boolean boolean12 = pOJONode1.has((-1));
        boolean boolean14 = pOJONode1.has((int) '#');
        java.math.BigDecimal bigDecimal15 = pOJONode1.decimalValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = pOJONode1.findParents("hi!");
        java.lang.Class<?> wildcardClass18 = pOJONode1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor14 = jsonNode13.fields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        java.lang.Object obj4 = pOJONode1._value;
        java.lang.Object obj6 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode(obj6);
        int int8 = pOJONode7.intValue();
        java.lang.String str9 = pOJONode7.asText();
        boolean boolean10 = pOJONode7.booleanValue();
        boolean boolean11 = pOJONode7.isDouble();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = pOJONode7.findValuesAsText("", (java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList20 = pOJONode1.findValuesAsText("hi!", strList19);
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = pOJONode1.at("");
        boolean boolean23 = pOJONode1.isLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get(10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.deepCopy();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNode12.at(jsonPointer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        java.lang.Object obj4 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode(obj4);
        boolean boolean6 = pOJONode5.asBoolean();
        boolean boolean7 = pOJONode5.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode9.elements();
        boolean boolean11 = pOJONode9.isFloatingPointNumber();
        java.lang.String str12 = pOJONode9.toString();
        java.lang.Object obj13 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode(obj13);
        boolean boolean15 = pOJONode14.asBoolean();
        byte[] byteArray16 = pOJONode14.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode18.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor21 = pOJONode18.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = pOJONode23.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor28 = pOJONode27.elements();
        boolean boolean29 = pOJONode27.isFloatingPointNumber();
        java.lang.String str30 = pOJONode27.toString();
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray34 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode5, pOJONode9, pOJONode14, pOJONode18, pOJONode23, pOJONode27, pOJONode32 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList35, jsonNodeArray34);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode1.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList35);
        boolean boolean38 = pOJONode1.isShort();
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = pOJONode1.traverse(objectCodec39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(strEntryItor21);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(jsonNodeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonParser40);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        short short4 = pOJONode1.shortValue();
        boolean boolean5 = pOJONode1.isLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.get("");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.get(10);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonNode7);
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal7 = pOJONode1.decimalValue();
        boolean boolean8 = pOJONode1.isContainerNode();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (byte) 10);
        double double6 = jsonNode5.asDouble();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNode5.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.isShort();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        double double8 = pOJONode1.doubleValue();
        boolean boolean9 = pOJONode1.isInt();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pOJONode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!");
        java.lang.Number number12 = pOJONode1.numberValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = pOJONode1.findParent("-1");
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator15 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode17.deepCopy();
        boolean boolean21 = pOJONode17.isPojo();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor22 = pOJONode17.iterator();
        int int23 = pOJONode17.asInt();
        boolean boolean24 = pOJONode17.isFloatingPointNumber();
        boolean boolean25 = pOJONode17.isShort();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = pOJONode1.equals(jsonNodeComparator15, (com.fasterxml.jackson.databind.JsonNode) pOJONode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        short short2 = pOJONode1.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findPath("hi!");
        boolean boolean5 = pOJONode1.isBoolean();
        java.lang.String str6 = pOJONode1.asText();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.findPath("-1");
        java.lang.Class<?> wildcardClass13 = jsonNode12.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        java.lang.Object obj10 = pOJONode1.getPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get((int) (short) 0);
        boolean boolean14 = pOJONode1.has("");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode6.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode8 = pOJONode6.deepCopy();
        int int9 = baseJsonNode8.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = baseJsonNode8.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode1.findValues("-1", jsonNodeList11);
        boolean boolean13 = pOJONode1.isObject();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode1.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.isShort();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        long long8 = pOJONode1.asLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pOJONode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = pOJONode1.traverse();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonParser4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        double double3 = pOJONode1.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        boolean boolean5 = pOJONode1.isContainerNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        boolean boolean6 = pOJONode1.isBigInteger();
        boolean boolean7 = pOJONode1.isNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.canConvertToLong();
        byte[] byteArray6 = pOJONode1.binaryValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        double double4 = pOJONode1.asDouble();
        java.lang.String str6 = pOJONode1.asText("");
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        java.lang.Object obj6 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode(obj6);
        boolean boolean8 = pOJONode7.asBoolean();
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        boolean boolean12 = pOJONode11.asBoolean();
        boolean boolean13 = pOJONode11.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor16 = pOJONode15.elements();
        boolean boolean17 = pOJONode15.isFloatingPointNumber();
        java.lang.String str18 = pOJONode15.toString();
        java.lang.Object obj19 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode(obj19);
        boolean boolean21 = pOJONode20.asBoolean();
        byte[] byteArray22 = pOJONode20.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode24.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor27 = pOJONode24.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode29 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = pOJONode29.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode33 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor34 = pOJONode33.elements();
        boolean boolean35 = pOJONode33.isFloatingPointNumber();
        java.lang.String str36 = pOJONode33.toString();
        java.lang.Object obj37 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode(obj37);
        boolean boolean39 = pOJONode38.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray40 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode11, pOJONode15, pOJONode20, pOJONode24, pOJONode29, pOJONode33, pOJONode38 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList41, jsonNodeArray40);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = pOJONode7.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList41);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList44 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList41);
        long long45 = pOJONode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = pOJONode1.get((int) (short) -1);
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator48 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode50 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor51 = pOJONode50.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode52 = pOJONode50.deepCopy();
        int int53 = baseJsonNode52.size();
        boolean boolean54 = baseJsonNode52.canConvertToInt();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator55 = baseJsonNode52.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = pOJONode1.equals(jsonNodeComparator48, (com.fasterxml.jackson.databind.JsonNode) baseJsonNode52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(strEntryItor27);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNodeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1" + "'", str36, "-1");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNodeList44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(jsonNode47);
        org.junit.Assert.assertNotNull(jsonNodeItor51);
        org.junit.Assert.assertNotNull(baseJsonNode52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator55);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = pOJONode1.findParent("-1");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.at(jsonPointer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode6.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode8 = pOJONode6.deepCopy();
        int int9 = baseJsonNode8.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = baseJsonNode8.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode1.findValues("-1", jsonNodeList11);
        int int13 = pOJONode1.asInt();
        boolean boolean14 = pOJONode1.canConvertToInt();
        long long15 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode1.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(jsonNode17);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal6 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode8.fields();
        double double12 = pOJONode8.asDouble();
        boolean boolean13 = pOJONode1._pojoEquals(pOJONode8);
        java.lang.Object obj14 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode(obj14);
        int int16 = pOJONode15.intValue();
        boolean boolean17 = pOJONode15.isNull();
        boolean boolean18 = pOJONode15.isPojo();
        boolean boolean19 = pOJONode8.equals((java.lang.Object) boolean18);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode8.serializeWithType(jsonGenerator20, serializerProvider21, typeSerializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        java.lang.String str4 = pOJONode1.textValue();
        boolean boolean5 = pOJONode1.isPojo();
        boolean boolean6 = pOJONode1.isInt();
        boolean boolean7 = pOJONode1.isNumber();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get(10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.deepCopy();
        boolean boolean13 = jsonNode12.isFloat();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        java.util.List<java.lang.String> strList7 = pOJONode1.findValuesAsText("-1");
        int int8 = pOJONode1.intValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.toString();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator6 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean10 = pOJONode8.hasNonNull("hi!");
        int int11 = pOJONode8.intValue();
        boolean boolean12 = pOJONode8.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = pOJONode8.traverse();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = pOJONode8.traverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = pOJONode1.equals(jsonNodeComparator6, (com.fasterxml.jackson.databind.JsonNode) pOJONode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonParser14);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        boolean boolean9 = pOJONode1.isObject();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonNode11.isFloatingPointNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonNode11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        byte[] byteArray14 = pOJONode1.binaryValue();
        boolean boolean15 = pOJONode1.isBigDecimal();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = pOJONode18.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode20 = pOJONode18.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean22 = pOJONode18.isEmpty(serializerProvider21);
        boolean boolean24 = pOJONode18.hasNonNull((int) '4');
        java.lang.String str25 = pOJONode18.asText();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = pOJONode18.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList28 = pOJONode1.findParents("-1", jsonNodeList27);
        long long29 = pOJONode1.asLong();
        float float30 = pOJONode1.floatValue();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertNotNull(baseJsonNode20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertNotNull(jsonNodeList28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = pOJONode6.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode6.iterator();
        boolean boolean9 = pOJONode1.equals((java.lang.Object) pOJONode6);
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double13 = pOJONode12.doubleValue();
        boolean boolean15 = pOJONode12.hasNonNull("hi!");
        java.lang.Object obj17 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode(obj17);
        boolean boolean19 = pOJONode18.asBoolean();
        java.lang.Object obj21 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode(obj21);
        boolean boolean23 = pOJONode22.asBoolean();
        boolean boolean24 = pOJONode22.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor27 = pOJONode26.elements();
        boolean boolean28 = pOJONode26.isFloatingPointNumber();
        java.lang.String str29 = pOJONode26.toString();
        java.lang.Object obj30 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode31 = new com.fasterxml.jackson.databind.node.POJONode(obj30);
        boolean boolean32 = pOJONode31.asBoolean();
        byte[] byteArray33 = pOJONode31.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode35.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor38 = pOJONode35.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode40 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList42 = pOJONode40.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor45 = pOJONode44.elements();
        boolean boolean46 = pOJONode44.isFloatingPointNumber();
        java.lang.String str47 = pOJONode44.toString();
        java.lang.Object obj48 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode49 = new com.fasterxml.jackson.databind.node.POJONode(obj48);
        boolean boolean50 = pOJONode49.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray51 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode22, pOJONode26, pOJONode31, pOJONode35, pOJONode40, pOJONode44, pOJONode49 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52, jsonNodeArray51);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList54 = pOJONode18.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = pOJONode12.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = pOJONode1.findValues("hi!", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = null;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = pOJONode1.findParents("hi!", jsonNodeList58);
        java.lang.Number number60 = pOJONode1.numberValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryItor7);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(strEntryItor38);
        org.junit.Assert.assertNotNull(jsonNodeList42);
        org.junit.Assert.assertNotNull(jsonNodeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jsonNodeList54);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNull(jsonNodeList59);
        org.junit.Assert.assertNull(number60);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.util.Iterator<java.lang.String> strItor9 = pOJONode1.fieldNames();
        java.math.BigInteger bigInteger10 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean8 = pOJONode1.isEmpty(serializerProvider7);
        int int9 = pOJONode1.size();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = pOJONode1.traverse();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.at("");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        boolean boolean8 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode9 = pOJONode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findParents("hi!");
        double double13 = pOJONode1.asDouble((double) 100.0f);
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(baseJsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode4 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = pOJONode4.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode6 = pOJONode4.deepCopy();
        boolean boolean7 = pOJONode1._pojoEquals(pOJONode4);
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor11 = pOJONode10.elements();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = pOJONode10.findParents("hi!");
        boolean boolean14 = pOJONode10.isIntegralNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode17.deepCopy();
        java.util.Iterator<java.lang.String> strItor21 = pOJONode17.fieldNames();
        short short22 = pOJONode17.shortValue();
        boolean boolean24 = pOJONode17.has((int) (short) 10);
        boolean boolean25 = pOJONode17.canConvertToLong();
        java.lang.Object obj27 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode28 = new com.fasterxml.jackson.databind.node.POJONode(obj27);
        boolean boolean29 = pOJONode28.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = pOJONode28.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = pOJONode28.path("hi!");
        boolean boolean34 = pOJONode28.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        boolean boolean36 = pOJONode28.isEmpty(serializerProvider35);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = pOJONode28.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList39 = pOJONode17.findParents("-1", jsonNodeList38);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList40 = pOJONode10.findParents("hi!", jsonNodeList39);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = pOJONode1.findValues("", jsonNodeList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = pOJONode1.findParent("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertNotNull(baseJsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor11);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertNotNull(jsonNodeList39);
        org.junit.Assert.assertNotNull(jsonNodeList40);
        org.junit.Assert.assertNotNull(jsonNodeList41);
        org.junit.Assert.assertNull(objectNode43);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        byte[] byteArray14 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode17.deepCopy();
        java.util.Iterator<java.lang.String> strItor21 = pOJONode17.fieldNames();
        boolean boolean22 = pOJONode17.canConvertToInt();
        boolean boolean23 = pOJONode17.booleanValue();
        double double24 = pOJONode17.asDouble();
        java.lang.Object obj26 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode(obj26);
        int int28 = pOJONode27.intValue();
        boolean boolean29 = pOJONode27.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double33 = pOJONode32.doubleValue();
        boolean boolean35 = pOJONode32.hasNonNull("hi!");
        java.lang.Object obj37 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode(obj37);
        boolean boolean39 = pOJONode38.asBoolean();
        java.lang.Object obj41 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode42 = new com.fasterxml.jackson.databind.node.POJONode(obj41);
        boolean boolean43 = pOJONode42.asBoolean();
        boolean boolean44 = pOJONode42.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode46 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor47 = pOJONode46.elements();
        boolean boolean48 = pOJONode46.isFloatingPointNumber();
        java.lang.String str49 = pOJONode46.toString();
        java.lang.Object obj50 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode51 = new com.fasterxml.jackson.databind.node.POJONode(obj50);
        boolean boolean52 = pOJONode51.asBoolean();
        byte[] byteArray53 = pOJONode51.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode55 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = pOJONode55.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor58 = pOJONode55.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode60 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList62 = pOJONode60.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode64 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor65 = pOJONode64.elements();
        boolean boolean66 = pOJONode64.isFloatingPointNumber();
        java.lang.String str67 = pOJONode64.toString();
        java.lang.Object obj68 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode69 = new com.fasterxml.jackson.databind.node.POJONode(obj68);
        boolean boolean70 = pOJONode69.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray71 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode42, pOJONode46, pOJONode51, pOJONode55, pOJONode60, pOJONode64, pOJONode69 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList72 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72, jsonNodeArray71);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = pOJONode38.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList75 = pOJONode32.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList76 = pOJONode27.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList77 = pOJONode17.findParents("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList78 = pOJONode1.findParents("hi!", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList72);
        boolean boolean79 = pOJONode1.isObject();
        boolean boolean80 = pOJONode1.isIntegralNumber();
        java.lang.String str81 = pOJONode1.textValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = pOJONode1.path((int) 'a');
        boolean boolean84 = pOJONode1.isBinary();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1" + "'", str49, "-1");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(jsonNodeList57);
        org.junit.Assert.assertNotNull(strEntryItor58);
        org.junit.Assert.assertNotNull(jsonNodeList62);
        org.junit.Assert.assertNotNull(jsonNodeItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "-1" + "'", str67, "-1");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNotNull(jsonNodeList75);
        org.junit.Assert.assertNotNull(jsonNodeList76);
        org.junit.Assert.assertNotNull(jsonNodeList77);
        org.junit.Assert.assertNotNull(jsonNodeList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = pOJONode1.findParent("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get((int) '4');
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        boolean boolean12 = pOJONode11.asBoolean();
        byte[] byteArray13 = pOJONode11.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor17 = pOJONode16.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode18 = pOJONode16.deepCopy();
        int int19 = baseJsonNode18.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = baseJsonNode18.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode11.findValues("-1", jsonNodeList21);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = pOJONode1.findValues("hi!", jsonNodeList21);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType24 = pOJONode1.numberType();
        boolean boolean25 = pOJONode1.canConvertToInt();
        boolean boolean26 = pOJONode1.isDouble();
        java.lang.String str27 = pOJONode1.asText();
        java.lang.Object obj28 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode29 = new com.fasterxml.jackson.databind.node.POJONode(obj28);
        boolean boolean30 = pOJONode29.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = pOJONode29.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = pOJONode29.path("hi!");
        java.math.BigInteger bigInteger35 = pOJONode29.bigIntegerValue();
        boolean boolean36 = pOJONode1._pojoEquals(pOJONode29);
        java.lang.Object obj37 = pOJONode1.getPojo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(jsonNodeItor17);
        org.junit.Assert.assertNotNull(baseJsonNode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertNull(numberType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        int int8 = pOJONode1.asInt();
        boolean boolean9 = pOJONode1.isNull();
        boolean boolean10 = pOJONode1.isBigDecimal();
        boolean boolean11 = pOJONode1.isFloatingPointNumber();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.canConvertToLong();
        double double9 = pOJONode1.doubleValue();
        boolean boolean10 = pOJONode1.isArray();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.util.Iterator<java.lang.String> strItor9 = pOJONode1.fieldNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.at("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        boolean boolean8 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode9 = pOJONode1.deepCopy();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor10 = baseJsonNode9.fields();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(baseJsonNode9);
        org.junit.Assert.assertNotNull(strEntryItor10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        java.lang.Object obj5 = pOJONode1._value;
        java.math.BigInteger bigInteger6 = pOJONode1.bigIntegerValue();
        java.lang.Number number7 = pOJONode1.numberValue();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        boolean boolean4 = baseJsonNode3.isObject();
        java.math.BigInteger bigInteger5 = baseJsonNode3.bigIntegerValue();
        boolean boolean6 = baseJsonNode3.isValueNode();
        boolean boolean7 = baseJsonNode3.isArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = baseJsonNode3.traverse();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        boolean boolean7 = pOJONode1.has("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = pOJONode1.findParent("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.findValue("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(jsonNode11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.deepCopy();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        boolean boolean12 = pOJONode1.isBinary();
        java.lang.Object obj14 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode(obj14);
        boolean boolean16 = pOJONode15.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode15.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode15.path("hi!");
        boolean boolean21 = pOJONode15.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        boolean boolean23 = pOJONode15.isEmpty(serializerProvider22);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = pOJONode15.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode1.findParents("-1", jsonNodeList25);
        java.lang.String str27 = pOJONode1.toString();
        float float28 = pOJONode1.floatValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        boolean boolean4 = baseJsonNode3.isObject();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor5 = baseJsonNode3.fields();
        boolean boolean6 = baseJsonNode3.isTextual();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        boolean boolean4 = pOJONode1.isBinary();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator5 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode7.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode9 = pOJONode7.deepCopy();
        int int10 = pOJONode7.asInt();
        java.lang.String str11 = pOJONode7.textValue();
        java.lang.Object obj12 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode(obj12);
        int int14 = pOJONode13.intValue();
        boolean boolean15 = pOJONode13.isNull();
        boolean boolean16 = pOJONode13.isPojo();
        java.math.BigDecimal bigDecimal17 = pOJONode13.decimalValue();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator18 = pOJONode13.spliterator();
        boolean boolean19 = pOJONode7.equals((java.lang.Object) pOJONode13);
        boolean boolean20 = pOJONode7.isBoolean();
        byte[] byteArray21 = pOJONode7.binaryValue();
        float float22 = pOJONode7.floatValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = pOJONode1.equals(jsonNodeComparator5, (com.fasterxml.jackson.databind.JsonNode) pOJONode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertNotNull(baseJsonNode9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        boolean boolean9 = pOJONode1.canConvertToLong();
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode12.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode12.path("hi!");
        boolean boolean18 = pOJONode12.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        boolean boolean20 = pOJONode12.isEmpty(serializerProvider19);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode12.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = pOJONode1.findParents("-1", jsonNodeList22);
        short short24 = pOJONode1.shortValue();
        boolean boolean26 = pOJONode1.has("");
        int int28 = pOJONode1.asInt((int) (short) 0);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        boolean boolean4 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = pOJONode5.findParent("-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objectNode7.isPojo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        long long6 = pOJONode1.asLong(100L);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.iterator();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(jsonNodeItor7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode6.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode8 = pOJONode6.deepCopy();
        int int9 = baseJsonNode8.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = baseJsonNode8.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode1.findValues("-1", jsonNodeList11);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = pOJONode1.asToken();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.booleanValue();
        double double8 = pOJONode1.asDouble();
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        int int12 = pOJONode11.intValue();
        boolean boolean13 = pOJONode11.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double17 = pOJONode16.doubleValue();
        boolean boolean19 = pOJONode16.hasNonNull("hi!");
        java.lang.Object obj21 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode(obj21);
        boolean boolean23 = pOJONode22.asBoolean();
        java.lang.Object obj25 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode(obj25);
        boolean boolean27 = pOJONode26.asBoolean();
        boolean boolean28 = pOJONode26.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor31 = pOJONode30.elements();
        boolean boolean32 = pOJONode30.isFloatingPointNumber();
        java.lang.String str33 = pOJONode30.toString();
        java.lang.Object obj34 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode(obj34);
        boolean boolean36 = pOJONode35.asBoolean();
        byte[] byteArray37 = pOJONode35.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = pOJONode39.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor42 = pOJONode39.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = pOJONode44.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode48 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor49 = pOJONode48.elements();
        boolean boolean50 = pOJONode48.isFloatingPointNumber();
        java.lang.String str51 = pOJONode48.toString();
        java.lang.Object obj52 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode53 = new com.fasterxml.jackson.databind.node.POJONode(obj52);
        boolean boolean54 = pOJONode53.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray55 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode26, pOJONode30, pOJONode35, pOJONode39, pOJONode44, pOJONode48, pOJONode53 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56, jsonNodeArray55);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = pOJONode22.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = pOJONode16.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList60 = pOJONode11.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList61 = pOJONode1.findParents("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        boolean boolean62 = pOJONode1.isObject();
        boolean boolean63 = pOJONode1.isNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertNotNull(jsonNodeList41);
        org.junit.Assert.assertNotNull(strEntryItor42);
        org.junit.Assert.assertNotNull(jsonNodeList46);
        org.junit.Assert.assertNotNull(jsonNodeItor49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-1" + "'", str51, "-1");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jsonNodeList58);
        org.junit.Assert.assertNotNull(jsonNodeList59);
        org.junit.Assert.assertNotNull(jsonNodeList60);
        org.junit.Assert.assertNotNull(jsonNodeList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get(100);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        java.lang.String str8 = pOJONode1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.util.Iterator<java.lang.String> strItor9 = pOJONode1.fieldNames();
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode12.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode12.path("hi!");
        boolean boolean18 = pOJONode12.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        boolean boolean20 = pOJONode12.isEmpty(serializerProvider19);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode12.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = pOJONode1.findParents("", jsonNodeList22);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType24 = pOJONode1.numberType();
        boolean boolean25 = pOJONode1.isBinary();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertNull(numberType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        int int6 = pOJONode1.intValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNode8.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode6.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode8 = pOJONode6.deepCopy();
        int int9 = baseJsonNode8.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = baseJsonNode8.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode1.findValues("-1", jsonNodeList11);
        int int13 = pOJONode1.asInt();
        boolean boolean14 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = pOJONode1.traverse(objectCodec15);
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator17 = pOJONode1.spliterator();
        boolean boolean18 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal19 = pOJONode1.decimalValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bigDecimal19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (byte) 10);
        boolean boolean6 = pOJONode1.isBoolean();
        boolean boolean7 = pOJONode1.isInt();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        java.lang.Object obj4 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode(obj4);
        boolean boolean6 = pOJONode5.asBoolean();
        boolean boolean7 = pOJONode5.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode9.elements();
        boolean boolean11 = pOJONode9.isFloatingPointNumber();
        java.lang.String str12 = pOJONode9.toString();
        java.lang.Object obj13 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode(obj13);
        boolean boolean15 = pOJONode14.asBoolean();
        byte[] byteArray16 = pOJONode14.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode18.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor21 = pOJONode18.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = pOJONode23.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor28 = pOJONode27.elements();
        boolean boolean29 = pOJONode27.isFloatingPointNumber();
        java.lang.String str30 = pOJONode27.toString();
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray34 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode5, pOJONode9, pOJONode14, pOJONode18, pOJONode23, pOJONode27, pOJONode32 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList35 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList35, jsonNodeArray34);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode1.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList35);
        java.lang.String str38 = pOJONode1.textValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(strEntryItor21);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(jsonNodeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = pOJONode1.findParents("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.with("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertNull(jsonNode8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType6 = pOJONode1.getNodeType();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.iterator();
        java.lang.Object obj8 = pOJONode1._value;
        java.util.Iterator<java.lang.String> strItor9 = pOJONode1.fieldNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + jsonNodeType6 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType6.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        int int6 = pOJONode1.intValue();
        boolean boolean7 = pOJONode1.isValueNode();
        boolean boolean8 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("-1");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNode10.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.MissingNode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.path((int) (byte) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        float float9 = pOJONode1.floatValue();
        boolean boolean10 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.path("hi!");
        boolean boolean14 = pOJONode1.has("");
        java.lang.Number number15 = pOJONode1.numberValue();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator16 = null;
        java.lang.Object obj17 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode(obj17);
        int int19 = pOJONode18.intValue();
        boolean boolean20 = pOJONode18.isNull();
        boolean boolean21 = pOJONode18.isPojo();
        java.math.BigDecimal bigDecimal22 = pOJONode18.decimalValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode24.findValues("hi!");
        java.lang.String str27 = pOJONode24.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode29 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = pOJONode29.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = pOJONode29.deepCopy();
        boolean boolean33 = pOJONode29.isPojo();
        boolean boolean34 = pOJONode24._pojoEquals(pOJONode29);
        boolean boolean36 = pOJONode24.has(10);
        boolean boolean37 = pOJONode24.isDouble();
        boolean boolean38 = pOJONode18.equals((java.lang.Object) boolean37);
        short short39 = pOJONode18.shortValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode42 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor43 = pOJONode42.elements();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList45 = pOJONode42.findParents("hi!");
        boolean boolean46 = pOJONode42.isIntegralNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode49 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = pOJONode49.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = pOJONode49.deepCopy();
        java.util.Iterator<java.lang.String> strItor53 = pOJONode49.fieldNames();
        short short54 = pOJONode49.shortValue();
        boolean boolean56 = pOJONode49.has((int) (short) 10);
        boolean boolean57 = pOJONode49.canConvertToLong();
        java.lang.Object obj59 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode60 = new com.fasterxml.jackson.databind.node.POJONode(obj59);
        boolean boolean61 = pOJONode60.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = pOJONode60.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = pOJONode60.path("hi!");
        boolean boolean66 = pOJONode60.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider67 = null;
        boolean boolean68 = pOJONode60.isEmpty(serializerProvider67);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList70 = pOJONode60.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList71 = pOJONode49.findParents("-1", jsonNodeList70);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList72 = pOJONode42.findParents("hi!", jsonNodeList71);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList73 = pOJONode18.findParents("hi!", jsonNodeList71);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = pOJONode1.equals(jsonNodeComparator16, (com.fasterxml.jackson.databind.JsonNode) pOJONode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 0 + "'", short39 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNodeItor43);
        org.junit.Assert.assertNotNull(jsonNodeList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 0 + "'", short54 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jsonNodeList70);
        org.junit.Assert.assertNotNull(jsonNodeList71);
        org.junit.Assert.assertNotNull(jsonNodeList72);
        org.junit.Assert.assertNotNull(jsonNodeList73);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        boolean boolean6 = pOJONode1.isDouble();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        java.util.Iterator<java.lang.String> strItor7 = pOJONode1.fieldNames();
        java.lang.Object obj8 = pOJONode1._value;
        boolean boolean10 = pOJONode1.hasNonNull((int) 'a');
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = jsonNode4.isMissingNode();
        boolean boolean6 = jsonNode4.isValueNode();
        long long7 = jsonNode4.asLong();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean9 = jsonNode4.isEmpty(serializerProvider8);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean4 = pOJONode1.isBigInteger();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        boolean boolean12 = pOJONode1.isObject();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode1.elements();
        boolean boolean10 = pOJONode1.has("");
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.at(jsonPointer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = pOJONode1.findParent("hi!");
        byte[] byteArray9 = pOJONode1.binaryValue();
        double double10 = pOJONode1.doubleValue();
        boolean boolean12 = pOJONode1.hasNonNull("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        boolean boolean11 = pOJONode1.asBoolean(true);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = pOJONode1.elements();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor12);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        double double6 = pOJONode1.asDouble();
        boolean boolean7 = pOJONode1.isBinary();
        java.lang.Object obj9 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode(obj9);
        int int11 = pOJONode10.intValue();
        java.lang.String str12 = pOJONode10.asText();
        boolean boolean13 = pOJONode10.booleanValue();
        boolean boolean14 = pOJONode10.isDouble();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = pOJONode10.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList23 = pOJONode1.findValuesAsText("hi!", strList22);
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor27 = pOJONode26.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode28 = pOJONode26.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        boolean boolean30 = pOJONode26.isEmpty(serializerProvider29);
        java.util.List<java.lang.String> strList32 = pOJONode26.findValuesAsText("-1");
        java.util.List<java.lang.String> strList33 = pOJONode1.findValuesAsText("", strList32);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(jsonNodeItor27);
        org.junit.Assert.assertNotNull(baseJsonNode28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isLong();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str10 = pOJONode1.asText("");
        boolean boolean11 = pOJONode1.canConvertToLong();
        boolean boolean12 = pOJONode1.isArray();
        boolean boolean13 = pOJONode1.isValueNode();
        boolean boolean15 = pOJONode1.hasNonNull("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal6 = pOJONode1.decimalValue();
        long long7 = pOJONode1.longValue();
        float float8 = pOJONode1.floatValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.get((int) (short) -1);
        java.lang.Object obj11 = pOJONode1.getPojo();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.math.BigInteger bigInteger9 = pOJONode1.bigIntegerValue();
        java.lang.Number number10 = pOJONode1.numberValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.findPath("-1");
        boolean boolean13 = jsonNode12.canConvertToLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean9 = pOJONode1.isEmpty(serializerProvider8);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.path((int) (byte) 10);
        boolean boolean12 = pOJONode1.isBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        double double6 = pOJONode1.asDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode8.fields();
        boolean boolean12 = pOJONode8.isArray();
        java.lang.Object obj13 = pOJONode8.getPojo();
        boolean boolean14 = pOJONode8.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = pOJONode8.asToken();
        boolean boolean16 = pOJONode1._pojoEquals(pOJONode8);
        boolean boolean18 = pOJONode1.has("-1");
        boolean boolean19 = pOJONode1.isBigInteger();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean7 = pOJONode1.isEmpty(serializerProvider6);
        boolean boolean8 = pOJONode1.canConvertToInt();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.findPath("-1");
        java.lang.String str13 = jsonNode12.textValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor14 = jsonNode12.iterator();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(jsonNodeItor14);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode8.get((int) '4');
        long long12 = pOJONode8.asLong((long) (byte) 10);
        boolean boolean13 = pOJONode8.isFloat();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        boolean boolean7 = pOJONode1.isValueNode();
        int int8 = pOJONode1.asInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = null;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        boolean boolean12 = pOJONode1.isMissingNode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonNodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        boolean boolean7 = pOJONode1.isNumber();
        boolean boolean9 = pOJONode1.asBoolean(true);
        boolean boolean10 = pOJONode1.isLong();
        boolean boolean11 = pOJONode1.isFloat();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonNode11.isInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNull(jsonNode11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        boolean boolean10 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.findPath("-1");
        boolean boolean15 = pOJONode1.asBoolean();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        java.util.List<java.lang.String> strList6 = pOJONode1.findValuesAsText("hi!");
        boolean boolean7 = pOJONode1.isPojo();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        boolean boolean15 = pOJONode1.asBoolean(false);
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        float float6 = pOJONode1.floatValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        java.math.BigInteger bigInteger8 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.isNumber();
        boolean boolean3 = pOJONode1.isMissingNode();
        java.lang.Number number4 = pOJONode1.numberValue();
        boolean boolean5 = pOJONode1.isValueNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        java.lang.String str5 = pOJONode1.textValue();
        java.lang.Object obj6 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode(obj6);
        int int8 = pOJONode7.intValue();
        boolean boolean9 = pOJONode7.isNull();
        boolean boolean10 = pOJONode7.isPojo();
        java.math.BigDecimal bigDecimal11 = pOJONode7.decimalValue();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator12 = pOJONode7.spliterator();
        boolean boolean13 = pOJONode1.equals((java.lang.Object) pOJONode7);
        boolean boolean14 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.findPath("-1");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = jsonNode16.findValues("-1");
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNodeList18);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.booleanValue();
        long long6 = pOJONode1.longValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        boolean boolean10 = pOJONode1.has((int) (short) -1);
        boolean boolean11 = pOJONode1.isValueNode();
        boolean boolean12 = pOJONode1.isObject();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strEntryItor6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        boolean boolean5 = pOJONode1.isShort();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator6 = pOJONode1.spliterator();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode8.elements();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode8.findParents("hi!");
        java.lang.String str12 = pOJONode8.toString();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = pOJONode14.elements();
        boolean boolean16 = pOJONode14.isFloatingPointNumber();
        java.lang.String str17 = pOJONode14.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = pOJONode14.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = pOJONode14.path((int) (byte) 1);
        float float22 = pOJONode14.floatValue();
        boolean boolean23 = pOJONode14.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode14.path("hi!");
        boolean boolean26 = pOJONode14.isIntegralNumber();
        boolean boolean27 = pOJONode14.isBigInteger();
        boolean boolean28 = pOJONode8._pojoEquals(pOJONode14);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList30 = pOJONode8.findParents("");
        boolean boolean31 = pOJONode1._pojoEquals(pOJONode8);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator6);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jsonNodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        boolean boolean7 = pOJONode1.canConvertToLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        boolean boolean6 = pOJONode1.canConvertToInt();
        java.lang.Object obj8 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode(obj8);
        int int10 = pOJONode9.intValue();
        boolean boolean11 = pOJONode9.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double15 = pOJONode14.doubleValue();
        boolean boolean17 = pOJONode14.hasNonNull("hi!");
        java.lang.Object obj19 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode(obj19);
        boolean boolean21 = pOJONode20.asBoolean();
        java.lang.Object obj23 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode(obj23);
        boolean boolean25 = pOJONode24.asBoolean();
        boolean boolean26 = pOJONode24.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode28 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor29 = pOJONode28.elements();
        boolean boolean30 = pOJONode28.isFloatingPointNumber();
        java.lang.String str31 = pOJONode28.toString();
        java.lang.Object obj32 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode33 = new com.fasterxml.jackson.databind.node.POJONode(obj32);
        boolean boolean34 = pOJONode33.asBoolean();
        byte[] byteArray35 = pOJONode33.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode37 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList39 = pOJONode37.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor40 = pOJONode37.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode42 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList44 = pOJONode42.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode46 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor47 = pOJONode46.elements();
        boolean boolean48 = pOJONode46.isFloatingPointNumber();
        java.lang.String str49 = pOJONode46.toString();
        java.lang.Object obj50 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode51 = new com.fasterxml.jackson.databind.node.POJONode(obj50);
        boolean boolean52 = pOJONode51.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray53 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode24, pOJONode28, pOJONode33, pOJONode37, pOJONode42, pOJONode46, pOJONode51 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList54 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList54, jsonNodeArray53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = pOJONode20.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList54);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = pOJONode14.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList54);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = pOJONode9.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList54);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList54);
        int int60 = pOJONode1.size();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNotNull(jsonNodeList39);
        org.junit.Assert.assertNotNull(strEntryItor40);
        org.junit.Assert.assertNotNull(jsonNodeList44);
        org.junit.Assert.assertNotNull(jsonNodeItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1" + "'", str49, "-1");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNodeList57);
        org.junit.Assert.assertNotNull(jsonNodeList58);
        org.junit.Assert.assertNotNull(jsonNodeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode10.fields();
        boolean boolean12 = pOJONode10.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = pOJONode10.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor17 = pOJONode16.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode16.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode10.findValues("hi!", jsonNodeList19);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = pOJONode1.findParents("hi!", jsonNodeList20);
        boolean boolean22 = pOJONode1.asBoolean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor17);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        boolean boolean3 = pOJONode1.asBoolean();
        boolean boolean4 = pOJONode1.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = pOJONode1.findValues("-1");
        java.math.BigDecimal bigDecimal7 = pOJONode1.decimalValue();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertNotNull(bigDecimal7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = pOJONode1.findParents("");
        boolean boolean10 = pOJONode1.isNull();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("");
        byte[] byteArray14 = pOJONode1.binaryValue();
        boolean boolean15 = pOJONode1.isBigDecimal();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = pOJONode18.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode20 = pOJONode18.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        boolean boolean22 = pOJONode18.isEmpty(serializerProvider21);
        boolean boolean24 = pOJONode18.hasNonNull((int) '4');
        java.lang.String str25 = pOJONode18.asText();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = pOJONode18.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList28 = pOJONode1.findParents("-1", jsonNodeList27);
        long long29 = pOJONode1.asLong();
        boolean boolean30 = pOJONode1.isArray();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertNotNull(baseJsonNode20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertNotNull(jsonNodeList28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        boolean boolean7 = pOJONode1.isNumber();
        boolean boolean9 = pOJONode1.asBoolean(true);
        boolean boolean10 = pOJONode1.isLong();
        boolean boolean12 = pOJONode1.has((-1));
        boolean boolean14 = pOJONode1.has((int) '#');
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.findValue("hi!");
        java.lang.String str17 = pOJONode1.asText();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode19 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonNode16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = pOJONode6.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode6.iterator();
        boolean boolean9 = pOJONode1.equals((java.lang.Object) pOJONode6);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode6.get("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode6.serialize(jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryItor7);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonNode11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        java.math.BigInteger bigInteger7 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.path("-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path((int) (byte) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean7 = pOJONode1.isEmpty(serializerProvider6);
        java.lang.String str8 = pOJONode1.textValue();
        java.lang.Object obj9 = pOJONode1.getPojo();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        com.fasterxml.jackson.core.JsonToken jsonToken6 = pOJONode1.asToken();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.toString();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.elements();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertNotNull(jsonNodeItor9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        boolean boolean9 = pOJONode1.isLong();
        boolean boolean11 = pOJONode1.has("-1");
        boolean boolean12 = pOJONode1.isValueNode();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor13 = pOJONode1.iterator();
        boolean boolean14 = pOJONode1.isContainerNode();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        boolean boolean8 = pOJONode1.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor12 = pOJONode11.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = pOJONode11.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = pOJONode1.findValues("hi!", jsonNodeList14);
        float float16 = pOJONode1.floatValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEntryItor12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        boolean boolean3 = pOJONode1.asBoolean();
        boolean boolean4 = pOJONode1.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = pOJONode1.findValues("-1");
        int int7 = pOJONode1.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = pOJONode1.findParents("-1");
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList9);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean8 = pOJONode1.isBoolean();
        java.lang.String str9 = pOJONode1.toString();
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        java.lang.Object obj6 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode(obj6);
        boolean boolean8 = pOJONode7.asBoolean();
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        boolean boolean12 = pOJONode11.asBoolean();
        boolean boolean13 = pOJONode11.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor16 = pOJONode15.elements();
        boolean boolean17 = pOJONode15.isFloatingPointNumber();
        java.lang.String str18 = pOJONode15.toString();
        java.lang.Object obj19 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode(obj19);
        boolean boolean21 = pOJONode20.asBoolean();
        byte[] byteArray22 = pOJONode20.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode24.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor27 = pOJONode24.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode29 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = pOJONode29.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode33 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor34 = pOJONode33.elements();
        boolean boolean35 = pOJONode33.isFloatingPointNumber();
        java.lang.String str36 = pOJONode33.toString();
        java.lang.Object obj37 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode(obj37);
        boolean boolean39 = pOJONode38.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray40 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode11, pOJONode15, pOJONode20, pOJONode24, pOJONode29, pOJONode33, pOJONode38 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList41, jsonNodeArray40);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = pOJONode7.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList41);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList44 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList41);
        long long46 = pOJONode1.asLong((long) (byte) 10);
        long long48 = pOJONode1.asLong((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(strEntryItor27);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNodeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1" + "'", str36, "-1");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNodeList44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = pOJONode1.findParent("");
        boolean boolean8 = pOJONode1.canConvertToLong();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator9, serializerProvider10, typeSerializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        boolean boolean11 = pOJONode1.isBigInteger();
        boolean boolean12 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean17 = pOJONode15.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode20.findValues("hi!");
        java.lang.String str23 = pOJONode20.asText();
        boolean boolean25 = pOJONode20.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType26 = pOJONode20.numberType();
        boolean boolean28 = pOJONode20.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = pOJONode20.findParent("");
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = pOJONode20.get("");
        java.util.List<java.lang.String> strList34 = pOJONode20.findValuesAsText("");
        java.util.List<java.lang.String> strList35 = pOJONode15.findValuesAsText("-1", strList34);
        java.util.List<java.lang.String> strList36 = pOJONode1.findValuesAsText("-1", strList35);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(numberType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(objectNode30);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor3 = pOJONode1.iterator();
        java.lang.String str5 = pOJONode1.asText("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path((int) (short) 10);
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator8 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode10.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = pOJONode10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = pOJONode1.equals(jsonNodeComparator8, (com.fasterxml.jackson.databind.JsonNode) pOJONode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertNotNull(jsonNodeItor12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.math.BigInteger bigInteger3 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = pOJONode1.traverse();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(jsonParser4);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor3 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.hasNonNull("-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strEntryItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        boolean boolean8 = pOJONode1.isBoolean();
        boolean boolean9 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = pOJONode1.asToken();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        byte[] byteArray12 = pOJONode6.binaryValue();
        int int13 = pOJONode6.size();
        boolean boolean14 = pOJONode6.isIntegralNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        long long4 = pOJONode1.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        java.lang.Object obj7 = pOJONode1.getPojo();
        int int8 = pOJONode1.intValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        boolean boolean7 = pOJONode1.isBigInteger();
        boolean boolean8 = pOJONode1.isDouble();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.asBoolean(true);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = pOJONode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.path((int) ' ');
        boolean boolean12 = jsonNode11.isBinary();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonNodeList9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("hi!");
        boolean boolean11 = pOJONode1.isObject();
        double double13 = pOJONode1.asDouble((double) (-1L));
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor14 = pOJONode1.elements();
        boolean boolean15 = pOJONode1.isBigInteger();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = pOJONode1.findParent("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = objectNode17.findParents("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectNode17);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        java.util.Iterator<java.lang.String> strItor7 = pOJONode1.fieldNames();
        java.lang.String str8 = pOJONode1.asText();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = pOJONode1.equals(jsonNodeComparator9, jsonNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        boolean boolean7 = pOJONode1.isNull();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        int int6 = pOJONode1.asInt((int) (byte) 1);
        short short7 = pOJONode1.shortValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = pOJONode1.findParent("");
        java.lang.String str14 = pOJONode1.asText("hi!");
        byte[] byteArray15 = pOJONode1.binaryValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertNull(byteArray15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType6 = pOJONode1.getNodeType();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.iterator();
        int int8 = pOJONode1.asInt();
        boolean boolean9 = pOJONode1.isValueNode();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + jsonNodeType6 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType6.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        boolean boolean11 = pOJONode1.isBigInteger();
        boolean boolean12 = pOJONode1.isFloatingPointNumber();
        boolean boolean13 = pOJONode1.isValueNode();
        int int14 = pOJONode1.asInt();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        boolean boolean7 = pOJONode1.has("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = pOJONode1.findParent("hi!");
        java.lang.String str11 = pOJONode1.asText("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode4 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = pOJONode4.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = pOJONode4.fields();
        boolean boolean8 = pOJONode4.isArray();
        java.lang.Object obj9 = pOJONode4.getPojo();
        boolean boolean10 = pOJONode4.isPojo();
        java.math.BigDecimal bigDecimal11 = pOJONode4.decimalValue();
        boolean boolean12 = pOJONode1._pojoEquals(pOJONode4);
        long long13 = pOJONode4.longValue();
        int int14 = pOJONode4.size();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertNotNull(strEntryItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        boolean boolean10 = pOJONode1.has("");
        boolean boolean11 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get((int) (byte) 10);
        boolean boolean14 = pOJONode1.isFloatingPointNumber();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = pOJONode10.fields();
        boolean boolean12 = pOJONode10.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = pOJONode10.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor17 = pOJONode16.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode16.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode10.findValues("hi!", jsonNodeList19);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = pOJONode1.findParents("hi!", jsonNodeList20);
        boolean boolean22 = pOJONode1.isObject();
        long long23 = pOJONode1.asLong();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor17);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.get("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.at(jsonPointer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonNode5);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        java.lang.Object obj6 = pOJONode1._value;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.path(1);
        boolean boolean11 = pOJONode1.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.get("-1");
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonNode13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.booleanValue();
        double double8 = pOJONode1.asDouble();
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        int int12 = pOJONode11.intValue();
        boolean boolean13 = pOJONode11.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double17 = pOJONode16.doubleValue();
        boolean boolean19 = pOJONode16.hasNonNull("hi!");
        java.lang.Object obj21 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode(obj21);
        boolean boolean23 = pOJONode22.asBoolean();
        java.lang.Object obj25 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode(obj25);
        boolean boolean27 = pOJONode26.asBoolean();
        boolean boolean28 = pOJONode26.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor31 = pOJONode30.elements();
        boolean boolean32 = pOJONode30.isFloatingPointNumber();
        java.lang.String str33 = pOJONode30.toString();
        java.lang.Object obj34 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode(obj34);
        boolean boolean36 = pOJONode35.asBoolean();
        byte[] byteArray37 = pOJONode35.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = pOJONode39.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor42 = pOJONode39.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = pOJONode44.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode48 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor49 = pOJONode48.elements();
        boolean boolean50 = pOJONode48.isFloatingPointNumber();
        java.lang.String str51 = pOJONode48.toString();
        java.lang.Object obj52 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode53 = new com.fasterxml.jackson.databind.node.POJONode(obj52);
        boolean boolean54 = pOJONode53.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray55 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode26, pOJONode30, pOJONode35, pOJONode39, pOJONode44, pOJONode48, pOJONode53 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56, jsonNodeArray55);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = pOJONode22.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = pOJONode16.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList60 = pOJONode11.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList61 = pOJONode1.findParents("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList56);
        boolean boolean62 = pOJONode1.isObject();
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = pOJONode1.get("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertNotNull(jsonNodeList41);
        org.junit.Assert.assertNotNull(strEntryItor42);
        org.junit.Assert.assertNotNull(jsonNodeList46);
        org.junit.Assert.assertNotNull(jsonNodeItor49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-1" + "'", str51, "-1");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jsonNodeList58);
        org.junit.Assert.assertNotNull(jsonNodeList59);
        org.junit.Assert.assertNotNull(jsonNodeList60);
        org.junit.Assert.assertNotNull(jsonNodeList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jsonNode64);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        double double7 = pOJONode1.asDouble((double) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.get("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonNode9.textValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = baseJsonNode3.size();
        boolean boolean5 = baseJsonNode3.canConvertToInt();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator6 = baseJsonNode3.spliterator();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator7 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger10 = pOJONode9.bigIntegerValue();
        boolean boolean11 = pOJONode9.asBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType12 = pOJONode9.getNodeType();
        java.lang.Object obj13 = pOJONode9._value;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = baseJsonNode3.equals(jsonNodeComparator7, (com.fasterxml.jackson.databind.JsonNode) pOJONode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator6);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + jsonNodeType12 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType12.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        boolean boolean4 = baseJsonNode3.isObject();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor5 = baseJsonNode3.fields();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator6 = baseJsonNode3.spliterator();
        java.lang.Number number7 = baseJsonNode3.numberValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryItor5);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator6);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        boolean boolean5 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path((int) (byte) 10);
        boolean boolean8 = jsonNode7.isTextual();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode5 = pOJONode1.deepCopy();
        long long7 = pOJONode1.asLong((long) (short) 1);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean9 = pOJONode1.isEmpty(serializerProvider8);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(baseJsonNode5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("hi!");
        boolean boolean11 = pOJONode1.isLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isFloat();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isBinary();
        float float6 = pOJONode1.floatValue();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean8 = pOJONode1.isEmpty(serializerProvider7);
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = pOJONode11.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode11.deepCopy();
        java.math.BigInteger bigInteger15 = jsonNode14.bigIntegerValue();
        boolean boolean16 = jsonNode14.isArray();
        boolean boolean17 = jsonNode14.isDouble();
        int int18 = jsonNode14.size();
        boolean boolean19 = jsonNode14.isBigDecimal();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = jsonNode14.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode1.findParents("", jsonNodeList21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertNotNull(jsonNodeList22);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean6 = pOJONode1.canConvertToLong();
        java.lang.Object obj7 = pOJONode1.getPojo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = pOJONode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode6.get((int) (byte) -1);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode6.findValue("");
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(pOJONode6);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertNull(jsonNode12);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = pOJONode1.findParents("");
        boolean boolean10 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.findValue("-1");
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonNode12.doubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = pOJONode1.numberType();
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.findPath("");
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("");
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        boolean boolean13 = pOJONode1.isEmpty(serializerProvider12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(numberType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator9 = pOJONode1.spliterator();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNodeSpliterator9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        boolean boolean10 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get("hi!");
        double double14 = pOJONode1.asDouble((double) (short) 100);
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = pOJONode16.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = pOJONode16.deepCopy();
        boolean boolean21 = pOJONode16.asBoolean(false);
        java.util.Iterator<java.lang.String> strItor22 = pOJONode16.fieldNames();
        boolean boolean23 = pOJONode16.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode16.get((int) '#');
        boolean boolean26 = pOJONode16.isValueNode();
        boolean boolean27 = pOJONode1._pojoEquals(pOJONode16);
        boolean boolean28 = pOJONode1.isLong();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        boolean boolean11 = pOJONode1.isBigInteger();
        long long13 = pOJONode1.asLong((long) (short) 10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode1.at(jsonPointer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.canConvertToLong();
        java.lang.Object obj9 = pOJONode1._value;
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = pOJONode1.findParent("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean9 = pOJONode1.isEmpty(serializerProvider8);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("");
        boolean boolean12 = pOJONode1.isMissingNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.hasNonNull("");
        boolean boolean8 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("hi!");
        java.math.BigInteger bigInteger11 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(bigInteger11);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        com.fasterxml.jackson.core.JsonToken jsonToken5 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.get("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonNode7.isValueNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(jsonNode7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        boolean boolean10 = pOJONode1.has("");
        java.lang.String str11 = pOJONode1.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.ValueNode valueNode13 = pOJONode1.deepCopy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertNotNull(valueNode13);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        byte[] byteArray5 = pOJONode1.binaryValue();
        boolean boolean6 = pOJONode1.isInt();
        java.math.BigDecimal bigDecimal7 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        boolean boolean9 = pOJONode1.isEmpty(serializerProvider8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.util.Iterator<java.lang.String> strItor9 = pOJONode1.fieldNames();
        boolean boolean10 = pOJONode1.isBigDecimal();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        boolean boolean10 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get("hi!");
        int int14 = pOJONode1.asInt((int) (byte) -1);
        byte[] byteArray15 = pOJONode1.binaryValue();
        int int16 = pOJONode1.intValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.isFloat();
        boolean boolean5 = pOJONode1.isBigInteger();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        java.lang.String str9 = pOJONode1.toString();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType10 = pOJONode1.getNodeType();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + jsonNodeType10 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType10.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType7 = pOJONode1.getNodeType();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator8 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode10.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode10.deepCopy();
        double double15 = pOJONode10.asDouble(1.0d);
        long long16 = pOJONode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode10.path("hi!");
        java.util.List<java.lang.String> strList20 = pOJONode10.findValuesAsText("hi!");
        float float21 = pOJONode10.floatValue();
        long long22 = pOJONode10.asLong();
        short short23 = pOJONode10.shortValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = pOJONode1.equals(jsonNodeComparator8, (com.fasterxml.jackson.databind.JsonNode) pOJONode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + jsonNodeType7 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType7.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator9, serializerProvider10, typeSerializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.path("hi!");
        boolean boolean10 = jsonNode9.isFloatingPointNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        double double3 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.isInt();
        java.lang.Object obj5 = pOJONode1.getPojo();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = pOJONode1.elements();
        short short9 = pOJONode1.shortValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.math.BigInteger bigInteger5 = jsonNode4.bigIntegerValue();
        long long6 = jsonNode4.asLong();
        float float7 = jsonNode4.floatValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = jsonNode4.findValues("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(jsonNodeList9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        java.lang.String str9 = pOJONode1.asText("-1");
        boolean boolean10 = pOJONode1.isLong();
        boolean boolean11 = pOJONode1.isPojo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        boolean boolean8 = pOJONode1.isContainerNode();
        boolean boolean9 = pOJONode1.isFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        boolean boolean8 = pOJONode1.isInt();
        boolean boolean10 = pOJONode1.asBoolean(false);
        boolean boolean11 = pOJONode1.asBoolean();
        java.util.List<java.lang.String> strList13 = pOJONode1.findValuesAsText("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        boolean boolean8 = pOJONode1.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = pOJONode1.findParent("hi!");
        int int12 = pOJONode1.asInt((int) (short) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = pOJONode1.findParents("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonNodeList14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        boolean boolean8 = pOJONode1.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.toString();
        java.lang.String str4 = pOJONode1.toString();
        double double6 = pOJONode1.asDouble((double) 100);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get("-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonNode8.canConvertToInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNull(jsonNode8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        java.lang.String str6 = pOJONode1.asText();
        java.lang.Number number7 = pOJONode1.numberValue();
        boolean boolean8 = pOJONode1.isShort();
        boolean boolean9 = pOJONode1.isArray();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        boolean boolean4 = pOJONode1.booleanValue();
        java.lang.String str5 = pOJONode1.toString();
        java.lang.Object obj7 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode(obj7);
        int int9 = pOJONode8.intValue();
        boolean boolean10 = pOJONode8.isInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double14 = pOJONode13.doubleValue();
        boolean boolean16 = pOJONode13.hasNonNull("hi!");
        java.lang.Object obj18 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode19 = new com.fasterxml.jackson.databind.node.POJONode(obj18);
        boolean boolean20 = pOJONode19.asBoolean();
        java.lang.Object obj22 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode(obj22);
        boolean boolean24 = pOJONode23.asBoolean();
        boolean boolean25 = pOJONode23.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor28 = pOJONode27.elements();
        boolean boolean29 = pOJONode27.isFloatingPointNumber();
        java.lang.String str30 = pOJONode27.toString();
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        byte[] byteArray34 = pOJONode32.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode36 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = pOJONode36.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor39 = pOJONode36.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode41 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = pOJONode41.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode45 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor46 = pOJONode45.elements();
        boolean boolean47 = pOJONode45.isFloatingPointNumber();
        java.lang.String str48 = pOJONode45.toString();
        java.lang.Object obj49 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode50 = new com.fasterxml.jackson.databind.node.POJONode(obj49);
        boolean boolean51 = pOJONode50.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray52 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode23, pOJONode27, pOJONode32, pOJONode36, pOJONode41, pOJONode45, pOJONode50 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53, jsonNodeArray52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = pOJONode19.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = pOJONode13.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = pOJONode8.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList53);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = pOJONode1.findParents("", jsonNodeList57);
        boolean boolean59 = pOJONode1.isLong();
        boolean boolean60 = pOJONode1.isMissingNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = pOJONode1.get("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertNotNull(strEntryItor39);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNodeItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "-1" + "'", str48, "-1");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNodeList57);
        org.junit.Assert.assertNotNull(jsonNodeList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(jsonNode62);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = pOJONode1.findParents("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.at("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeList9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("hi!");
        boolean boolean11 = pOJONode1.isPojo();
        java.lang.String str12 = pOJONode1.textValue();
        boolean boolean13 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal14 = pOJONode1.decimalValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType16 = pOJONode1.getNodeType();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertTrue("'" + jsonNodeType16 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType16.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        boolean boolean6 = pOJONode1.isPojo();
        boolean boolean7 = pOJONode1.isValueNode();
        byte[] byteArray8 = pOJONode1.binaryValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.with("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        int int6 = pOJONode1.intValue();
        boolean boolean7 = pOJONode1.isValueNode();
        boolean boolean8 = pOJONode1.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("-1");
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = pOJONode1.traverse(objectCodec11);
        java.lang.Class<?> wildcardClass13 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        boolean boolean8 = pOJONode1.asBoolean(true);
        java.lang.String str9 = pOJONode1.textValue();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor10 = pOJONode1.fields();
        java.lang.String str11 = pOJONode1.asText();
        boolean boolean12 = pOJONode1.isMissingNode();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        boolean boolean11 = pOJONode1.asBoolean(true);
        java.util.Iterator<java.lang.String> strItor12 = pOJONode1.fieldNames();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
    }
}

