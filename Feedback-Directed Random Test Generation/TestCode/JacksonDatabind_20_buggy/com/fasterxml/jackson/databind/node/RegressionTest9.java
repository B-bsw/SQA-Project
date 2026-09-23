package com.fasterxml.jackson.databind.node;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = objectNode2.iterator();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        boolean boolean9 = objectNode8.isBoolean();
        boolean boolean10 = objectNode8.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode8.deepCopy();
        double double12 = objectNode8.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode8.path("");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode8.findValue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = objectNode8.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode2.remove((java.util.Collection<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        boolean boolean27 = objectNode26.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        boolean boolean32 = objectNode31.isBoolean();
        boolean boolean33 = objectNode31.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode26.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        boolean boolean35 = objectNode31.isBigInteger();
        float float36 = objectNode31.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType37 = objectNode31.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode2.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap39 = objectNode2._children;
        java.lang.String str41 = objectNode2.asText("{}");
        boolean boolean42 = objectNode2.isValueNode();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode2.putAll(strMap43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType37 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType37.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        int int3 = objectNode1.asInt((int) 'a');
        boolean boolean5 = objectNode1.has((int) '4');
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = objectNode1.elements();
        short short7 = objectNode1.shortValue();
        boolean boolean8 = objectNode1.isFloat();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode1.retain(strArray7);
        short short9 = objectNode1.shortValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        int int13 = objectNode11.asInt((int) 'a');
        boolean boolean14 = objectNode11.isValueNode();
        boolean boolean15 = objectNode11.isTextual();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode17.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode17.findParents("");
        boolean boolean21 = objectNode17.isArray();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        double double24 = objectNode23.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode23.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = objectNode25.findValues("");
        byte[] byteArray28 = objectNode25.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode17.setAll(objectNode25);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode31.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList34 = objectNode31.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode31.path((int) (short) 10);
        boolean boolean37 = jsonNode36.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList39 = jsonNode36.findValues("hi!");
        java.lang.String str40 = jsonNode36.textValue();
        java.util.List<java.lang.String> strList42 = jsonNode36.findValuesAsText("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode17.retain((java.util.Collection<java.lang.String>) strList42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode11.remove((java.util.Collection<java.lang.String>) strList42);
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode1.putAll(objectNode11);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(jsonNodeList34);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jsonNodeList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(jsonNode45);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        boolean boolean10 = objectNode9.isBoolean();
        boolean boolean11 = objectNode9.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode9.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = objectNode9.findValues("");
        boolean boolean15 = objectNode9.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode1._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode9);
        long long17 = objectNode9.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode9.findPath("{}");
        boolean boolean20 = objectNode9.isPojo();
        boolean boolean21 = objectNode9.isDouble();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode9.serialize(jsonGenerator22, serializerProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor5 = objectNode1.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode8.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode8.path((int) (short) 10);
        boolean boolean14 = jsonNode13.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = jsonNode13.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode1.findParents("", jsonNodeList16);
        java.util.List<java.lang.String> strList19 = objectNode1.findValuesAsText("");
        boolean boolean20 = objectNode1.booleanValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode1.objectNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strEntryItor5);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        boolean boolean9 = objectNode2.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = objectNode2.numberType();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = objectNode2.traverse(objectCodec11);
        boolean boolean13 = objectNode2.isFloat();
        boolean boolean14 = objectNode2.isShort();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode2.remove("{}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode2.put("{\"\":{},\"{\\\"\\\":{}}\":{}}", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(numberType10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonNode16);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode5.without("hi!");
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator8 = objectNode5.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        boolean boolean12 = objectNode11.isBoolean();
        boolean boolean13 = objectNode11.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode11.deepCopy();
        boolean boolean15 = objectNode11.isTextual();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        boolean boolean19 = objectNode18.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        boolean boolean24 = objectNode23.isBoolean();
        boolean boolean25 = objectNode23.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode18.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode23);
        boolean boolean27 = objectNode18.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode18.at("");
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode11.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        boolean boolean31 = objectNode5._childrenEqual(objectNode11);
        long long32 = objectNode11.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode35.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode35.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode35.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode42.removeAll();
        boolean boolean44 = objectNode43.isBoolean();
        boolean boolean45 = objectNode43.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode43.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = objectNode43.findValues("");
        boolean boolean49 = objectNode43.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode35._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode43);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = objectNode43.findValues("{}");
        java.math.BigDecimal bigDecimal53 = objectNode43.decimalValue();
        com.fasterxml.jackson.core.JsonToken jsonToken54 = objectNode43.asToken();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode56.removeAll();
        boolean boolean58 = objectNode57.isBoolean();
        boolean boolean59 = objectNode57.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = objectNode57.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList62 = objectNode57.findValues("");
        boolean boolean63 = objectNode57.isInt();
        boolean boolean64 = objectNode57.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType65 = objectNode57.numberType();
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser67 = objectNode57.traverse(objectCodec66);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory69 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory69);
        double double71 = objectNode70.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode70.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = objectNode72.findValues("");
        byte[] byteArray75 = objectNode72.binaryValue();
        boolean boolean76 = objectNode72.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory78 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode79 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory78);
        double double80 = objectNode79.asDouble();
        java.lang.String[] strArray82 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode85 = objectNode79.retain((java.util.Collection<java.lang.String>) strList83);
        java.util.List<java.lang.String> strList86 = objectNode72.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList83);
        java.util.List<java.lang.String> strList87 = objectNode57.findValuesAsText("{\"hi!\":{}}", strList86);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode88 = objectNode43.retain((java.util.Collection<java.lang.String>) strList86);
        java.util.List<java.lang.String> strList89 = objectNode11.findValuesAsText("{\"\":{}}", strList86);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator8);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertTrue("'" + jsonToken54 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken54.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectNode60);
        org.junit.Assert.assertNotNull(jsonNodeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(numberType65);
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNull(byteArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(objectNode85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(objectNode88);
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode1.findParents("hi!");
        boolean boolean9 = objectNode1.has("");
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType10 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode1.removeAll();
        boolean boolean12 = objectNode1.isArray();
        java.util.List<java.lang.String> strList14 = objectNode1.findValuesAsText("{\"\":{}}");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + jsonNodeType10 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType10.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        java.lang.String str4 = objectNode3.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        int int9 = objectNode7.asInt((int) 'a');
        boolean boolean10 = objectNode7.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode12.findParents("");
        double double16 = objectNode12.asDouble();
        int int17 = objectNode12.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode12.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        double double21 = objectNode20.asDouble();
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode20.retain((java.util.Collection<java.lang.String>) strList24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode18.retain((java.util.Collection<java.lang.String>) strList24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode7.without((java.util.Collection<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList29 = objectNode3.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList24);
        boolean boolean30 = objectNode3.isDouble();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.at("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode7.findPath("");
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode7.get("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode13.findParents("");
        boolean boolean17 = objectNode13.isArray();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        double double20 = objectNode19.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode19.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = objectNode21.findValues("");
        byte[] byteArray24 = objectNode21.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode13.setAll(objectNode21);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        boolean boolean30 = objectNode29.isBoolean();
        boolean boolean31 = objectNode29.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode29.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = objectNode32.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap34 = objectNode32._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode36.removeAll();
        float float38 = objectNode36.floatValue();
        int int40 = objectNode36.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList42 = objectNode36.findParents("hi!");
        int int43 = objectNode36.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode45.removeAll();
        boolean boolean47 = objectNode46.isBoolean();
        boolean boolean48 = objectNode46.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode46.deepCopy();
        double double50 = objectNode46.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = objectNode46.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap53 = objectNode46._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode56.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = objectNode56.path("hi!");
        java.util.List<java.lang.String> strList61 = objectNode56.findValuesAsText("");
        java.util.List<java.lang.String> strList62 = objectNode46.findValuesAsText("", strList61);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = objectNode36.remove((java.util.Collection<java.lang.String>) strList62);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode64 = objectNode32.without((java.util.Collection<java.lang.String>) strList62);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory65 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode66 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = objectNode66.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = objectNode66.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = objectNode66.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = objectNode70.without("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser73 = objectNode70.traverse();
        java.lang.Number number74 = objectNode70.numberValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode75 = objectNode64.putAll(objectNode70);
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = objectNode13.set("", (com.fasterxml.jackson.databind.JsonNode) objectNode64);
        boolean boolean77 = objectNode7._childrenEqual(objectNode13);
        java.lang.String str79 = objectNode13.asText("{\"hi!\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode82 = objectNode13.put("{\"\":{}}", (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(objectNode63);
        org.junit.Assert.assertNotNull(objectNode64);
        org.junit.Assert.assertNotNull(objectNode67);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(objectNode70);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNull(number74);
        org.junit.Assert.assertNotNull(jsonNode75);
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = objectNode2.iterator();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        boolean boolean9 = objectNode8.isBoolean();
        boolean boolean10 = objectNode8.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode8.deepCopy();
        double double12 = objectNode8.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode8.path("");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode8.findValue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = objectNode8.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode2.remove((java.util.Collection<java.lang.String>) strList20);
        boolean boolean24 = objectNode2.isShort();
        boolean boolean25 = objectNode2.canConvertToLong();
        double double26 = objectNode2.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode2.removeAll();
        boolean boolean28 = objectNode27.isMissingNode();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode2.removeAll();
        boolean boolean4 = objectNode3.isBoolean();
        boolean boolean5 = objectNode3.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode3.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode3.findValues("");
        boolean boolean9 = objectNode3.isInt();
        boolean boolean10 = objectNode3.isIntegralNumber();
        boolean boolean11 = objectNode3.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode13.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = objectNode13.asToken();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor18 = objectNode13.fields();
        boolean boolean19 = objectNode13.isShort();
        java.math.BigDecimal bigDecimal20 = objectNode13.decimalValue();
        boolean boolean21 = objectNode13.isDouble();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode23.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode23.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode23.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        boolean boolean32 = objectNode31.isBoolean();
        boolean boolean33 = objectNode31.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode31.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList36 = objectNode31.findValues("");
        boolean boolean37 = objectNode31.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode23._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList40 = objectNode31.findValues("{}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode42.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList45 = objectNode42.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode47.removeAll();
        float float49 = objectNode47.floatValue();
        boolean boolean50 = objectNode47.isFloat();
        boolean boolean51 = objectNode42.equals((java.lang.Object) boolean50);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = objectNode53.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = objectNode53.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode53.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap59 = objectNode53._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = objectNode42.setAll(strMap59);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = objectNode31.setAll(strMap59);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = objectNode13.setAll(strMap59);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode3.putAll(strMap59);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode64 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap59);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(jsonNodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(jsonNodeList40);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(jsonNodeList45);
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectNode54);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNode63);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        boolean boolean10 = objectNode9.isBoolean();
        boolean boolean11 = objectNode9.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode9.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = objectNode9.findValues("");
        boolean boolean15 = objectNode9.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode1._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode9);
        long long17 = objectNode9.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode9.findPath("{}");
        boolean boolean20 = objectNode9.isPojo();
        double double21 = objectNode9.doubleValue();
        long long22 = objectNode9.asLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode9.removeAll();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(objectNode23);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode6.isBigInteger();
        float float11 = objectNode6.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType12 = objectNode6.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        boolean boolean15 = objectNode14.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode18.removeAll();
        boolean boolean20 = objectNode19.isBoolean();
        boolean boolean21 = objectNode19.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode14.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode19);
        boolean boolean23 = objectNode19.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode6.putAll(objectNode19);
        boolean boolean25 = objectNode6.isObject();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode6.get((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType12 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType12.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(jsonNode27);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        boolean boolean6 = objectNode5.isBigDecimal();
        boolean boolean7 = objectNode5.isMissingNode();
        boolean boolean9 = objectNode5.hasNonNull("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode11.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = objectNode11.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode11.path((int) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode19.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode26.removeAll();
        boolean boolean28 = objectNode27.isBoolean();
        boolean boolean29 = objectNode27.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode27.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = objectNode27.findValues("");
        boolean boolean33 = objectNode27.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode19._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode27);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = objectNode11.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode27);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor36 = objectNode11.elements();
        boolean boolean37 = objectNode11.canConvertToLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode5.putAll(objectNode11);
        int int39 = objectNode5.intValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode5.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNull(jsonNode35);
        org.junit.Assert.assertNotNull(jsonNodeItor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(jsonNode41);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator6 = objectNode5.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        boolean boolean10 = objectNode9.isContainerNode();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = objectNode9.traverse();
        boolean boolean12 = objectNode5.equals((java.lang.Object) jsonParser11);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode5.at("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = objectNode5.withArray("{\"\":{},\"{\\\"\\\":{}}\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator6);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        boolean boolean6 = objectNode5.isBigDecimal();
        boolean boolean7 = objectNode5.isMissingNode();
        boolean boolean9 = objectNode5.hasNonNull("");
        boolean boolean10 = objectNode5.isShort();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = objectNode1.asToken();
        java.lang.String str6 = objectNode1.asText();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap7 = objectNode1._children;
        java.lang.String str9 = objectNode1.asText("{\"hi!\":{}}");
        boolean boolean10 = objectNode1.isFloatingPointNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.findValue("{\"{\\\"hi!\\\":{}}\":{}}");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.remove("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = objectNode1.traverse(objectCodec13);
        boolean boolean15 = objectNode1.booleanValue();
        boolean boolean16 = objectNode1.isDouble();
        boolean boolean17 = objectNode1.isBigInteger();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType18 = objectNode1.getNodeType();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + jsonNodeType18 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType18.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.remove("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = objectNode1.traverse(objectCodec13);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = objectNode1.elements();
        boolean boolean17 = objectNode1.has(97);
        java.math.BigInteger bigInteger18 = objectNode1.bigIntegerValue();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode6.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = objectNode6.asToken();
        java.lang.String str11 = objectNode6.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = objectNode6.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode6.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode1._put("{}", jsonNode14);
        double double17 = objectNode15.asDouble((double) '#');
        int int18 = objectNode15.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        boolean boolean22 = objectNode21.isBoolean();
        boolean boolean23 = objectNode21.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode21.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode21.findValues("");
        boolean boolean27 = objectNode21.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode21.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode31.removeAll();
        boolean boolean33 = objectNode32.isBoolean();
        boolean boolean34 = objectNode32.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode32.without("");
        java.lang.String str38 = objectNode32.asText("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode40.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = objectNode40.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode45.removeAll();
        float float47 = objectNode45.floatValue();
        boolean boolean48 = objectNode45.isFloat();
        boolean boolean49 = objectNode40.equals((java.lang.Object) boolean48);
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = objectNode40.remove("");
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode32.setAll(objectNode40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode28._put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode15.setAll(objectNode28);
        boolean boolean55 = objectNode15.isNull();
        boolean boolean56 = objectNode15.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode58 = objectNode15.numberNode((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(objectNode41);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jsonNode51);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        double double6 = objectNode2.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode2.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode2._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode12.path("hi!");
        java.util.List<java.lang.String> strList17 = objectNode12.findValuesAsText("");
        java.util.List<java.lang.String> strList18 = objectNode2.findValuesAsText("", strList17);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        boolean boolean22 = objectNode21.isBoolean();
        boolean boolean23 = objectNode21.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode21.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode21.findValues("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode21.findParent("");
        com.fasterxml.jackson.core.JsonParser jsonParser29 = objectNode21.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode33.removeAll();
        boolean boolean35 = objectNode34.isBoolean();
        boolean boolean36 = objectNode34.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode34.deepCopy();
        double double38 = objectNode34.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList40 = objectNode34.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap41 = objectNode34._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31, strMap41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30, strMap41);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor44 = objectNode43.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode21.putAll(objectNode43);
        boolean boolean46 = objectNode2.equals((java.lang.Object) objectNode21);
        double double47 = objectNode2.asDouble();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory48);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode49.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode49.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken53 = objectNode49.asToken();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor54 = objectNode49.fields();
        boolean boolean55 = objectNode49.isShort();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode49.findParent("{}");
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = objectNode49._put("", jsonNode59);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = objectNode2.setAll(objectNode49);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNull(objectNode28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strEntryItor44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertTrue("'" + jsonToken53 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken53.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(objectNode57);
        org.junit.Assert.assertNotNull(objectNode60);
        org.junit.Assert.assertNotNull(jsonNode61);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = objectNode2.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        boolean boolean9 = objectNode8.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        boolean boolean14 = objectNode13.isBoolean();
        boolean boolean15 = objectNode13.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode8.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        boolean boolean17 = objectNode13.isBigInteger();
        float float18 = objectNode13.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType19 = objectNode13.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        boolean boolean22 = objectNode21.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode25.removeAll();
        boolean boolean27 = objectNode26.isBoolean();
        boolean boolean28 = objectNode26.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode21.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode26);
        boolean boolean30 = objectNode26.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode13.putAll(objectNode26);
        boolean boolean32 = objectNode2._childrenEqual(objectNode13);
        long long33 = objectNode2.longValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode35 = objectNode2.numberNode(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType19 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType19.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        boolean boolean6 = objectNode5.isBigDecimal();
        boolean boolean7 = objectNode5.isMissingNode();
        boolean boolean8 = objectNode5.isArray();
        boolean boolean9 = objectNode5.isShort();
        boolean boolean10 = objectNode5.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode5.path("{\"hi!\":{}}");
        boolean boolean13 = objectNode5.isBoolean();
        boolean boolean14 = objectNode5.isNull();
        boolean boolean15 = objectNode5.isBoolean();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode6.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = objectNode6.asToken();
        java.lang.String str11 = objectNode6.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = objectNode6.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode6.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode1._put("{}", jsonNode14);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.findPath("{}");
        boolean boolean18 = objectNode1.isTextual();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode6.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = objectNode6.asToken();
        java.lang.String str11 = objectNode6.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = objectNode6.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode6.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode1._put("{}", jsonNode14);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.findPath("{}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode19.deepCopy();
        boolean boolean25 = objectNode19.has("{\"hi!\":{}}");
        boolean boolean26 = objectNode19.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode28.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode28.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode32.without("hi!");
        boolean boolean35 = objectNode32.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory36 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory36);
        boolean boolean38 = objectNode37.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode41.removeAll();
        boolean boolean43 = objectNode42.isBoolean();
        boolean boolean44 = objectNode42.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode37.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode42);
        boolean boolean46 = objectNode37.isTextual();
        int int48 = objectNode37.asInt(0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode51.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList54 = objectNode51.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory56 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode57.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList60 = objectNode57.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList61 = objectNode51.findParents("hi!", jsonNodeList60);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList63 = objectNode51.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList64 = objectNode37.findValues("", jsonNodeList63);
        java.lang.String[] strArray69 = new java.lang.String[] { "{\"hi!\":{}}", "{}", "", "{}" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = objectNode37.retain(strArray69);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = objectNode32.retain(strArray69);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode19.retain(strArray69);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode1.retain(strArray69);
        boolean boolean74 = objectNode1.isIntegralNumber();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertNotNull(jsonNodeList54);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertNotNull(jsonNodeList60);
        org.junit.Assert.assertNotNull(jsonNodeList61);
        org.junit.Assert.assertNotNull(jsonNodeList63);
        org.junit.Assert.assertNotNull(jsonNodeList64);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "{\"hi!\":{}}", "{}", "", "{}" });
        org.junit.Assert.assertNotNull(objectNode70);
        org.junit.Assert.assertNotNull(objectNode71);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.at("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        boolean boolean10 = objectNode9.isBoolean();
        boolean boolean11 = objectNode9.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode9.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = objectNode9.findValues("");
        boolean boolean15 = objectNode9.isLong();
        boolean boolean17 = objectNode9.hasNonNull("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode9.remove("");
        boolean boolean20 = objectNode9.isPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode1.putAll(objectNode9);
        int int22 = objectNode1.intValue();
        java.lang.String str23 = objectNode1.textValue();
        int int24 = objectNode1.size();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode26 = objectNode1.numberNode((java.lang.Byte) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = objectNode2.iterator();
        long long6 = objectNode2.asLong(1L);
        boolean boolean7 = objectNode2.canConvertToInt();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.Iterator<java.lang.String> strItor3 = objectNode1.fieldNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode5 = objectNode1.numberNode((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        boolean boolean5 = objectNode1.isFloat();
        boolean boolean7 = objectNode1.has("");
        int int8 = objectNode1.intValue();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        boolean boolean4 = objectNode1.isFloat();
        boolean boolean5 = objectNode1.isDouble();
        java.lang.String str7 = objectNode1.asText("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        boolean boolean11 = objectNode10.isBoolean();
        boolean boolean12 = objectNode10.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode10.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode10.findValues("");
        boolean boolean16 = objectNode10.isInt();
        boolean boolean17 = objectNode10.isLong();
        boolean boolean18 = objectNode10.isNull();
        boolean boolean19 = objectNode10.isArray();
        boolean boolean20 = objectNode1._childrenEqual(objectNode10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode23.removeAll();
        float float25 = objectNode23.floatValue();
        int int27 = objectNode23.asInt(100);
        long long29 = objectNode23.asLong((long) 100);
        boolean boolean30 = objectNode23.booleanValue();
        boolean boolean31 = objectNode23.isNull();
        long long32 = objectNode23.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode1.replace("{\"\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode23);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(jsonNode33);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.findValue("");
        java.util.Iterator<java.lang.String> strItor5 = objectNode1.fieldNames();
        double double7 = objectNode1.asDouble((double) (short) 100);
        long long9 = objectNode1.asLong(0L);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = objectNode1.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = objectNode1.traverse(objectCodec2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = objectNode1.traverse(objectCodec4);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = objectNode1.fields();
        boolean boolean7 = objectNode1.isNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        boolean boolean10 = objectNode9.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        boolean boolean15 = objectNode14.isBoolean();
        boolean boolean16 = objectNode14.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode9.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode14);
        boolean boolean18 = objectNode9.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode9.at("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode23.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode23.path("hi!");
        java.util.List<java.lang.String> strList28 = objectNode23.findValuesAsText("");
        java.util.List<java.lang.String> strList29 = objectNode9.findValuesAsText("{\"\":{},\"{\\\"\\\":{}}\":{}}", strList28);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap30 = objectNode9._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode1.putAll(strMap30);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(jsonNode31);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        long long11 = objectNode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode1.without("{\"{\\\"hi!\\\":{}}\":{}}");
        boolean boolean14 = objectNode1.isBigInteger();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        double double6 = objectNode5.asDouble();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode5.retain((java.util.Collection<java.lang.String>) strList9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode3.retain((java.util.Collection<java.lang.String>) strList9);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode3.findPath("");
        boolean boolean16 = objectNode3.hasNonNull("{\"{\\\"hi!\\\":{}}\":{}}");
        boolean boolean17 = objectNode3.isFloat();
        int int19 = objectNode3.asInt((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode3.put("{\"\":{},\"{\\\"\\\":{}}\":{}}", (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor5 = objectNode1.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode8.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode8.path((int) (short) 10);
        boolean boolean14 = jsonNode13.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = jsonNode13.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode1.findParents("", jsonNodeList16);
        java.lang.String str18 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode21.removeAll();
        float float23 = objectNode21.floatValue();
        int int25 = objectNode21.asInt(100);
        boolean boolean26 = objectNode21.isContainerNode();
        boolean boolean27 = objectNode21.booleanValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode21.path(100);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        double double33 = objectNode32.asDouble();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode32.retain((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = objectNode38.at("");
        boolean boolean41 = objectNode38.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode43.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode43.path("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor47 = objectNode43.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory49);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = objectNode50.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = objectNode50.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode50.path((int) (short) 10);
        boolean boolean56 = jsonNode55.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList58 = jsonNode55.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = objectNode43.findParents("", jsonNodeList58);
        java.util.List<java.lang.String> strList61 = objectNode43.findValuesAsText("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = objectNode38.remove((java.util.Collection<java.lang.String>) strList61);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory65 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory66 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory67 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory67);
        boolean boolean69 = objectNode68.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory71 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode72.removeAll();
        boolean boolean74 = objectNode73.isBoolean();
        boolean boolean75 = objectNode73.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = objectNode68.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode73);
        boolean boolean77 = objectNode68.booleanValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap78 = objectNode68._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode79 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory66, strMap78);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode80 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory65, strMap78);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode81 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory64, strMap78);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList83 = objectNode81.findValues("{}");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList84 = objectNode38.findValues("", jsonNodeList83);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList85 = objectNode21.findValues("{\"hi!\":{}}", jsonNodeList83);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList86 = objectNode1.findParents("{}", jsonNodeList83);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strEntryItor5);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertNotNull(strEntryItor47);
        org.junit.Assert.assertNotNull(objectNode51);
        org.junit.Assert.assertNotNull(jsonNodeList53);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonNodeList58);
        org.junit.Assert.assertNotNull(jsonNodeList59);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(objectNode62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(jsonNodeList83);
        org.junit.Assert.assertNotNull(jsonNodeList84);
        org.junit.Assert.assertNotNull(jsonNodeList85);
        org.junit.Assert.assertNotNull(jsonNodeList86);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode12.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode12.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap18 = objectNode12._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode1.setAll(strMap18);
        boolean boolean20 = objectNode1.isLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = objectNode1.traverse(objectCodec21);
        int int23 = objectNode1.size();
        boolean boolean25 = objectNode1.asBoolean(false);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode1.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.at("");
        java.lang.Object obj13 = null;
        boolean boolean14 = objectNode1.equals(obj13);
        boolean boolean15 = objectNode1.isLong();
        java.lang.String str16 = objectNode1.asText();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode1.at("{\"hi!\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"{\"hi!\":{}}\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode6.isBigInteger();
        float float11 = objectNode6.floatValue();
        boolean boolean12 = objectNode6.isMissingNode();
        boolean boolean13 = objectNode6.isObject();
        boolean boolean14 = objectNode6.isPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode6.findPath("");
        boolean boolean18 = objectNode6.has((int) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        boolean boolean22 = objectNode21.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor23 = objectNode21.iterator();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType24 = objectNode21.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode26.removeAll();
        boolean boolean28 = objectNode27.isBoolean();
        boolean boolean29 = objectNode27.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode27.deepCopy();
        double double31 = objectNode27.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode27.path("");
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = objectNode27.findValue("");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = objectNode27.findValuesAsText("", (java.util.List<java.lang.String>) strList39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode21.remove((java.util.Collection<java.lang.String>) strList39);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        boolean boolean46 = objectNode45.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory48);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode49.removeAll();
        boolean boolean51 = objectNode50.isBoolean();
        boolean boolean52 = objectNode50.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode45.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode50);
        boolean boolean54 = objectNode50.isBigInteger();
        float float55 = objectNode50.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType56 = objectNode50.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = objectNode21.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode50);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap58 = objectNode21._children;
        boolean boolean59 = objectNode21.booleanValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory60 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory60);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = objectNode61.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList64 = objectNode61.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = objectNode61.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap67 = objectNode61._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = objectNode21.putAll(strMap67);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.POJONode pOJONode69 = objectNode6.POJONode((java.lang.Object) strMap67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor23);
        org.junit.Assert.assertNull(numberType24);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNull(jsonNode35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType56 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType56.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNull(jsonNode57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectNode62);
        org.junit.Assert.assertNotNull(jsonNodeList64);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(jsonNode68);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.retain((java.util.Collection<java.lang.String>) strList5);
        int int8 = objectNode7.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode7.remove("{\"hi!\":{}}");
        byte[] byteArray11 = objectNode7.binaryValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertNull(byteArray11);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.remove("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = objectNode1.traverse(objectCodec13);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = objectNode1.elements();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = objectNode1.numberType();
        java.math.BigInteger bigInteger17 = objectNode1.bigIntegerValue();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertNull(numberType16);
        org.junit.Assert.assertNotNull(bigInteger17);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode6.asBoolean();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = objectNode6.fields();
        boolean boolean12 = objectNode6.isLong();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = objectNode3.findValues("");
        byte[] byteArray6 = objectNode3.binaryValue();
        boolean boolean7 = objectNode3.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        double double11 = objectNode10.asDouble();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode10.retain((java.util.Collection<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = objectNode3.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList14);
        boolean boolean18 = objectNode3.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType19 = objectNode3.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        int int23 = objectNode21.asInt((int) 'a');
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode21.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        double double28 = objectNode27.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode27.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode29.findValues("");
        byte[] byteArray32 = objectNode29.binaryValue();
        boolean boolean33 = objectNode29.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory35);
        double double37 = objectNode36.asDouble();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode36.retain((java.util.Collection<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList43 = objectNode29.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList44 = objectNode24.findValuesAsText("{\"hi!\":{}}", (java.util.List<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode3.without((java.util.Collection<java.lang.String>) strList40);
        java.util.Collection<java.lang.String> strCollection46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode3.retain(strCollection46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + jsonNodeType19 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType19.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(objectNode45);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.canConvertToInt();
        java.lang.String str6 = objectNode2.asText("{\"\":{}}");
        boolean boolean7 = objectNode2.canConvertToLong();
        boolean boolean8 = objectNode2.canConvertToInt();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        double double5 = objectNode1.asDouble();
        java.util.Iterator<java.lang.String> strItor6 = objectNode1.fieldNames();
        double double8 = objectNode1.asDouble(0.0d);
        boolean boolean9 = objectNode1.booleanValue();
        boolean boolean11 = objectNode1.has("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = objectNode1.arrayNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        boolean boolean6 = objectNode1.isBigInteger();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = objectNode1.traverse(objectCodec7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = objectNode1.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode11.removeAll();
        boolean boolean13 = objectNode12.isBoolean();
        boolean boolean14 = objectNode12.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode12.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode12.findValues("");
        int int18 = objectNode12.asInt();
        boolean boolean19 = objectNode12.isMissingNode();
        java.util.List<java.lang.String> strList21 = objectNode12.findValuesAsText("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode24.removeAll();
        boolean boolean26 = objectNode25.isBoolean();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode12._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode25);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode29.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken33 = objectNode29.asToken();
        java.lang.String str34 = objectNode29.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor35 = objectNode29.iterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory36 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode37.removeAll();
        float float39 = objectNode37.floatValue();
        int int41 = objectNode37.asInt(100);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode37.retain(strArray43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode29.retain(strArray43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode25.retain(strArray43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode1.retain(strArray43);
        boolean boolean48 = objectNode47.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory49);
        boolean boolean51 = objectNode50.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory53 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory53);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = objectNode54.removeAll();
        boolean boolean56 = objectNode55.isBoolean();
        boolean boolean57 = objectNode55.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode50.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode55);
        boolean boolean59 = objectNode55.isBigInteger();
        float float60 = objectNode55.floatValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor61 = objectNode55.elements();
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = objectNode47.setAll(objectNode55);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + jsonToken33 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken33.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(jsonNodeItor35);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectNode55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertNotNull(jsonNodeItor61);
        org.junit.Assert.assertNotNull(jsonNode62);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.lang.String str4 = objectNode2.asText("");
        boolean boolean5 = objectNode2.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode7.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        boolean boolean15 = objectNode14.isBoolean();
        boolean boolean16 = objectNode14.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode14.without("");
        java.lang.String str20 = objectNode14.asText("");
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode7.replace("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode14);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "{\"hi!\":{}}", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode14.without((java.util.Collection<java.lang.String>) strList26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode31.removeAll();
        boolean boolean33 = objectNode32.isBoolean();
        boolean boolean34 = objectNode32.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode32.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = objectNode32.findValues("");
        boolean boolean38 = objectNode32.isLong();
        boolean boolean40 = objectNode32.hasNonNull("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken41 = objectNode32.asToken();
        java.lang.String[] strArray44 = new java.lang.String[] { "{\"hi!\":{}}", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode32.without((java.util.Collection<java.lang.String>) strList45);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory48);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode49.removeAll();
        boolean boolean51 = objectNode50.isBoolean();
        boolean boolean52 = objectNode50.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode50.deepCopy();
        double double54 = objectNode50.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = objectNode50.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap57 = objectNode50._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory59 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory59);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = objectNode60.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode60.path("hi!");
        java.util.List<java.lang.String> strList65 = objectNode60.findValuesAsText("");
        java.util.List<java.lang.String> strList66 = objectNode50.findValuesAsText("", strList65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = objectNode47.remove((java.util.Collection<java.lang.String>) strList65);
        java.util.List<java.lang.String> strList68 = objectNode28.findValuesAsText("hi!", strList65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode69 = objectNode2.retain((java.util.Collection<java.lang.String>) strList68);
        boolean boolean70 = objectNode2.isPojo();
        java.util.Iterator<java.lang.String> strItor71 = objectNode2.fieldNames();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType72 = objectNode2.numberType();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "{\"hi!\":{}}", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + jsonToken41 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken41.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "{\"hi!\":{}}", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(objectNode61);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(objectNode67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(objectNode69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strItor71);
        org.junit.Assert.assertNull(numberType72);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode7.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode1.findParents("hi!", jsonNodeList10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode1.findValues("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode15.removeAll();
        boolean boolean17 = objectNode16.isContainerNode();
        boolean boolean18 = objectNode1._childrenEqual(objectNode16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        boolean boolean22 = objectNode21.isBoolean();
        boolean boolean23 = objectNode21.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode21.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode21.findValues("");
        boolean boolean27 = objectNode21.isInt();
        java.lang.String str28 = objectNode21.textValue();
        boolean boolean29 = objectNode1._childrenEqual(objectNode21);
        long long31 = objectNode21.asLong((long) 1);
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType32 = objectNode21.getNodeType();
        double double33 = objectNode21.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList35 = objectNode21.findParents("{}");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = objectNode21.findValues("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory38 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory38);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode39.removeAll();
        boolean boolean41 = objectNode40.isBoolean();
        boolean boolean42 = objectNode40.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode40.without("");
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode21.putAll(objectNode40);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory46);
        boolean boolean48 = objectNode47.isLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode47.findValue("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        double double53 = objectNode52.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = objectNode52.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = objectNode54.findValues("");
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode54.findPath("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory60 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory60);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = objectNode61.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode61.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken65 = objectNode61.asToken();
        java.lang.String str66 = objectNode61.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode54.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode61);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = objectNode54.removeAll();
        com.fasterxml.jackson.core.JsonToken jsonToken69 = objectNode54.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = objectNode47.putAll(objectNode54);
        boolean boolean71 = objectNode40.equals((java.lang.Object) objectNode54);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode73 = objectNode40.numberNode((java.lang.Float) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + jsonNodeType32 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType32.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList35);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(jsonNode50);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode54);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(objectNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + jsonToken65 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken65.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(objectNode68);
        org.junit.Assert.assertTrue("'" + jsonToken69 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken69.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.lang.String str4 = objectNode2.asText("");
        boolean boolean5 = objectNode2.isContainerNode();
        long long6 = objectNode2.longValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor7 = objectNode2.iterator();
        boolean boolean8 = objectNode2.isDouble();
        boolean boolean9 = objectNode2.isObject();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode2._children;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode2.serializeWithType(jsonGenerator11, serializerProvider12, typeSerializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(jsonNodeItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.path((int) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode9.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode9.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode16.removeAll();
        boolean boolean18 = objectNode17.isBoolean();
        boolean boolean19 = objectNode17.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode17.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = objectNode17.findValues("");
        boolean boolean23 = objectNode17.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode9._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode17);
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode17);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor26 = objectNode1.elements();
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator27 = objectNode1.spliterator();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode1.findParent("{\"{\\\"hi!\\\":{}}\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = objectNode30.findValues("{\"\":{},\"{\\\"\\\":{}}\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(objectNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertNotNull(jsonNodeItor26);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator27);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNull(objectNode30);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        double double5 = objectNode1.asDouble();
        int int6 = objectNode1.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.removeAll();
        boolean boolean9 = objectNode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode11.removeAll();
        boolean boolean13 = objectNode12.isBoolean();
        boolean boolean14 = objectNode12.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode12.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode12.findValues("");
        boolean boolean18 = objectNode12.isInt();
        boolean boolean19 = objectNode12.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType20 = objectNode12.numberType();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = objectNode12.traverse(objectCodec21);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        double double26 = objectNode25.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode25.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = objectNode27.findValues("");
        byte[] byteArray30 = objectNode27.binaryValue();
        boolean boolean31 = objectNode27.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        double double35 = objectNode34.asDouble();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode34.retain((java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = objectNode27.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList42 = objectNode12.findValuesAsText("{\"hi!\":{}}", strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode1.remove((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode45.removeAll();
        float float47 = objectNode45.floatValue();
        int int49 = objectNode45.asInt(100);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode45.retain(strArray51);
        short short53 = objectNode45.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode43.setAll(objectNode45);
        int int55 = objectNode45.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = objectNode45.path("{}");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(numberType20);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNull(byteArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jsonNode57);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        int int5 = objectNode1.asInt((int) (short) 0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        boolean boolean9 = objectNode8.isBoolean();
        boolean boolean10 = objectNode8.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode8.without("");
        java.lang.String str14 = objectNode8.asText("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode16.removeAll();
        float float18 = objectNode16.floatValue();
        boolean boolean19 = objectNode16.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode8.putAll(objectNode16);
        boolean boolean21 = objectNode1.equals((java.lang.Object) objectNode16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode24.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode29.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = objectNode24.findValues("hi!", jsonNodeList31);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList33 = objectNode16.findParents("{}", jsonNodeList31);
        boolean boolean35 = objectNode16.hasNonNull((int) (byte) 0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode38.removeAll();
        boolean boolean40 = objectNode39.isBoolean();
        boolean boolean41 = objectNode39.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode39.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser43 = objectNode42.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap44 = objectNode42._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory45 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory45);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode46.removeAll();
        float float48 = objectNode46.floatValue();
        int int50 = objectNode46.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = objectNode46.findParents("hi!");
        int int53 = objectNode46.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory54 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory54);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode55.removeAll();
        boolean boolean57 = objectNode56.isBoolean();
        boolean boolean58 = objectNode56.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode56.deepCopy();
        double double60 = objectNode56.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList62 = objectNode56.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap63 = objectNode56._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory65 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode66 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = objectNode66.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = objectNode66.path("hi!");
        java.util.List<java.lang.String> strList71 = objectNode66.findValuesAsText("");
        java.util.List<java.lang.String> strList72 = objectNode56.findValuesAsText("", strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode46.remove((java.util.Collection<java.lang.String>) strList72);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode42.without((java.util.Collection<java.lang.String>) strList72);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory76 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory76);
        double double78 = objectNode77.asDouble();
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode83 = objectNode77.retain((java.util.Collection<java.lang.String>) strList81);
        boolean boolean84 = objectNode77.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode85 = objectNode74._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode77);
        boolean boolean87 = objectNode74.hasNonNull("{}");
        boolean boolean89 = objectNode74.hasNonNull("{\"\":{}}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode90 = objectNode74.deepCopy();
        boolean boolean91 = objectNode90.isTextual();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode92 = objectNode16._put("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode90);
        boolean boolean93 = objectNode92.isIntegralNumber();
        boolean boolean94 = objectNode92.isPojo();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(objectNode17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertNotNull(jsonNodeList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(objectNode67);
        org.junit.Assert.assertNotNull(jsonNode69);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(objectNode83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(objectNode85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectNode90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objectNode92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = objectNode5.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap7 = objectNode5._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        float float11 = objectNode9.floatValue();
        int int13 = objectNode9.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode9.findParents("hi!");
        int int16 = objectNode9.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode18.removeAll();
        boolean boolean20 = objectNode19.isBoolean();
        boolean boolean21 = objectNode19.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode19.deepCopy();
        double double23 = objectNode19.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = objectNode19.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap26 = objectNode19._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode29.path("hi!");
        java.util.List<java.lang.String> strList34 = objectNode29.findValuesAsText("");
        java.util.List<java.lang.String> strList35 = objectNode19.findValuesAsText("", strList34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode9.remove((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode5.without((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        double double41 = objectNode40.asDouble();
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode40.retain((java.util.Collection<java.lang.String>) strList44);
        boolean boolean47 = objectNode40.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode37._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        boolean boolean50 = objectNode37.hasNonNull("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = objectNode37.deepCopy();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType52 = objectNode51.numberType();
        double double54 = objectNode51.asDouble((double) 35L);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectNode51);
        org.junit.Assert.assertNull(numberType52);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 35.0d + "'", double54 == 35.0d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        boolean boolean10 = objectNode9.isBoolean();
        boolean boolean11 = objectNode9.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode9.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = objectNode9.findValues("");
        boolean boolean15 = objectNode9.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode1._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode9);
        boolean boolean17 = objectNode1.isBinary();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode1.path(100);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = objectNode22.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode28.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = objectNode22.findParents("hi!", jsonNodeList31);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList34 = objectNode22.findValues("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode36.removeAll();
        boolean boolean38 = objectNode37.isContainerNode();
        boolean boolean39 = objectNode22._childrenEqual(objectNode37);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = objectNode1.put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode22);
        boolean boolean41 = objectNode1.canConvertToInt();
        boolean boolean43 = objectNode1.hasNonNull(100);
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode1.get(1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = objectNode1.findValues("{}");
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator48 = jsonNodeList47.spliterator();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertNotNull(jsonNodeList34);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNodeList47);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator48);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode2.findParent("");
        com.fasterxml.jackson.core.JsonParser jsonParser10 = objectNode2.traverse();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode2.path(52);
        boolean boolean13 = jsonNode12.isDouble();
        boolean boolean14 = jsonNode12.isTextual();
        boolean boolean15 = jsonNode12.isShort();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        int int4 = objectNode2.asInt((int) 'a');
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap5 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap5);
        boolean boolean7 = objectNode6.isContainerNode();
        boolean boolean8 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = objectNode6.traverse();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode5.without("hi!");
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator8 = objectNode5.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        boolean boolean12 = objectNode11.isBoolean();
        boolean boolean13 = objectNode11.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode11.deepCopy();
        boolean boolean15 = objectNode11.isTextual();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        boolean boolean19 = objectNode18.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        boolean boolean24 = objectNode23.isBoolean();
        boolean boolean25 = objectNode23.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode18.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode23);
        boolean boolean27 = objectNode18.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode18.at("");
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode11.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        boolean boolean31 = objectNode5._childrenEqual(objectNode11);
        long long32 = objectNode11.asLong();
        boolean boolean33 = objectNode11.isBigDecimal();
        boolean boolean34 = objectNode11.canConvertToLong();
        int int35 = objectNode11.asInt();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode36 = objectNode11.arrayNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator8);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode7.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode1.findParents("hi!", jsonNodeList10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode1.findValues("");
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode1.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken16 = objectNode1.asToken();
        java.lang.String str18 = objectNode1.asText("");
        java.math.BigInteger bigInteger19 = objectNode1.bigIntegerValue();
        boolean boolean20 = objectNode1.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        float float24 = objectNode22.floatValue();
        int int26 = objectNode22.asInt(100);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode22.retain(strArray28);
        int int30 = objectNode29.size();
        byte[] byteArray31 = objectNode29.binaryValue();
        long long32 = objectNode29.longValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode34.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode34.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken38 = objectNode34.asToken();
        java.lang.String str39 = objectNode34.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor40 = objectNode34.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode34.path("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode34.findPath("{\"hi!\":{}}");
        java.util.List<java.lang.String> strList46 = jsonNode44.findValuesAsText("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode29.remove((java.util.Collection<java.lang.String>) strList46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode1.without((java.util.Collection<java.lang.String>) strList46);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        boolean boolean52 = objectNode51.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory54 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory54);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode55.removeAll();
        boolean boolean57 = objectNode56.isBoolean();
        boolean boolean58 = objectNode56.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = objectNode51.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode56);
        boolean boolean60 = objectNode51.isTextual();
        int int62 = objectNode51.asInt(0);
        short short63 = objectNode51.shortValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode64 = objectNode48.putPOJO("{\"\":{},\"{\\\"\\\":{}}\":{}}", (java.lang.Object) objectNode51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + jsonToken38 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken38.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(jsonNodeItor40);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 0 + "'", short63 == (short) 0);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        boolean boolean10 = objectNode9.isBoolean();
        boolean boolean11 = objectNode9.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode9.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList14 = objectNode9.findValues("");
        boolean boolean15 = objectNode9.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode1._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode9);
        boolean boolean17 = objectNode1.isBinary();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode1.path(100);
        boolean boolean20 = objectNode1.isNull();
        short short21 = objectNode1.shortValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode23.removeAll();
        boolean boolean25 = objectNode24.isBoolean();
        boolean boolean26 = objectNode24.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode24.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = objectNode27.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap29 = objectNode27._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode1.putAll(strMap29);
        boolean boolean31 = objectNode1.isBigInteger();
        boolean boolean32 = objectNode1.isNull();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonNodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        double double6 = objectNode2.asDouble();
        boolean boolean8 = objectNode2.has("{\"\":{}}");
        boolean boolean9 = objectNode2.isBigInteger();
        int int10 = objectNode2.asInt();
        boolean boolean11 = objectNode2.isArray();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode5.at("");
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor8 = objectNode5.iterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        double double12 = objectNode11.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode11.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode13.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode5.findValues("{\"hi!\":{}}", jsonNodeList15);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        double double19 = objectNode18.asDouble();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode18.retain((java.util.Collection<java.lang.String>) strList22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode5.retain((java.util.Collection<java.lang.String>) strList22);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        boolean boolean31 = objectNode30.isBoolean();
        boolean boolean32 = objectNode30.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode30.deepCopy();
        double double34 = objectNode30.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList36 = objectNode30.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap37 = objectNode30._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27, strMap37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = objectNode38.traverse(objectCodec39);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode38.without("");
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode25.set("{\"hi!\":{}}", jsonNode42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser45 = objectNode25.traverse(objectCodec44);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = objectNode25.findParents("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory49);
        boolean boolean51 = objectNode50.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory53 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory53);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = objectNode54.removeAll();
        boolean boolean56 = objectNode55.isBoolean();
        boolean boolean57 = objectNode55.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode50.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode55);
        boolean boolean59 = objectNode50.isTextual();
        boolean boolean61 = objectNode50.asBoolean(true);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory62 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory62);
        double double64 = objectNode63.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = objectNode63.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList67 = objectNode65.findValues("");
        byte[] byteArray68 = objectNode65.binaryValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap69 = objectNode65._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = objectNode50.setAll(strMap69);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory48, strMap69);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = objectNode25.putAll(strMap69);
        boolean boolean73 = objectNode25.isNull();
        java.lang.String str74 = objectNode25.asText();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeItor8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(jsonNodeList47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectNode55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode65);
        org.junit.Assert.assertNotNull(jsonNodeList67);
        org.junit.Assert.assertNull(byteArray68);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(jsonNode70);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        boolean boolean5 = objectNode1.isArray();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        double double8 = objectNode7.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode7.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode9.findValues("");
        byte[] byteArray12 = objectNode9.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode1.setAll(objectNode9);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode9.findParents("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode17.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode17.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode17.at("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode17.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode23.findPath("");
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode23.get("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        boolean boolean32 = objectNode31.isBoolean();
        boolean boolean33 = objectNode31.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode31.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList36 = objectNode31.findValues("");
        boolean boolean37 = objectNode31.isInt();
        boolean boolean38 = objectNode31.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType39 = objectNode31.numberType();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = objectNode31.traverse(objectCodec40);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory43);
        double double45 = objectNode44.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode44.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = objectNode46.findValues("");
        byte[] byteArray49 = objectNode46.binaryValue();
        boolean boolean50 = objectNode46.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        double double54 = objectNode53.asDouble();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode53.retain((java.util.Collection<java.lang.String>) strList57);
        java.util.List<java.lang.String> strList60 = objectNode46.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList57);
        java.util.List<java.lang.String> strList61 = objectNode31.findValuesAsText("{\"hi!\":{}}", strList60);
        java.util.List<java.lang.String> strList62 = objectNode23.findValuesAsText("{}", strList60);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = objectNode9.remove((java.util.Collection<java.lang.String>) strList60);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode65 = objectNode63.numberNode((java.lang.Byte) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(jsonNodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(numberType39);
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(objectNode63);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode7.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode1.findParents("hi!", jsonNodeList10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode1.findValues("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode15.removeAll();
        boolean boolean17 = objectNode16.isContainerNode();
        boolean boolean18 = objectNode1._childrenEqual(objectNode16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode20.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode20.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode24.without("hi!");
        long long28 = objectNode24.asLong((long) (byte) 1);
        boolean boolean29 = objectNode1._childrenEqual(objectNode24);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        int int34 = objectNode32.asInt((int) 'a');
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode32.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode24.put("", (com.fasterxml.jackson.databind.JsonNode) objectNode35);
        boolean boolean37 = objectNode24.isArray();
        boolean boolean38 = objectNode24.isShort();
        boolean boolean40 = objectNode24.hasNonNull("{}");
        boolean boolean41 = objectNode24.isInt();
        com.fasterxml.jackson.core.JsonToken jsonToken42 = objectNode24.asToken();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + jsonToken42 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken42.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = objectNode2.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        boolean boolean9 = objectNode8.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        boolean boolean14 = objectNode13.isBoolean();
        boolean boolean15 = objectNode13.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode8.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        boolean boolean17 = objectNode13.isBigInteger();
        float float18 = objectNode13.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType19 = objectNode13.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        boolean boolean22 = objectNode21.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode25.removeAll();
        boolean boolean27 = objectNode26.isBoolean();
        boolean boolean28 = objectNode26.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode21.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode26);
        boolean boolean30 = objectNode26.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode13.putAll(objectNode26);
        boolean boolean32 = objectNode2._childrenEqual(objectNode13);
        long long33 = objectNode2.longValue();
        boolean boolean34 = objectNode2.booleanValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode2.removeAll();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType19 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType19.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectNode35);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = objectNode5.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap7 = objectNode5._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        float float11 = objectNode9.floatValue();
        int int13 = objectNode9.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode9.findParents("hi!");
        int int16 = objectNode9.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode18.removeAll();
        boolean boolean20 = objectNode19.isBoolean();
        boolean boolean21 = objectNode19.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode19.deepCopy();
        double double23 = objectNode19.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = objectNode19.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap26 = objectNode19._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode29.path("hi!");
        java.util.List<java.lang.String> strList34 = objectNode29.findValuesAsText("");
        java.util.List<java.lang.String> strList35 = objectNode19.findValuesAsText("", strList34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode9.remove((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode5.without((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        double double41 = objectNode40.asDouble();
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode40.retain((java.util.Collection<java.lang.String>) strList44);
        boolean boolean47 = objectNode40.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode37._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode40.removeAll();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode49.deepCopy();
        double double51 = objectNode50.asDouble();
        boolean boolean52 = objectNode50.isIntegralNumber();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode1.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.at("");
        java.lang.Object obj13 = null;
        boolean boolean14 = objectNode1.equals(obj13);
        boolean boolean15 = objectNode1.isLong();
        java.lang.String str16 = objectNode1.asText();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode1.put("{\"\":{},\"{\\\"\\\":{}}\":{}}", (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode1.findParents("hi!");
        long long9 = objectNode1.asLong((long) (short) -1);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        boolean boolean14 = objectNode13.isBoolean();
        boolean boolean15 = objectNode13.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode13.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = objectNode13.findValues("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode13.findParent("");
        com.fasterxml.jackson.core.JsonParser jsonParser21 = objectNode13.traverse();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode13.path("{\"\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        java.lang.String str31 = objectNode29.asText("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap32 = objectNode29._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode26.putAll(strMap32);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24, strMap32);
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = objectNode13.setAll(strMap32);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode1.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode38 = objectNode13.numberNode((short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNull(jsonNode36);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = objectNode2.iterator();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        boolean boolean9 = objectNode8.isBoolean();
        boolean boolean10 = objectNode8.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode8.deepCopy();
        double double12 = objectNode8.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode8.path("");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode8.findValue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = objectNode8.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode2.remove((java.util.Collection<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        boolean boolean27 = objectNode26.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        boolean boolean32 = objectNode31.isBoolean();
        boolean boolean33 = objectNode31.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode26.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        boolean boolean35 = objectNode31.isBigInteger();
        float float36 = objectNode31.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType37 = objectNode31.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode2.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap39 = objectNode2._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode2.without("{}");
        boolean boolean42 = objectNode2.isBigDecimal();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList44 = objectNode2.findParents("{\"\":{},\"{\\\"\\\":{}}\":{}}");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor45 = objectNode2.fields();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType37 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType37.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonNodeList44);
        org.junit.Assert.assertNotNull(strEntryItor45);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode1.retain(strArray7);
        java.util.Iterator<java.lang.String> strItor9 = objectNode8.fieldNames();
        boolean boolean10 = objectNode8.isDouble();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode12.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode12.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap18 = objectNode12._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode1.setAll(strMap18);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode1.remove("{\"\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        double double24 = objectNode23.asDouble();
        boolean boolean25 = objectNode23.isValueNode();
        java.math.BigDecimal bigDecimal26 = objectNode23.decimalValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        float float31 = objectNode29.floatValue();
        int int33 = objectNode29.asInt(100);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode29.retain(strArray35);
        boolean boolean37 = objectNode29.isNumber();
        boolean boolean38 = objectNode29.booleanValue();
        java.util.List<java.lang.String> strList40 = objectNode29.findValuesAsText("{\"\":{}}");
        boolean boolean41 = objectNode29.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode23.replace("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode29);
        boolean boolean43 = objectNode29.isBigDecimal();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode1.putAll(objectNode29);
        double double45 = objectNode1.asDouble();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode1.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.at("");
        java.lang.Object obj13 = null;
        boolean boolean14 = objectNode1.equals(obj13);
        boolean boolean15 = objectNode1.isLong();
        boolean boolean16 = objectNode1.canConvertToLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode1.path((int) (short) -1);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode1.findParents("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode1.put("{\"hi!\":{}}", (java.lang.Short) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNodeList20);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        java.util.List<java.lang.String> strList6 = objectNode1.findValuesAsText("");
        int int7 = objectNode1.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode9.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken13 = objectNode9.asToken();
        java.lang.String str14 = objectNode9.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor15 = objectNode9.iterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode17.removeAll();
        float float19 = objectNode17.floatValue();
        int int21 = objectNode17.asInt(100);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode17.retain(strArray23);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode9.retain(strArray23);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode1.retain(strArray23);
        boolean boolean27 = objectNode1.isShort();
        boolean boolean29 = objectNode1.has((int) (byte) 0);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonNodeItor15);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        boolean boolean9 = objectNode2.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode13.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode13.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode17.without("hi!");
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator20 = objectNode17.spliterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        boolean boolean24 = objectNode23.isBoolean();
        boolean boolean25 = objectNode23.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode23.deepCopy();
        boolean boolean27 = objectNode23.isTextual();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        boolean boolean31 = objectNode30.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode34.removeAll();
        boolean boolean36 = objectNode35.isBoolean();
        boolean boolean37 = objectNode35.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode30.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode35);
        boolean boolean39 = objectNode30.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode30.at("");
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode23.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode30);
        boolean boolean43 = objectNode17._childrenEqual(objectNode23);
        long long44 = objectNode23.asLong();
        boolean boolean45 = objectNode23.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode2._put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode23);
        com.fasterxml.jackson.core.JsonToken jsonToken47 = objectNode46.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode46.without("{\"{\\\"hi!\\\":{}}\":{}}");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(numberType10);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(objectNode17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator20);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode49);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode1.retain(strArray7);
        int int9 = objectNode8.size();
        byte[] byteArray10 = objectNode8.binaryValue();
        long long11 = objectNode8.longValue();
        java.lang.String str12 = objectNode8.textValue();
        boolean boolean13 = objectNode8.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode15.removeAll();
        boolean boolean17 = objectNode16.isBoolean();
        boolean boolean18 = objectNode16.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode16.deepCopy();
        boolean boolean20 = objectNode16.isBoolean();
        boolean boolean21 = objectNode16.isInt();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = objectNode16.traverse(objectCodec22);
        double double25 = objectNode16.asDouble((double) (byte) 100);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        boolean boolean30 = objectNode29.isBoolean();
        boolean boolean31 = objectNode29.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode29.deepCopy();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor33 = objectNode29.elements();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor34 = objectNode29.elements();
        boolean boolean35 = objectNode29.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        int int40 = objectNode38.asInt((int) 'a');
        boolean boolean41 = objectNode38.isValueNode();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = objectNode38.findParents("{}");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList44 = objectNode29.findParents("{\"hi!\":{}}", jsonNodeList43);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList45 = objectNode16.findParents("", jsonNodeList44);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode8.putAll(objectNode16);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(jsonNodeItor33);
        org.junit.Assert.assertNotNull(jsonNodeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNodeList44);
        org.junit.Assert.assertNotNull(jsonNodeList45);
        org.junit.Assert.assertNotNull(jsonNode46);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        double double6 = objectNode2.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode2.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode2._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode12.path("hi!");
        java.util.List<java.lang.String> strList17 = objectNode12.findValuesAsText("");
        java.util.List<java.lang.String> strList18 = objectNode2.findValuesAsText("", strList17);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        boolean boolean22 = objectNode21.isBoolean();
        boolean boolean23 = objectNode21.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode21.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode21.findValues("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode21.findParent("");
        com.fasterxml.jackson.core.JsonParser jsonParser29 = objectNode21.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode33.removeAll();
        boolean boolean35 = objectNode34.isBoolean();
        boolean boolean36 = objectNode34.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode34.deepCopy();
        double double38 = objectNode34.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList40 = objectNode34.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap41 = objectNode34._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31, strMap41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30, strMap41);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor44 = objectNode43.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode21.putAll(objectNode43);
        boolean boolean46 = objectNode2.equals((java.lang.Object) objectNode21);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode48 = objectNode21.numberNode((java.lang.Byte) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNull(objectNode28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strEntryItor44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap7 = objectNode1._children;
        short short8 = objectNode1.shortValue();
        boolean boolean9 = objectNode1.isValueNode();
        int int10 = objectNode1.intValue();
        boolean boolean11 = objectNode1.isBigDecimal();
        short short12 = objectNode1.shortValue();
        boolean boolean13 = objectNode1.isBigInteger();
        boolean boolean15 = objectNode1.asBoolean(false);
        boolean boolean16 = objectNode1.booleanValue();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        double double5 = objectNode1.asDouble();
        int int6 = objectNode1.intValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode1.findValues("{\"hi!\":{}}");
        boolean boolean9 = objectNode1.isShort();
        boolean boolean11 = objectNode1.hasNonNull((int) (short) 100);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = objectNode3.findValues("");
        boolean boolean6 = objectNode3.booleanValue();
        boolean boolean7 = objectNode3.isValueNode();
        boolean boolean8 = objectNode3.isArray();
        boolean boolean9 = objectNode3.isLong();
        java.math.BigDecimal bigDecimal10 = objectNode3.decimalValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode3.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode3.findPath("{\"\":{}}");
        boolean boolean15 = objectNode3.has((int) 'a');
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode17.removeAll();
        boolean boolean19 = objectNode18.isBoolean();
        boolean boolean20 = objectNode18.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode18.deepCopy();
        double double22 = objectNode18.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = objectNode18.findParents("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = objectNode18.traverse(objectCodec25);
        boolean boolean27 = objectNode18.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        float float31 = objectNode29.floatValue();
        int int33 = objectNode29.asInt(100);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode29.retain(strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode18.retain(strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode3.retain(strArray35);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode3.put("{}", (java.lang.Float) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(objectNode38);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        int int8 = objectNode2.asInt();
        boolean boolean9 = objectNode2.isMissingNode();
        java.util.List<java.lang.String> strList11 = objectNode2.findValuesAsText("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode2.deepCopy();
        boolean boolean13 = objectNode12.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode12.get((int) (short) 10);
        long long16 = objectNode12.longValue();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode2.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        boolean boolean14 = objectNode13.isBoolean();
        boolean boolean15 = objectNode13.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode13.without("");
        java.lang.String str19 = objectNode13.asText("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode21.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = objectNode21.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode26.removeAll();
        float float28 = objectNode26.floatValue();
        boolean boolean29 = objectNode26.isFloat();
        boolean boolean30 = objectNode21.equals((java.lang.Object) boolean29);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode21.remove("");
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode13.setAll(objectNode21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode9._put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode21);
        boolean boolean35 = objectNode34.isBinary();
        long long36 = objectNode34.asLong();
        java.lang.String str37 = objectNode34.toString();
        boolean boolean38 = objectNode34.isIntegralNumber();
        short short39 = objectNode34.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode34.findPath("{\"\":{},\"{\\\"\\\":{}}\":{}}");
        java.math.BigDecimal bigDecimal42 = objectNode34.decimalValue();
        double double43 = objectNode34.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode34.put("{}", (java.lang.Long) 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{\"{\\\"hi!\\\":{}}\":{}}" + "'", str37, "{\"{\\\"hi!\\\":{}}\":{}}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 0 + "'", short39 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode1.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.at("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode14.removeAll();
        boolean boolean16 = objectNode15.isBoolean();
        boolean boolean17 = objectNode15.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode15.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode15.findValues("");
        boolean boolean21 = objectNode15.isInt();
        boolean boolean22 = objectNode15.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType23 = objectNode15.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        double double26 = objectNode25.asDouble();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode25.retain((java.util.Collection<java.lang.String>) strList29);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        double double35 = objectNode34.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode34.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = objectNode36.findValues("");
        byte[] byteArray39 = objectNode36.binaryValue();
        boolean boolean40 = objectNode36.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        double double44 = objectNode43.asDouble();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode43.retain((java.util.Collection<java.lang.String>) strList47);
        java.util.List<java.lang.String> strList50 = objectNode36.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList47);
        java.util.List<java.lang.String> strList51 = objectNode31.findValuesAsText("{}", (java.util.List<java.lang.String>) strList47);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode15.without((java.util.Collection<java.lang.String>) strList51);
        boolean boolean53 = objectNode1._childrenEqual(objectNode15);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        boolean boolean57 = objectNode56.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory59 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory59);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = objectNode60.removeAll();
        boolean boolean62 = objectNode61.isBoolean();
        boolean boolean63 = objectNode61.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode56.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode61);
        boolean boolean65 = objectNode56.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode56.at("");
        java.lang.Object obj68 = null;
        boolean boolean69 = objectNode56.equals(obj68);
        boolean boolean70 = objectNode56.isLong();
        boolean boolean71 = objectNode56.canConvertToLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory72);
        double double74 = objectNode73.asDouble();
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode79 = objectNode73.retain((java.util.Collection<java.lang.String>) strList77);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode80 = objectNode56.retain((java.util.Collection<java.lang.String>) strList77);
        com.fasterxml.jackson.core.JsonToken jsonToken81 = objectNode56.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode82 = objectNode15.put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(numberType23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectNode61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objectNode79);
        org.junit.Assert.assertNotNull(objectNode80);
        org.junit.Assert.assertTrue("'" + jsonToken81 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken81.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNull(jsonNode82);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.at("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode7.findPath("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        int int13 = objectNode11.asInt((int) 'a');
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap14 = objectNode11._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode7.putAll(strMap14);
        java.math.BigDecimal bigDecimal16 = jsonNode15.decimalValue();
        boolean boolean17 = jsonNode15.isObject();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = objectNode5.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap7 = objectNode5._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        float float11 = objectNode9.floatValue();
        int int13 = objectNode9.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode9.findParents("hi!");
        int int16 = objectNode9.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode18.removeAll();
        boolean boolean20 = objectNode19.isBoolean();
        boolean boolean21 = objectNode19.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode19.deepCopy();
        double double23 = objectNode19.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = objectNode19.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap26 = objectNode19._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode29.path("hi!");
        java.util.List<java.lang.String> strList34 = objectNode29.findValuesAsText("");
        java.util.List<java.lang.String> strList35 = objectNode19.findValuesAsText("", strList34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode9.remove((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode5.without((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        double double41 = objectNode40.asDouble();
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode40.retain((java.util.Collection<java.lang.String>) strList44);
        boolean boolean47 = objectNode40.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode37._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        boolean boolean50 = objectNode37.hasNonNull("{}");
        boolean boolean52 = objectNode37.hasNonNull("{\"\":{}}");
        java.math.BigInteger bigInteger53 = objectNode37.bigIntegerValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory54 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory54);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode55.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode55.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode55.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory61 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory61);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = objectNode62.removeAll();
        boolean boolean64 = objectNode63.isBoolean();
        boolean boolean65 = objectNode63.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode66 = objectNode63.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList68 = objectNode63.findValues("");
        boolean boolean69 = objectNode63.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = objectNode55._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode63);
        boolean boolean71 = objectNode55.isBinary();
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = objectNode55.path(100);
        boolean boolean74 = objectNode55.isNull();
        short short75 = objectNode55.shortValue();
        boolean boolean76 = objectNode55.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = objectNode37.setAll(objectNode55);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertNotNull(jsonNode58);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertNotNull(objectNode63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectNode66);
        org.junit.Assert.assertNotNull(jsonNodeList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectNode70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jsonNode73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 0 + "'", short75 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jsonNode77);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        double double5 = objectNode1.asDouble();
        int int6 = objectNode1.intValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode1.findValues("{\"hi!\":{}}");
        boolean boolean9 = objectNode1.isShort();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode11.removeAll();
        boolean boolean13 = objectNode12.isBoolean();
        boolean boolean14 = objectNode12.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode12.deepCopy();
        boolean boolean16 = objectNode15.isBigDecimal();
        boolean boolean18 = objectNode15.hasNonNull((int) 'a');
        java.math.BigDecimal bigDecimal19 = objectNode15.decimalValue();
        double double21 = objectNode15.asDouble((double) (short) 0);
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode15.path("{\"hi!\":{}}");
        boolean boolean25 = objectNode15.has("{\"\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode27.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode27.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode34.removeAll();
        boolean boolean36 = objectNode35.isBoolean();
        boolean boolean37 = objectNode35.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode35.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList40 = objectNode35.findValues("");
        boolean boolean41 = objectNode35.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode27._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode35);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode35.path("hi!");
        boolean boolean45 = objectNode35.isArray();
        long long46 = objectNode35.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = objectNode15.setAll(objectNode35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory48);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode49.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = objectNode49.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode49.at("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = objectNode49.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = objectNode55.findPath("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory58);
        int int61 = objectNode59.asInt((int) 'a');
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap62 = objectNode59._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode55.putAll(strMap62);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode35.setAll(strMap62);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.POJONode pOJONode65 = objectNode1.POJONode((java.lang.Object) jsonNode64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(jsonNodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNotNull(objectNode55);
        org.junit.Assert.assertNotNull(jsonNode57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertNotNull(jsonNode64);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        boolean boolean3 = objectNode1.isFloatingPointNumber();
        boolean boolean5 = objectNode1.hasNonNull((int) (byte) 0);
        boolean boolean6 = objectNode1.isBigDecimal();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isLong();
        boolean boolean10 = objectNode2.hasNonNull("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken11 = objectNode2.asToken();
        java.lang.String[] strArray14 = new java.lang.String[] { "{\"hi!\":{}}", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode2.without((java.util.Collection<java.lang.String>) strList15);
        boolean boolean18 = objectNode17.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = objectNode20.findParents("");
        double double24 = objectNode20.asDouble();
        boolean boolean25 = objectNode17.equals((java.lang.Object) objectNode20);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode28.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode28.path((int) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode36.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode36.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode36.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode43.removeAll();
        boolean boolean45 = objectNode44.isBoolean();
        boolean boolean46 = objectNode44.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode44.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = objectNode44.findValues("");
        boolean boolean50 = objectNode44.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = objectNode36._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode44);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode28.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode44);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap53 = objectNode28._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26, strMap53);
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode17.putAll(strMap53);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode17.removeAll();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + jsonToken11 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken11.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "{\"hi!\":{}}", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objectNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectNode51);
        org.junit.Assert.assertNull(jsonNode52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(objectNode56);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        double double6 = objectNode5.asDouble();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode5.retain((java.util.Collection<java.lang.String>) strList9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode3.retain((java.util.Collection<java.lang.String>) strList9);
        short short13 = objectNode12.shortValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode12.removeAll();
        java.util.Iterator<java.lang.String> strItor15 = objectNode12.fieldNames();
        float float16 = objectNode12.floatValue();
        double double18 = objectNode12.asDouble((double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode7.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode1.findParents("hi!", jsonNodeList10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode1.findValues("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode15.removeAll();
        boolean boolean17 = objectNode16.isContainerNode();
        boolean boolean18 = objectNode1._childrenEqual(objectNode16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode21.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = objectNode22.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = objectNode16.findValues("hi!", jsonNodeList24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = objectNode16.traverse(objectCodec26);
        boolean boolean28 = objectNode16.isBinary();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        long long11 = objectNode1.asLong();
        int int12 = objectNode1.asInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        boolean boolean15 = objectNode14.isLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode14.deepCopy();
        java.util.List<java.lang.String> strList18 = objectNode14.findValuesAsText("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode1.remove((java.util.Collection<java.lang.String>) strList18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode20.remove("{\"hi!\":{}}");
        boolean boolean23 = objectNode20.isIntegralNumber();
        boolean boolean24 = objectNode20.isBigDecimal();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        double double6 = objectNode2.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode2.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode2._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode12.path("hi!");
        java.util.List<java.lang.String> strList17 = objectNode12.findValuesAsText("");
        java.util.List<java.lang.String> strList18 = objectNode2.findValuesAsText("", strList17);
        boolean boolean19 = objectNode2.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = objectNode2.findValues("{\"\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode26.removeAll();
        java.lang.String str29 = objectNode27.asText("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap30 = objectNode27._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode24.putAll(strMap30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22, strMap30);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode2.putAll(strMap30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode2.findParent("{\"\":{},\"{\\\"\\\":{}}\":{}}");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNull(objectNode35);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode1.findParents("hi!");
        int int8 = objectNode1.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode1.path((int) (byte) 0);
        java.lang.String str11 = objectNode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode1.path("{\"{\\\"hi!\\\":{}}\":{}}");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        java.lang.String str5 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType6 = objectNode1.getNodeType();
        long long7 = objectNode1.asLong();
        long long8 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode1.findParent("{\"\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode12 = objectNode1.numberNode((double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + jsonNodeType6 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType6.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = objectNode1.asToken();
        java.lang.String str6 = objectNode1.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode1.get("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken9 = objectNode1.asToken();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        double double12 = objectNode11.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode11.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode13.findValues("");
        byte[] byteArray16 = objectNode13.binaryValue();
        boolean boolean17 = objectNode13.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        double double21 = objectNode20.asDouble();
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode20.retain((java.util.Collection<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList27 = objectNode13.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode1.without((java.util.Collection<java.lang.String>) strList24);
        boolean boolean29 = objectNode28.isFloat();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken9.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        double double5 = objectNode1.asDouble();
        int int6 = objectNode1.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.removeAll();
        boolean boolean8 = objectNode7.isArray();
        long long10 = objectNode7.asLong((long) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        boolean boolean14 = objectNode13.isBoolean();
        boolean boolean15 = objectNode13.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode13.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = objectNode16.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap18 = objectNode16._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode7.putAll(strMap18);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = objectNode22.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode28.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList32 = objectNode22.findParents("hi!", jsonNodeList31);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList34 = objectNode22.findValues("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode36.removeAll();
        boolean boolean38 = objectNode37.isContainerNode();
        boolean boolean39 = objectNode22._childrenEqual(objectNode37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode41.removeAll();
        boolean boolean43 = objectNode42.isBoolean();
        boolean boolean44 = objectNode42.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode42.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = objectNode42.findValues("");
        boolean boolean48 = objectNode42.isInt();
        java.lang.String str49 = objectNode42.textValue();
        boolean boolean50 = objectNode22._childrenEqual(objectNode42);
        boolean boolean52 = objectNode22.hasNonNull("{}");
        long long53 = objectNode22.longValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode56.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList59 = objectNode56.findParents("");
        boolean boolean60 = objectNode56.isArray();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory61 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory61);
        double double63 = objectNode62.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode64 = objectNode62.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList66 = objectNode64.findValues("");
        byte[] byteArray67 = objectNode64.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = objectNode56.setAll(objectNode64);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory69 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory69);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = objectNode70.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList73 = objectNode70.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode75 = objectNode70.path((int) (short) 10);
        boolean boolean76 = jsonNode75.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList78 = jsonNode75.findValues("hi!");
        java.lang.String str79 = jsonNode75.textValue();
        java.util.List<java.lang.String> strList81 = jsonNode75.findValuesAsText("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode82 = objectNode56.retain((java.util.Collection<java.lang.String>) strList81);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode83 = objectNode82.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList85 = objectNode83.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList86 = objectNode22.findParents("{\"\":{}}", jsonNodeList85);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList87 = objectNode7.findParents("{\"\":{}}", jsonNodeList86);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNodeList32);
        org.junit.Assert.assertNotNull(jsonNodeList34);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(jsonNodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNotNull(jsonNodeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode64);
        org.junit.Assert.assertNotNull(jsonNodeList66);
        org.junit.Assert.assertNull(byteArray67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertNotNull(objectNode71);
        org.junit.Assert.assertNotNull(jsonNodeList73);
        org.junit.Assert.assertNotNull(jsonNode75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jsonNodeList78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(objectNode82);
        org.junit.Assert.assertNotNull(objectNode83);
        org.junit.Assert.assertNotNull(jsonNodeList85);
        org.junit.Assert.assertNotNull(jsonNodeList86);
        org.junit.Assert.assertNotNull(jsonNodeList87);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode5.without("hi!");
        long long9 = objectNode5.asLong((long) (byte) 1);
        boolean boolean10 = objectNode5.isPojo();
        boolean boolean11 = objectNode5.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode13.path("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode13.remove("");
        java.lang.String str19 = objectNode13.asText();
        boolean boolean20 = objectNode13.isBoolean();
        boolean boolean21 = objectNode5._childrenEqual(objectNode13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode5.put("", "{\"{\\\"hi!\\\":{}}\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = objectNode1.asToken();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = objectNode1.fields();
        boolean boolean7 = objectNode1.isShort();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.path("hi!");
        java.lang.String str14 = objectNode10.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType15 = objectNode10.getNodeType();
        long long16 = objectNode10.asLong();
        java.util.List<java.lang.String> strList18 = objectNode10.findValuesAsText("{}");
        java.util.List<java.lang.String> strList19 = objectNode1.findValuesAsText("{\"{\\\"hi!\\\":{}}\":{}}", strList18);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode1.findPath("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode23.removeAll();
        boolean boolean25 = objectNode24.isBoolean();
        boolean boolean26 = objectNode24.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode24.deepCopy();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap28 = objectNode27._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode1.setAll(strMap28);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + jsonNodeType15 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType15.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(jsonNode29);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        boolean boolean3 = objectNode2.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        boolean boolean8 = objectNode7.isBoolean();
        boolean boolean9 = objectNode7.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode2.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode7);
        boolean boolean11 = objectNode2.booleanValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap12 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        boolean boolean16 = objectNode15.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        boolean boolean21 = objectNode20.isBoolean();
        boolean boolean22 = objectNode20.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode15.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode20);
        boolean boolean24 = objectNode15.booleanValue();
        long long25 = objectNode15.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode15.get("{\"hi!\":{}}");
        boolean boolean29 = objectNode15.hasNonNull((int) (byte) 1);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        double double32 = objectNode31.asDouble();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode31.retain((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode15.retain((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode13.remove((java.util.Collection<java.lang.String>) strList35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = objectNode3.findValues("");
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode3.findPath("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = objectNode10.asToken();
        java.lang.String str15 = objectNode10.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode3.removeAll();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType18 = objectNode3.numberType();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = objectNode3.asToken();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(objectNode17);
        org.junit.Assert.assertNull(numberType18);
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode4.findPath("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode4.get("{\"\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.path("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode10.remove("");
        java.lang.String str16 = objectNode10.asText();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = objectNode10.asToken();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode10.findParent("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode21.removeAll();
        boolean boolean23 = objectNode22.isBoolean();
        boolean boolean24 = objectNode22.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode22.deepCopy();
        double double26 = objectNode22.asDouble();
        boolean boolean28 = objectNode22.has("{\"\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode31.removeAll();
        boolean boolean33 = objectNode32.isBoolean();
        boolean boolean34 = objectNode32.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode32.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = objectNode32.findValues("");
        boolean boolean38 = objectNode32.isInt();
        boolean boolean39 = objectNode32.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType40 = objectNode32.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode43.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = objectNode43.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = objectNode43.path((int) (short) 10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = objectNode43.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = objectNode32.findValues("hi!", jsonNodeList50);
        boolean boolean52 = objectNode32.isMissingNode();
        boolean boolean53 = objectNode32.isFloatingPointNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode22.set("{\"\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode32);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory56 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory56);
        double double58 = objectNode57.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode57.deepCopy();
        java.lang.String str60 = objectNode59.textValue();
        boolean boolean62 = objectNode59.hasNonNull(52);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode32.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode59);
        int int64 = objectNode32.intValue();
        boolean boolean65 = objectNode10._childrenEqual(objectNode32);
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = objectNode4.putAll(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNull(objectNode19);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(numberType40);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(jsonNodeList46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonNode66);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        boolean boolean5 = objectNode1.isArray();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        double double8 = objectNode7.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode7.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode9.findValues("");
        byte[] byteArray12 = objectNode9.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode1.setAll(objectNode9);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode15.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = objectNode15.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode15.path((int) (short) 10);
        boolean boolean21 = jsonNode20.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = jsonNode20.findValues("hi!");
        java.lang.String str24 = jsonNode20.textValue();
        java.util.List<java.lang.String> strList26 = jsonNode20.findValuesAsText("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode1.retain((java.util.Collection<java.lang.String>) strList26);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode27.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList30 = objectNode28.findValues("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode28.objectNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNotNull(jsonNodeList30);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = objectNode3.findValues("");
        boolean boolean6 = objectNode3.booleanValue();
        boolean boolean7 = objectNode3.isValueNode();
        boolean boolean8 = objectNode3.isArray();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode10 = objectNode3.numberNode((java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode2.removeAll();
        boolean boolean4 = objectNode3.isBoolean();
        boolean boolean5 = objectNode3.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode3.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode3.findValues("");
        boolean boolean9 = objectNode3.isLong();
        boolean boolean11 = objectNode3.hasNonNull("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken12 = objectNode3.asToken();
        java.lang.String[] strArray15 = new java.lang.String[] { "{\"hi!\":{}}", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode3.without((java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = objectNode18.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode21.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = objectNode21.findParents("");
        double double25 = objectNode21.asDouble();
        boolean boolean26 = objectNode18.equals((java.lang.Object) objectNode21);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        double double29 = objectNode28.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode28.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        double double33 = objectNode32.asDouble();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode32.retain((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode30.retain((java.util.Collection<java.lang.String>) strList36);
        short short40 = objectNode39.shortValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode39.removeAll();
        java.util.Iterator<java.lang.String> strItor42 = objectNode39.fieldNames();
        float float43 = objectNode39.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode45.removeAll();
        boolean boolean47 = objectNode46.isBoolean();
        int int48 = objectNode46.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode46.deepCopy();
        boolean boolean50 = objectNode49.isBigDecimal();
        boolean boolean51 = objectNode49.canConvertToInt();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap52 = objectNode49._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode39.setAll(strMap52);
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode18.setAll(strMap52);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap52);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "{\"hi!\":{}}", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 0 + "'", short40 == (short) 0);
        org.junit.Assert.assertNotNull(objectNode41);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(jsonNode54);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        boolean boolean4 = objectNode1.isFloat();
        boolean boolean5 = objectNode1.isDouble();
        java.math.BigDecimal bigDecimal6 = objectNode1.decimalValue();
        boolean boolean7 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode10.deepCopy();
        boolean boolean15 = objectNode10.isBigInteger();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = objectNode10.traverse(objectCodec16);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode10.remove((java.util.Collection<java.lang.String>) strList20);
        int int23 = objectNode22.size();
        boolean boolean24 = objectNode22.isValueNode();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode1._put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode26 = objectNode22.arrayNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectNode25);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        double double6 = objectNode2.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode2.path("");
        int int10 = objectNode2.asInt((int) ' ');
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor11 = objectNode2.iterator();
        double double12 = objectNode2.asDouble();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(jsonNodeItor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode2.removeAll();
        boolean boolean4 = objectNode3.isBoolean();
        boolean boolean5 = objectNode3.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode3.deepCopy();
        double double7 = objectNode3.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList9 = objectNode3.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode3._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode11.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType14 = objectNode11.getNodeType();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = objectNode11.numberType();
        boolean boolean16 = objectNode11.isFloatingPointNumber();
        boolean boolean17 = objectNode11.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        float float22 = objectNode20.floatValue();
        boolean boolean23 = objectNode20.isFloat();
        boolean boolean24 = objectNode20.isDouble();
        java.lang.String str26 = objectNode20.asText("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        boolean boolean30 = objectNode29.isBoolean();
        boolean boolean31 = objectNode29.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode29.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList34 = objectNode29.findValues("");
        boolean boolean35 = objectNode29.isInt();
        boolean boolean36 = objectNode29.isLong();
        boolean boolean37 = objectNode29.isNull();
        boolean boolean38 = objectNode29.isArray();
        boolean boolean39 = objectNode20._childrenEqual(objectNode29);
        long long41 = objectNode20.asLong((long) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode43.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList46 = objectNode43.findParents("");
        double double47 = objectNode43.asDouble();
        java.util.Iterator<java.lang.String> strItor48 = objectNode43.fieldNames();
        java.math.BigInteger bigInteger49 = objectNode43.bigIntegerValue();
        boolean boolean50 = objectNode43.isBinary();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList52 = objectNode43.findParents("{\"hi!\":{}}");
        boolean boolean53 = objectNode20.equals((java.lang.Object) jsonNodeList52);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList54 = objectNode11.findParents("{\"\":{},\"{\\\"\\\":{}}\":{}}", jsonNodeList52);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode11.with("{\"{\\\"hi!\\\":{}}\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertTrue("'" + jsonNodeType14 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType14.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNull(numberType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(jsonNodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(jsonNodeList46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(strItor48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jsonNodeList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonNodeList54);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList6 = jsonNode4.findParents("hi!");
        boolean boolean7 = jsonNode4.isNumber();
        boolean boolean8 = jsonNode4.isArray();
        long long10 = jsonNode4.asLong((long) (short) 10);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        boolean boolean9 = objectNode2.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode13.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode13.path((int) (short) 10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode13.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = objectNode2.findValues("hi!", jsonNodeList20);
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode2.without("");
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode2.findPath("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode2.serializeWithType(jsonGenerator26, serializerProvider27, typeSerializer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(numberType10);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(jsonNode25);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.canConvertToInt();
        java.lang.String str6 = objectNode2.asText("{\"\":{}}");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode2.serialize(jsonGenerator7, serializerProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode1.retain(strArray7);
        int int9 = objectNode8.size();
        byte[] byteArray10 = objectNode8.binaryValue();
        long long11 = objectNode8.longValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode13.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = objectNode13.asToken();
        java.lang.String str18 = objectNode13.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor19 = objectNode13.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode13.path("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode13.findPath("{\"hi!\":{}}");
        java.util.List<java.lang.String> strList25 = jsonNode23.findValuesAsText("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode8.remove((java.util.Collection<java.lang.String>) strList25);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode29.removeAll();
        boolean boolean31 = objectNode30.isBoolean();
        boolean boolean32 = objectNode30.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode30.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser34 = objectNode33.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap35 = objectNode33._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27, strMap35);
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode8.setAll(strMap35);
        boolean boolean39 = objectNode8.has((int) (short) 0);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jsonNodeItor19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isBigInteger();
        java.lang.String str5 = objectNode2.asText();
        int int6 = objectNode2.asInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = objectNode9.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode9.at("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode9.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode15.findPath("");
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode15.get("");
        java.math.BigDecimal bigDecimal20 = objectNode15.decimalValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode22.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken26 = objectNode22.asToken();
        java.lang.String str27 = objectNode22.asText();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap28 = objectNode22._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode15.setAll(strMap28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7, strMap28);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode2.setAll(strMap28);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(jsonNode31);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        double double6 = objectNode2.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode2.findParents("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = objectNode2.traverse(objectCodec9);
        boolean boolean11 = objectNode2.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        float float15 = objectNode13.floatValue();
        int int17 = objectNode13.asInt(100);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode13.retain(strArray19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode2.retain(strArray19);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode23.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode23.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        float float30 = objectNode28.floatValue();
        boolean boolean31 = objectNode28.isFloat();
        boolean boolean32 = objectNode23.equals((java.lang.Object) boolean31);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode23.remove("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser36 = objectNode23.traverse(objectCodec35);
        short short37 = objectNode23.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode21.putAll(objectNode23);
        boolean boolean40 = objectNode23.asBoolean(false);
        boolean boolean42 = objectNode23.has(1);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode45.removeAll();
        boolean boolean47 = objectNode46.isBoolean();
        boolean boolean48 = objectNode46.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode46.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList51 = objectNode46.findValues("");
        boolean boolean52 = objectNode46.isInt();
        boolean boolean53 = objectNode46.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType54 = objectNode46.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory56 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode57.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList60 = objectNode57.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = objectNode57.path((int) (short) 10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList64 = objectNode57.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList65 = objectNode46.findValues("hi!", jsonNodeList64);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode46.without("");
        boolean boolean68 = objectNode46.isContainerNode();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap69 = objectNode46._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory43, strMap69);
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = objectNode23.putAll(strMap69);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 0 + "'", short37 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertNotNull(jsonNodeList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(numberType54);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertNotNull(jsonNodeList60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(jsonNodeList64);
        org.junit.Assert.assertNotNull(jsonNodeList65);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(jsonNode71);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        double double5 = objectNode1.asDouble();
        int int6 = objectNode1.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        double double10 = objectNode9.asDouble();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode9.retain((java.util.Collection<java.lang.String>) strList13);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode7.retain((java.util.Collection<java.lang.String>) strList13);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor17 = objectNode7.elements();
        boolean boolean19 = objectNode7.has("{\"{\\\"hi!\\\":{}}\":{}}");
        boolean boolean20 = objectNode7.isTextual();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(jsonNodeItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = objectNode1.traverse(objectCodec2);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        double double6 = objectNode5.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode5.deepCopy();
        java.lang.String str8 = objectNode7.textValue();
        boolean boolean10 = objectNode7.hasNonNull(52);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.setAll(objectNode7);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode14.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode14.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken18 = objectNode14.asToken();
        java.lang.String str19 = objectNode14.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor20 = objectNode14.iterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode22.removeAll();
        float float24 = objectNode22.floatValue();
        int int26 = objectNode22.asInt(100);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode22.retain(strArray28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode14.retain(strArray28);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor31 = objectNode14.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode34.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode34.path("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode34.remove("");
        java.lang.String str40 = objectNode34.asText();
        com.fasterxml.jackson.core.JsonToken jsonToken41 = objectNode34.asToken();
        int int42 = objectNode34.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode14.replace("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode34);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType44 = objectNode14.numberType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode1._put("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory46);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode47.removeAll();
        float float49 = objectNode47.floatValue();
        int int51 = objectNode47.asInt(100);
        boolean boolean52 = objectNode47.isContainerNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode47.findValue("{\"\":{}}");
        java.util.Iterator<java.lang.String> strItor55 = objectNode47.fieldNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = objectNode47.without("{\"hi!\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode58 = objectNode14.pojoNode((java.lang.Object) "{\"hi!\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + jsonToken18 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken18.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(jsonNodeItor20);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(strEntryItor31);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNull(jsonNode39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + jsonToken41 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken41.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(jsonNode43);
        org.junit.Assert.assertNull(numberType44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(jsonNode54);
        org.junit.Assert.assertNotNull(strItor55);
        org.junit.Assert.assertNotNull(jsonNode57);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.path((int) (short) 10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = jsonNode6.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = jsonNode6.findParents("{\"hi!\":{}}");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode1.booleanValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        boolean boolean14 = objectNode13.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode17.removeAll();
        boolean boolean19 = objectNode18.isBoolean();
        boolean boolean20 = objectNode18.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode13.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        boolean boolean22 = objectNode13.booleanValue();
        long long23 = objectNode13.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode13.get("{\"hi!\":{}}");
        boolean boolean27 = objectNode13.hasNonNull((int) (byte) 1);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode1.set("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode30 = objectNode1.numberNode((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonNode28);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = objectNode2.iterator();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        boolean boolean9 = objectNode8.isBoolean();
        boolean boolean10 = objectNode8.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode8.deepCopy();
        double double12 = objectNode8.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode8.path("");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode8.findValue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = objectNode8.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode2.remove((java.util.Collection<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        boolean boolean27 = objectNode26.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        boolean boolean32 = objectNode31.isBoolean();
        boolean boolean33 = objectNode31.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode26.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        boolean boolean35 = objectNode31.isBigInteger();
        float float36 = objectNode31.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType37 = objectNode31.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode2.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap39 = objectNode2._children;
        boolean boolean40 = objectNode2.booleanValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode42.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList45 = objectNode42.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = objectNode42.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap48 = objectNode42._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode2.putAll(strMap48);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NullNode nullNode50 = objectNode2.nullNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType37 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType37.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(jsonNodeList45);
        org.junit.Assert.assertNotNull(jsonNode47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(jsonNode49);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode6.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = objectNode6.asToken();
        java.lang.String str11 = objectNode6.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = objectNode6.iterator();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode6.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode1._put("{}", jsonNode14);
        double double17 = objectNode15.asDouble((double) '#');
        int int18 = objectNode15.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode20.removeAll();
        boolean boolean22 = objectNode21.isBoolean();
        boolean boolean23 = objectNode21.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode21.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode21.findValues("");
        boolean boolean27 = objectNode21.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode21.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode31.removeAll();
        boolean boolean33 = objectNode32.isBoolean();
        boolean boolean34 = objectNode32.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode32.without("");
        java.lang.String str38 = objectNode32.asText("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode40.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = objectNode40.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode45.removeAll();
        float float47 = objectNode45.floatValue();
        boolean boolean48 = objectNode45.isFloat();
        boolean boolean49 = objectNode40.equals((java.lang.Object) boolean48);
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = objectNode40.remove("");
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode32.setAll(objectNode40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode28._put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode15.setAll(objectNode28);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = null;
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = objectNode28.findParents("{}", jsonNodeList56);
        boolean boolean58 = objectNode28.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory60 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory60);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = objectNode61.removeAll();
        boolean boolean63 = objectNode62.isBoolean();
        boolean boolean64 = objectNode62.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = objectNode62.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList67 = objectNode62.findValues("");
        boolean boolean68 = objectNode62.isInt();
        boolean boolean69 = objectNode62.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType70 = objectNode62.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory72);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode73.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList76 = objectNode73.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = objectNode73.path((int) (short) 10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList80 = objectNode73.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList81 = objectNode62.findValues("hi!", jsonNodeList80);
        boolean boolean82 = objectNode62.isMissingNode();
        boolean boolean83 = objectNode62.isFloatingPointNumber();
        boolean boolean84 = objectNode62.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode85 = objectNode28.set("", (com.fasterxml.jackson.databind.JsonNode) objectNode62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(objectNode41);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jsonNode51);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertNull(jsonNodeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectNode62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectNode65);
        org.junit.Assert.assertNotNull(jsonNodeList67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(numberType70);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertNotNull(jsonNodeList76);
        org.junit.Assert.assertNotNull(jsonNode78);
        org.junit.Assert.assertNotNull(jsonNodeList80);
        org.junit.Assert.assertNotNull(jsonNodeList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jsonNode85);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        double double5 = objectNode1.asDouble();
        int int6 = objectNode1.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.removeAll();
        boolean boolean9 = objectNode1.hasNonNull("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode11.removeAll();
        boolean boolean13 = objectNode12.isBoolean();
        boolean boolean14 = objectNode12.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode12.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode12.findValues("");
        boolean boolean18 = objectNode12.isInt();
        boolean boolean19 = objectNode12.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType20 = objectNode12.numberType();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = objectNode12.traverse(objectCodec21);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        double double26 = objectNode25.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode25.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = objectNode27.findValues("");
        byte[] byteArray30 = objectNode27.binaryValue();
        boolean boolean31 = objectNode27.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        double double35 = objectNode34.asDouble();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode34.retain((java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = objectNode27.findValuesAsText("hi!", (java.util.List<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList42 = objectNode12.findValuesAsText("{\"hi!\":{}}", strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode1.remove((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode45.removeAll();
        float float47 = objectNode45.floatValue();
        int int49 = objectNode45.asInt(100);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode45.retain(strArray51);
        short short53 = objectNode45.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode43.setAll(objectNode45);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode43.put("{\"{\\\"hi!\\\":{}}\":{}}", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(numberType20);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNull(byteArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode54);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = objectNode3.findValues("");
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode3.findPath("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = objectNode10.asToken();
        java.lang.String str15 = objectNode10.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode3.removeAll();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap18 = objectNode3._children;
        com.fasterxml.jackson.core.JsonParser.NumberType numberType19 = objectNode3.numberType();
        boolean boolean20 = objectNode3.isInt();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(objectNode17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(numberType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.at("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        boolean boolean9 = objectNode7.isDouble();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode7._children;
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode2.removeAll();
        boolean boolean4 = objectNode3.isBoolean();
        boolean boolean5 = objectNode3.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode3.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode6.traverse();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap8 = objectNode6._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        float float12 = objectNode10.floatValue();
        int int14 = objectNode10.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode10.findParents("hi!");
        int int17 = objectNode10.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        boolean boolean21 = objectNode20.isBoolean();
        boolean boolean22 = objectNode20.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode20.deepCopy();
        double double24 = objectNode20.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode20.findParents("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap27 = objectNode20._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode30.path("hi!");
        java.util.List<java.lang.String> strList35 = objectNode30.findValuesAsText("");
        java.util.List<java.lang.String> strList36 = objectNode20.findValuesAsText("", strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode10.remove((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode6.without((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        double double42 = objectNode41.asDouble();
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode41.retain((java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = objectNode41.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode38._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode41);
        boolean boolean50 = objectNode41.isBinary();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode52.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode52.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode52.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory58);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = objectNode59.removeAll();
        boolean boolean61 = objectNode60.isBoolean();
        boolean boolean62 = objectNode60.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = objectNode60.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList65 = objectNode60.findValues("");
        boolean boolean66 = objectNode60.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = objectNode52._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode60);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList69 = objectNode60.findValues("{}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory70 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory70);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode71.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = objectNode71.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory75 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode76 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory75);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode76.removeAll();
        float float78 = objectNode76.floatValue();
        boolean boolean79 = objectNode76.isFloat();
        boolean boolean80 = objectNode71.equals((java.lang.Object) boolean79);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory81 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode82 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory81);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode83 = objectNode82.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList85 = objectNode82.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode87 = objectNode82.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap88 = objectNode82._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = objectNode71.setAll(strMap88);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = objectNode60.setAll(strMap88);
        com.fasterxml.jackson.databind.JsonNode jsonNode91 = objectNode41.putAll(strMap88);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode92 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap88);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertNotNull(objectNode60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectNode63);
        org.junit.Assert.assertNotNull(jsonNodeList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectNode67);
        org.junit.Assert.assertNotNull(jsonNodeList69);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(objectNode83);
        org.junit.Assert.assertNotNull(jsonNodeList85);
        org.junit.Assert.assertNotNull(jsonNode87);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNotNull(jsonNode91);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        double double6 = objectNode2.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode2.get(97);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode11.removeAll();
        float float13 = objectNode11.floatValue();
        int int15 = objectNode11.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode11.findParents("hi!");
        boolean boolean19 = objectNode11.has("");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor20 = objectNode11.fields();
        int int21 = objectNode11.size();
        short short22 = objectNode11.shortValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode25.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList28 = objectNode25.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode25.at("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode25.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode31.findPath("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        int int37 = objectNode35.asInt((int) 'a');
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap38 = objectNode35._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode31.putAll(strMap38);
        float float40 = jsonNode39.floatValue();
        boolean boolean41 = jsonNode39.booleanValue();
        boolean boolean42 = jsonNode39.isPojo();
        boolean boolean44 = jsonNode39.has(100);
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode11.put("{}", jsonNode39);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode2.set("{\"\":{}}", jsonNode39);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strEntryItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertNotNull(jsonNodeList28);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(jsonNode45);
        org.junit.Assert.assertNotNull(jsonNode46);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode2.findParent("");
        com.fasterxml.jackson.core.JsonParser jsonParser10 = objectNode2.traverse();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode2.path(52);
        boolean boolean13 = objectNode2.isNull();
        long long14 = objectNode2.asLong();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NullNode nullNode15 = objectNode2.nullNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        boolean boolean6 = objectNode5.isBigDecimal();
        boolean boolean7 = objectNode5.isMissingNode();
        boolean boolean8 = objectNode5.isArray();
        boolean boolean9 = objectNode5.isDouble();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode11.removeAll();
        java.lang.String str14 = objectNode12.asText("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap15 = objectNode12._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode5.setAll(strMap15);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode5.path("{\"\":{},\"{\\\"\\\":{}}\":{}}");
        boolean boolean20 = objectNode5.asBoolean(false);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode2.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = objectNode2.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode2.path((int) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode10.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode17.removeAll();
        boolean boolean19 = objectNode18.isBoolean();
        boolean boolean20 = objectNode18.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode18.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = objectNode18.findValues("");
        boolean boolean24 = objectNode18.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode10._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode2.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap27 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap27);
        boolean boolean29 = objectNode28.isObject();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode28.put("{\"{\\\"hi!\\\":{}}\":{}}", (java.lang.Short) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNull(jsonNode26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        boolean boolean9 = objectNode2.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode13.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode13.path((int) (short) 10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode13.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList21 = objectNode2.findValues("hi!", jsonNodeList20);
        boolean boolean22 = objectNode2.isMissingNode();
        boolean boolean23 = objectNode2.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode26.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList29 = objectNode26.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode26.path((int) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode34.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode34.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode34.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode41.removeAll();
        boolean boolean43 = objectNode42.isBoolean();
        boolean boolean44 = objectNode42.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode42.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList47 = objectNode42.findValues("");
        boolean boolean48 = objectNode42.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode34._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode42);
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode26.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode42);
        boolean boolean51 = objectNode42.isLong();
        int int52 = objectNode42.asInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory54 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory54);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode55.removeAll();
        boolean boolean57 = objectNode56.isBoolean();
        boolean boolean58 = objectNode56.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode56.deepCopy();
        double double60 = objectNode56.asDouble();
        boolean boolean61 = objectNode56.isPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode56.get(1);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory65 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode66 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = objectNode66.removeAll();
        boolean boolean68 = objectNode67.isBoolean();
        int int69 = objectNode67.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = objectNode67.deepCopy();
        boolean boolean71 = objectNode70.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode56._put("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode70);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor73 = objectNode70.iterator();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode42._put("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode70);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory75 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode76 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory75);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode76.removeAll();
        boolean boolean78 = objectNode77.isBoolean();
        int int79 = objectNode77.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode80 = objectNode77.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode82 = objectNode80.findPath("{\"\":{}}");
        int int83 = objectNode80.intValue();
        boolean boolean84 = objectNode70.equals((java.lang.Object) int83);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType85 = objectNode70.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode86 = objectNode2.set("{\"\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode70);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(numberType10);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(jsonNodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(jsonNodeList29);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(jsonNodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertNull(jsonNode50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertNotNull(objectNode67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objectNode70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(jsonNodeItor73);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objectNode80);
        org.junit.Assert.assertNotNull(jsonNode82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(numberType85);
        org.junit.Assert.assertNotNull(jsonNode86);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode5.removeAll();
        boolean boolean7 = objectNode6.isBoolean();
        boolean boolean8 = objectNode6.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean10 = objectNode1.isTextual();
        int int12 = objectNode1.asInt(0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode15.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = objectNode15.findParents("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode1._put("{\"\":{},\"{\\\"\\\":{}}\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode15);
        byte[] byteArray20 = objectNode15.binaryValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        double double24 = objectNode23.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode23.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        double double28 = objectNode27.asDouble();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode27.retain((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode25.retain((java.util.Collection<java.lang.String>) strList31);
        short short35 = objectNode34.shortValue();
        boolean boolean36 = objectNode34.isBigInteger();
        boolean boolean37 = objectNode34.canConvertToLong();
        boolean boolean38 = objectNode34.isNumber();
        java.math.BigDecimal bigDecimal39 = objectNode34.decimalValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode41.removeAll();
        float float43 = objectNode41.floatValue();
        int int45 = objectNode41.asInt(100);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode41.retain(strArray47);
        boolean boolean49 = objectNode41.isNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        double double52 = objectNode51.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode51.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = objectNode53.findValues("");
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = objectNode53.findPath("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory59 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory59);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = objectNode60.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode60.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken64 = objectNode60.asToken();
        java.lang.String str65 = objectNode60.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = objectNode53.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode60);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = objectNode53.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = objectNode41.putAll(objectNode53);
        boolean boolean70 = objectNode53.has((int) ' ');
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory72);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode73.removeAll();
        boolean boolean75 = objectNode74.isBoolean();
        boolean boolean76 = objectNode74.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode74.deepCopy();
        double double78 = objectNode74.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList80 = objectNode74.findParents("");
        java.math.BigDecimal bigDecimal81 = objectNode74.decimalValue();
        boolean boolean82 = objectNode74.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory83 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode84 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory83);
        double double85 = objectNode84.asDouble();
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode90 = objectNode84.retain((java.util.Collection<java.lang.String>) strList88);
        boolean boolean91 = objectNode74.equals((java.lang.Object) strList88);
        java.util.List<java.lang.String> strList92 = objectNode53.findValuesAsText("", (java.util.List<java.lang.String>) strList88);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode93 = objectNode34.retain((java.util.Collection<java.lang.String>) strList88);
        com.fasterxml.jackson.databind.JsonNode jsonNode94 = objectNode15.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode93);
        boolean boolean96 = jsonNode94.hasNonNull((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(jsonNode57);
        org.junit.Assert.assertNotNull(objectNode61);
        org.junit.Assert.assertNotNull(jsonNode63);
        org.junit.Assert.assertTrue("'" + jsonToken64 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken64.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(objectNode67);
        org.junit.Assert.assertNotNull(jsonNode68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList80);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objectNode90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(objectNode93);
        org.junit.Assert.assertNotNull(jsonNode94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        int int3 = objectNode1.asInt((int) 'a');
        boolean boolean5 = objectNode1.asBoolean(true);
        java.util.Iterator<java.lang.String> strItor6 = objectNode1.fieldNames();
        byte[] byteArray7 = objectNode1.binaryValue();
        boolean boolean8 = objectNode1.isValueNode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        java.util.List<java.lang.String> strList6 = objectNode1.findValuesAsText("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode1.deepCopy();
        long long8 = objectNode7.asLong();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType9 = objectNode7.getNodeType();
        int int10 = objectNode7.size();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + jsonNodeType9 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType9.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        java.lang.String str9 = objectNode2.textValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = objectNode2.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode12.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode12.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode12.deepCopy();
        boolean boolean17 = objectNode12.isBigInteger();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = objectNode12.traverse(objectCodec18);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode12.remove((java.util.Collection<java.lang.String>) strList22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode2.remove((java.util.Collection<java.lang.String>) strList22);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode2.deepCopy();
        boolean boolean27 = objectNode2.isFloatingPointNumber();
        boolean boolean28 = objectNode2.canConvertToLong();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode1.retain(strArray7);
        boolean boolean9 = objectNode1.isNumber();
        boolean boolean10 = objectNode1.isPojo();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap11 = objectNode1._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode13.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode13.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode13.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap19 = objectNode13._children;
        short short20 = objectNode13.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode13.path("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        double double25 = objectNode24.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode24.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        double double29 = objectNode28.asDouble();
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode28.retain((java.util.Collection<java.lang.String>) strList32);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode26.retain((java.util.Collection<java.lang.String>) strList32);
        short short36 = objectNode35.shortValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode35.removeAll();
        java.util.Iterator<java.lang.String> strItor38 = objectNode35.fieldNames();
        boolean boolean39 = objectNode35.isFloat();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode42.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode42.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode42.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = objectNode46.at("");
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor49 = objectNode46.iterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        double double53 = objectNode52.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = objectNode52.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList56 = objectNode54.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList57 = objectNode46.findValues("{\"hi!\":{}}", jsonNodeList56);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory58);
        double double60 = objectNode59.asDouble();
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = objectNode59.retain((java.util.Collection<java.lang.String>) strList63);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode66 = objectNode46.retain((java.util.Collection<java.lang.String>) strList63);
        java.util.List<java.lang.String> strList67 = objectNode35.findValuesAsText("{\"\":{}}", (java.util.List<java.lang.String>) strList63);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = objectNode13.without((java.util.Collection<java.lang.String>) strList67);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = objectNode1.putAll(objectNode68);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 0 + "'", short36 == (short) 0);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(jsonNodeItor49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode54);
        org.junit.Assert.assertNotNull(jsonNodeList56);
        org.junit.Assert.assertNotNull(jsonNodeList57);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objectNode65);
        org.junit.Assert.assertNotNull(objectNode66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(objectNode68);
        org.junit.Assert.assertNotNull(jsonNode69);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        double double6 = objectNode5.asDouble();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode5.retain((java.util.Collection<java.lang.String>) strList9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode3.retain((java.util.Collection<java.lang.String>) strList9);
        java.math.BigInteger bigInteger13 = objectNode12.bigIntegerValue();
        boolean boolean14 = objectNode12.isArray();
        boolean boolean15 = objectNode12.isIntegralNumber();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap16 = objectNode12._children;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode12.put("{\"\":{}}", (java.lang.Double) 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        double double6 = objectNode5.asDouble();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode5.retain((java.util.Collection<java.lang.String>) strList9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode3.retain((java.util.Collection<java.lang.String>) strList9);
        java.math.BigInteger bigInteger13 = objectNode12.bigIntegerValue();
        boolean boolean14 = objectNode12.canConvertToInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode12.get(35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonNode16);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        boolean boolean4 = objectNode1.isFloat();
        boolean boolean5 = objectNode1.isDouble();
        java.math.BigDecimal bigDecimal6 = objectNode1.decimalValue();
        boolean boolean7 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode10.deepCopy();
        boolean boolean15 = objectNode10.isBigInteger();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = objectNode10.traverse(objectCodec16);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode10.remove((java.util.Collection<java.lang.String>) strList20);
        int int23 = objectNode22.size();
        boolean boolean24 = objectNode22.isValueNode();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode1._put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode22);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode28.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode28.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode28.findPath("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        int int37 = objectNode35.asInt((int) 'a');
        boolean boolean38 = objectNode35.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode40.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = objectNode40.findParents("");
        double double44 = objectNode40.asDouble();
        int int45 = objectNode40.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode40.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory47 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory47);
        double double49 = objectNode48.asDouble();
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = objectNode48.retain((java.util.Collection<java.lang.String>) strList52);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = objectNode46.retain((java.util.Collection<java.lang.String>) strList52);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode35.without((java.util.Collection<java.lang.String>) strList52);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode28.without((java.util.Collection<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList58 = objectNode25.findValuesAsText("{}", (java.util.List<java.lang.String>) strList52);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectNode41);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectNode54);
        org.junit.Assert.assertNotNull(objectNode55);
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = objectNode2.iterator();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = objectNode2.numberType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        boolean boolean9 = objectNode8.isBoolean();
        boolean boolean10 = objectNode8.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode8.deepCopy();
        double double12 = objectNode8.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode8.path("");
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode8.findValue("");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = objectNode8.findValuesAsText("", (java.util.List<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode2.remove((java.util.Collection<java.lang.String>) strList20);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        boolean boolean27 = objectNode26.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        boolean boolean32 = objectNode31.isBoolean();
        boolean boolean33 = objectNode31.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode26.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        boolean boolean35 = objectNode31.isBigInteger();
        float float36 = objectNode31.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType37 = objectNode31.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode2.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap39 = objectNode2._children;
        java.lang.Number number40 = objectNode2.numberValue();
        java.util.Iterator<java.lang.String> strItor41 = objectNode2.fieldNames();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + jsonNodeType37 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType37.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(number40);
        org.junit.Assert.assertNotNull(strItor41);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        java.lang.String str7 = objectNode1.asText();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = objectNode1.asToken();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode10.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode10.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode10.path((int) (short) 10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode18.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode18.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode18.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode25.removeAll();
        boolean boolean27 = objectNode26.isBoolean();
        boolean boolean28 = objectNode26.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode26.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode26.findValues("");
        boolean boolean32 = objectNode26.isInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode18._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode26);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode10.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode26);
        boolean boolean35 = objectNode26.isLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode1.putAll(objectNode26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        boolean boolean39 = objectNode38.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode42.removeAll();
        boolean boolean44 = objectNode43.isBoolean();
        boolean boolean45 = objectNode43.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode38.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode43);
        boolean boolean47 = objectNode38.isTextual();
        int int49 = objectNode38.asInt(0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode52.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList55 = objectNode52.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory57);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode58.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList61 = objectNode58.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList62 = objectNode52.findParents("hi!", jsonNodeList61);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList64 = objectNode52.findValues("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList65 = objectNode38.findValues("", jsonNodeList64);
        java.lang.String[] strArray70 = new java.lang.String[] { "{\"hi!\":{}}", "{}", "", "{}" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = objectNode38.retain(strArray70);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode26.retain(strArray70);
        int int73 = objectNode72.intValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode75 = objectNode72.without("hi!");
        boolean boolean77 = objectNode72.hasNonNull("");
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(jsonNodeList55);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertNotNull(jsonNodeList61);
        org.junit.Assert.assertNotNull(jsonNodeList62);
        org.junit.Assert.assertNotNull(jsonNodeList64);
        org.junit.Assert.assertNotNull(jsonNodeList65);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "{\"hi!\":{}}", "{}", "", "{}" });
        org.junit.Assert.assertNotNull(objectNode71);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(jsonNode75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        int int8 = objectNode2.asInt();
        boolean boolean9 = objectNode2.isMissingNode();
        java.util.List<java.lang.String> strList11 = objectNode2.findValuesAsText("{\"hi!\":{}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode14.removeAll();
        boolean boolean16 = objectNode15.isBoolean();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode2._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode15);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken23 = objectNode19.asToken();
        java.lang.String str24 = objectNode19.asText();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor25 = objectNode19.iterator();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode27.removeAll();
        float float29 = objectNode27.floatValue();
        int int31 = objectNode27.asInt(100);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode27.retain(strArray33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode19.retain(strArray33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode15.retain(strArray33);
        boolean boolean37 = objectNode15.isBinary();
        short short38 = objectNode15.shortValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor39 = objectNode15.iterator();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectNode17);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(jsonNodeItor25);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 0 + "'", short38 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNodeItor39);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        boolean boolean9 = objectNode2.isValueNode();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode2.deepCopy();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor11 = objectNode10.fields();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = objectNode10.withArray("{\"hi!\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(strEntryItor11);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        boolean boolean4 = objectNode2.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode2.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode2.findValues("");
        boolean boolean8 = objectNode2.isInt();
        boolean boolean9 = objectNode2.isValueNode();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = objectNode2.numberType();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = objectNode2.traverse(objectCodec11);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNode15.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = objectNode20.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList23 = objectNode15.findValues("hi!", jsonNodeList22);
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator24 = jsonNodeList23.spliterator();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList25 = objectNode2.findParents("hi!", jsonNodeList23);
        double double27 = objectNode2.asDouble((double) 0.0f);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode30.removeAll();
        boolean boolean32 = objectNode31.isBoolean();
        boolean boolean33 = objectNode31.isArray();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode31.deepCopy();
        double double35 = objectNode31.asDouble();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList37 = objectNode31.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList38 = objectNode2.findValues("{\"hi!\":{}}", jsonNodeList37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        boolean boolean41 = objectNode40.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode44.removeAll();
        boolean boolean46 = objectNode45.isBoolean();
        boolean boolean47 = objectNode45.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = objectNode40.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode45);
        boolean boolean49 = objectNode40.isTextual();
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = objectNode40.at("");
        java.lang.Object obj52 = null;
        boolean boolean53 = objectNode40.equals(obj52);
        long long55 = objectNode40.asLong(0L);
        boolean boolean56 = objectNode2._childrenEqual(objectNode40);
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(numberType10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(objectNode16);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNotNull(jsonNodeList23);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator24);
        org.junit.Assert.assertNotNull(jsonNodeList25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList37);
        org.junit.Assert.assertNotNull(jsonNodeList38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jsonNode51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode7.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode7.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode1.findParents("hi!", jsonNodeList10);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode1.findValues("");
        double double14 = objectNode1.doubleValue();
        double double15 = objectNode1.doubleValue();
        java.math.BigDecimal bigDecimal16 = objectNode1.decimalValue();
        java.lang.String str17 = objectNode1.asText();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        boolean boolean7 = objectNode1.has("{\"hi!\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode9 = objectNode1.numberNode((byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.path((int) (short) 10);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap7 = objectNode1._children;
        short short8 = objectNode1.shortValue();
        boolean boolean9 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.without("{\"hi!\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode1.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        double double2 = objectNode1.asDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList5 = objectNode3.findValues("");
        byte[] byteArray6 = objectNode3.binaryValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode9.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = objectNode10.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode3.findParents("hi!", jsonNodeList12);
        byte[] byteArray14 = objectNode3.binaryValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.path("{\"\":{}}");
        boolean boolean17 = objectNode3.isBigInteger();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode19.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = objectNode19.findParents("");
        double double23 = objectNode19.asDouble();
        int int24 = objectNode19.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode19.removeAll();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        double double28 = objectNode27.asDouble();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode27.retain((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode25.retain((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode3.without((java.util.Collection<java.lang.String>) strList31);
        boolean boolean36 = objectNode3.isShort();
        long long37 = objectNode3.longValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonNodeList5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNotNull(jsonNodeList12);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = objectNode1.asToken();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = objectNode1.fields();
        double double7 = objectNode1.asDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = objectNode1.putArray("{\"{\\\"hi!\\\":{}}\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        float float3 = objectNode1.floatValue();
        int int5 = objectNode1.asInt(100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = objectNode1.findParents("hi!");
        long long9 = objectNode1.asLong((long) (short) -1);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = objectNode1.asToken();
        int int11 = objectNode1.intValue();
        boolean boolean12 = objectNode1.isIntegralNumber();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        boolean boolean3 = objectNode2.isBoolean();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor4 = objectNode2.iterator();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType5 = objectNode2.numberType();
        long long6 = objectNode2.longValue();
        boolean boolean7 = objectNode2.isFloatingPointNumber();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode2.objectNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor4);
        org.junit.Assert.assertNull(numberType5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.path("hi!");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor5 = objectNode1.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode8.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList11 = objectNode8.findParents("");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode8.path((int) (short) 10);
        boolean boolean14 = jsonNode13.isFloat();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = jsonNode13.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode1.findParents("", jsonNodeList16);
        boolean boolean18 = objectNode1.isBoolean();
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(strEntryItor5);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNotNull(jsonNodeList11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectNode1.removeAll();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList4 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNode6.removeAll();
        float float8 = objectNode6.floatValue();
        boolean boolean9 = objectNode6.isFloat();
        boolean boolean10 = objectNode1.equals((java.lang.Object) boolean9);
        long long11 = objectNode1.asLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode1.findValue("hi!");
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.BinaryNode binaryNode20 = objectNode1.binaryNode(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNode2);
        org.junit.Assert.assertNotNull(jsonNodeList4);
        org.junit.Assert.assertNotNull(objectNode7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 100 });
    }
}

