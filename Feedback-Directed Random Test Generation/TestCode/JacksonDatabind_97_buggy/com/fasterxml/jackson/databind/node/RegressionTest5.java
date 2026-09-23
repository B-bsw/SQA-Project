package com.fasterxml.jackson.databind.node;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean7 = pOJONode1.canConvertToLong();
        boolean boolean8 = pOJONode1.isBinary();
        int int9 = pOJONode1.asInt();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path((int) (short) -1);
        boolean boolean7 = pOJONode1.isBoolean();
        boolean boolean8 = pOJONode1.isShort();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        boolean boolean16 = pOJONode1.isTextual();
        java.lang.Object obj17 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode(obj17);
        boolean boolean19 = pOJONode18.asBoolean();
        long long21 = pOJONode18.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = pOJONode18.traverse(objectCodec22);
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode18.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = pOJONode18.path((int) (byte) -1);
        java.math.BigDecimal bigDecimal28 = jsonNode27.decimalValue();
        boolean boolean29 = pOJONode1.equals((java.lang.Object) jsonNode27);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType30 = pOJONode1.numberType();
        long long31 = pOJONode1.asLong();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(numberType30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        byte[] byteArray12 = pOJONode6.binaryValue();
        java.lang.String str13 = pOJONode6.asText();
        java.lang.String str14 = pOJONode6.asText();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = jsonNode4.isMissingNode();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = jsonNode4.findParents("");
        boolean boolean8 = jsonNode4.isIntegralNumber();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get(100);
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.lang.String str11 = pOJONode8.asText();
        boolean boolean13 = pOJONode8.asBoolean(false);
        boolean boolean14 = pOJONode1._pojoEquals(pOJONode8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = pOJONode8.traverse(objectCodec15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode8.with("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.findPath("-1");
        boolean boolean13 = jsonNode12.isNumber();
        boolean boolean14 = jsonNode12.isLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor16 = pOJONode15.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode17 = pOJONode15.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        boolean boolean19 = pOJONode15.isEmpty(serializerProvider18);
        double double20 = pOJONode15.asDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = pOJONode22.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor25 = pOJONode22.fields();
        boolean boolean26 = pOJONode22.isArray();
        java.lang.Object obj27 = pOJONode22.getPojo();
        boolean boolean28 = pOJONode22.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken29 = pOJONode22.asToken();
        boolean boolean30 = pOJONode15._pojoEquals(pOJONode22);
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        long long35 = pOJONode32.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser37 = pOJONode32.traverse(objectCodec36);
        boolean boolean38 = pOJONode32.isIntegralNumber();
        boolean boolean39 = pOJONode22._pojoEquals(pOJONode32);
        int int40 = pOJONode32.asInt();
        boolean boolean41 = pOJONode6._pojoEquals(pOJONode32);
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger45 = pOJONode44.bigIntegerValue();
        double double46 = pOJONode44.doubleValue();
        java.math.BigInteger bigInteger47 = pOJONode44.bigIntegerValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode50 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = pOJONode50.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = pOJONode50.deepCopy();
        double double55 = pOJONode50.asDouble(1.0d);
        long long56 = pOJONode50.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = pOJONode50.path("hi!");
        java.util.List<java.lang.String> strList60 = pOJONode50.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList61 = pOJONode44.findValuesAsText("hi!", strList60);
        java.util.List<java.lang.String> strList62 = pOJONode6.findValuesAsText("", strList60);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor16);
        org.junit.Assert.assertNotNull(baseJsonNode17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertNotNull(strEntryItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + jsonToken29 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken29.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        int int8 = pOJONode1.asInt();
        boolean boolean10 = pOJONode1.hasNonNull((int) (byte) 100);
        java.util.List<java.lang.String> strList12 = pOJONode1.findValuesAsText("-1");
        long long13 = pOJONode1.asLong();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean8 = pOJONode1.isEmpty(serializerProvider7);
        long long9 = pOJONode1.asLong();
        boolean boolean10 = pOJONode1.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = pOJONode1.elements();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor12);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        java.lang.String str9 = pOJONode1.toString();
        boolean boolean10 = pOJONode1.isFloatingPointNumber();
        boolean boolean11 = pOJONode1.isNumber();
        boolean boolean13 = pOJONode1.hasNonNull("hi!");
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = pOJONode1.elements();
        boolean boolean7 = pOJONode1.asBoolean(true);
        java.util.List<java.lang.String> strList9 = pOJONode1.findValuesAsText("hi!");
        java.math.BigDecimal bigDecimal10 = pOJONode1.decimalValue();
        boolean boolean11 = pOJONode1.canConvertToLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType15 = pOJONode1.getNodeType();
        boolean boolean16 = pOJONode1.isNull();
        java.lang.String str17 = pOJONode1.toString();
        boolean boolean19 = pOJONode1.has((int) (short) -1);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + jsonNodeType15 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType15.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode1.path("hi!");
        boolean boolean19 = pOJONode1.hasNonNull("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode20 = pOJONode1.deepCopy();
        boolean boolean21 = pOJONode1.isNumber();
        java.lang.Object obj22 = pOJONode1.getPojo();
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
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(valueNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        double double6 = pOJONode1.asDouble();
        byte[] byteArray7 = pOJONode1.binaryValue();
        boolean boolean8 = pOJONode1.isArray();
        boolean boolean9 = pOJONode1.isBigInteger();
        java.lang.String str11 = pOJONode1.asText("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.has("-1");
        boolean boolean9 = pOJONode1.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get(0);
        java.util.Iterator<java.lang.String> strItor12 = pOJONode1.fieldNames();
        java.math.BigDecimal bigDecimal13 = pOJONode1.decimalValue();
        boolean boolean15 = pOJONode1.has("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode1.path("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser18 = pOJONode1.traverse();
        long long19 = pOJONode1.longValue();
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
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = pOJONode1.elements();
        double double7 = pOJONode1.doubleValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        double double4 = pOJONode1.asDouble();
        boolean boolean6 = pOJONode1.hasNonNull(0);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean8 = pOJONode1.isEmpty(serializerProvider7);
        int int9 = pOJONode1.size();
        java.lang.String str10 = pOJONode1.toString();
        boolean boolean11 = pOJONode1.isLong();
        java.lang.Object obj12 = pOJONode1.getPojo();
        int int13 = pOJONode1.asInt();
        java.lang.Class<?> wildcardClass14 = pOJONode1.getClass();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        java.lang.Object obj8 = pOJONode1._value;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = pOJONode1.numberType();
        com.fasterxml.jackson.databind.node.ValueNode valueNode10 = pOJONode1.deepCopy();
        boolean boolean12 = valueNode10.has("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(numberType9);
        org.junit.Assert.assertNotNull(valueNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        int int8 = pOJONode1.asInt();
        boolean boolean10 = pOJONode1.hasNonNull((int) (byte) 100);
        java.lang.Object obj11 = pOJONode1.getPojo();
        boolean boolean12 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = pOJONode15.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode15.deepCopy();
        boolean boolean19 = pOJONode15.isPojo();
        int int20 = pOJONode15.asInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode15.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = pOJONode1.findParents("-1", jsonNodeList22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNodeList23);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        boolean boolean16 = pOJONode1.isMissingNode();
        boolean boolean17 = pOJONode1.isShort();
        boolean boolean18 = pOJONode1.isBigDecimal();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor19 = pOJONode1.fields();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator20 = pOJONode1.spliterator();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEntryItor12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strEntryItor19);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator20);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        boolean boolean6 = pOJONode1.asBoolean();
        boolean boolean7 = pOJONode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType8 = pOJONode1.getNodeType();
        java.math.BigDecimal bigDecimal9 = pOJONode1.decimalValue();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = pOJONode1.findParent("-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonNodeType8 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType8.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        boolean boolean12 = pOJONode6.isBoolean();
        double double13 = pOJONode6.asDouble();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.Object obj0 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serializeWithType(jsonGenerator2, serializerProvider3, typeSerializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = pOJONode1.findParents("");
        com.fasterxml.jackson.core.JsonParser jsonParser10 = pOJONode1.traverse();
        boolean boolean12 = pOJONode1.hasNonNull(0);
        boolean boolean13 = pOJONode1.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode1.get((int) (short) 1);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeList9);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonNode15);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        byte[] byteArray45 = pOJONode1.binaryValue();
        java.lang.Number number46 = pOJONode1.numberValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass47 = number46.getClass();
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
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertNull(number46);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isLong();
        boolean boolean4 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = pOJONode1.findParent("");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode8.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode10 = pOJONode8.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        boolean boolean12 = pOJONode8.isEmpty(serializerProvider11);
        boolean boolean14 = pOJONode8.hasNonNull((int) '4');
        java.lang.String str15 = pOJONode8.toString();
        java.lang.String str17 = pOJONode8.asText("");
        boolean boolean18 = pOJONode1.equals((java.lang.Object) pOJONode8);
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor21 = pOJONode20.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode22 = pOJONode20.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        boolean boolean24 = pOJONode20.isEmpty(serializerProvider23);
        double double25 = pOJONode20.asDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = pOJONode27.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor30 = pOJONode27.fields();
        boolean boolean31 = pOJONode27.isArray();
        java.lang.Object obj32 = pOJONode27.getPojo();
        boolean boolean33 = pOJONode27.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken34 = pOJONode27.asToken();
        boolean boolean35 = pOJONode20._pojoEquals(pOJONode27);
        boolean boolean37 = pOJONode20.hasNonNull("-1");
        boolean boolean38 = pOJONode8._pojoEquals(pOJONode20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertNotNull(baseJsonNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor21);
        org.junit.Assert.assertNotNull(baseJsonNode22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNotNull(strEntryItor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + jsonToken34 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken34.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        boolean boolean8 = pOJONode1.isNumber();
        boolean boolean9 = pOJONode1.isNumber();
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
        boolean boolean23 = pOJONode11.isObject();
        boolean boolean24 = pOJONode1.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(jsonNodeItor17);
        org.junit.Assert.assertNotNull(baseJsonNode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean10 = pOJONode6.isPojo();
        boolean boolean11 = pOJONode1._pojoEquals(pOJONode6);
        byte[] byteArray12 = pOJONode6.binaryValue();
        java.lang.String str13 = pOJONode6.textValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode6.deepCopy();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        boolean boolean9 = pOJONode1.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.path((int) 'a');
        boolean boolean12 = pOJONode1.canConvertToInt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType6 = pOJONode1.getNodeType();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = pOJONode1.traverse(objectCodec7);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode1.findParents("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + jsonNodeType6 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType6.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        boolean boolean10 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.findPath("hi!");
        boolean boolean13 = jsonNode12.isFloatingPointNumber();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        java.lang.String str63 = pOJONode1.textValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = pOJONode1.get(1);
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
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(jsonNode65);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        java.lang.Number number6 = pOJONode1.numberValue();
        short short7 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.isPojo();
        java.lang.Object obj10 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode(obj10);
        int int12 = pOJONode11.intValue();
        boolean boolean14 = pOJONode11.hasNonNull("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode11.get("-1");
        java.util.List<java.lang.String> strList18 = pOJONode11.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList19 = pOJONode1.findValuesAsText("hi!", strList18);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = pOJONode1.get((int) (byte) 1);
        long long23 = pOJONode1.asLong((long) (byte) -1);
        java.util.List<java.lang.String> strList25 = pOJONode1.findValuesAsText("");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(number6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isBigDecimal();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean11 = pOJONode9.hasNonNull("hi!");
        int int12 = pOJONode9.intValue();
        boolean boolean13 = pOJONode9.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = pOJONode9.traverse();
        boolean boolean15 = pOJONode9.isDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor19 = pOJONode18.fields();
        boolean boolean20 = pOJONode18.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = pOJONode18.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor25 = pOJONode24.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = pOJONode24.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList28 = pOJONode18.findValues("hi!", jsonNodeList27);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = pOJONode9.findParents("hi!", jsonNodeList28);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList30 = pOJONode1.findParents("", jsonNodeList28);
        int int32 = pOJONode1.asInt(0);
        java.lang.String str34 = pOJONode1.asText("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider36 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator35, serializerProvider36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strEntryItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor25);
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertNotNull(jsonNodeList28);
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNotNull(jsonNodeList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        boolean boolean7 = pOJONode1.hasNonNull("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        boolean boolean8 = pOJONode1.isNumber();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor9 = pOJONode1.fields();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEntryItor9);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.asBoolean();
        boolean boolean4 = pOJONode1.isValueNode();
        java.lang.Object obj5 = pOJONode1._value;
        boolean boolean6 = pOJONode1.asBoolean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        int int6 = pOJONode1.intValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        boolean boolean6 = pOJONode1.isPojo();
        boolean boolean8 = pOJONode1.hasNonNull("");
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
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean5 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal7 = pOJONode1.decimalValue();
        long long9 = pOJONode1.asLong((long) (short) 100);
        long long11 = pOJONode1.asLong((long) (-1));
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isPojo();
        java.lang.String str9 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = pOJONode12.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode12.deepCopy();
        double double17 = pOJONode12.asDouble(1.0d);
        boolean boolean18 = pOJONode12.isShort();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = pOJONode12.findParent("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = pOJONode23.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = pOJONode23.deepCopy();
        java.util.Iterator<java.lang.String> strItor27 = pOJONode23.fieldNames();
        short short28 = pOJONode23.shortValue();
        boolean boolean30 = pOJONode23.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = pOJONode23.findPath("hi!");
        boolean boolean33 = pOJONode23.isObject();
        double double35 = pOJONode23.asDouble((double) (-1L));
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor36 = pOJONode23.elements();
        boolean boolean37 = pOJONode23.isNumber();
        java.lang.Object obj39 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode40 = new com.fasterxml.jackson.databind.node.POJONode(obj39);
        boolean boolean41 = pOJONode40.asBoolean();
        byte[] byteArray42 = pOJONode40.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode45 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor46 = pOJONode45.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode47 = pOJONode45.deepCopy();
        int int48 = baseJsonNode47.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = baseJsonNode47.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = pOJONode40.findValues("-1", jsonNodeList50);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = pOJONode23.findParents("", jsonNodeList51);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = pOJONode12.findParents("-1", jsonNodeList52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList54 = pOJONode1.findValues("", jsonNodeList52);
        com.fasterxml.jackson.databind.node.POJONode pOJONode57 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = pOJONode57.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor60 = pOJONode57.fields();
        com.fasterxml.jackson.core.JsonToken jsonToken61 = pOJONode57.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = pOJONode57.get((int) (byte) 0);
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = pOJONode57.findValue("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode68 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList70 = pOJONode68.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor71 = pOJONode68.fields();
        boolean boolean72 = pOJONode68.isArray();
        boolean boolean73 = pOJONode68.isPojo();
        java.util.List<java.lang.String> strList75 = pOJONode68.findValuesAsText("-1");
        java.util.List<java.lang.String> strList76 = pOJONode57.findValuesAsText("", strList75);
        java.util.List<java.lang.String> strList77 = pOJONode1.findValuesAsText("hi!", strList75);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeItor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(byteArray42);
        org.junit.Assert.assertNotNull(jsonNodeItor46);
        org.junit.Assert.assertNotNull(baseJsonNode47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertNotNull(jsonNodeList53);
        org.junit.Assert.assertNotNull(jsonNodeList54);
        org.junit.Assert.assertNotNull(jsonNodeList59);
        org.junit.Assert.assertNotNull(strEntryItor60);
        org.junit.Assert.assertTrue("'" + jsonToken61 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken61.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNodeList70);
        org.junit.Assert.assertNotNull(strEntryItor71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        boolean boolean9 = pOJONode1.has((int) (short) 10);
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("");
        boolean boolean12 = pOJONode1.isNumber();
        boolean boolean13 = pOJONode1.isArray();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        boolean boolean20 = pOJONode1.isIntegralNumber();
        boolean boolean21 = pOJONode1.isContainerNode();
        int int22 = pOJONode1.size();
        boolean boolean23 = pOJONode1.isFloat();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isLong();
        boolean boolean5 = pOJONode1.has(100);
        boolean boolean6 = pOJONode1.isContainerNode();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode1.findParents("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeList8);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        java.lang.Object obj5 = pOJONode1._value;
        int int7 = pOJONode1.asInt((int) (byte) 100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = pOJONode1.findValues("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList9);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        boolean boolean8 = pOJONode1.asBoolean(true);
        java.lang.String str9 = pOJONode1.textValue();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor10 = pOJONode1.fields();
        boolean boolean11 = pOJONode1.isBinary();
        double double12 = pOJONode1.doubleValue();
        int int13 = pOJONode1.asInt();
        java.lang.Number number14 = pOJONode1.numberValue();
        java.lang.Number number15 = pOJONode1.numberValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        java.lang.Object obj9 = pOJONode1.getPojo();
        boolean boolean10 = pOJONode1.isValueNode();
        int int11 = pOJONode1.size();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean6 = pOJONode1.canConvertToLong();
        boolean boolean7 = pOJONode1.asBoolean();
        long long8 = pOJONode1.longValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        java.lang.String str5 = pOJONode1.textValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        java.lang.String str6 = pOJONode1.asText();
        java.lang.Number number7 = pOJONode1.numberValue();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        java.util.Iterator<java.lang.String> strItor9 = pOJONode1.fieldNames();
        boolean boolean10 = pOJONode1.isMissingNode();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.booleanValue();
        long long9 = pOJONode1.asLong((long) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get(0);
        java.lang.Object obj12 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode(obj12);
        int int14 = pOJONode13.intValue();
        boolean boolean15 = pOJONode13.isNumber();
        boolean boolean16 = pOJONode13.isNull();
        int int17 = pOJONode13.asInt();
        boolean boolean18 = pOJONode1.equals((java.lang.Object) int17);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = pOJONode1.elements();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = pOJONode1.traverse();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertNotNull(jsonParser20);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = pOJONode1.elements();
        boolean boolean7 = pOJONode1.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double11 = pOJONode10.doubleValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor14 = pOJONode13.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode15 = pOJONode13.deepCopy();
        boolean boolean16 = pOJONode10._pojoEquals(pOJONode13);
        java.lang.Object obj17 = pOJONode13.getPojo();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType18 = pOJONode13.getNodeType();
        java.lang.Object obj20 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode21 = new com.fasterxml.jackson.databind.node.POJONode(obj20);
        boolean boolean22 = pOJONode21.asBoolean();
        byte[] byteArray23 = pOJONode21.binaryValue();
        boolean boolean25 = pOJONode21.hasNonNull("");
        com.fasterxml.jackson.databind.node.POJONode pOJONode28 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean30 = pOJONode28.hasNonNull("hi!");
        int int31 = pOJONode28.intValue();
        boolean boolean32 = pOJONode28.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = pOJONode28.traverse();
        boolean boolean34 = pOJONode28.isDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode37 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor38 = pOJONode37.fields();
        boolean boolean39 = pOJONode37.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken40 = pOJONode37.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode43 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor44 = pOJONode43.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = pOJONode43.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = pOJONode37.findValues("hi!", jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = pOJONode28.findParents("hi!", jsonNodeList47);
        java.lang.Object obj50 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode51 = new com.fasterxml.jackson.databind.node.POJONode(obj50);
        int int52 = pOJONode51.intValue();
        java.lang.String str53 = pOJONode51.asText();
        boolean boolean54 = pOJONode51.booleanValue();
        boolean boolean55 = pOJONode51.isDouble();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = pOJONode51.findValuesAsText("", (java.util.List<java.lang.String>) strList61);
        java.util.List<java.lang.String> strList64 = pOJONode28.findValuesAsText("-1", strList63);
        java.util.List<java.lang.String> strList65 = pOJONode21.findValuesAsText("", strList64);
        java.util.List<java.lang.String> strList66 = pOJONode13.findValuesAsText("hi!", strList64);
        java.util.List<java.lang.String> strList67 = pOJONode1.findValuesAsText("hi!", strList64);
        com.fasterxml.jackson.databind.node.POJONode pOJONode68 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) strList67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor14);
        org.junit.Assert.assertNotNull(baseJsonNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + jsonNodeType18 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType18.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strEntryItor38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + jsonToken40 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken40.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor44);
        org.junit.Assert.assertNotNull(jsonNodeList46);
        org.junit.Assert.assertNotNull(jsonNodeList47);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        int int4 = pOJONode1.asInt();
        long long5 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType6 = pOJONode1.getNodeType();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.iterator();
        java.lang.Object obj8 = pOJONode1._value;
        boolean boolean9 = pOJONode1.isNumber();
        boolean boolean11 = pOJONode1.has("");
        byte[] byteArray12 = pOJONode1.binaryValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + jsonNodeType6 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType6.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteArray12);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.isNumber();
        boolean boolean3 = pOJONode1.isMissingNode();
        java.lang.Number number4 = pOJONode1.numberValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode6.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode6.deepCopy();
        boolean boolean11 = pOJONode6.asBoolean(false);
        boolean boolean12 = pOJONode1._pojoEquals(pOJONode6);
        java.util.Iterator<java.lang.String> strItor13 = pOJONode1.fieldNames();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = pOJONode1.findParents("");
        short short16 = pOJONode1.shortValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        boolean boolean6 = pOJONode5.isShort();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode7 = pOJONode5.deepCopy();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(baseJsonNode7);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = pOJONode1.numberType();
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.findPath("");
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("");
        boolean boolean12 = pOJONode1.isBigInteger();
        boolean boolean13 = pOJONode1.isObject();
        boolean boolean14 = pOJONode1.isBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(numberType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        long long4 = pOJONode1.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType5 = pOJONode1.getNodeType();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode6 = pOJONode1.deepCopy();
        java.lang.String str7 = pOJONode1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + jsonNodeType5 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType5.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(baseJsonNode6);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        boolean boolean6 = pOJONode1.asBoolean();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = pOJONode1.fields();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strEntryItor7);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        boolean boolean15 = pOJONode1.canConvertToLong();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator16, serializerProvider17);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        double double3 = pOJONode1.doubleValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.findPath("");
        boolean boolean6 = pOJONode1.isBinary();
        boolean boolean7 = pOJONode1.isContainerNode();
        java.lang.Object obj8 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode(obj8);
        int int10 = pOJONode9.intValue();
        boolean boolean11 = pOJONode9.isNull();
        boolean boolean12 = pOJONode9.isPojo();
        java.lang.Object obj13 = pOJONode9._value;
        java.math.BigInteger bigInteger14 = pOJONode9.bigIntegerValue();
        boolean boolean15 = pOJONode1._pojoEquals(pOJONode9);
        java.lang.Object obj17 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode(obj17);
        boolean boolean19 = pOJONode18.asBoolean();
        byte[] byteArray20 = pOJONode18.binaryValue();
        java.lang.Object obj21 = pOJONode18._value;
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode(obj21);
        java.lang.Object obj24 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode25 = new com.fasterxml.jackson.databind.node.POJONode(obj24);
        boolean boolean26 = pOJONode25.asBoolean();
        byte[] byteArray27 = pOJONode25.binaryValue();
        java.lang.Object obj28 = pOJONode25._value;
        java.lang.Object obj30 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode31 = new com.fasterxml.jackson.databind.node.POJONode(obj30);
        int int32 = pOJONode31.intValue();
        java.lang.String str33 = pOJONode31.asText();
        boolean boolean34 = pOJONode31.booleanValue();
        boolean boolean35 = pOJONode31.isDouble();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<java.lang.String> strList43 = pOJONode31.findValuesAsText("", (java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList44 = pOJONode25.findValuesAsText("hi!", strList43);
        java.util.List<java.lang.String> strList45 = pOJONode22.findValuesAsText("", strList43);
        java.util.List<java.lang.String> strList46 = pOJONode9.findValuesAsText("-1", strList43);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path((int) (short) -1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = pOJONode1.findParent("-1");
        boolean boolean10 = pOJONode1.has((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        boolean boolean14 = pOJONode1.isArray();
        long long16 = pOJONode1.asLong((long) 100);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode1.findValue("");
        boolean boolean19 = pOJONode1.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = pOJONode1.findParent("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objectNode21);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        boolean boolean14 = pOJONode1.canConvertToInt();
        boolean boolean16 = pOJONode1.has((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findValue("");
        boolean boolean9 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = pOJONode1.traverse(objectCodec10);
        int int12 = pOJONode1.asInt();
        java.lang.String str13 = pOJONode1.asText();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode8.get((int) '4');
        long long12 = pOJONode8.asLong((long) (byte) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode8.findValue("hi!");
        java.lang.String str15 = pOJONode8.asText();
        boolean boolean16 = pOJONode8.isPojo();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator17 = pOJONode8.spliterator();
        boolean boolean18 = pOJONode8.isInt();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        boolean boolean6 = pOJONode1.isValueNode();
        boolean boolean8 = pOJONode1.hasNonNull("hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        int int9 = pOJONode1.asInt(0);
        boolean boolean10 = pOJONode1.isDouble();
        boolean boolean12 = pOJONode1.asBoolean(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        boolean boolean20 = pOJONode1.isIntegralNumber();
        int int21 = pOJONode1.asInt();
        boolean boolean22 = pOJONode1.isArray();
        boolean boolean24 = pOJONode1.has((int) '4');
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean28 = pOJONode26.hasNonNull("hi!");
        int int29 = pOJONode26.intValue();
        boolean boolean30 = pOJONode26.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = pOJONode26.traverse();
        boolean boolean32 = pOJONode26.isDouble();
        java.lang.String str33 = pOJONode26.asText();
        boolean boolean34 = pOJONode1.equals((java.lang.Object) str33);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        boolean boolean3 = pOJONode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.get("hi!");
        boolean boolean6 = pOJONode1.isTextual();
        double double8 = pOJONode1.asDouble((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        boolean boolean16 = pOJONode1.isMissingNode();
        boolean boolean17 = pOJONode1.isShort();
        boolean boolean18 = pOJONode1.isBigDecimal();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor19 = pOJONode1.fields();
        java.math.BigDecimal bigDecimal20 = pOJONode1.decimalValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEntryItor12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strEntryItor19);
        org.junit.Assert.assertNotNull(bigDecimal20);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        int int6 = pOJONode1.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.findPath("-1");
        boolean boolean9 = pOJONode1.isMissingNode();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator10 = null;
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.isNumber();
        boolean boolean14 = pOJONode12.isMissingNode();
        java.lang.Number number15 = pOJONode12.numberValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode17.deepCopy();
        boolean boolean22 = pOJONode17.asBoolean(false);
        boolean boolean23 = pOJONode12._pojoEquals(pOJONode17);
        java.util.Iterator<java.lang.String> strItor24 = pOJONode12.fieldNames();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode12.findParents("");
        byte[] byteArray27 = pOJONode12.binaryValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = pOJONode1.equals(jsonNodeComparator10, (com.fasterxml.jackson.databind.JsonNode) pOJONode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNull(byteArray27);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        java.lang.Object obj4 = pOJONode1._value;
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode(obj4);
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean9 = pOJONode7.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = pOJONode12.findValues("hi!");
        java.lang.String str15 = pOJONode12.asText();
        boolean boolean17 = pOJONode12.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType18 = pOJONode12.numberType();
        boolean boolean20 = pOJONode12.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = pOJONode12.findParent("");
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = pOJONode12.get("");
        java.util.List<java.lang.String> strList26 = pOJONode12.findValuesAsText("");
        java.util.List<java.lang.String> strList27 = pOJONode7.findValuesAsText("-1", strList26);
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = pOJONode7.findPath("hi!");
        boolean boolean30 = pOJONode5.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(numberType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objectNode22);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        boolean boolean9 = pOJONode1.isLong();
        boolean boolean11 = pOJONode1.has("-1");
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator12 = pOJONode1.spliterator();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = pOJONode14.elements();
        boolean boolean16 = pOJONode14.isFloatingPointNumber();
        java.lang.String str17 = pOJONode14.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = pOJONode14.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = pOJONode14.path((int) (byte) 1);
        float float22 = pOJONode14.floatValue();
        boolean boolean23 = pOJONode14.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode14.path("hi!");
        boolean boolean26 = pOJONode1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator12);
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        int int6 = pOJONode1.intValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        java.lang.Object obj10 = pOJONode1.getPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(jsonNode12);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        double double15 = pOJONode6.asDouble();
        java.lang.String str16 = pOJONode6.textValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        boolean boolean16 = pOJONode1.isTextual();
        java.lang.Object obj17 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode(obj17);
        boolean boolean19 = pOJONode18.asBoolean();
        long long21 = pOJONode18.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = pOJONode18.traverse(objectCodec22);
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode18.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = pOJONode18.path((int) (byte) -1);
        java.math.BigDecimal bigDecimal28 = jsonNode27.decimalValue();
        boolean boolean29 = pOJONode1.equals((java.lang.Object) jsonNode27);
        boolean boolean30 = pOJONode1.isInt();
        boolean boolean32 = pOJONode1.hasNonNull("-1");
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        boolean boolean6 = pOJONode1.isBigInteger();
        boolean boolean8 = pOJONode1.hasNonNull("-1");
        int int10 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor11 = pOJONode1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(jsonNodeItor11);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        boolean boolean3 = pOJONode1.asBoolean();
        boolean boolean4 = pOJONode1.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = pOJONode1.findValues("-1");
        boolean boolean7 = pOJONode1.canConvertToLong();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.path("hi!");
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.path("hi!");
        boolean boolean14 = pOJONode1.canConvertToInt();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = pOJONode1.elements();
        long long16 = pOJONode1.asLong();
        boolean boolean17 = pOJONode1.isNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        short short2 = pOJONode1.shortValue();
        boolean boolean3 = pOJONode1.isLong();
        boolean boolean4 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.at("");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode1.fields();
        java.util.Iterator<java.lang.String> strItor9 = pOJONode1.fieldNames();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = pOJONode1.elements();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        boolean boolean20 = pOJONode1.asBoolean();
        boolean boolean21 = pOJONode1.isDouble();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.path((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        double double5 = pOJONode1.asDouble();
        double double7 = pOJONode1.asDouble((double) (short) 10);
        boolean boolean9 = pOJONode1.has((int) (short) 1);
        java.lang.String str10 = pOJONode1.textValue();
        java.lang.String str11 = pOJONode1.textValue();
        long long12 = pOJONode1.longValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        short short6 = pOJONode1.shortValue();
        boolean boolean8 = pOJONode1.has((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.findPath("hi!");
        java.lang.Number number11 = pOJONode1.numberValue();
        boolean boolean13 = pOJONode1.hasNonNull((int) (short) -1);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode1.at("");
        java.math.BigDecimal bigDecimal16 = pOJONode1.decimalValue();
        boolean boolean17 = pOJONode1.isObject();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.math.BigInteger bigInteger5 = jsonNode4.bigIntegerValue();
        boolean boolean6 = jsonNode4.isArray();
        boolean boolean7 = jsonNode4.isBigInteger();
        boolean boolean8 = jsonNode4.isFloat();
        boolean boolean9 = jsonNode4.isFloatingPointNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get(10);
        boolean boolean13 = pOJONode1.asBoolean(false);
        java.lang.Object obj14 = pOJONode1._value;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.withArray("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = pOJONode1.findParents("hi!");
        boolean boolean5 = pOJONode1.isValueNode();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = pOJONode1.findParent("hi!");
        boolean boolean9 = pOJONode1.hasNonNull("-1");
        boolean boolean10 = pOJONode1.isBigDecimal();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.has("");
        boolean boolean7 = pOJONode1.canConvertToInt();
        java.lang.Object obj8 = pOJONode1.getPojo();
        boolean boolean9 = pOJONode1.isLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.findPath("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonNode8.isTextual();
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        java.util.List<java.lang.String> strList7 = null;
        java.util.List<java.lang.String> strList8 = pOJONode1.findValuesAsText("-1", strList7);
        boolean boolean9 = pOJONode1.isBinary();
        double double10 = pOJONode1.asDouble();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.booleanValue();
        long long9 = pOJONode1.asLong((long) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.get(0);
        java.lang.Object obj12 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode(obj12);
        int int14 = pOJONode13.intValue();
        boolean boolean15 = pOJONode13.isNumber();
        boolean boolean16 = pOJONode13.isNull();
        int int17 = pOJONode13.asInt();
        boolean boolean18 = pOJONode1.equals((java.lang.Object) int17);
        java.lang.Object obj19 = pOJONode1._value;
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = pOJONode1.deepCopy();
        boolean boolean7 = pOJONode6.isBoolean();
        boolean boolean8 = pOJONode6.isContainerNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode6.get("hi!");
        boolean boolean12 = pOJONode6.asBoolean(true);
        boolean boolean13 = pOJONode6.isBinary();
        java.util.Comparator<com.fasterxml.jackson.databind.JsonNode> jsonNodeComparator14 = null;
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = pOJONode16.findValues("hi!");
        boolean boolean19 = pOJONode16.canConvertToLong();
        boolean boolean20 = pOJONode16.isShort();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = pOJONode6.equals(jsonNodeComparator14, (com.fasterxml.jackson.databind.JsonNode) pOJONode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(pOJONode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        boolean boolean4 = baseJsonNode3.isObject();
        java.math.BigInteger bigInteger5 = baseJsonNode3.bigIntegerValue();
        boolean boolean6 = baseJsonNode3.isValueNode();
        boolean boolean7 = baseJsonNode3.isBoolean();
        int int8 = baseJsonNode3.intValue();
        boolean boolean9 = baseJsonNode3.booleanValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = baseJsonNode3.withArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call withArray() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        java.lang.String str9 = pOJONode1.asText("-1");
        boolean boolean10 = pOJONode1.isLong();
        long long12 = pOJONode1.asLong((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        short short4 = pOJONode1.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.findPath("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = pOJONode1.traverse(objectCodec7);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser8);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.math.BigInteger bigInteger5 = jsonNode4.bigIntegerValue();
        boolean boolean6 = jsonNode4.isArray();
        boolean boolean7 = jsonNode4.isDouble();
        int int8 = jsonNode4.size();
        boolean boolean9 = jsonNode4.isBigDecimal();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = jsonNode4.findParents("-1");
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        int int24 = pOJONode1.asInt();
        boolean boolean25 = pOJONode1.isDouble();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator26 = pOJONode1.spliterator();
        boolean boolean27 = pOJONode1.isNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor31 = pOJONode30.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode32 = pOJONode30.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        boolean boolean34 = pOJONode30.isEmpty(serializerProvider33);
        boolean boolean36 = pOJONode30.asBoolean(true);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = pOJONode30.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList39 = pOJONode1.findParents("-1", jsonNodeList38);
        com.fasterxml.jackson.databind.node.POJONode pOJONode40 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) "-1");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor31);
        org.junit.Assert.assertNotNull(baseJsonNode32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertNotNull(jsonNodeList39);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        boolean boolean31 = pOJONode1.isEmpty(serializerProvider30);
        int int33 = pOJONode1.asInt((int) (short) 100);
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType34 = pOJONode1.getNodeType();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + jsonNodeType34 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType34.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        com.fasterxml.jackson.databind.node.POJONode pOJONode60 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double61 = pOJONode60.doubleValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode63 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor64 = pOJONode63.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode65 = pOJONode63.deepCopy();
        boolean boolean66 = pOJONode60._pojoEquals(pOJONode63);
        boolean boolean67 = pOJONode63.isArray();
        com.fasterxml.jackson.databind.node.POJONode pOJONode69 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger70 = pOJONode69.bigIntegerValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode72 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = pOJONode72.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor75 = pOJONode72.fields();
        boolean boolean76 = pOJONode72.isArray();
        java.lang.Object obj77 = pOJONode72.getPojo();
        boolean boolean78 = pOJONode72.isPojo();
        java.math.BigDecimal bigDecimal79 = pOJONode72.decimalValue();
        boolean boolean80 = pOJONode69._pojoEquals(pOJONode72);
        boolean boolean81 = pOJONode63._pojoEquals(pOJONode72);
        boolean boolean82 = pOJONode1.equals((java.lang.Object) pOJONode72);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode84 = pOJONode72.findParent("-1");
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
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor64);
        org.junit.Assert.assertNotNull(baseJsonNode65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNotNull(strEntryItor75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (byte) -1 + "'", obj77, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(objectNode84);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        boolean boolean22 = pOJONode1.isBigInteger();
        boolean boolean23 = pOJONode1.isLong();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor24 = pOJONode1.fields();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strEntryItor24);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        java.lang.Object obj8 = pOJONode1._value;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode1.findParents("hi!");
        boolean boolean11 = pOJONode1.isArray();
        java.math.BigInteger bigInteger12 = pOJONode1.bigIntegerValue();
        double double14 = pOJONode1.asDouble(0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        boolean boolean9 = pOJONode1.has((int) (short) 10);
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("");
        boolean boolean12 = pOJONode1.isNumber();
        short short13 = pOJONode1.shortValue();
        java.math.BigDecimal bigDecimal14 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode15 = pOJONode1.deepCopy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(baseJsonNode15);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        long long9 = pOJONode1.asLong((long) 1);
        long long10 = pOJONode1.asLong();
        boolean boolean12 = pOJONode1.has("");
        boolean boolean13 = pOJONode1.isPojo();
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = pOJONode15.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor18 = pOJONode15.fields();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = pOJONode15.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = pOJONode15.get("");
        boolean boolean23 = pOJONode15.asBoolean(true);
        boolean boolean24 = pOJONode1._pojoEquals(pOJONode15);
        boolean boolean25 = pOJONode15.isBoolean();
        boolean boolean27 = pOJONode15.hasNonNull(100);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(strEntryItor18);
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode4 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = pOJONode4.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode6 = pOJONode4.deepCopy();
        boolean boolean7 = pOJONode1._pojoEquals(pOJONode4);
        java.lang.Object obj8 = pOJONode4.getPojo();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType9 = pOJONode4.getNodeType();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator10 = pOJONode4.spliterator();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor11 = pOJONode4.iterator();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = pOJONode14.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = pOJONode14.deepCopy();
        boolean boolean18 = pOJONode14.isPojo();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = pOJONode14.iterator();
        int int20 = pOJONode14.asInt();
        boolean boolean21 = pOJONode14.canConvertToInt();
        java.util.List<java.lang.String> strList23 = pOJONode14.findValuesAsText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor27 = pOJONode26.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode28 = pOJONode26.deepCopy();
        int int29 = pOJONode26.asInt();
        long long30 = pOJONode26.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType31 = pOJONode26.getNodeType();
        com.fasterxml.jackson.databind.node.POJONode pOJONode34 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor35 = pOJONode34.fields();
        boolean boolean36 = pOJONode34.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken37 = pOJONode34.asToken();
        java.math.BigDecimal bigDecimal38 = pOJONode34.decimalValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode41 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor42 = pOJONode41.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor43 = pOJONode41.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = pOJONode41.path((int) (byte) 10);
        boolean boolean46 = pOJONode41.isBoolean();
        java.lang.String str48 = pOJONode41.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode51 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = pOJONode51.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = pOJONode51.deepCopy();
        boolean boolean55 = pOJONode51.isPojo();
        int int56 = pOJONode51.asInt();
        int int58 = pOJONode51.asInt((int) ' ');
        java.lang.String str59 = pOJONode51.asText();
        com.fasterxml.jackson.databind.node.POJONode pOJONode62 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean64 = pOJONode62.hasNonNull("hi!");
        int int65 = pOJONode62.intValue();
        boolean boolean66 = pOJONode62.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser67 = pOJONode62.traverse();
        java.lang.String str68 = pOJONode62.toString();
        boolean boolean70 = pOJONode62.has((int) (short) 10);
        java.util.List<java.lang.String> strList72 = pOJONode62.findValuesAsText("");
        java.util.List<java.lang.String> strList73 = pOJONode51.findValuesAsText("", strList72);
        java.util.List<java.lang.String> strList74 = pOJONode41.findValuesAsText("hi!", strList72);
        java.util.List<java.lang.String> strList75 = pOJONode34.findValuesAsText("hi!", strList74);
        java.util.List<java.lang.String> strList76 = pOJONode26.findValuesAsText("", strList74);
        java.util.List<java.lang.String> strList77 = pOJONode14.findValuesAsText("", strList74);
        java.util.List<java.lang.String> strList78 = pOJONode4.findValuesAsText("hi!", strList77);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertNotNull(baseJsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + jsonNodeType9 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType9.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonNodeSpliterator10);
        org.junit.Assert.assertNotNull(jsonNodeItor11);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(jsonNodeItor27);
        org.junit.Assert.assertNotNull(baseJsonNode28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + jsonNodeType31 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType31.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(strEntryItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + jsonToken37 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken37.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(strEntryItor42);
        org.junit.Assert.assertNotNull(jsonNodeItor43);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "-1" + "'", str48, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-1" + "'", str59, "-1");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-1" + "'", str68, "-1");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        boolean boolean46 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode49 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor50 = pOJONode49.fields();
        boolean boolean51 = pOJONode49.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken52 = pOJONode49.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType53 = pOJONode49.numberType();
        boolean boolean54 = pOJONode49.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = pOJONode49.findParents("-1");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = pOJONode1.findValues("", jsonNodeList56);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider59 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator58, serializerProvider59);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strEntryItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + jsonToken52 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken52.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNodeList57);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull((int) (byte) 10);
        com.fasterxml.jackson.databind.node.POJONode pOJONode4 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) 10);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode4.traverse();
        boolean boolean6 = pOJONode4.isBigDecimal();
        java.math.BigDecimal bigDecimal7 = pOJONode4.decimalValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigDecimal7);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        int int5 = jsonNode4.intValue();
        boolean boolean6 = jsonNode4.isLong();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNode4.with("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        boolean boolean14 = pOJONode1.canConvertToInt();
        boolean boolean15 = pOJONode1.isFloatingPointNumber();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        java.math.BigInteger bigInteger3 = pOJONode1.bigIntegerValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = pOJONode1.findParents("-1");
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.lang.String str8 = pOJONode1.asText("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isMissingNode();
        boolean boolean8 = pOJONode1.isContainerNode();
        java.lang.Number number9 = pOJONode1.numberValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        boolean boolean4 = pOJONode1.isBinary();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path((int) (short) 0);
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.lang.String str11 = pOJONode8.asText();
        boolean boolean13 = pOJONode8.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = pOJONode8.numberType();
        boolean boolean16 = pOJONode8.hasNonNull("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = pOJONode8.findValues("hi!");
        java.lang.Number number19 = pOJONode8.numberValue();
        boolean boolean20 = pOJONode1._pojoEquals(pOJONode8);
        float float21 = pOJONode8.floatValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode24.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = pOJONode24.deepCopy();
        java.util.Iterator<java.lang.String> strItor28 = pOJONode24.fieldNames();
        boolean boolean29 = pOJONode24.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = pOJONode24.findPath("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = jsonNode31.at("");
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator34 = jsonNode31.spliterator();
        boolean boolean35 = jsonNode31.isBinary();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = jsonNode31.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = pOJONode8.findValues("-1", jsonNodeList37);
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(jsonNodeList38);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.hasNonNull("");
        java.math.BigInteger bigInteger8 = pOJONode1.bigIntegerValue();
        boolean boolean10 = pOJONode1.asBoolean(true);
        boolean boolean12 = pOJONode1.has("hi!");
        boolean boolean14 = pOJONode1.hasNonNull((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        boolean boolean84 = pOJONode1.asBoolean();
        boolean boolean85 = pOJONode1.isArray();
        double double86 = pOJONode1.asDouble();
        boolean boolean87 = pOJONode1.isDouble();
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        int int10 = pOJONode1.intValue();
        long long12 = pOJONode1.asLong((long) (-1));
        double double13 = pOJONode1.asDouble();
        boolean boolean14 = pOJONode1.booleanValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        long long4 = pOJONode1.longValue();
        java.lang.String str6 = pOJONode1.asText("-1");
        boolean boolean7 = pOJONode1.isLong();
        short short8 = pOJONode1.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.path("-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isPojo();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = pOJONode1.numberType();
        boolean boolean10 = pOJONode1.isPojo();
        boolean boolean11 = pOJONode1.isArray();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNull(numberType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = pOJONode1.numberType();
        boolean boolean7 = pOJONode1.isDouble();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator8 = pOJONode1.spliterator();
        int int9 = pOJONode1.intValue();
        byte[] byteArray10 = pOJONode1.binaryValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = pOJONode1.traverse(objectCodec11);
        int int13 = pOJONode1.asInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(numberType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        double double6 = pOJONode1.asDouble();
        boolean boolean7 = pOJONode1.isBinary();
        boolean boolean9 = pOJONode1.has((int) (byte) 1);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.at("");
        int int13 = pOJONode1.asInt((int) (short) 10);
        boolean boolean14 = pOJONode1.isContainerNode();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        boolean boolean7 = pOJONode1.isDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.get((int) (byte) 0);
        java.lang.Object obj10 = pOJONode1.getPojo();
        float float11 = pOJONode1.floatValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonNode9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        boolean boolean8 = pOJONode1.asBoolean(true);
        java.lang.String str9 = pOJONode1.textValue();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor10 = pOJONode1.fields();
        boolean boolean11 = pOJONode1.canConvertToLong();
        boolean boolean12 = pOJONode1.booleanValue();
        double double14 = pOJONode1.asDouble(10.0d);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        boolean boolean5 = pOJONode1.hasNonNull("");
        byte[] byteArray6 = pOJONode1.binaryValue();
        boolean boolean7 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = pOJONode1.findParent("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.path("hi!");
        com.fasterxml.jackson.core.JsonParser.NumberType numberType8 = pOJONode1.numberType();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode10.findValues("hi!");
        boolean boolean13 = pOJONode10.isTextual();
        boolean boolean14 = pOJONode1._pojoEquals(pOJONode10);
        boolean boolean15 = pOJONode10.asBoolean();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = pOJONode10.traverse(objectCodec16);
        com.fasterxml.jackson.databind.node.POJONode pOJONode19 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = pOJONode19.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = pOJONode19.deepCopy();
        boolean boolean23 = pOJONode19.isPojo();
        int int24 = pOJONode19.asInt();
        int int26 = pOJONode19.asInt((int) ' ');
        java.lang.String str27 = pOJONode19.asText();
        boolean boolean29 = pOJONode19.asBoolean(true);
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList34 = pOJONode32.findValues("hi!");
        boolean boolean35 = pOJONode32.canConvertToLong();
        boolean boolean36 = pOJONode32.isObject();
        java.lang.Object obj38 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode39 = new com.fasterxml.jackson.databind.node.POJONode(obj38);
        int int40 = pOJONode39.intValue();
        boolean boolean41 = pOJONode39.isNull();
        int int43 = pOJONode39.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor44 = pOJONode39.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor45 = pOJONode39.elements();
        java.lang.Object obj46 = pOJONode39._value;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = pOJONode39.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = pOJONode32.findParents("-1", jsonNodeList48);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode19.findValues("-1", jsonNodeList49);
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType51 = pOJONode19.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = pOJONode19.findPath("");
        java.util.Iterator<java.lang.String> strItor54 = pOJONode19.fieldNames();
        boolean boolean55 = pOJONode10._pojoEquals(pOJONode19);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(numberType8);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jsonNodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(strEntryItor44);
        org.junit.Assert.assertNotNull(jsonNodeItor45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertTrue("'" + jsonNodeType51 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType51.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        float float9 = pOJONode1.floatValue();
        boolean boolean10 = pOJONode1.isIntegralNumber();
        boolean boolean11 = pOJONode1.isShort();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator12 = pOJONode1.spliterator();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator12);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        java.lang.Number number5 = pOJONode1.numberValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonToken jsonToken5 = pOJONode1.asToken();
        java.math.BigInteger bigInteger6 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode9.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor12 = pOJONode9.fields();
        boolean boolean13 = pOJONode9.isArray();
        java.lang.Object obj14 = pOJONode9.getPojo();
        boolean boolean15 = pOJONode9.isIntegralNumber();
        long long17 = pOJONode9.asLong((long) 1);
        long long18 = pOJONode9.asLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = pOJONode9.findParent("");
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double24 = pOJONode23.doubleValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode26 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor27 = pOJONode26.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode28 = pOJONode26.deepCopy();
        boolean boolean29 = pOJONode23._pojoEquals(pOJONode26);
        java.lang.Object obj30 = pOJONode26.getPojo();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType31 = pOJONode26.getNodeType();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList33 = pOJONode26.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList35 = pOJONode26.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList36 = pOJONode9.findParents("-1", jsonNodeList35);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = pOJONode1.findValues("-1", jsonNodeList35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(strEntryItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(objectNode20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor27);
        org.junit.Assert.assertNotNull(baseJsonNode28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + jsonNodeType31 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.POJO + "'", jsonNodeType31.equals(com.fasterxml.jackson.databind.node.JsonNodeType.POJO));
        org.junit.Assert.assertNotNull(jsonNodeList33);
        org.junit.Assert.assertNotNull(jsonNodeList35);
        org.junit.Assert.assertNotNull(jsonNodeList36);
        org.junit.Assert.assertNotNull(jsonNodeList37);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = pOJONode1.findParents("hi!");
        boolean boolean5 = pOJONode1.isArray();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.isContainerNode();
        double double4 = pOJONode1.asDouble();
        double double5 = pOJONode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = pOJONode1.elements();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at(jsonPointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.get(100);
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.lang.String str11 = pOJONode8.asText();
        boolean boolean13 = pOJONode8.asBoolean(false);
        boolean boolean14 = pOJONode1._pojoEquals(pOJONode8);
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.path(100);
        boolean boolean17 = pOJONode1.isIntegralNumber();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        java.util.Iterator<java.lang.String> strItor7 = pOJONode1.fieldNames();
        java.lang.String str8 = pOJONode1.toString();
        long long9 = pOJONode1.asLong();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull((int) (byte) 10);
        boolean boolean4 = pOJONode1.isDouble();
        boolean boolean5 = pOJONode1.isNull();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) boolean5);
        java.lang.Object obj8 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode(obj8);
        int int10 = pOJONode9.intValue();
        boolean boolean11 = pOJONode9.isNull();
        int int13 = pOJONode9.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor14 = pOJONode9.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = pOJONode9.elements();
        int int16 = pOJONode9.asInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode19 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor20 = pOJONode19.fields();
        boolean boolean21 = pOJONode19.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = pOJONode19.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode25 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor26 = pOJONode25.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList28 = pOJONode25.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = pOJONode19.findValues("hi!", jsonNodeList28);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = pOJONode19.get("");
        byte[] byteArray32 = pOJONode19.binaryValue();
        boolean boolean33 = pOJONode19.isBigDecimal();
        com.fasterxml.jackson.databind.node.POJONode pOJONode36 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor37 = pOJONode36.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode38 = pOJONode36.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = null;
        boolean boolean40 = pOJONode36.isEmpty(serializerProvider39);
        boolean boolean42 = pOJONode36.hasNonNull((int) '4');
        java.lang.String str43 = pOJONode36.asText();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList45 = pOJONode36.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = pOJONode19.findParents("-1", jsonNodeList45);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = pOJONode9.findParents("", jsonNodeList46);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = pOJONode6.findParents("-1", jsonNodeList47);
        com.fasterxml.jackson.databind.node.POJONode pOJONode51 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = pOJONode51.findValues("hi!");
        boolean boolean54 = pOJONode51.canConvertToLong();
        boolean boolean55 = pOJONode51.isObject();
        java.lang.Object obj57 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode58 = new com.fasterxml.jackson.databind.node.POJONode(obj57);
        int int59 = pOJONode58.intValue();
        boolean boolean60 = pOJONode58.isNull();
        int int62 = pOJONode58.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor63 = pOJONode58.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor64 = pOJONode58.elements();
        java.lang.Object obj65 = pOJONode58._value;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList67 = pOJONode58.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList68 = pOJONode51.findParents("-1", jsonNodeList67);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList69 = pOJONode6.findParents("hi!", jsonNodeList68);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strEntryItor14);
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strEntryItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + jsonToken22 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken22.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor26);
        org.junit.Assert.assertNotNull(jsonNodeList28);
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor37);
        org.junit.Assert.assertNotNull(baseJsonNode38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-1" + "'", str43, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList45);
        org.junit.Assert.assertNotNull(jsonNodeList46);
        org.junit.Assert.assertNotNull(jsonNodeList47);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertNotNull(jsonNodeList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(strEntryItor63);
        org.junit.Assert.assertNotNull(jsonNodeItor64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(jsonNodeList67);
        org.junit.Assert.assertNotNull(jsonNodeList68);
        org.junit.Assert.assertNotNull(jsonNodeList69);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        boolean boolean30 = pOJONode1.isNull();
        double double31 = pOJONode1.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode33 = pOJONode1.with("hi!");
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.toString();
        boolean boolean10 = pOJONode1.hasNonNull((int) (byte) 10);
        boolean boolean11 = pOJONode1.isDouble();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.findValue("-1");
        boolean boolean16 = pOJONode1.has(0);
        boolean boolean18 = pOJONode1.hasNonNull((int) (short) 100);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode1.findPath("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOJONode1.serialize(jsonGenerator21, serializerProvider22);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("hi!");
        boolean boolean7 = pOJONode1.isIntegralNumber();
        int int9 = pOJONode1.asInt(0);
        short short10 = pOJONode1.shortValue();
        double double12 = pOJONode1.asDouble((double) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
        boolean boolean7 = pOJONode1.isValueNode();
        int int8 = pOJONode1.asInt();
        java.lang.String str9 = pOJONode1.textValue();
        int int11 = pOJONode1.asInt(1);
        boolean boolean12 = pOJONode1.isBigDecimal();
        long long13 = pOJONode1.longValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode8.get((int) '4');
        long long12 = pOJONode8.asLong((long) (byte) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode8.findValue("hi!");
        java.lang.String str15 = pOJONode8.asText();
        boolean boolean16 = pOJONode8.isPojo();
        byte[] byteArray17 = pOJONode8.binaryValue();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(byteArray17);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str10 = pOJONode1.asText("");
        boolean boolean11 = pOJONode1.canConvertToLong();
        int int12 = pOJONode1.asInt();
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) int12);
        double double15 = pOJONode13.asDouble((double) (short) 1);
        boolean boolean16 = pOJONode13.isNull();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        java.math.BigDecimal bigDecimal6 = pOJONode1.decimalValue();
        long long7 = pOJONode1.longValue();
        boolean boolean8 = pOJONode1.isMissingNode();
        boolean boolean9 = pOJONode1.isBinary();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        boolean boolean6 = pOJONode1.isIntegralNumber();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = pOJONode1.deepCopy();
        boolean boolean7 = pOJONode6.isBoolean();
        boolean boolean8 = pOJONode6.isContainerNode();
        boolean boolean9 = pOJONode6.isNull();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode6.findParents("");
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(pOJONode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.lang.String str7 = pOJONode5.asText("hi!");
        boolean boolean8 = pOJONode5.isPojo();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        boolean boolean6 = pOJONode1.isPojo();
        java.util.List<java.lang.String> strList8 = pOJONode1.findValuesAsText("-1");
        java.lang.Object obj9 = pOJONode1._value;
        java.lang.Object obj11 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode12 = new com.fasterxml.jackson.databind.node.POJONode(obj11);
        boolean boolean13 = pOJONode12.asBoolean();
        byte[] byteArray14 = pOJONode12.binaryValue();
        boolean boolean16 = pOJONode12.hasNonNull("");
        boolean boolean18 = pOJONode12.asBoolean(false);
        boolean boolean19 = pOJONode12.isNull();
        java.util.Iterator<java.lang.String> strItor20 = pOJONode12.fieldNames();
        java.lang.Object obj22 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode(obj22);
        boolean boolean24 = pOJONode23.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = pOJONode23.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = pOJONode23.path("hi!");
        boolean boolean29 = pOJONode23.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider30 = null;
        boolean boolean31 = pOJONode23.isEmpty(serializerProvider30);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList33 = pOJONode23.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList34 = pOJONode12.findParents("", jsonNodeList33);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList35 = pOJONode1.findParents("-1", jsonNodeList34);
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = pOJONode1.findPath("hi!");
        boolean boolean38 = pOJONode1.isNumber();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonNodeList33);
        org.junit.Assert.assertNotNull(jsonNodeList34);
        org.junit.Assert.assertNotNull(jsonNodeList35);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode24.findValues("hi!");
        java.lang.String str27 = pOJONode24.asText();
        boolean boolean29 = pOJONode24.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType30 = pOJONode24.numberType();
        boolean boolean32 = pOJONode24.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = pOJONode24.findParent("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser36 = pOJONode24.traverse(objectCodec35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = pOJONode24.findParent("hi!");
        boolean boolean39 = pOJONode1.equals((java.lang.Object) objectNode38);
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
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(numberType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(objectNode34);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNull(objectNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path((int) (short) -1);
        java.util.Iterator<java.lang.String> strItor7 = pOJONode1.fieldNames();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        boolean boolean8 = pOJONode1.isNull();
        java.lang.Object obj9 = pOJONode1.getPojo();
        boolean boolean11 = pOJONode1.hasNonNull((int) '#');
        boolean boolean12 = pOJONode1.isBinary();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.math.BigInteger bigInteger5 = jsonNode4.bigIntegerValue();
        boolean boolean6 = jsonNode4.isArray();
        boolean boolean7 = jsonNode4.isBigInteger();
        boolean boolean8 = jsonNode4.canConvertToLong();
        boolean boolean9 = jsonNode4.isTextual();
        boolean boolean10 = jsonNode4.isBigInteger();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.path("");
        com.fasterxml.jackson.databind.node.POJONode pOJONode18 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode18.findValues("hi!");
        boolean boolean21 = pOJONode18.canConvertToLong();
        byte[] byteArray22 = pOJONode18.binaryValue();
        java.lang.String str23 = pOJONode18.textValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = pOJONode18.traverse(objectCodec24);
        boolean boolean26 = pOJONode1.equals((java.lang.Object) objectCodec24);
        int int28 = pOJONode1.asInt((int) (byte) 0);
        java.lang.String str29 = pOJONode1.asText();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = pOJONode1.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        java.lang.Object obj8 = pOJONode1._value;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = pOJONode1.numberType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = pOJONode1.findParent("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objectNode11.isContainerNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(numberType9);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        long long6 = pOJONode1.asLong(100L);
        double double8 = pOJONode1.asDouble((double) (byte) 0);
        boolean boolean9 = pOJONode1.isNull();
        boolean boolean10 = pOJONode1.isArray();
        boolean boolean11 = pOJONode1.isTextual();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean6 = pOJONode1.asBoolean(false);
        double double8 = pOJONode1.asDouble((double) 10.0f);
        boolean boolean9 = pOJONode1.isObject();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("");
        int int12 = pOJONode1.asInt();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        boolean boolean7 = pOJONode1.has(10);
        long long9 = pOJONode1.asLong((long) (short) 100);
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator10 = pOJONode1.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator10);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        boolean boolean4 = pOJONode1.isBinary();
        com.fasterxml.jackson.databind.node.POJONode pOJONode5 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        boolean boolean6 = pOJONode1.isTextual();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = pOJONode1.traverse();
        boolean boolean8 = pOJONode1.canConvertToLong();
        java.lang.Object obj9 = pOJONode1._value;
        java.lang.String str11 = pOJONode1.asText("");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.path(10);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor5 = pOJONode1.fieldNames();
        boolean boolean6 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        boolean boolean8 = pOJONode1.isEmpty(serializerProvider7);
        int int9 = pOJONode1.size();
        java.lang.String str10 = pOJONode1.toString();
        boolean boolean11 = pOJONode1.isDouble();
        boolean boolean12 = pOJONode1.isBigInteger();
        java.lang.Object obj13 = pOJONode1.getPojo();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = pOJONode1.findParent("hi!");
        int int10 = pOJONode1.asInt((int) '#');
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        boolean boolean6 = pOJONode1.asBoolean();
        boolean boolean7 = pOJONode1.isMissingNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.findValue("-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = pOJONode1.path(100);
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator55 = jsonNode54.spliterator();
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
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator55);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean10 = pOJONode8.hasNonNull("hi!");
        int int11 = pOJONode8.intValue();
        boolean boolean12 = pOJONode8.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = pOJONode8.traverse();
        boolean boolean14 = pOJONode8.isDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode17 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor18 = pOJONode17.fields();
        boolean boolean19 = pOJONode17.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = pOJONode17.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode23 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor24 = pOJONode23.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode23.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = pOJONode17.findValues("hi!", jsonNodeList26);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList28 = pOJONode8.findParents("hi!", jsonNodeList27);
        java.lang.Object obj30 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode31 = new com.fasterxml.jackson.databind.node.POJONode(obj30);
        int int32 = pOJONode31.intValue();
        java.lang.String str33 = pOJONode31.asText();
        boolean boolean34 = pOJONode31.booleanValue();
        boolean boolean35 = pOJONode31.isDouble();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<java.lang.String> strList43 = pOJONode31.findValuesAsText("", (java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList44 = pOJONode8.findValuesAsText("-1", strList43);
        java.util.List<java.lang.String> strList45 = pOJONode1.findValuesAsText("", strList44);
        java.lang.Object obj46 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode47 = new com.fasterxml.jackson.databind.node.POJONode(obj46);
        boolean boolean48 = pOJONode47.asBoolean();
        byte[] byteArray49 = pOJONode47.binaryValue();
        boolean boolean51 = pOJONode47.hasNonNull("");
        boolean boolean53 = pOJONode47.asBoolean(false);
        boolean boolean54 = pOJONode47.isNull();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor55 = pOJONode47.fields();
        boolean boolean56 = pOJONode1._pojoEquals(pOJONode47);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = pOJONode1.findParent("-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strEntryItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertNotNull(jsonNodeList28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strEntryItor55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(objectNode58);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean4 = pOJONode1.isMissingNode();
        boolean boolean5 = pOJONode1.isNumber();
        boolean boolean7 = pOJONode1.has((int) (short) 100);
        boolean boolean8 = pOJONode1.isMissingNode();
        java.lang.Number number9 = pOJONode1.numberValue();
        boolean boolean10 = pOJONode1.isTextual();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull((int) (byte) 10);
        double double5 = pOJONode1.asDouble((double) 1);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.findValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonNode7.isArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNull(jsonNode7);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        boolean boolean5 = pOJONode1.isObject();
        boolean boolean6 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode9.findValues("hi!");
        java.lang.String str12 = pOJONode9.asText();
        boolean boolean14 = pOJONode9.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = pOJONode9.numberType();
        boolean boolean17 = pOJONode9.hasNonNull("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = pOJONode9.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = pOJONode1.findValues("-1", jsonNodeList19);
        long long21 = pOJONode1.asLong();
        boolean boolean22 = pOJONode1.isArray();
        boolean boolean24 = pOJONode1.asBoolean(false);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(numberType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        java.lang.Object obj6 = pOJONode1._value;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = pOJONode1.fields();
        boolean boolean8 = pOJONode1.isNull();
        boolean boolean10 = pOJONode1.hasNonNull((int) 'a');
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor14 = pOJONode13.fields();
        boolean boolean15 = pOJONode13.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = pOJONode13.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType17 = pOJONode13.numberType();
        java.lang.String str19 = pOJONode13.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode13);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor21 = pOJONode13.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode13);
        com.fasterxml.jackson.databind.node.POJONode pOJONode25 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = pOJONode25.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = pOJONode25.deepCopy();
        boolean boolean29 = pOJONode25.isPojo();
        java.util.List<java.lang.String> strList31 = null;
        java.util.List<java.lang.String> strList32 = pOJONode25.findValuesAsText("-1", strList31);
        com.fasterxml.jackson.databind.node.POJONode pOJONode35 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor36 = pOJONode35.elements();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = pOJONode35.findParents("hi!");
        boolean boolean39 = pOJONode35.isIntegralNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode42 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList44 = pOJONode42.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = pOJONode42.deepCopy();
        java.util.Iterator<java.lang.String> strItor46 = pOJONode42.fieldNames();
        short short47 = pOJONode42.shortValue();
        boolean boolean49 = pOJONode42.has((int) (short) 10);
        boolean boolean50 = pOJONode42.canConvertToLong();
        java.lang.Object obj52 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode53 = new com.fasterxml.jackson.databind.node.POJONode(obj52);
        boolean boolean54 = pOJONode53.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = pOJONode53.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = pOJONode53.path("hi!");
        boolean boolean59 = pOJONode53.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider60 = null;
        boolean boolean61 = pOJONode53.isEmpty(serializerProvider60);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList63 = pOJONode53.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList64 = pOJONode42.findParents("-1", jsonNodeList63);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList65 = pOJONode35.findParents("hi!", jsonNodeList64);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList66 = pOJONode25.findParents("hi!", jsonNodeList64);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList67 = pOJONode22.findParents("hi!", jsonNodeList66);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList68 = pOJONode1.findParents("-1", jsonNodeList66);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(strEntryItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strEntryItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
        org.junit.Assert.assertNotNull(strEntryItor21);
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertNotNull(jsonNodeItor36);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonNodeList44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 0 + "'", short47 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jsonNode56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jsonNodeList63);
        org.junit.Assert.assertNotNull(jsonNodeList64);
        org.junit.Assert.assertNotNull(jsonNodeList65);
        org.junit.Assert.assertNotNull(jsonNodeList66);
        org.junit.Assert.assertNotNull(jsonNodeList67);
        org.junit.Assert.assertNotNull(jsonNodeList68);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = pOJONode1.iterator();
        int int7 = pOJONode1.asInt();
        boolean boolean8 = pOJONode1.isFloatingPointNumber();
        double double9 = pOJONode1.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = pOJONode1.findValue("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = jsonNode11.numberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNull(jsonNode11);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        boolean boolean51 = pOJONode1.canConvertToInt();
        boolean boolean52 = pOJONode1.isFloatingPointNumber();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.isContainerNode();
        double double4 = pOJONode1.asDouble();
        double double5 = pOJONode1.doubleValue();
        boolean boolean6 = pOJONode1.isTextual();
        boolean boolean7 = pOJONode1.booleanValue();
        boolean boolean8 = pOJONode1.isInt();
        java.lang.String str9 = pOJONode1.asText();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        java.lang.String str10 = pOJONode1.toString();
        int int12 = pOJONode1.asInt((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonNode14.booleanValue();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonNode14);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        java.lang.Object obj5 = pOJONode1.getPojo();
        boolean boolean6 = pOJONode1.isInt();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.with("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNode not of type ObjectNode (but com.fasterxml.jackson.databind.node.POJONode), cannot call with() on it");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isPojo();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode11 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = pOJONode11.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode13 = pOJONode11.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        boolean boolean15 = pOJONode11.isEmpty(serializerProvider14);
        double double16 = pOJONode11.asDouble();
        java.lang.Object obj18 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode19 = new com.fasterxml.jackson.databind.node.POJONode(obj18);
        int int20 = pOJONode19.intValue();
        boolean boolean22 = pOJONode19.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor25 = pOJONode24.fields();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor26 = pOJONode24.iterator();
        boolean boolean27 = pOJONode19.equals((java.lang.Object) pOJONode24);
        com.fasterxml.jackson.databind.node.POJONode pOJONode30 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double31 = pOJONode30.doubleValue();
        boolean boolean33 = pOJONode30.hasNonNull("hi!");
        java.lang.Object obj35 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode36 = new com.fasterxml.jackson.databind.node.POJONode(obj35);
        boolean boolean37 = pOJONode36.asBoolean();
        java.lang.Object obj39 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode40 = new com.fasterxml.jackson.databind.node.POJONode(obj39);
        boolean boolean41 = pOJONode40.asBoolean();
        boolean boolean42 = pOJONode40.isFloat();
        com.fasterxml.jackson.databind.node.POJONode pOJONode44 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor45 = pOJONode44.elements();
        boolean boolean46 = pOJONode44.isFloatingPointNumber();
        java.lang.String str47 = pOJONode44.toString();
        java.lang.Object obj48 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode49 = new com.fasterxml.jackson.databind.node.POJONode(obj48);
        boolean boolean50 = pOJONode49.asBoolean();
        byte[] byteArray51 = pOJONode49.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode53 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = pOJONode53.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor56 = pOJONode53.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode58 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList60 = pOJONode58.findValues("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode62 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor63 = pOJONode62.elements();
        boolean boolean64 = pOJONode62.isFloatingPointNumber();
        java.lang.String str65 = pOJONode62.toString();
        java.lang.Object obj66 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode67 = new com.fasterxml.jackson.databind.node.POJONode(obj66);
        boolean boolean68 = pOJONode67.asBoolean();
        com.fasterxml.jackson.databind.JsonNode[] jsonNodeArray69 = new com.fasterxml.jackson.databind.JsonNode[] { pOJONode40, pOJONode44, pOJONode49, pOJONode53, pOJONode58, pOJONode62, pOJONode67 };
        java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode> jsonNodeList70 = new java.util.ArrayList<com.fasterxml.jackson.databind.JsonNode>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList70, jsonNodeArray69);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList72 = pOJONode36.findValues("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList70);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList73 = pOJONode30.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList70);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = pOJONode19.findValues("hi!", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList70);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList75 = pOJONode11.findParents("-1", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList70);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList76 = pOJONode1.findParents("", (java.util.List<com.fasterxml.jackson.databind.JsonNode>) jsonNodeList70);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertNotNull(baseJsonNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strEntryItor25);
        org.junit.Assert.assertNotNull(jsonNodeItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(byteArray51);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(strEntryItor56);
        org.junit.Assert.assertNotNull(jsonNodeList60);
        org.junit.Assert.assertNotNull(jsonNodeItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "-1" + "'", str65, "-1");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jsonNodeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jsonNodeList72);
        org.junit.Assert.assertNotNull(jsonNodeList73);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNotNull(jsonNodeList75);
        org.junit.Assert.assertNotNull(jsonNodeList76);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        boolean boolean9 = pOJONode1.has((int) (short) 10);
        boolean boolean10 = pOJONode1.isNull();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor11 = pOJONode1.iterator();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double15 = pOJONode14.doubleValue();
        boolean boolean16 = pOJONode14.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = pOJONode14.asToken();
        com.fasterxml.jackson.databind.node.ValueNode valueNode18 = pOJONode14.deepCopy();
        com.fasterxml.jackson.databind.node.POJONode pOJONode21 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor22 = pOJONode21.fields();
        boolean boolean23 = pOJONode21.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken24 = pOJONode21.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor28 = pOJONode27.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList30 = pOJONode27.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = pOJONode21.findValues("hi!", jsonNodeList30);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = valueNode18.findValues("", jsonNodeList31);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList33 = pOJONode1.findParents("hi!", jsonNodeList32);
        boolean boolean34 = pOJONode1.asBoolean();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(valueNode18);
        org.junit.Assert.assertNotNull(strEntryItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + jsonToken24 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken24.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor28);
        org.junit.Assert.assertNotNull(jsonNodeList30);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertNotNull(jsonNodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean6 = pOJONode1.canConvertToLong();
        boolean boolean7 = pOJONode1.asBoolean();
        boolean boolean8 = pOJONode1.isBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.path("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode3 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        boolean boolean5 = pOJONode1.isEmpty(serializerProvider4);
        boolean boolean7 = pOJONode1.hasNonNull((int) '4');
        java.lang.String str8 = pOJONode1.asText();
        java.lang.String str9 = pOJONode1.toString();
        boolean boolean10 = pOJONode1.isFloatingPointNumber();
        boolean boolean11 = pOJONode1.isNumber();
        java.util.List<java.lang.String> strList13 = pOJONode1.findValuesAsText("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = pOJONode1.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertNotNull(baseJsonNode3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(jsonNode15);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = jsonNode4.elements();
        boolean boolean6 = jsonNode4.isNumber();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = jsonNode4.elements();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = jsonNode4.fields();
        boolean boolean9 = jsonNode4.asBoolean();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.get((int) (byte) 10);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        boolean boolean18 = pOJONode1.isEmpty(serializerProvider17);
        boolean boolean20 = pOJONode1.has(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        boolean boolean7 = pOJONode1.isEmpty(serializerProvider6);
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bigDecimal8);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.lang.String str4 = pOJONode1.asText();
        boolean boolean6 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = pOJONode1.numberType();
        boolean boolean9 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = pOJONode1.findParent("");
        long long13 = pOJONode1.asLong((long) 10);
        boolean boolean15 = pOJONode1.asBoolean(true);
        boolean boolean16 = pOJONode1.isShort();
        java.lang.String str17 = pOJONode1.toString();
        boolean boolean18 = pOJONode1.isFloat();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.ValueNode valueNode5 = pOJONode1.deepCopy();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueNode5.serializeWithType(jsonGenerator6, serializerProvider7, typeSerializer8);
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode7 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = pOJONode7.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode7.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = pOJONode1.findValues("hi!", jsonNodeList10);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = pOJONode1.asToken();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken4 = pOJONode1.asToken();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = pOJONode1.numberType();
        java.lang.String str7 = pOJONode1.asText("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor9 = pOJONode1.fields();
        java.lang.Object obj10 = pOJONode1.getPojo();
        int int12 = pOJONode1.asInt((int) (byte) -1);
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(strEntryItor9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode1.findValue("-1");
        java.lang.String str26 = pOJONode1.toString();
        java.lang.Object obj27 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode28 = new com.fasterxml.jackson.databind.node.POJONode(obj27);
        int int29 = pOJONode28.intValue();
        boolean boolean30 = pOJONode28.isNull();
        boolean boolean31 = pOJONode28.isPojo();
        com.fasterxml.jackson.core.JsonParser jsonParser32 = pOJONode28.traverse();
        boolean boolean34 = pOJONode28.has(10);
        boolean boolean35 = pOJONode1.equals((java.lang.Object) pOJONode28);
        java.math.BigInteger bigInteger36 = pOJONode28.bigIntegerValue();
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
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1" + "'", str26, "-1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bigInteger36);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean6 = pOJONode1.has("");
        boolean boolean7 = pOJONode1.canConvertToInt();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator8 = pOJONode1.spliterator();
        java.lang.String str9 = pOJONode1.asText();
        int int10 = pOJONode1.asInt();
        boolean boolean11 = pOJONode1.canConvertToLong();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken3 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.lang.Object obj5 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode6 = new com.fasterxml.jackson.databind.node.POJONode(obj5);
        boolean boolean7 = pOJONode6.asBoolean();
        boolean boolean8 = pOJONode6.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode6.get("hi!");
        boolean boolean11 = pOJONode6.isTextual();
        boolean boolean12 = pOJONode1.equals((java.lang.Object) boolean11);
        java.util.List<java.lang.String> strList14 = pOJONode1.findValuesAsText("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.path((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        int int6 = pOJONode1.asInt();
        int int8 = pOJONode1.asInt((int) ' ');
        java.lang.String str9 = pOJONode1.asText();
        java.lang.String str10 = pOJONode1.toString();
        int int12 = pOJONode1.asInt((int) (short) 10);
        boolean boolean14 = pOJONode1.asBoolean(true);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = pOJONode1.findParent("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = objectNode16.textValue();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectNode16);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger16 = pOJONode15.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode15.findValue("-1");
        com.fasterxml.jackson.core.JsonParser jsonParser19 = pOJONode15.traverse();
        java.lang.Object obj20 = pOJONode15._value;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor21 = pOJONode15.fields();
        boolean boolean22 = pOJONode15.isNull();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        boolean boolean24 = pOJONode15.isEmpty(serializerProvider23);
        long long25 = pOJONode15.longValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode27 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = pOJONode27.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = pOJONode27.deepCopy();
        boolean boolean32 = pOJONode27.asBoolean(false);
        double double34 = pOJONode27.asDouble((double) 10.0f);
        java.lang.String str35 = pOJONode27.asText();
        boolean boolean36 = pOJONode15._pojoEquals(pOJONode27);
        boolean boolean37 = pOJONode1._pojoEquals(pOJONode15);
        boolean boolean38 = pOJONode1.isObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(strEntryItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1" + "'", str35, "-1");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = pOJONode1.findValue("-1");
        boolean boolean16 = pOJONode1.hasNonNull("");
        int int17 = pOJONode1.size();
        boolean boolean18 = pOJONode1.isMissingNode();
        java.math.BigInteger bigInteger19 = pOJONode1.bigIntegerValue();
        int int20 = pOJONode1.asInt();
        boolean boolean21 = pOJONode1.booleanValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor4 = pOJONode1.fields();
        boolean boolean5 = pOJONode1.isArray();
        java.lang.Object obj6 = pOJONode1.getPojo();
        boolean boolean7 = pOJONode1.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) jsonToken8);
        boolean boolean10 = pOJONode9.booleanValue();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator11 = pOJONode9.spliterator();
        java.math.BigInteger bigInteger12 = pOJONode9.bigIntegerValue();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(strEntryItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator11);
        org.junit.Assert.assertNotNull(bigInteger12);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        java.lang.String str3 = pOJONode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.path("-1");
        int int6 = pOJONode1.asInt();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = pOJONode1.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode8 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.node.POJONode pOJONode10 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = pOJONode10.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor13 = pOJONode10.fields();
        boolean boolean14 = pOJONode10.isArray();
        java.lang.Object obj15 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode16 = new com.fasterxml.jackson.databind.node.POJONode(obj15);
        boolean boolean17 = pOJONode16.asBoolean();
        byte[] byteArray18 = pOJONode16.binaryValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode21 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor22 = pOJONode21.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode23 = pOJONode21.deepCopy();
        int int24 = baseJsonNode23.size();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = baseJsonNode23.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = pOJONode16.findValues("-1", jsonNodeList26);
        boolean boolean28 = pOJONode10.equals((java.lang.Object) "-1");
        boolean boolean29 = pOJONode10.isIntegralNumber();
        java.util.List<java.lang.String> strList31 = pOJONode10.findValuesAsText("hi!");
        boolean boolean32 = pOJONode1._pojoEquals(pOJONode10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertNotNull(baseJsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertNotNull(strEntryItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNotNull(jsonNodeItor22);
        org.junit.Assert.assertNotNull(baseJsonNode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        boolean boolean4 = pOJONode1.isPojo();
        java.math.BigDecimal bigDecimal5 = pOJONode1.decimalValue();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator6 = pOJONode1.spliterator();
        boolean boolean7 = pOJONode1.isBigDecimal();
        boolean boolean8 = pOJONode1.isContainerNode();
        boolean boolean10 = pOJONode1.hasNonNull((-1));
        boolean boolean11 = pOJONode1.isInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        int int6 = pOJONode1.intValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.at("");
        java.lang.Object obj9 = pOJONode1.getPojo();
        java.lang.Object obj10 = pOJONode1._value;
        com.fasterxml.jackson.databind.node.POJONode pOJONode13 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor14 = pOJONode13.elements();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = pOJONode13.findParents("hi!");
        boolean boolean17 = pOJONode13.isIntegralNumber();
        com.fasterxml.jackson.databind.node.POJONode pOJONode20 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = pOJONode20.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = pOJONode20.deepCopy();
        java.util.Iterator<java.lang.String> strItor24 = pOJONode20.fieldNames();
        short short25 = pOJONode20.shortValue();
        boolean boolean27 = pOJONode20.has((int) (short) 10);
        boolean boolean28 = pOJONode20.canConvertToLong();
        java.lang.Object obj30 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode31 = new com.fasterxml.jackson.databind.node.POJONode(obj30);
        boolean boolean32 = pOJONode31.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = pOJONode31.findValue("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = pOJONode31.path("hi!");
        boolean boolean37 = pOJONode31.isIntegralNumber();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = null;
        boolean boolean39 = pOJONode31.isEmpty(serializerProvider38);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = pOJONode31.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList42 = pOJONode20.findParents("-1", jsonNodeList41);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = pOJONode13.findParents("hi!", jsonNodeList42);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList44 = pOJONode1.findParents("", jsonNodeList43);
        boolean boolean45 = pOJONode1.isFloat();
        boolean boolean46 = pOJONode1.isBoolean();
        java.lang.String str47 = pOJONode1.toString();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(jsonNodeItor14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonNodeList41);
        org.junit.Assert.assertNotNull(jsonNodeList42);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        byte[] byteArray5 = pOJONode1.binaryValue();
        boolean boolean6 = pOJONode1.isPojo();
        boolean boolean7 = pOJONode1.isValueNode();
        boolean boolean8 = pOJONode1.isTextual();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode24.findValues("hi!");
        java.lang.String str27 = pOJONode24.asText();
        boolean boolean29 = pOJONode24.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType30 = pOJONode24.numberType();
        boolean boolean32 = pOJONode24.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = pOJONode24.findParent("");
        long long36 = pOJONode24.asLong((long) 10);
        java.math.BigInteger bigInteger37 = pOJONode24.bigIntegerValue();
        java.lang.String str38 = pOJONode24.textValue();
        boolean boolean39 = pOJONode1._pojoEquals(pOJONode24);
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = pOJONode1.path("-1");
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
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(numberType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(objectNode34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jsonNode41);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        boolean boolean9 = pOJONode1.has((int) (short) 10);
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("");
        boolean boolean12 = pOJONode1.isNumber();
        short short13 = pOJONode1.shortValue();
        java.lang.String str14 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.get((int) (byte) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = pOJONode1.traverse(objectCodec17);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = pOJONode1.elements();
        java.lang.Object obj20 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode21 = new com.fasterxml.jackson.databind.node.POJONode(obj20);
        int int22 = pOJONode21.intValue();
        java.lang.String str23 = pOJONode21.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = pOJONode21.path((int) (short) 0);
        long long27 = pOJONode21.asLong((long) (byte) 1);
        boolean boolean29 = pOJONode21.hasNonNull(1);
        boolean boolean30 = pOJONode21.canConvertToInt();
        boolean boolean31 = pOJONode1._pojoEquals(pOJONode21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        boolean boolean2 = pOJONode1.asBoolean();
        byte[] byteArray3 = pOJONode1.binaryValue();
        boolean boolean5 = pOJONode1.hasNonNull("");
        boolean boolean7 = pOJONode1.asBoolean(false);
        com.fasterxml.jackson.core.JsonToken jsonToken8 = pOJONode1.asToken();
        short short9 = pOJONode1.shortValue();
        byte[] byteArray10 = pOJONode1.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get((int) 'a');
        boolean boolean13 = pOJONode1.canConvertToLong();
        boolean boolean14 = pOJONode1.isDouble();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse(objectCodec5);
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
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = pOJONode1.findValues("-1", jsonNodeList58);
        boolean boolean60 = pOJONode1.booleanValue();
        boolean boolean61 = pOJONode1.isBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.Object obj0 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode(obj0);
        int int2 = pOJONode1.intValue();
        boolean boolean3 = pOJONode1.isNull();
        int int5 = pOJONode1.asInt((int) (short) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = pOJONode1.get("-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(jsonNode7);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        boolean boolean5 = pOJONode1.isShort();
        long long6 = pOJONode1.asLong();
        int int8 = pOJONode1.asInt((int) ' ');
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = pOJONode1.path("-1");
        java.lang.Number number11 = pOJONode1.numberValue();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(number11);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.findValue("-1");
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        java.lang.Object obj6 = pOJONode1._value;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor7 = pOJONode1.fields();
        boolean boolean8 = pOJONode1.isNull();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        boolean boolean10 = pOJONode1.isEmpty(serializerProvider9);
        long long11 = pOJONode1.longValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode14 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = pOJONode14.findValues("hi!");
        boolean boolean18 = pOJONode14.hasNonNull("hi!");
        java.lang.Number number19 = pOJONode14.numberValue();
        short short20 = pOJONode14.shortValue();
        boolean boolean21 = pOJONode14.isContainerNode();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = pOJONode24.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = pOJONode24.deepCopy();
        boolean boolean29 = pOJONode24.asBoolean(false);
        java.util.Iterator<java.lang.String> strItor30 = pOJONode24.fieldNames();
        double double31 = pOJONode24.asDouble();
        java.util.List<java.lang.String> strList33 = pOJONode24.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList34 = pOJONode14.findValuesAsText("", strList33);
        java.util.List<java.lang.String> strList35 = pOJONode1.findValuesAsText("", strList34);
        com.fasterxml.jackson.databind.node.POJONode pOJONode38 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList40 = pOJONode38.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor41 = pOJONode38.fields();
        com.fasterxml.jackson.core.JsonToken jsonToken42 = pOJONode38.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = pOJONode38.get("");
        int int45 = pOJONode38.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = pOJONode38.path((int) (short) -1);
        com.fasterxml.jackson.databind.node.POJONode pOJONode50 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = pOJONode50.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = pOJONode50.deepCopy();
        double double55 = pOJONode50.asDouble(1.0d);
        boolean boolean56 = pOJONode50.isBigInteger();
        long long58 = pOJONode50.asLong((long) 'a');
        com.fasterxml.jackson.databind.node.POJONode pOJONode61 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean63 = pOJONode61.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.POJONode pOJONode66 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList68 = pOJONode66.findValues("hi!");
        java.lang.String str69 = pOJONode66.asText();
        boolean boolean71 = pOJONode66.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType72 = pOJONode66.numberType();
        boolean boolean74 = pOJONode66.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode76 = pOJONode66.findParent("");
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = pOJONode66.get("");
        java.util.List<java.lang.String> strList80 = pOJONode66.findValuesAsText("");
        java.util.List<java.lang.String> strList81 = pOJONode61.findValuesAsText("-1", strList80);
        java.util.List<java.lang.String> strList82 = pOJONode50.findValuesAsText("-1", strList81);
        java.util.List<java.lang.String> strList83 = pOJONode38.findValuesAsText("", strList81);
        java.util.List<java.lang.String> strList84 = pOJONode1.findValuesAsText("", strList81);
        com.fasterxml.jackson.databind.JsonNode jsonNode86 = pOJONode1.get((int) '#');
        boolean boolean87 = pOJONode1.isPojo();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(strEntryItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(jsonNodeList40);
        org.junit.Assert.assertNotNull(strEntryItor41);
        org.junit.Assert.assertTrue("'" + jsonToken42 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken42.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jsonNodeList68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "-1" + "'", str69, "-1");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(numberType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(objectNode76);
        org.junit.Assert.assertNull(jsonNode78);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNull(jsonNode86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        boolean boolean10 = pOJONode1.isLong();
        double double12 = pOJONode1.asDouble(10.0d);
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double16 = pOJONode15.doubleValue();
        boolean boolean18 = pOJONode15.hasNonNull("hi!");
        boolean boolean19 = pOJONode15.canConvertToInt();
        boolean boolean21 = pOJONode15.hasNonNull("");
        java.math.BigInteger bigInteger22 = pOJONode15.bigIntegerValue();
        boolean boolean24 = pOJONode15.asBoolean(true);
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = pOJONode15.path("hi!");
        java.util.Iterator<java.lang.String> strItor27 = pOJONode15.fieldNames();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = pOJONode15.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList30 = pOJONode1.findValues("", jsonNodeList29);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNotNull(jsonNodeList30);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        long long21 = pOJONode1.asLong();
        java.math.BigDecimal bigDecimal22 = pOJONode1.decimalValue();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        java.math.BigDecimal bigDecimal8 = pOJONode1.decimalValue();
        boolean boolean9 = pOJONode1.canConvertToInt();
        boolean boolean10 = pOJONode1.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.get((int) ' ');
        boolean boolean13 = pOJONode1.isLong();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = pOJONode1.path("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = pOJONode1.path((int) (byte) 1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor9 = pOJONode1.iterator();
        boolean boolean10 = pOJONode1.isLong();
        byte[] byteArray11 = pOJONode1.binaryValue();
        boolean boolean12 = pOJONode1.isNumber();
        double double13 = pOJONode1.doubleValue();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        double double6 = pOJONode1.asDouble(1.0d);
        long long7 = pOJONode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.path("hi!");
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = pOJONode1.path("hi!");
        boolean boolean14 = pOJONode1.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.findPath("-1");
        long long18 = pOJONode1.asLong((-1L));
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode5 = pOJONode1.deepCopy();
        com.fasterxml.jackson.databind.node.POJONode pOJONode8 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = pOJONode8.findValues("hi!");
        java.lang.String str11 = pOJONode8.asText();
        boolean boolean13 = pOJONode8.asBoolean(false);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = pOJONode8.numberType();
        boolean boolean16 = pOJONode8.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = pOJONode8.findParent("");
        long long20 = pOJONode8.asLong((long) 10);
        boolean boolean21 = pOJONode8.isFloat();
        java.lang.Object obj23 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode24 = new com.fasterxml.jackson.databind.node.POJONode(obj23);
        boolean boolean25 = pOJONode24.asBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken26 = pOJONode24.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = pOJONode24.deepCopy();
        boolean boolean28 = pOJONode24.isBigDecimal();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor29 = pOJONode24.fields();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean34 = pOJONode32.hasNonNull("hi!");
        int int35 = pOJONode32.intValue();
        boolean boolean36 = pOJONode32.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser37 = pOJONode32.traverse();
        boolean boolean38 = pOJONode32.isDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode41 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor42 = pOJONode41.fields();
        boolean boolean43 = pOJONode41.isContainerNode();
        com.fasterxml.jackson.core.JsonToken jsonToken44 = pOJONode41.asToken();
        com.fasterxml.jackson.databind.node.POJONode pOJONode47 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor48 = pOJONode47.fields();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = pOJONode47.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = pOJONode41.findValues("hi!", jsonNodeList50);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = pOJONode32.findParents("hi!", jsonNodeList51);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = pOJONode24.findParents("", jsonNodeList51);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList54 = pOJONode8.findValues("hi!", jsonNodeList51);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = pOJONode1.findParents("hi!", jsonNodeList51);
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(baseJsonNode5);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectNode18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strEntryItor29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strEntryItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + jsonToken44 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken44.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor48);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertNotNull(jsonNodeList53);
        org.junit.Assert.assertNotNull(jsonNodeList54);
        org.junit.Assert.assertNotNull(jsonNodeList55);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        double double2 = pOJONode1.doubleValue();
        boolean boolean4 = pOJONode1.hasNonNull("hi!");
        boolean boolean5 = pOJONode1.canConvertToInt();
        boolean boolean7 = pOJONode1.hasNonNull("");
        java.math.BigInteger bigInteger8 = pOJONode1.bigIntegerValue();
        boolean boolean10 = pOJONode1.asBoolean(true);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = pOJONode1.path("hi!");
        java.util.Iterator<java.lang.String> strItor13 = pOJONode1.fieldNames();
        byte[] byteArray14 = pOJONode1.binaryValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNull(byteArray14);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor2 = pOJONode1.fields();
        boolean boolean3 = pOJONode1.isContainerNode();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = pOJONode1.iterator();
        boolean boolean5 = pOJONode1.isFloat();
        int int6 = pOJONode1.asInt();
        org.junit.Assert.assertNotNull(strEntryItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor2 = pOJONode1.elements();
        boolean boolean3 = pOJONode1.isFloatingPointNumber();
        java.lang.String str4 = pOJONode1.toString();
        java.lang.Object obj5 = pOJONode1.getPojo();
        byte[] byteArray6 = pOJONode1.binaryValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = pOJONode1.findParents("");
        double double9 = pOJONode1.asDouble();
        org.junit.Assert.assertNotNull(jsonNodeItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor14 = pOJONode1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeItor14);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        boolean boolean13 = pOJONode1.isBoolean();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        com.fasterxml.jackson.databind.node.POJONode pOJONode15 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor16 = pOJONode15.elements();
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode17 = pOJONode15.deepCopy();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        boolean boolean19 = pOJONode15.isEmpty(serializerProvider18);
        double double20 = pOJONode15.asDouble();
        com.fasterxml.jackson.databind.node.POJONode pOJONode22 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = pOJONode22.findValues("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor25 = pOJONode22.fields();
        boolean boolean26 = pOJONode22.isArray();
        java.lang.Object obj27 = pOJONode22.getPojo();
        boolean boolean28 = pOJONode22.isIntegralNumber();
        com.fasterxml.jackson.core.JsonToken jsonToken29 = pOJONode22.asToken();
        boolean boolean30 = pOJONode15._pojoEquals(pOJONode22);
        java.lang.Object obj31 = new java.lang.Object();
        com.fasterxml.jackson.databind.node.POJONode pOJONode32 = new com.fasterxml.jackson.databind.node.POJONode(obj31);
        boolean boolean33 = pOJONode32.asBoolean();
        long long35 = pOJONode32.asLong((long) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser37 = pOJONode32.traverse(objectCodec36);
        boolean boolean38 = pOJONode32.isIntegralNumber();
        boolean boolean39 = pOJONode22._pojoEquals(pOJONode32);
        int int40 = pOJONode32.asInt();
        boolean boolean41 = pOJONode6._pojoEquals(pOJONode32);
        boolean boolean42 = pOJONode32.isNull();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor16);
        org.junit.Assert.assertNotNull(baseJsonNode17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertNotNull(strEntryItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + jsonToken29 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken29.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        java.math.BigInteger bigInteger5 = jsonNode4.bigIntegerValue();
        boolean boolean6 = jsonNode4.isArray();
        boolean boolean7 = jsonNode4.isBigInteger();
        float float8 = jsonNode4.floatValue();
        boolean boolean9 = jsonNode4.isObject();
        boolean boolean10 = jsonNode4.isInt();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = pOJONode1.deepCopy();
        boolean boolean5 = pOJONode1.isPojo();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = pOJONode1.iterator();
        boolean boolean7 = pOJONode1.canConvertToInt();
        java.lang.Number number8 = pOJONode1.numberValue();
        com.fasterxml.jackson.databind.node.POJONode pOJONode9 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) pOJONode1);
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = pOJONode1.findValues("hi!");
        boolean boolean4 = pOJONode1.canConvertToLong();
        boolean boolean5 = pOJONode1.isObject();
        boolean boolean6 = pOJONode1.isBoolean();
        boolean boolean7 = pOJONode1.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        boolean boolean14 = pOJONode1.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = pOJONode1.findParents("-1");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = pOJONode1.path("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode20 = pOJONode1.withArray("hi!");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNode18);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        java.math.BigInteger bigInteger2 = pOJONode1.bigIntegerValue();
        double double3 = pOJONode1.doubleValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = pOJONode1.findPath("");
        boolean boolean6 = pOJONode1.isBinary();
        boolean boolean7 = pOJONode1.isContainerNode();
        java.lang.String str9 = pOJONode1.asText("");
        boolean boolean10 = pOJONode1.isNull();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (byte) -1);
        boolean boolean3 = pOJONode1.hasNonNull("hi!");
        int int4 = pOJONode1.intValue();
        boolean boolean5 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = pOJONode1.traverse();
        java.lang.String str7 = pOJONode1.toString();
        boolean boolean9 = pOJONode1.has((int) (short) 10);
        java.util.List<java.lang.String> strList11 = pOJONode1.findValuesAsText("");
        boolean boolean12 = pOJONode1.isNumber();
        short short13 = pOJONode1.shortValue();
        java.lang.String str14 = pOJONode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = pOJONode1.get((int) (byte) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = pOJONode1.traverse(objectCodec17);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = pOJONode1.elements();
        java.math.BigInteger bigInteger20 = pOJONode1.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertNotNull(bigInteger20);
    }
}

