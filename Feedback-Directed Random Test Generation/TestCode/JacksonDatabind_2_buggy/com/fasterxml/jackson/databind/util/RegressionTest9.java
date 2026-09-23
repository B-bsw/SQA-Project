package com.fasterxml.jackson.databind.util;

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
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer5.asParser(objectCodec16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = tokenBuffer5.canUseSchema(formatSchema18);
        tokenBuffer5._generatorFeatures = 0;
        tokenBuffer5.writeNumber((int) (short) 100);
        tokenBuffer5.writeEndArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        boolean boolean27 = tokenBuffer26._hasNativeTypeIds;
        tokenBuffer26.writeFieldName("");
        int int30 = tokenBuffer26.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = tokenBuffer26.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer26.setFeatureMask((-1));
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonGenerator33.setPrettyPrinter(prettyPrinter34);
        jsonGenerator35.writeNumberField("hi!", (double) '4');
        tokenBuffer5.writeObject((java.lang.Object) '4');
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = tokenBuffer5.setCodec(objectCodec40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        tokenBuffer43._objectCodec = objectCodec44;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = tokenBuffer43._objectCodec;
        boolean boolean47 = tokenBuffer43._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = tokenBuffer5.append(tokenBuffer43);
        tokenBuffer48._generatorFeatures = 0;
        tokenBuffer48._hasNativeObjectIds = false;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 79 + "'", int30 == 79);
        org.junit.Assert.assertNull(formatSchema31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertNull(objectCodec46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tokenBuffer48);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        tokenBuffer8.writeStartArray(6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        tokenBuffer2.writeNumber((double) 16);
        int int6 = tokenBuffer2.getFeatureMask();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec7);
        boolean boolean9 = tokenBuffer8._hasNativeTypeIds;
        tokenBuffer8.close();
        tokenBuffer8.writeNumberField("hi!", (long) (short) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        tokenBuffer8._objectCodec = objectCodec14;
        tokenBuffer2._objectId = objectCodec14;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer2.setHighestNonEscapedChar(0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = tokenBuffer2._first;
        tokenBuffer2.writeNumber(4);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(segment19);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer5.asParser(objectCodec16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = tokenBuffer5.canUseSchema(formatSchema18);
        tokenBuffer5._generatorFeatures = 0;
        tokenBuffer5.writeNumber((int) (short) 100);
        tokenBuffer5.writeEndArray();
        tokenBuffer5._hasNativeTypeIds = false;
        boolean boolean27 = tokenBuffer5._hasNativeTypeIds;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.getCurrentToken();
        int int11 = parser4.getFeatureMask();
        boolean boolean12 = parser4.hasTextCharacters();
        double double13 = parser4.getValueAsDouble();
        parser4._closed = false;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = tokenBuffer1.append(tokenBuffer10);
        boolean boolean12 = tokenBuffer1.canOmitFields();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer14.writeFieldName("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer14.setHighestNonEscapedChar(32);
        tokenBuffer1._objectId = 32;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext24 = tokenBuffer1._writeContext;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(tokenBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(jsonWriteContext24);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        boolean boolean7 = parser4.hasTextCharacters();
        boolean boolean8 = parser4._hasNativeIds;
        java.io.OutputStream outputStream9 = null;
        int int10 = parser4.releaseBuffered(outputStream9);
        boolean boolean11 = parser4.canReadObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment12, objectCodec13, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = parser16.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser16._segment = segment18;
        java.lang.Object obj21 = segment18.findTypeId(16);
        java.lang.Object obj23 = segment18.findObjectId((int) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment18, objectCodec24);
        parser4._segment = segment18;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = parser4._codec;
        boolean boolean28 = parser4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = parser4.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(objectCodec27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        int int8 = parser4.getCurrentTokenId();
        int int10 = parser4.getValueAsInt((int) (byte) 10);
        boolean boolean11 = parser4.canReadObjectId();
        boolean boolean12 = parser4.requiresCustomCodec();
        java.lang.Boolean boolean13 = parser4.nextBooleanValue();
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = parser4.getSchema();
        com.fasterxml.jackson.core.Version version15 = parser4.version();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = parser4.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(formatSchema14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        int int7 = tokenBuffer1._appendAt;
        tokenBuffer1.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = tokenBuffer1.setCodec(objectCodec10);
        tokenBuffer1.writeNumberField("hi!", (long) (-1));
        tokenBuffer1.writeBoolean(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        boolean boolean19 = tokenBuffer18._hasNativeTypeIds;
        tokenBuffer18.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = tokenBuffer18.getOutputContext();
        boolean boolean22 = tokenBuffer18.canWriteBinaryNatively();
        tokenBuffer18.writeNumberField("[TokenBuffer: ]", (long) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser30 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment26, objectCodec27, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = parser30.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment32 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser30._segment = segment32;
        java.lang.Object obj35 = segment32.findTypeId(16);
        java.lang.Object obj37 = segment32.findObjectId((int) ' ');
        java.lang.Object[] objArray38 = segment32._tokens;
        boolean boolean39 = segment32.hasIds();
        segment32._tokenTypes = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer44 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec43);
        boolean boolean45 = tokenBuffer44._hasNativeTypeIds;
        tokenBuffer44.writeFieldName("");
        int int48 = tokenBuffer44.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = tokenBuffer44.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = tokenBuffer44.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer53 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec52);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer54 = tokenBuffer44.append(tokenBuffer53);
        com.fasterxml.jackson.core.JsonToken jsonToken55 = tokenBuffer44.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = segment32.append(100, jsonToken55);
        tokenBuffer18.writeTypeId((java.lang.Object) segment56);
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer60 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec58, true);
        com.fasterxml.jackson.core.JsonParser jsonParser61 = tokenBuffer60.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment62 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser66 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment62, objectCodec63, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema67 = parser66.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser66._segment = segment68;
        com.fasterxml.jackson.core.JsonToken jsonToken70 = parser66.getLastClearedToken();
        tokenBuffer60.writeTypeId((java.lang.Object) parser66);
        com.fasterxml.jackson.core.TreeNode treeNode72 = null;
        tokenBuffer60.writeTree(treeNode72);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer74 = tokenBuffer18.append(tokenBuffer60);
        tokenBuffer60.writeEndArray();
        com.fasterxml.jackson.core.JsonParser jsonParser76 = tokenBuffer60.asParser();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter77 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator78 = tokenBuffer60.setPrettyPrinter(prettyPrinter77);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer79 = tokenBuffer1.append(tokenBuffer60);
        com.fasterxml.jackson.core.FormatSchema formatSchema80 = tokenBuffer60.getSchema();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(formatSchema31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 79 + "'", int48 == 79);
        org.junit.Assert.assertNull(formatSchema49);
        org.junit.Assert.assertNotNull(jsonGenerator51);
        org.junit.Assert.assertNotNull(tokenBuffer54);
        org.junit.Assert.assertTrue("'" + jsonToken55 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken55.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment56);
        org.junit.Assert.assertNotNull(jsonParser61);
        org.junit.Assert.assertNull(formatSchema67);
        org.junit.Assert.assertNull(jsonToken70);
        org.junit.Assert.assertNotNull(tokenBuffer74);
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertNotNull(jsonGenerator78);
        org.junit.Assert.assertNotNull(tokenBuffer79);
        org.junit.Assert.assertNull(formatSchema80);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._closed;
        int int8 = parser4.getTextOffset();
        boolean boolean10 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        boolean boolean12 = tokenBuffer11.canWriteObjectId();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec3, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = tokenBuffer5._last;
        tokenBuffer1._objectId = tokenBuffer5;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = tokenBuffer1.firstToken();
        boolean boolean9 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.SerializableString serializableString10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeFieldName(serializableString10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(prettyPrinter2);
        org.junit.Assert.assertNotNull(segment6);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.String str8 = parser4.getCurrentName();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean19 = tokenBuffer14._hasNativeId;
        int int20 = tokenBuffer14._appendAt;
        tokenBuffer14.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = tokenBuffer14.useDefaultPrettyPrinter();
        tokenBuffer1._typeId = tokenBuffer14;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter27 = tokenBuffer26.getPrettyPrinter();
        tokenBuffer26.writeFieldName("");
        tokenBuffer1.writeObjectId((java.lang.Object) "");
        tokenBuffer1.writeStringField("[TokenBuffer: VALUE_NULL]", "[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_EMBEDDED_OBJECT]");
        tokenBuffer1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNull(prettyPrinter27);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer1.writeBinary(byteArray6);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer1._writeContext;
        java.math.BigDecimal bigDecimal11 = null;
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL]", bigDecimal11);
        boolean boolean13 = tokenBuffer1.isClosed();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = tokenBuffer1.asParser(objectCodec14);
        tokenBuffer1.writeNumber((short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        boolean boolean7 = tokenBuffer1._hasNativeTypeIds;
        java.lang.Object obj8 = null;
        tokenBuffer1.writeObject(obj8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = tokenBuffer1._objectCodec;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer1.setFeatureMask(7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectCodec10);
        org.junit.Assert.assertNotNull(jsonGenerator12);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1.writeNumberField("[TokenBuffer: ]", (long) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = parser13.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser13._segment = segment15;
        java.lang.Object obj18 = segment15.findTypeId(16);
        java.lang.Object obj20 = segment15.findObjectId((int) ' ');
        java.lang.Object[] objArray21 = segment15._tokens;
        boolean boolean22 = segment15.hasIds();
        segment15._tokenTypes = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        boolean boolean28 = tokenBuffer27._hasNativeTypeIds;
        tokenBuffer27.writeFieldName("");
        int int31 = tokenBuffer27.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = tokenBuffer27.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer27.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = tokenBuffer27.append(tokenBuffer36);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = tokenBuffer27.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = segment15.append(100, jsonToken38);
        tokenBuffer1.writeTypeId((java.lang.Object) segment39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41, true);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = tokenBuffer43.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = parser49.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser49._segment = segment51;
        com.fasterxml.jackson.core.JsonToken jsonToken53 = parser49.getLastClearedToken();
        tokenBuffer43.writeTypeId((java.lang.Object) parser49);
        com.fasterxml.jackson.core.TreeNode treeNode55 = null;
        tokenBuffer43.writeTree(treeNode55);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = tokenBuffer1.append(tokenBuffer43);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter58 = tokenBuffer57.getPrettyPrinter();
        tokenBuffer57.writeNumberField("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]", (float) 4L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(formatSchema14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 79 + "'", int31 == 79);
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNotNull(tokenBuffer37);
        org.junit.Assert.assertTrue("'" + jsonToken38 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken38.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment39);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNull(formatSchema50);
        org.junit.Assert.assertNull(jsonToken53);
        org.junit.Assert.assertNotNull(tokenBuffer57);
        org.junit.Assert.assertNull(prettyPrinter58);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        tokenBuffer5._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        tokenBuffer9._objectCodec = objectCodec10;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer13.writeBinary(byteArray18);
        tokenBuffer9._typeId = tokenBuffer13;
        boolean boolean21 = tokenBuffer13.isClosed();
        tokenBuffer5.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer13);
        java.lang.Object obj23 = tokenBuffer13.getOutputTarget();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer13);
        boolean boolean25 = tokenBuffer13._mayHaveNativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        tokenBuffer27._objectCodec = objectCodec28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        boolean boolean32 = tokenBuffer31._hasNativeTypeIds;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer31.writeBinary(byteArray36);
        tokenBuffer27._typeId = tokenBuffer31;
        boolean boolean39 = tokenBuffer31.isClosed();
        tokenBuffer13.writeObjectId((java.lang.Object) tokenBuffer31);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment41 = tokenBuffer13._first;
        com.fasterxml.jackson.core.JsonToken jsonToken43 = segment41.type((int) '4');
        boolean boolean44 = segment41.hasIds();
        boolean boolean45 = segment41.hasIds();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(segment41);
        org.junit.Assert.assertNull(jsonToken43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment5, objectCodec6, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser9.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser9._segment = segment11;
        tokenBuffer2.writeObjectField("", (java.lang.Object) segment11);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer2._last;
        tokenBuffer2.writeBooleanField("[TokenBuffer: ]", false);
        tokenBuffer2._closed = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer2._first;
        tokenBuffer2.writeNumber("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertNotNull(segment20);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        tokenBuffer5._objectCodec = objectCodec6;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        boolean boolean10 = tokenBuffer9._hasNativeTypeIds;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer9.writeBinary(byteArray14);
        tokenBuffer5._typeId = tokenBuffer9;
        boolean boolean17 = tokenBuffer9.isClosed();
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer9);
        java.lang.Object obj19 = tokenBuffer9.getOutputTarget();
        tokenBuffer9.writeStartObject();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = tokenBuffer9.getOutputContext();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        boolean boolean16 = tokenBuffer15._hasNativeTypeIds;
        tokenBuffer15.writeFieldName("");
        int int19 = tokenBuffer15.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = tokenBuffer15.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer15.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = tokenBuffer15.append(tokenBuffer24);
        com.fasterxml.jackson.core.JsonToken jsonToken26 = tokenBuffer15.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = parser31.getSchema();
        boolean boolean33 = parser31._hasNativeObjectIds;
        long long35 = parser31.getValueAsLong((long) (byte) 1);
        parser31._closed = true;
        boolean boolean39 = parser31.getValueAsBoolean(true);
        int int40 = parser31.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken41 = parser31.getCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation42 = parser31.getCurrentLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken43 = parser31.peekNextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser48 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment44, objectCodec45, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = parser48.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment50 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser48._segment = segment50;
        java.lang.Boolean boolean52 = parser48.nextBooleanValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = segment6.append((int) ' ', jsonToken26, (java.lang.Object) parser31, (java.lang.Object) boolean52);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser60 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment56, objectCodec57, true, true);
        int int62 = parser60.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken63 = parser60.peekNextToken();
        int int64 = parser60.getCurrentTokenId();
        int int66 = parser60.getValueAsInt((int) (byte) 10);
        boolean boolean67 = parser60.canReadObjectId();
        java.lang.String str68 = parser60.getCurrentName();
        boolean boolean69 = parser60._hasNativeIds;
        parser60.overrideCurrentName("[TokenBuffer: ]");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment72 = segment53.appendRaw(100, 2, (java.lang.Object) parser60);
        java.lang.Object obj73 = parser60.getEmbeddedObject();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(tokenBuffer25);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(jsonToken41);
        org.junit.Assert.assertNotNull(jsonLocation42);
        org.junit.Assert.assertNull(jsonToken43);
        org.junit.Assert.assertNull(formatSchema49);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(segment53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertNull(jsonToken63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(segment72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        tokenBuffer1.writeNumberField("", (double) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        boolean boolean10 = tokenBuffer9._hasNativeId;
        tokenBuffer1._objectId = tokenBuffer9;
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer9.writeNumber(bigInteger12);
        tokenBuffer9._hasNativeId = true;
        tokenBuffer9._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        boolean boolean20 = tokenBuffer19._hasNativeTypeIds;
        tokenBuffer19.writeFieldName("");
        int int23 = tokenBuffer19.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = tokenBuffer19.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = tokenBuffer19.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec27);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = tokenBuffer19.append(tokenBuffer28);
        java.lang.Object obj30 = tokenBuffer28._objectId;
        tokenBuffer28.flush();
        tokenBuffer28.flush();
        tokenBuffer28.writeFieldName("[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_EMBEDDED_OBJECT]");
        java.math.BigDecimal bigDecimal36 = null;
        tokenBuffer28.writeNumberField("[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_EMBEDDED_OBJECT]", bigDecimal36);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = tokenBuffer9.append(tokenBuffer28);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = tokenBuffer38.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = tokenBuffer38.setFeatureMask(16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 79 + "'", int23 == 79);
        org.junit.Assert.assertNull(formatSchema24);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(tokenBuffer29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(tokenBuffer38);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(jsonGenerator41);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec3);
        boolean boolean5 = tokenBuffer4._hasNativeTypeIds;
        tokenBuffer4._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer4.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = tokenBuffer4.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = null;
        boolean boolean14 = tokenBuffer4.canUseSchema(formatSchema13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = tokenBuffer17._first;
        tokenBuffer4.writeObject((java.lang.Object) segment18);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = tokenBuffer1.append(tokenBuffer4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        boolean boolean23 = tokenBuffer22._hasNativeTypeIds;
        tokenBuffer22._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        int int27 = tokenBuffer22.getFeatureMask();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = tokenBuffer22._last;
        boolean boolean29 = tokenBuffer22._hasNativeObjectIds;
        tokenBuffer20._objectId = boolean29;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = tokenBuffer20._last;
        java.lang.Object obj33 = segment31.findObjectId(7);
        boolean boolean34 = segment31.hasIds();
        org.junit.Assert.assertNull(prettyPrinter2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(characterEscapes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(segment18);
        org.junit.Assert.assertNotNull(tokenBuffer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 79 + "'", int27 == 79);
        org.junit.Assert.assertNotNull(segment28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(segment31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        java.lang.Object obj15 = segment6.findObjectId(10);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap16 = null;
        segment6._nativeIds = intMap16;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        tokenBuffer19._objectCodec = objectCodec20;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema27 = parser26.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser26._segment = segment28;
        java.lang.Object obj31 = segment28.findTypeId(16);
        java.lang.Object obj33 = segment28.findObjectId((int) ' ');
        java.lang.Object[] objArray34 = segment28._tokens;
        boolean boolean35 = segment28.hasIds();
        tokenBuffer19._first = segment28;
        segment6._next = segment28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser41 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment28, objectCodec38, true, false);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(formatSchema27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        boolean boolean16 = tokenBuffer5.canWriteObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = tokenBuffer5._last;
        java.lang.Object obj18 = tokenBuffer5._objectId;
        java.math.BigDecimal bigDecimal20 = null;
        tokenBuffer5.writeNumberField("[TokenBuffer: VALUE_STRING, VALUE_NUMBER_INT]", bigDecimal20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(segment17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        boolean boolean8 = parser4._hasNativeObjectIds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = parser4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = tokenBuffer2.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser8._segment = segment10;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser8.getLastClearedToken();
        tokenBuffer2.writeTypeId((java.lang.Object) parser8);
        boolean boolean14 = parser8.requiresCustomCodec();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = parser19.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser19._segment = segment21;
        java.lang.Object obj24 = segment21.findTypeId((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec25);
        com.fasterxml.jackson.core.Version version27 = parser26.version();
        boolean boolean28 = parser26._closed;
        com.fasterxml.jackson.core.JsonLocation jsonLocation29 = parser26.getCurrentLocation();
        parser8._location = jsonLocation29;
        long long31 = parser8.getValueAsLong();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonLocation29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        parser4._segmentPtr = (short) 100;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder10 = parser4._byteBuilder;
        int int11 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser4.nextToken();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.nextValue();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(byteArrayBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.getLastClearedToken();
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadTypeId();
        int int12 = parser4.nextIntValue((-1));
        com.fasterxml.jackson.core.JsonParser jsonParser14 = parser4.setFeatureMask((int) (short) 10);
        double double15 = jsonParser14.getValueAsDouble();
        long long16 = jsonParser14.getValueAsLong();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = tokenBuffer1.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = tokenBuffer1.getSchema();
        tokenBuffer1.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext17 = tokenBuffer14.getOutputContext();
        boolean boolean18 = tokenBuffer14.canWriteBinaryNatively();
        tokenBuffer14._appendAt = 79;
        tokenBuffer14._closed = false;
        boolean boolean23 = tokenBuffer14._hasNativeId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        tokenBuffer25._objectCodec = objectCodec26;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        boolean boolean30 = tokenBuffer29._hasNativeTypeIds;
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer29.writeBinary(byteArray34);
        tokenBuffer25._typeId = tokenBuffer29;
        tokenBuffer29.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = tokenBuffer29.asParser(objectCodec40);
        com.fasterxml.jackson.core.SerializableString serializableString42 = null;
        tokenBuffer29.writeString(serializableString42);
        com.fasterxml.jackson.core.JsonToken jsonToken44 = tokenBuffer29.firstToken();
        tokenBuffer14._append(jsonToken44);
        boolean boolean46 = tokenBuffer14.canWriteObjectId();
        tokenBuffer1._appendRaw(97, (java.lang.Object) tokenBuffer14);
        int int48 = tokenBuffer14._generatorFeatures;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(characterEscapes9);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertTrue("'" + jsonToken44 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken44.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 79 + "'", int48 == 79);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        boolean boolean12 = parser4.getValueAsBoolean(true);
        int int13 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation15 = parser4.getCurrentLocation();
        boolean boolean17 = parser4.getValueAsBoolean(false);
        char[] charArray18 = parser4.getTextCharacters();
        com.fasterxml.jackson.core.Version version19 = parser4.version();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNotNull(jsonLocation15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(version19);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        java.io.OutputStream outputStream10 = null;
        int int11 = parser4.releaseBuffered(outputStream10);
        int int12 = parser4.getCurrentTokenId();
        boolean boolean13 = parser4.requiresCustomCodec();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer1.writeBinary(byteArray6);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser14 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec11, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = parser14.getSchema();
        boolean boolean16 = parser14._hasNativeObjectIds;
        long long18 = parser14.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = null;
        parser14._location = jsonLocation19;
        com.fasterxml.jackson.core.JsonLocation jsonLocation21 = parser14.getTokenLocation();
        tokenBuffer1._appendRaw(3, (java.lang.Object) jsonLocation21);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext23 = tokenBuffer1._writeContext;
        tokenBuffer1.writeBooleanField("[TokenBuffer: VALUE_NULL, END_OBJECT, FIELD_NAME([TokenBuffer: ]), VALUE_STRING]", false);
        com.fasterxml.jackson.core.SerializableString serializableString27 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw(serializableString27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertNull(formatSchema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(jsonLocation21);
        org.junit.Assert.assertNotNull(jsonWriteContext23);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean19 = tokenBuffer14._hasNativeId;
        int int20 = tokenBuffer14._appendAt;
        tokenBuffer14.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = tokenBuffer14.useDefaultPrettyPrinter();
        tokenBuffer1._typeId = tokenBuffer14;
        boolean boolean25 = tokenBuffer14.canOmitFields();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        boolean boolean13 = parser4.hasTextCharacters();
        boolean boolean14 = parser4.canReadTypeId();
        char[] charArray15 = parser4.getTextCharacters();
        boolean boolean16 = parser4.getValueAsBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = parser4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        parser4._location = jsonLocation9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        int int13 = parser4.getValueAsInt();
        int int14 = parser4.getTextLength();
        boolean boolean15 = parser4.canReadTypeId();
        java.io.Writer writer16 = null;
        int int17 = parser4.releaseBuffered(writer16);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment18, objectCodec19, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = parser22.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser22._segment = segment24;
        com.fasterxml.jackson.core.JsonToken jsonToken26 = parser22.getLastClearedToken();
        boolean boolean28 = parser22.getValueAsBoolean(true);
        boolean boolean29 = parser22._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonParser jsonParser31 = parser22.setFeatureMask((int) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        parser22.setCodec(objectCodec32);
        com.fasterxml.jackson.core.JsonLocation jsonLocation34 = parser22.getCurrentLocation();
        parser4._location = jsonLocation34;
        java.lang.Boolean boolean36 = parser4.nextBooleanValue();
        boolean boolean37 = parser4._closed;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertNull(jsonToken26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonLocation34);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = tokenBuffer1._objectCodec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = tokenBuffer1._last;
        tokenBuffer1.writeBooleanField("hi!", true);
        boolean boolean9 = tokenBuffer1.canWriteTypeId();
        org.junit.Assert.assertNull(objectCodec4);
        org.junit.Assert.assertNotNull(segment5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        tokenBuffer5._objectCodec = objectCodec6;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        boolean boolean10 = tokenBuffer9._hasNativeTypeIds;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer9.writeBinary(byteArray14);
        tokenBuffer5._typeId = tokenBuffer9;
        boolean boolean17 = tokenBuffer9.isClosed();
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer9);
        java.math.BigDecimal bigDecimal20 = null;
        tokenBuffer1.writeNumberField("hi!", bigDecimal20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes22 = tokenBuffer1.getCharacterEscapes();
        boolean boolean23 = tokenBuffer1._mayHaveNativeIds;
        java.math.BigInteger bigInteger24 = null;
        tokenBuffer1.writeNumber(bigInteger24);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(characterEscapes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = tokenBuffer1._objectCodec;
        boolean boolean5 = tokenBuffer1._closed;
        tokenBuffer1.writeStartArray((int) (byte) -1);
        tokenBuffer1.writeNumber((float) 100);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer1.configure(feature10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectCodec4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        int int8 = parser4.getCurrentTokenId();
        int int10 = parser4.getValueAsInt((int) (byte) 10);
        boolean boolean11 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = parser4.getTokenLocation();
        boolean boolean13 = parser4._closed;
        com.fasterxml.jackson.core.Version version14 = parser4.version();
        boolean boolean15 = parser4.getValueAsBoolean();
        boolean boolean16 = parser4.requiresCustomCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        // The following exception was thrown during execution in test generation
        try {
            parser4.setSchema(formatSchema17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        boolean boolean12 = parser4.getValueAsBoolean(true);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.getLastClearedToken();
        boolean boolean14 = parser4._hasNativeIds;
        int int15 = parser4.getTextLength();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext16 = parser4._parsingContext;
        boolean boolean17 = parser4.getValueAsBoolean();
        java.lang.Boolean boolean18 = parser4.nextBooleanValue();
        int int19 = parser4.getTextLength();
        // The following exception was thrown during execution in test generation
        try {
            byte byte20 = parser4.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonReadContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.getLastClearedToken();
        java.lang.String str9 = parser4.getText();
        double double10 = parser4.getValueAsDouble();
        java.lang.String str11 = parser4.nextTextValue();
        java.lang.Object obj12 = parser4.getObjectId();
        int int13 = parser4._segmentPtr;
        int int14 = parser4.getTextOffset();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = tokenBuffer1.append(tokenBuffer10);
        int int12 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = tokenBuffer1.setPrettyPrinter(prettyPrinter13);
        com.fasterxml.jackson.core.Version version15 = tokenBuffer1.version();
        tokenBuffer1.writeEndObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(tokenBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNotNull(version15);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        parser4._location = jsonLocation9;
        java.lang.Object obj11 = parser4.getEmbeddedObject();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder12 = parser4._byteBuilder;
        java.lang.String str13 = parser4.getCurrentName();
        int int14 = parser4.getTextOffset();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(byteArrayBuilder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        boolean boolean10 = segment6.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = segment6._next;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec12, true, false);
        java.lang.String str16 = parser15.nextTextValue();
        java.lang.Object obj17 = parser15.getTypeId();
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser15.getSchema();
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = parser15.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = parser24.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser24._segment = segment26;
        java.lang.Object obj29 = segment26.findTypeId(16);
        java.lang.Object obj31 = segment26.findObjectId((int) ' ');
        java.lang.Object[] objArray32 = segment26._tokens;
        boolean boolean33 = segment26.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser35 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment26, objectCodec34);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        boolean boolean37 = parser35.nextFieldName(serializableString36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser42 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment38, objectCodec39, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema43 = parser42.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser42._segment = segment44;
        java.lang.Object obj47 = segment44.findTypeId((int) (byte) 0);
        parser35._segment = segment44;
        java.lang.Object obj50 = segment44.findObjectId((int) (byte) 0);
        parser15._segment = segment44;
        parser15.close();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(segment11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertNotNull(jsonLocation19);
        org.junit.Assert.assertNull(formatSchema25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(formatSchema43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._generatorFeatures = (byte) -1;
        boolean boolean4 = tokenBuffer1._closed;
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumberField("", bigDecimal6);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment8, objectCodec9, false, true);
        long long13 = segment8._tokenTypes;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 197L + "'", long13 == 197L);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        int int8 = parser4.getCurrentTokenId();
        int int10 = parser4.getValueAsInt((int) (byte) 10);
        boolean boolean11 = parser4.canReadObjectId();
        boolean boolean12 = parser4.requiresCustomCodec();
        boolean boolean13 = parser4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.getLastClearedToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = null;
        parser4._byteBuilder = byteArrayBuilder15;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = parser4.getCodec();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        parser4.setCodec(objectCodec18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(objectCodec17);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = tokenBuffer1._first;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = segment4.type(97);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema12 = parser11.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser11._segment = segment13;
        java.lang.Object obj16 = segment13.findTypeId(16);
        java.lang.Object obj18 = segment13.findObjectId((int) ' ');
        java.lang.Object[] objArray19 = segment13._tokens;
        boolean boolean20 = segment13.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec21);
        segment4._next = segment13;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec24);
        parser25._closed = true;
        org.junit.Assert.assertNotNull(segment4);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNull(formatSchema12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        boolean boolean11 = parser4.getValueAsBoolean();
        double double12 = parser4.getValueAsDouble();
        char[] charArray13 = parser4.getTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.nextToken();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = parser4.peekNextToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = null;
        parser4._byteBuilder = byteArrayBuilder16;
        java.lang.String str19 = parser4.getValueAsString("[TokenBuffer: VALUE_NULL]");
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[TokenBuffer: VALUE_NULL]" + "'", str19, "[TokenBuffer: VALUE_NULL]");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._hasNativeIds;
        com.fasterxml.jackson.core.SerializableString serializableString8 = null;
        boolean boolean9 = parser4.nextFieldName(serializableString8);
        boolean boolean10 = parser4.hasTextCharacters();
        boolean boolean11 = parser4.hasCurrentToken();
        boolean boolean12 = parser4.isExpectedStartArrayToken();
        java.lang.String str13 = parser4.getValueAsString();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        parser4._location = jsonLocation9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext13 = parser4._parsingContext;
        java.io.Writer writer14 = null;
        int int15 = parser4.releaseBuffered(writer14);
        java.lang.String str17 = parser4.getValueAsString("hi!");
        com.fasterxml.jackson.core.Version version18 = parser4.version();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonReadContext13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(version18);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        parser4.close();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.nextValue();
        java.lang.String str8 = parser4.getCurrentName();
        java.lang.String str9 = parser4.nextTextValue();
        java.lang.Object obj10 = parser4.getInputSource();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = parser15.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser15._segment = segment17;
        java.lang.Object obj20 = segment17.findTypeId(16);
        java.lang.Object obj22 = segment17.findObjectId((int) ' ');
        java.lang.Object[] objArray23 = segment17._tokens;
        boolean boolean24 = segment17.hasIds();
        segment17._tokenTypes = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        boolean boolean30 = tokenBuffer29._hasNativeTypeIds;
        tokenBuffer29.writeFieldName("");
        int int33 = tokenBuffer29.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema34 = tokenBuffer29.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = tokenBuffer29.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = tokenBuffer29.append(tokenBuffer38);
        com.fasterxml.jackson.core.JsonToken jsonToken40 = tokenBuffer29.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment41 = segment17.append(100, jsonToken40);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = segment17._next;
        parser4._segment = segment17;
        segment17._tokenTypes = 52;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(formatSchema16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 79 + "'", int33 == 79);
        org.junit.Assert.assertNull(formatSchema34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(tokenBuffer39);
        org.junit.Assert.assertTrue("'" + jsonToken40 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken40.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment41);
        org.junit.Assert.assertNotNull(segment42);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeBoolean(false);
        boolean boolean15 = tokenBuffer5._closed;
        tokenBuffer5.writeBoolean(false);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = tokenBuffer5.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser23 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment19, objectCodec20, true, true);
        boolean boolean24 = parser23.requiresCustomCodec();
        com.fasterxml.jackson.core.SerializableString serializableString25 = null;
        boolean boolean26 = parser23.nextFieldName(serializableString25);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = parser23.setFeatureMask(3);
        com.fasterxml.jackson.core.SerializableString serializableString29 = null;
        boolean boolean30 = jsonParser28.nextFieldName(serializableString29);
        tokenBuffer5.writeObjectId((java.lang.Object) serializableString29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer33 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec32);
        boolean boolean34 = tokenBuffer33._hasNativeTypeIds;
        tokenBuffer33.writeFieldName("");
        int int37 = tokenBuffer33.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema38 = tokenBuffer33.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = tokenBuffer33.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = tokenBuffer33.append(tokenBuffer42);
        int int44 = tokenBuffer33._appendAt;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = tokenBuffer33.setPrettyPrinter(prettyPrinter45);
        tokenBuffer5.writeObject((java.lang.Object) tokenBuffer33);
        com.fasterxml.jackson.core.SerializableString serializableString48 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer33.writeFieldName(serializableString48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 79 + "'", int37 == 79);
        org.junit.Assert.assertNull(formatSchema38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(tokenBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator46);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = tokenBuffer1._objectCodec;
        boolean boolean5 = tokenBuffer1._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = tokenBuffer1._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        boolean boolean11 = tokenBuffer10._hasNativeTypeIds;
        tokenBuffer10.writeFieldName("");
        int int14 = tokenBuffer10.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = tokenBuffer10.getSchema();
        boolean boolean16 = tokenBuffer10._hasNativeTypeIds;
        java.lang.Object obj17 = null;
        tokenBuffer10.writeObject(obj17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = tokenBuffer10._objectCodec;
        com.fasterxml.jackson.core.Version version20 = tokenBuffer10.version();
        com.fasterxml.jackson.core.Version version21 = tokenBuffer10.version();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = segment6.appendRaw((int) (short) 100, (int) (byte) 1, (java.lang.Object) version21);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser29 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment25, objectCodec26, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = parser29.getSchema();
        parser29.close();
        com.fasterxml.jackson.core.JsonToken jsonToken32 = parser29.nextValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext33 = parser29._parsingContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment34 = segment22.appendRaw((int) (short) -1, 6, (java.lang.Object) parser29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectCodec4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(segment6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertNull(formatSchema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectCodec19);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(segment22);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNull(jsonToken32);
        org.junit.Assert.assertNotNull(jsonReadContext33);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment5, objectCodec6, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser9.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser9._segment = segment11;
        tokenBuffer2.writeObjectField("", (java.lang.Object) segment11);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = tokenBuffer2.useDefaultPrettyPrinter();
        boolean boolean15 = tokenBuffer2.canWriteObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec17, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema21 = parser20.getSchema();
        boolean boolean22 = parser20._hasNativeObjectIds;
        long long24 = parser20.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = null;
        parser20._location = jsonLocation25;
        com.fasterxml.jackson.core.FormatSchema formatSchema27 = null;
        boolean boolean28 = parser20.canUseSchema(formatSchema27);
        long long29 = parser20.getValueAsLong();
        boolean boolean31 = parser20.getValueAsBoolean(false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = parser20.getCurrentLocation();
        tokenBuffer2.writeObjectId((java.lang.Object) parser20);
        java.lang.String str34 = parser20.getText();
        boolean boolean35 = parser20.isClosed();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(formatSchema21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonLocation32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        boolean boolean13 = parser4._hasNativeObjectIds;
        int int14 = parser4.getFeatureMask();
        com.fasterxml.jackson.core.JsonLocation jsonLocation15 = parser4._location;
        boolean boolean16 = parser4.canReadObjectId();
        int int17 = parser4.getTextLength();
        long long19 = parser4.getValueAsLong((long) (byte) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = parser4.getCodec();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(jsonLocation15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNull(objectCodec20);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer5.asParser(objectCodec16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = tokenBuffer5.canUseSchema(formatSchema18);
        tokenBuffer5._generatorFeatures = 0;
        tokenBuffer5.writeNumber((int) (short) 100);
        tokenBuffer5.writeEndArray();
        tokenBuffer5._hasNativeTypeIds = false;
        tokenBuffer5.writeNumber(10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        com.fasterxml.jackson.core.Version version16 = parser15.version();
        java.lang.Object obj17 = parser15.getEmbeddedObject();
        boolean boolean18 = parser15.canReadTypeId();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser15);
        java.lang.Object obj20 = tokenBuffer19._typeId;
        int int21 = tokenBuffer19.getFeatureMask();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer23 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec22);
        tokenBuffer23._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = tokenBuffer23._first;
        com.fasterxml.jackson.core.JsonToken jsonToken28 = segment26.type(97);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        boolean boolean32 = tokenBuffer31._hasNativeTypeIds;
        tokenBuffer31.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext34 = tokenBuffer31.getOutputContext();
        boolean boolean35 = tokenBuffer31.canWriteBinaryNatively();
        tokenBuffer31._appendAt = 79;
        tokenBuffer31._closed = false;
        boolean boolean40 = tokenBuffer31._hasNativeId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        tokenBuffer42._objectCodec = objectCodec43;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        boolean boolean47 = tokenBuffer46._hasNativeTypeIds;
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer46.writeBinary(byteArray51);
        tokenBuffer42._typeId = tokenBuffer46;
        tokenBuffer46.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser58 = tokenBuffer46.asParser(objectCodec57);
        com.fasterxml.jackson.core.SerializableString serializableString59 = null;
        tokenBuffer46.writeString(serializableString59);
        com.fasterxml.jackson.core.JsonToken jsonToken61 = tokenBuffer46.firstToken();
        tokenBuffer31._append(jsonToken61);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment63 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser67 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment63, objectCodec64, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema68 = parser67.getSchema();
        boolean boolean69 = parser67._hasNativeObjectIds;
        long long71 = parser67.getValueAsLong((long) (byte) 1);
        parser67._closed = true;
        boolean boolean75 = parser67.getValueAsBoolean(true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment76 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser80 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment76, objectCodec77, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema81 = parser80.getSchema();
        boolean boolean82 = parser80._hasNativeObjectIds;
        long long84 = parser80.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation85 = null;
        parser80._location = jsonLocation85;
        com.fasterxml.jackson.core.FormatSchema formatSchema87 = null;
        boolean boolean88 = parser80.canUseSchema(formatSchema87);
        int int89 = parser80.getValueAsInt();
        int int90 = parser80.getTextLength();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment91 = segment26.append((int) (byte) 100, jsonToken61, (java.lang.Object) parser67, (java.lang.Object) int90);
        tokenBuffer19._first = segment26;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 79 + "'", int21 == 79);
        org.junit.Assert.assertNotNull(segment26);
        org.junit.Assert.assertNull(jsonToken28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertTrue("'" + jsonToken61 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken61.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(formatSchema68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(formatSchema81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(segment91);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser8._segment = segment10;
        java.lang.Object obj13 = segment10.findTypeId(16);
        java.lang.Object obj15 = segment10.findObjectId((int) ' ');
        java.lang.Object[] objArray16 = segment10._tokens;
        boolean boolean17 = segment10.hasIds();
        tokenBuffer1._first = segment10;
        boolean boolean19 = segment10.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser21 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec20);
        int int23 = parser21.getValueAsInt((-1));
        int int24 = parser21.getTextLength();
        parser21._closed = true;
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        boolean boolean13 = parser4.hasTextCharacters();
        int int15 = parser4.getValueAsInt(100);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = null;
        parser4._byteBuilder = byteArrayBuilder16;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        tokenBuffer18.writeFieldName("hi!");
        java.lang.Object obj21 = tokenBuffer18._objectId;
        tokenBuffer18.writeArrayFieldStart("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT, VALUE_NULL, VALUE_NULL]");
        tokenBuffer18.writeString("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]");
        java.lang.Object obj26 = tokenBuffer18._typeId;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeFieldName("");
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = tokenBuffer1.getSchema();
        tokenBuffer1._hasNativeObjectIds = true;
        tokenBuffer1.flush();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment12, objectCodec13, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = parser16.getSchema();
        boolean boolean18 = parser16._hasNativeObjectIds;
        long long20 = parser16.getValueAsLong((long) (byte) 1);
        parser16._closed = true;
        boolean boolean24 = parser16.getValueAsBoolean(true);
        com.fasterxml.jackson.core.JsonToken jsonToken25 = parser16.getLastClearedToken();
        boolean boolean26 = parser16._hasNativeIds;
        int int28 = parser16.getValueAsInt(10);
        boolean boolean29 = parser16.getValueAsBoolean();
        boolean boolean30 = parser16.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeObjectRef((java.lang.Object) boolean30);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(formatSchema8);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(jsonToken25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeStartObject();
        tokenBuffer1.writeString("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6, true);
        java.lang.Object obj9 = tokenBuffer8._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = parser15.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser15._segment = segment17;
        tokenBuffer8.writeObjectField("", (java.lang.Object) segment17);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer8._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer23 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        tokenBuffer23._objectCodec = objectCodec24;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        boolean boolean28 = tokenBuffer27._hasNativeTypeIds;
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer27.writeBinary(byteArray32);
        tokenBuffer23._typeId = tokenBuffer27;
        tokenBuffer27.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser39 = tokenBuffer27.asParser(objectCodec38);
        com.fasterxml.jackson.core.SerializableString serializableString40 = null;
        tokenBuffer27.writeString(serializableString40);
        com.fasterxml.jackson.core.JsonToken jsonToken42 = tokenBuffer27.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer44 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec43);
        boolean boolean45 = tokenBuffer44._hasNativeTypeIds;
        tokenBuffer44._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment49 = segment20.append(32, jsonToken42, (java.lang.Object) (byte) 0);
        tokenBuffer1._first = segment49;
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser52 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment49, objectCodec51);
        org.junit.Assert.assertNull(prettyPrinter2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(formatSchema16);
        org.junit.Assert.assertNotNull(segment20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + jsonToken42 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken42.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(segment49);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadTypeId();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = parser4.getCurrentLocation();
        java.lang.String str13 = parser4.getText();
        long long15 = parser4.nextLongValue(100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = parser4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._hasNativeIds;
        com.fasterxml.jackson.core.SerializableString serializableString8 = null;
        boolean boolean9 = parser4.nextFieldName(serializableString8);
        boolean boolean10 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = parser4.getCodec();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = parser4.setFeatureMask((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = parser4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectCodec11);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        tokenBuffer2.writeObject((java.lang.Object) 10);
        java.math.BigDecimal bigDecimal5 = null;
        tokenBuffer2.writeNumber(bigDecimal5);
        tokenBuffer2._hasNativeId = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        boolean boolean11 = tokenBuffer10._hasNativeTypeIds;
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer10.writeBinary(byteArray15);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = tokenBuffer10._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = tokenBuffer10._objectCodec;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        tokenBuffer20._objectCodec = objectCodec21;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        boolean boolean25 = tokenBuffer24._hasNativeTypeIds;
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer24.writeBinary(byteArray29);
        tokenBuffer20._typeId = tokenBuffer24;
        boolean boolean32 = tokenBuffer24.isClosed();
        tokenBuffer24._appendAt = 16;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        boolean boolean37 = tokenBuffer36._hasNativeTypeIds;
        tokenBuffer36.close();
        tokenBuffer36.writeNumber((long) '4');
        byte[] byteArray42 = new byte[] {};
        tokenBuffer36.writeBinaryField("hi!", byteArray42);
        tokenBuffer24.writeBinary(byteArray42);
        tokenBuffer10.writeBinary(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer2.writeBinary(byteArray42, 79, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 84 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment17);
        org.junit.Assert.assertNull(objectCodec18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumber(bigDecimal6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer10._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser17._segment = segment19;
        java.lang.Object obj22 = segment19.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        boolean boolean26 = tokenBuffer25._hasNativeTypeIds;
        tokenBuffer25.writeFieldName("");
        int int29 = tokenBuffer25.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = tokenBuffer25.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer25.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = tokenBuffer25.append(tokenBuffer34);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = tokenBuffer25.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = segment19.append(16, jsonToken36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment39, objectCodec40, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema44 = parser43.getSchema();
        boolean boolean45 = parser43._hasNativeObjectIds;
        long long47 = parser43.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version48 = parser43.version();
        boolean boolean49 = parser43._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder50 = null;
        parser43._byteBuilder = byteArrayBuilder50;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment52, objectCodec53, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema57 = parser56.getSchema();
        boolean boolean58 = parser56._hasNativeObjectIds;
        long long60 = parser56.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version61 = parser56.version();
        boolean boolean62 = parser56._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder63 = null;
        parser56._byteBuilder = byteArrayBuilder63;
        boolean boolean65 = parser56.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext66 = parser56._parsingContext;
        parser43._parsingContext = jsonReadContext66;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = segment11.append(16, jsonToken36, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer70 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec69);
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator72 = tokenBuffer70.setCodec(objectCodec71);
        tokenBuffer1._append(jsonToken36, (java.lang.Object) tokenBuffer70);
        com.fasterxml.jackson.core.JsonToken jsonToken74 = tokenBuffer70.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer76 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec75);
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        tokenBuffer76._objectCodec = objectCodec77;
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer80 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec79);
        boolean boolean81 = tokenBuffer80._hasNativeTypeIds;
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer80.writeBinary(byteArray85);
        tokenBuffer76._typeId = tokenBuffer80;
        tokenBuffer80.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer91 = tokenBuffer70.append(tokenBuffer80);
        tokenBuffer80.writeBooleanField("[TokenBuffer: FIELD_NAME(hi!), VALUE_FALSE, VALUE_NUMBER_INT, FIELD_NAME(hi!), VALUE_TRUE]", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(segment11);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 79 + "'", int29 == 79);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(tokenBuffer35);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment37);
        org.junit.Assert.assertNull(formatSchema44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(formatSchema57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonReadContext66);
        org.junit.Assert.assertNotNull(segment68);
        org.junit.Assert.assertNotNull(jsonGenerator72);
        org.junit.Assert.assertNull(jsonToken74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(tokenBuffer91);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = tokenBuffer2.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser8._segment = segment10;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser8.getLastClearedToken();
        tokenBuffer2.writeTypeId((java.lang.Object) parser8);
        java.lang.String str15 = parser8.getValueAsString("hi!");
        java.lang.String str17 = parser8.getValueAsString("[TokenBuffer: ]");
        double double19 = parser8.getValueAsDouble((double) 2901L);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[TokenBuffer: ]" + "'", str17, "[TokenBuffer: ]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2901.0d + "'", double19 == 2901.0d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadObjectId();
        long long12 = parser4.getValueAsLong((long) 16);
        java.lang.Object obj13 = parser4.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.nextToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        parser4.setCodec(objectCodec15);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 16L + "'", long12 == 16L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment5, objectCodec6, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser9.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser9._segment = segment11;
        tokenBuffer2.writeObjectField("", (java.lang.Object) segment11);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer2._last;
        java.math.BigInteger bigInteger15 = null;
        tokenBuffer2.writeNumber(bigInteger15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        boolean boolean19 = tokenBuffer18._hasNativeTypeIds;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer18.writeBinary(byteArray23);
        tokenBuffer2.writeBinary(byteArray23, (int) (byte) 1, (int) (short) 1);
        tokenBuffer2.writeNumber((float) (byte) 1);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter30 = tokenBuffer2.getPrettyPrinter();
        tokenBuffer2.writeStringField("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]", "[TokenBuffer: ]");
        tokenBuffer2.writeNumberField("[TokenBuffer: VALUE_NULL, END_OBJECT, FIELD_NAME([TokenBuffer: ]), VALUE_STRING]", (float) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNull(prettyPrinter30);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer1.writeBinary(byteArray6);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer1._writeContext;
        java.math.BigDecimal bigDecimal11 = null;
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL]", bigDecimal11);
        java.lang.Object obj13 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumber("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]");
        tokenBuffer1.writeObjectFieldStart("[TokenBuffer: FIELD_NAME(hi!), VALUE_FALSE, VALUE_NUMBER_INT, FIELD_NAME(hi!), VALUE_TRUE]");
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT, END_ARRAY, VALUE_EMBEDDED_OBJECT]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        tokenBuffer2.writeNumber((short) -1);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = tokenBuffer2.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = tokenBuffer7.setCodec(objectCodec8);
        tokenBuffer7._appendAt = 52;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer14.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes22 = tokenBuffer14.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = tokenBuffer14.getSchema();
        tokenBuffer14.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        tokenBuffer26._objectCodec = objectCodec27;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        boolean boolean31 = tokenBuffer30._hasNativeTypeIds;
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer30.writeBinary(byteArray35);
        tokenBuffer26._typeId = tokenBuffer30;
        boolean boolean38 = tokenBuffer30.isClosed();
        tokenBuffer30._appendAt = 16;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41);
        boolean boolean43 = tokenBuffer42._hasNativeTypeIds;
        tokenBuffer42.close();
        tokenBuffer42.writeNumber((long) '4');
        byte[] byteArray48 = new byte[] {};
        tokenBuffer42.writeBinaryField("hi!", byteArray48);
        tokenBuffer30.writeBinary(byteArray48);
        tokenBuffer14.writeBinary(byteArray48);
        tokenBuffer7.writeBinaryField("hi!", byteArray48);
        tokenBuffer2.writeBinary(byteArray48);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(characterEscapes22);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._generatorFeatures = (byte) -1;
        boolean boolean4 = tokenBuffer1._closed;
        int int5 = tokenBuffer1._appendAt;
        tokenBuffer1.writeNumber("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT, VALUE_NULL, VALUE_NULL]");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokenBuffer1.isEnabled(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = tokenBuffer1.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = tokenBuffer1.getSchema();
        tokenBuffer1.writeEndArray();
        boolean boolean12 = tokenBuffer1.canWriteBinaryNatively();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = tokenBuffer1.setCharacterEscapes(characterEscapes13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(characterEscapes9);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonGenerator14);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        boolean boolean3 = tokenBuffer1._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer6 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        tokenBuffer6._objectCodec = objectCodec7;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        boolean boolean11 = tokenBuffer10._hasNativeTypeIds;
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer10.writeBinary(byteArray15);
        tokenBuffer6._typeId = tokenBuffer10;
        tokenBuffer10.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = tokenBuffer10.asParser(objectCodec21);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = null;
        boolean boolean24 = tokenBuffer10.canUseSchema(formatSchema23);
        tokenBuffer10._generatorFeatures = 0;
        tokenBuffer1._appendRaw((int) 'a', (java.lang.Object) tokenBuffer10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        tokenBuffer1._objectCodec = objectCodec28;
        tokenBuffer1.writeString("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertNull(prettyPrinter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean19 = tokenBuffer14._hasNativeId;
        int int20 = tokenBuffer14._appendAt;
        tokenBuffer14.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = tokenBuffer14.useDefaultPrettyPrinter();
        tokenBuffer1._typeId = tokenBuffer14;
        tokenBuffer1.writeNumberField("", (double) 10L);
        tokenBuffer1.writeBoolean(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1._appendAt = 79;
        tokenBuffer1._closed = false;
        boolean boolean10 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        tokenBuffer12._objectCodec = objectCodec13;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        boolean boolean17 = tokenBuffer16._hasNativeTypeIds;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer16.writeBinary(byteArray21);
        tokenBuffer12._typeId = tokenBuffer16;
        tokenBuffer16.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = tokenBuffer16.asParser(objectCodec27);
        com.fasterxml.jackson.core.SerializableString serializableString29 = null;
        tokenBuffer16.writeString(serializableString29);
        com.fasterxml.jackson.core.JsonToken jsonToken31 = tokenBuffer16.firstToken();
        tokenBuffer1._append(jsonToken31);
        java.lang.Object obj33 = tokenBuffer1._objectId;
        tokenBuffer1.writeStartArray((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + jsonToken31 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken31.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        boolean boolean7 = parser4.hasTextCharacters();
        boolean boolean8 = parser4._hasNativeIds;
        java.io.OutputStream outputStream9 = null;
        int int10 = parser4.releaseBuffered(outputStream9);
        boolean boolean11 = parser4.canReadObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment12, objectCodec13, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = parser16.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser16._segment = segment18;
        java.lang.Object obj21 = segment18.findTypeId(16);
        java.lang.Object obj23 = segment18.findObjectId((int) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment18, objectCodec24);
        parser4._segment = segment18;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = parser4._codec;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext28 = parser4._parsingContext;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(objectCodec27);
        org.junit.Assert.assertNotNull(jsonReadContext28);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        tokenBuffer17._objectCodec = objectCodec18;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        boolean boolean22 = tokenBuffer21._hasNativeTypeIds;
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer21.writeBinary(byteArray26);
        tokenBuffer17._typeId = tokenBuffer21;
        tokenBuffer21.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer21.setPrettyPrinter(prettyPrinter32);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonGenerator33.setCharacterEscapes(characterEscapes34);
        tokenBuffer5.writeObjectId((java.lang.Object) characterEscapes34);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser41 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment37, objectCodec38, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema42 = parser41.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser41._segment = segment43;
        java.lang.Object obj46 = segment43.findTypeId(16);
        boolean boolean47 = segment43.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = segment43._next;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap49 = segment43._nativeIds;
        java.lang.Object obj51 = segment43.findTypeId((int) (short) 100);
        java.lang.Object[] objArray52 = segment43._tokens;
        tokenBuffer5._last = segment43;
        com.fasterxml.jackson.core.JsonToken jsonToken54 = tokenBuffer5.firstToken();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNull(formatSchema42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(segment48);
        org.junit.Assert.assertNull(intMap49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + jsonToken54 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken54.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        int int7 = tokenBuffer1._appendAt;
        boolean boolean8 = tokenBuffer1.canOmitFields();
        tokenBuffer1.writeOmittedField("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer1._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = parser13.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(segment11);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = segment6.type(0);
        boolean boolean18 = segment6.hasIds();
        int int20 = segment6.rawType((int) (byte) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        tokenBuffer22._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = tokenBuffer22._first;
        java.lang.Object obj27 = segment25.findObjectId((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter30 = tokenBuffer29.getPrettyPrinter();
        tokenBuffer29.writeFieldName("");
        tokenBuffer29._mayHaveNativeIds = false;
        boolean boolean35 = tokenBuffer29._hasNativeObjectIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = tokenBuffer29._last;
        segment25._next = segment36;
        segment6._next = segment36;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41, true);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = tokenBuffer43.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = parser49.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser49._segment = segment51;
        com.fasterxml.jackson.core.JsonToken jsonToken53 = parser49.getLastClearedToken();
        tokenBuffer43.writeTypeId((java.lang.Object) parser49);
        long long56 = parser49.nextLongValue(10L);
        parser49.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer59 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec58);
        boolean boolean60 = tokenBuffer59._hasNativeTypeIds;
        tokenBuffer59._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer59.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes67 = tokenBuffer59.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema68 = tokenBuffer59.getSchema();
        int int69 = tokenBuffer59.getHighestEscapedChar();
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer71 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec70);
        boolean boolean72 = tokenBuffer71._hasNativeTypeIds;
        tokenBuffer71._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer71.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes79 = tokenBuffer71.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema80 = tokenBuffer71.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer82 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec81);
        boolean boolean83 = tokenBuffer82._hasNativeTypeIds;
        tokenBuffer82.writeFieldName("");
        int int86 = tokenBuffer82.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema87 = tokenBuffer82.getSchema();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext88 = tokenBuffer82._writeContext;
        tokenBuffer71.writeObject((java.lang.Object) tokenBuffer82);
        tokenBuffer82.flush();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment91 = segment6.appendRaw(97, (int) (short) 10, (java.lang.Object) parser49, (java.lang.Object) tokenBuffer59, (java.lang.Object) tokenBuffer82);
        com.fasterxml.jackson.core.ObjectCodec objectCodec92 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser95 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment91, objectCodec92, true, false);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(segment25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(prettyPrinter30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(segment36);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNull(formatSchema50);
        org.junit.Assert.assertNull(jsonToken53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(characterEscapes67);
        org.junit.Assert.assertNull(formatSchema68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(characterEscapes79);
        org.junit.Assert.assertNull(formatSchema80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 79 + "'", int86 == 79);
        org.junit.Assert.assertNull(formatSchema87);
        org.junit.Assert.assertNotNull(jsonWriteContext88);
        org.junit.Assert.assertNotNull(segment91);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        boolean boolean16 = tokenBuffer15._hasNativeTypeIds;
        tokenBuffer15.writeFieldName("");
        int int19 = tokenBuffer15.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = tokenBuffer15.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer15.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = tokenBuffer15.append(tokenBuffer24);
        com.fasterxml.jackson.core.JsonToken jsonToken26 = tokenBuffer15.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = parser31.getSchema();
        boolean boolean33 = parser31._hasNativeObjectIds;
        long long35 = parser31.getValueAsLong((long) (byte) 1);
        parser31._closed = true;
        boolean boolean39 = parser31.getValueAsBoolean(true);
        int int40 = parser31.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken41 = parser31.getCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation42 = parser31.getCurrentLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken43 = parser31.peekNextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser48 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment44, objectCodec45, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = parser48.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment50 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser48._segment = segment50;
        java.lang.Boolean boolean52 = parser48.nextBooleanValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = segment6.append((int) ' ', jsonToken26, (java.lang.Object) parser31, (java.lang.Object) boolean52);
        com.fasterxml.jackson.core.JsonToken jsonToken54 = parser31.nextToken();
        com.fasterxml.jackson.core.JsonParser jsonParser55 = parser31.skipChildren();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(tokenBuffer25);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(jsonToken41);
        org.junit.Assert.assertNotNull(jsonLocation42);
        org.junit.Assert.assertNull(jsonToken43);
        org.junit.Assert.assertNull(formatSchema49);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(segment53);
        org.junit.Assert.assertNull(jsonToken54);
        org.junit.Assert.assertNotNull(jsonParser55);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec10);
        com.fasterxml.jackson.core.Version version12 = parser11.version();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        boolean boolean19 = parser17._hasNativeObjectIds;
        long long21 = parser17.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version22 = parser17.version();
        boolean boolean23 = parser17._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder24 = null;
        parser17._byteBuilder = byteArrayBuilder24;
        boolean boolean26 = parser17._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = parser17.getTokenLocation();
        parser11._location = jsonLocation27;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = parser11.skipChildren();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        boolean boolean32 = tokenBuffer31._hasNativeTypeIds;
        tokenBuffer31.writeFieldName("");
        int int35 = tokenBuffer31.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = tokenBuffer31.getSchema();
        tokenBuffer31.writeNumber("hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes39 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = tokenBuffer31.setCharacterEscapes(characterEscapes39);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = tokenBuffer31.setCharacterEscapes(characterEscapes41);
        java.lang.Object obj43 = tokenBuffer31._objectId;
        tokenBuffer31._closed = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer47 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec46);
        boolean boolean48 = tokenBuffer47._hasNativeTypeIds;
        tokenBuffer47.writeFieldName("");
        tokenBuffer47.writeNumberField("", (double) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        boolean boolean56 = tokenBuffer55._hasNativeId;
        tokenBuffer47._objectId = tokenBuffer55;
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer59 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec58);
        tokenBuffer59._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer63 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        tokenBuffer63._objectCodec = objectCodec64;
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer67 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec66);
        boolean boolean68 = tokenBuffer67._hasNativeTypeIds;
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer67.writeBinary(byteArray72);
        tokenBuffer63._typeId = tokenBuffer67;
        boolean boolean75 = tokenBuffer67.isClosed();
        tokenBuffer59.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer67);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer77 = tokenBuffer55.append(tokenBuffer67);
        tokenBuffer31.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer77);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment79 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser83 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment79, objectCodec80, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema84 = parser83.getSchema();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext85 = parser83._parsingContext;
        double double86 = parser83.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser87 = tokenBuffer31.asParser((com.fasterxml.jackson.core.JsonParser) parser83);
        java.lang.Object obj88 = parser83.getEmbeddedObject();
        boolean boolean89 = parser83.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonLocation jsonLocation90 = parser83.getCurrentLocation();
        parser11.setLocation(jsonLocation90);
        int int92 = parser11.getTextLength();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 79 + "'", int35 == 79);
        org.junit.Assert.assertNull(formatSchema36);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(tokenBuffer77);
        org.junit.Assert.assertNull(formatSchema84);
        org.junit.Assert.assertNotNull(jsonReadContext85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(jsonLocation90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        java.lang.Object obj17 = segment6.findObjectId(79);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = segment6.type(32);
        int int21 = segment6.rawType((int) (short) 10);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = segment6.next();
        java.lang.Object[] objArray23 = segment6._tokens;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = segment6._next;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(segment22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(segment24);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        boolean boolean3 = tokenBuffer1._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer6 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        tokenBuffer6._objectCodec = objectCodec7;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        boolean boolean11 = tokenBuffer10._hasNativeTypeIds;
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer10.writeBinary(byteArray15);
        tokenBuffer6._typeId = tokenBuffer10;
        tokenBuffer10.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = tokenBuffer10.asParser(objectCodec21);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = null;
        boolean boolean24 = tokenBuffer10.canUseSchema(formatSchema23);
        tokenBuffer10._generatorFeatures = 0;
        tokenBuffer1._appendRaw((int) 'a', (java.lang.Object) tokenBuffer10);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer1.useDefaultPrettyPrinter();
        tokenBuffer1.writeStringField("[TokenBuffer: ]", "[TokenBuffer: VALUE_NULL]");
        com.fasterxml.jackson.core.TreeNode treeNode32 = null;
        tokenBuffer1.writeTree(treeNode32);
        org.junit.Assert.assertNull(prettyPrinter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonGenerator28);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        boolean boolean6 = tokenBuffer1.isClosed();
        boolean boolean7 = tokenBuffer1._closed;
        boolean boolean8 = tokenBuffer1.isClosed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.getLastClearedToken();
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadTypeId();
        java.lang.Boolean boolean11 = parser4.nextBooleanValue();
        parser4._segmentPtr = 1;
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = null;
        // The following exception was thrown during execution in test generation
        try {
            parser4.setSchema(formatSchema14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = tokenBuffer2.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser8._segment = segment10;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser8.getLastClearedToken();
        tokenBuffer2.writeTypeId((java.lang.Object) parser8);
        int int14 = parser8.getTextLength();
        java.lang.Object obj15 = parser8.getEmbeddedObject();
        java.lang.Object obj16 = parser8.getEmbeddedObject();
        java.lang.String str17 = parser8.getValueAsString();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        tokenBuffer2.writeNumberField("", (double) 1L);
        tokenBuffer2.writeNull();
        tokenBuffer2.writeNumber(0);
        boolean boolean10 = tokenBuffer2.canWriteBinaryNatively();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        int int17 = parser15.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken18 = parser15.peekNextToken();
        boolean boolean19 = parser15._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = parser15.nextToken();
        tokenBuffer2.writeTypeId((java.lang.Object) parser15);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema27 = parser26.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser26._segment = segment28;
        com.fasterxml.jackson.core.JsonParser jsonParser31 = parser26.setFeatureMask((int) (byte) 10);
        boolean boolean32 = parser26._closed;
        com.fasterxml.jackson.core.JsonLocation jsonLocation33 = parser26.getTokenLocation();
        parser15.setLocation(jsonLocation33);
        com.fasterxml.jackson.core.FormatSchema formatSchema35 = null;
        boolean boolean36 = parser15.canUseSchema(formatSchema35);
        com.fasterxml.jackson.core.JsonToken jsonToken37 = parser15.peekNextToken();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNull(jsonToken18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertNull(formatSchema27);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonLocation33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jsonToken37);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        java.lang.String str16 = parser15.getCurrentName();
        boolean boolean17 = parser15.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = parser15.getTokenLocation();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder19 = null;
        parser15._byteBuilder = byteArrayBuilder19;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        tokenBuffer22._objectCodec = objectCodec23;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser29 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment25, objectCodec26, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = parser29.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser29._segment = segment31;
        java.lang.Object obj34 = segment31.findTypeId(16);
        java.lang.Object obj36 = segment31.findObjectId((int) ' ');
        java.lang.Object[] objArray37 = segment31._tokens;
        boolean boolean38 = segment31.hasIds();
        tokenBuffer22._first = segment31;
        boolean boolean40 = segment31.hasIds();
        com.fasterxml.jackson.core.JsonToken jsonToken42 = segment31.type(35);
        parser15._segment = segment31;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonLocation18);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jsonToken42);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer5.asParser(objectCodec16);
        boolean boolean18 = tokenBuffer5.canWriteTypeId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._generatorFeatures = (byte) -1;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer1.setCodec(objectCodec4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext6 = tokenBuffer1._writeContext;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw("[TokenBuffer: START_ARRAY]", 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertNotNull(jsonWriteContext6);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        boolean boolean10 = segment6.hasIds();
        segment6._tokenTypes = 35L;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser14 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = segment6.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        tokenBuffer2.writeObject((java.lang.Object) 10);
        java.math.BigDecimal bigDecimal5 = null;
        tokenBuffer2.writeNumber(bigDecimal5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = tokenBuffer2.asParser(objectCodec7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9, true);
        java.lang.Object obj12 = tokenBuffer11._objectId;
        tokenBuffer11.writeNull();
        java.math.BigDecimal bigDecimal15 = null;
        tokenBuffer11.writeNumberField("", bigDecimal15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        tokenBuffer18._objectCodec = objectCodec19;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        boolean boolean23 = tokenBuffer22._hasNativeTypeIds;
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer22.writeBinary(byteArray27);
        tokenBuffer18._typeId = tokenBuffer22;
        tokenBuffer22.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter33 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer22.setPrettyPrinter(prettyPrinter33);
        tokenBuffer22._hasNativeObjectIds = false;
        com.fasterxml.jackson.core.JsonToken jsonToken37 = tokenBuffer22.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        tokenBuffer39._objectCodec = objectCodec40;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        boolean boolean44 = tokenBuffer43._hasNativeTypeIds;
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer43.writeBinary(byteArray48);
        tokenBuffer39._typeId = tokenBuffer43;
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer52 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec51);
        boolean boolean53 = tokenBuffer52._hasNativeTypeIds;
        tokenBuffer52._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean57 = tokenBuffer52._hasNativeId;
        int int58 = tokenBuffer52._appendAt;
        tokenBuffer52.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = tokenBuffer52.useDefaultPrettyPrinter();
        tokenBuffer39._typeId = tokenBuffer52;
        java.math.BigDecimal bigDecimal64 = null;
        tokenBuffer39.writeNumberField("", bigDecimal64);
        tokenBuffer39.writeNull();
        tokenBuffer11._append(jsonToken37, (java.lang.Object) tokenBuffer39);
        tokenBuffer2._append(jsonToken37);
        com.fasterxml.jackson.core.SerializableString serializableString69 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator70 = tokenBuffer2.setRootValueSeparator(serializableString69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertTrue("'" + jsonToken37 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken37.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator61);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = tokenBuffer1.append(tokenBuffer10);
        boolean boolean12 = tokenBuffer1.canOmitFields();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer14.writeFieldName("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer14.setHighestNonEscapedChar(32);
        tokenBuffer1._objectId = 32;
        tokenBuffer1.writeBooleanField("[TokenBuffer: ]", false);
        tokenBuffer1.writeStartArray((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(tokenBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        int int8 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = parser4.skipChildren();
        int int11 = parser4.getValueAsInt(97);
        boolean boolean12 = parser4._hasNativeObjectIds;
        long long14 = parser4.nextLongValue(2L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer1._mayHaveNativeIds = false;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext15 = tokenBuffer1.getOutputContext();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = tokenBuffer1.asParser();
        com.fasterxml.jackson.core.TreeNode treeNode17 = null;
        tokenBuffer1.writeTree(treeNode17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        boolean boolean22 = tokenBuffer21._hasNativeTypeIds;
        tokenBuffer21.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext24 = tokenBuffer21.getOutputContext();
        boolean boolean25 = tokenBuffer21.canWriteBinaryNatively();
        tokenBuffer21._hasNativeTypeIds = false;
        tokenBuffer21.writeBoolean(false);
        tokenBuffer1._appendRaw((int) (byte) 10, (java.lang.Object) tokenBuffer21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = tokenBuffer1._objectCodec;
        tokenBuffer1._mayHaveNativeIds = true;
        tokenBuffer1._generatorFeatures = 79;
        tokenBuffer1.writeEndArray();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonWriteContext15);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(objectCodec31);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumber(bigDecimal6);
        java.lang.Object obj8 = tokenBuffer1._typeId;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1.writeNumber((short) (byte) 10);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment12, objectCodec13, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = parser16.getSchema();
        boolean boolean18 = parser16._hasNativeObjectIds;
        boolean boolean19 = parser16.hasTextCharacters();
        boolean boolean20 = parser16._hasNativeIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser16._segment = segment21;
        tokenBuffer1._last = segment21;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = tokenBuffer1.asParser();
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.configure(feature25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(characterEscapes9);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        java.lang.Object obj17 = segment6.findObjectId(79);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap18 = segment6._nativeIds;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap19 = null;
        segment6._nativeIds = intMap19;
        java.lang.Object[] objArray21 = segment6._tokens;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = tokenBuffer26._first;
        tokenBuffer26.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = tokenBuffer26.useDefaultPrettyPrinter();
        tokenBuffer26.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext33 = tokenBuffer26.getOutputContext();
        com.fasterxml.jackson.core.SerializableString serializableString34 = null;
        tokenBuffer26.writeString(serializableString34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = tokenBuffer26.setCharacterEscapes(characterEscapes36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser42 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment38, objectCodec39, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema43 = parser42.getSchema();
        boolean boolean44 = parser42._hasNativeObjectIds;
        long long46 = parser42.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version47 = parser42.version();
        parser42._closed = true;
        com.fasterxml.jackson.core.JsonToken jsonToken50 = parser42.nextValue();
        int int51 = parser42.getCurrentTokenId();
        boolean boolean52 = parser42.canReadTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer54 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec53);
        boolean boolean55 = tokenBuffer54._hasNativeTypeIds;
        tokenBuffer54.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext57 = tokenBuffer54.getOutputContext();
        boolean boolean58 = tokenBuffer54.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal59 = null;
        tokenBuffer54.writeNumber(bigDecimal59);
        java.lang.String str61 = tokenBuffer54.toString();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment62 = segment6.appendRaw(32, (int) (short) 100, (java.lang.Object) characterEscapes36, (java.lang.Object) boolean52, (java.lang.Object) str61);
        java.lang.Object obj64 = segment6.findObjectId((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = segment6.get(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(intMap18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(segment27);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(jsonWriteContext33);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNull(formatSchema43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNull(jsonToken50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[TokenBuffer: VALUE_NULL]" + "'", str61, "[TokenBuffer: VALUE_NULL]");
        org.junit.Assert.assertNotNull(segment62);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._first;
        tokenBuffer2.writeBooleanField("hi!", false);
        tokenBuffer2.writeNumber(0L);
        tokenBuffer2._hasNativeTypeIds = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer2._first;
        tokenBuffer2.writeEndObject();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = tokenBuffer2._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        tokenBuffer16._objectCodec = objectCodec17;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        boolean boolean21 = tokenBuffer20._hasNativeTypeIds;
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer20.writeBinary(byteArray25);
        tokenBuffer16._typeId = tokenBuffer20;
        tokenBuffer20.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser32 = tokenBuffer20.asParser(objectCodec31);
        com.fasterxml.jackson.core.FormatSchema formatSchema33 = null;
        boolean boolean34 = tokenBuffer20.canUseSchema(formatSchema33);
        tokenBuffer20._generatorFeatures = 0;
        tokenBuffer20.writeNumber((int) (short) 100);
        tokenBuffer20.writeEndArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec40);
        boolean boolean42 = tokenBuffer41._hasNativeTypeIds;
        tokenBuffer41.writeFieldName("");
        int int45 = tokenBuffer41.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema46 = tokenBuffer41.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = tokenBuffer41.setFeatureMask((-1));
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter49 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = jsonGenerator48.setPrettyPrinter(prettyPrinter49);
        jsonGenerator50.writeNumberField("hi!", (double) '4');
        tokenBuffer20.writeObject((java.lang.Object) '4');
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator56 = tokenBuffer20.setCodec(objectCodec55);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment57 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser61 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment57, objectCodec58, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema62 = parser61.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment63 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser61._segment = segment63;
        java.lang.Boolean boolean65 = parser61.nextBooleanValue();
        com.fasterxml.jackson.core.JsonParser jsonParser66 = parser61.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser67 = tokenBuffer20.asParser((com.fasterxml.jackson.core.JsonParser) parser61);
        int int68 = tokenBuffer20._generatorFeatures;
        tokenBuffer20._generatorFeatures = 10;
        tokenBuffer2.writeObjectField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT, END_ARRAY, VALUE_EMBEDDED_OBJECT]", (java.lang.Object) tokenBuffer20);
        int int72 = tokenBuffer20._generatorFeatures;
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertNotNull(segment11);
        org.junit.Assert.assertNotNull(segment13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 79 + "'", int45 == 79);
        org.junit.Assert.assertNull(formatSchema46);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertNotNull(jsonGenerator50);
        org.junit.Assert.assertNotNull(jsonGenerator56);
        org.junit.Assert.assertNull(formatSchema62);
        org.junit.Assert.assertNull(boolean65);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec10);
        com.fasterxml.jackson.core.Version version12 = parser11.version();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        boolean boolean19 = parser17._hasNativeObjectIds;
        long long21 = parser17.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version22 = parser17.version();
        boolean boolean23 = parser17._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder24 = null;
        parser17._byteBuilder = byteArrayBuilder24;
        boolean boolean26 = parser17._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = parser17.getTokenLocation();
        parser11._location = jsonLocation27;
        java.lang.String str30 = parser11.getValueAsString("hi!");
        java.lang.String str31 = parser11.getText();
        java.lang.Boolean boolean32 = parser11.nextBooleanValue();
        double double34 = parser11.getValueAsDouble(52.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        boolean boolean37 = tokenBuffer36._hasNativeTypeIds;
        tokenBuffer36.writeFieldName("");
        int int40 = tokenBuffer36.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = tokenBuffer36.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = tokenBuffer36.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = tokenBuffer36.append(tokenBuffer45);
        int int47 = tokenBuffer36._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser52 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment48, objectCodec49, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema53 = parser52.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment54 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser52._segment = segment54;
        java.lang.Object obj57 = segment54.findTypeId(16);
        java.lang.Object obj59 = segment54.findObjectId((int) (byte) 100);
        tokenBuffer36._last = segment54;
        parser11._segment = segment54;
        com.fasterxml.jackson.core.JsonToken jsonToken62 = parser11.getLastClearedToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 79 + "'", int40 == 79);
        org.junit.Assert.assertNull(formatSchema41);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNotNull(tokenBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(formatSchema53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(jsonToken62);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        java.lang.String str7 = parser4.getValueAsString();
        java.lang.String str8 = parser4.getText();
        boolean boolean9 = parser4._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        tokenBuffer1.writeNullField("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString6 = null;
        tokenBuffer1.writeString(serializableString6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes8 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1.writeNumber("");
        tokenBuffer1.writeStringField("[TokenBuffer: ]", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT]");
        tokenBuffer1.writeObjectFieldStart("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = tokenBuffer1._objectCodec;
        tokenBuffer1.writeEndObject();
        org.junit.Assert.assertNull(characterEscapes8);
        org.junit.Assert.assertNull(objectCodec16);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.nextToken();
        java.lang.String str9 = parser4.getValueAsString("hi!");
        boolean boolean10 = parser4._closed;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec10);
        java.lang.String str12 = parser11.getCurrentName();
        java.io.Writer writer13 = null;
        int int14 = parser11.releaseBuffered(writer13);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        boolean boolean12 = parser4.getValueAsBoolean(true);
        int int13 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.getCurrentToken();
        int int15 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = parser4.getCurrentToken();
        java.lang.Object obj17 = parser4.getEmbeddedObject();
        java.lang.Object obj18 = parser4.getInputSource();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser8._segment = segment10;
        java.lang.Object obj13 = segment10.findTypeId(16);
        java.lang.Object obj15 = segment10.findObjectId((int) ' ');
        java.lang.Object[] objArray16 = segment10._tokens;
        boolean boolean17 = segment10.hasIds();
        tokenBuffer1._first = segment10;
        boolean boolean19 = segment10.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser21 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser23 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec22);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment5, objectCodec6, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser9.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser9._segment = segment11;
        tokenBuffer2.writeObjectField("", (java.lang.Object) segment11);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer2._last;
        java.math.BigInteger bigInteger15 = null;
        tokenBuffer2.writeNumber(bigInteger15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        boolean boolean19 = tokenBuffer18._hasNativeTypeIds;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer18.writeBinary(byteArray23);
        tokenBuffer2.writeBinary(byteArray23, (int) (byte) 1, (int) (short) 1);
        tokenBuffer2.writeNumber((float) (byte) 1);
        tokenBuffer2.writeNumber("hi!");
        tokenBuffer2._appendAt = (byte) 0;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = tokenBuffer2.setFeatureMask(52);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = tokenBuffer2.setHighestNonEscapedChar(3);
        tokenBuffer2._hasNativeObjectIds = true;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1.writeNumberField("[TokenBuffer: ]", (long) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = parser13.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser13._segment = segment15;
        java.lang.Object obj18 = segment15.findTypeId(16);
        java.lang.Object obj20 = segment15.findObjectId((int) ' ');
        java.lang.Object[] objArray21 = segment15._tokens;
        boolean boolean22 = segment15.hasIds();
        segment15._tokenTypes = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        boolean boolean28 = tokenBuffer27._hasNativeTypeIds;
        tokenBuffer27.writeFieldName("");
        int int31 = tokenBuffer27.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = tokenBuffer27.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer27.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = tokenBuffer27.append(tokenBuffer36);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = tokenBuffer27.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = segment15.append(100, jsonToken38);
        tokenBuffer1.writeTypeId((java.lang.Object) segment39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41, true);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = tokenBuffer43.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = parser49.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser49._segment = segment51;
        com.fasterxml.jackson.core.JsonToken jsonToken53 = parser49.getLastClearedToken();
        tokenBuffer43.writeTypeId((java.lang.Object) parser49);
        com.fasterxml.jackson.core.TreeNode treeNode55 = null;
        tokenBuffer43.writeTree(treeNode55);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = tokenBuffer1.append(tokenBuffer43);
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer59 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec58);
        boolean boolean60 = tokenBuffer59._hasNativeTypeIds;
        tokenBuffer59._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        int int64 = tokenBuffer59.getFeatureMask();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment65 = tokenBuffer59._last;
        segment65._tokenTypes = 101L;
        long long68 = segment65._tokenTypes;
        tokenBuffer43._first = segment65;
        long long70 = segment65._tokenTypes;
        java.lang.Object[] objArray71 = segment65._tokens;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(formatSchema14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 79 + "'", int31 == 79);
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNotNull(tokenBuffer37);
        org.junit.Assert.assertTrue("'" + jsonToken38 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken38.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment39);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNull(formatSchema50);
        org.junit.Assert.assertNull(jsonToken53);
        org.junit.Assert.assertNotNull(tokenBuffer57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 79 + "'", int64 == 79);
        org.junit.Assert.assertNotNull(segment65);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 101L + "'", long68 == 101L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 101L + "'", long70 == 101L);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[100.0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[100.0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1._hasNativeTypeIds = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = parser13.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser13._segment = segment15;
        java.lang.Object obj18 = segment15.findTypeId(16);
        boolean boolean19 = segment15.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = segment15._next;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec21, true, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec27);
        boolean boolean29 = tokenBuffer28._hasNativeTypeIds;
        tokenBuffer28._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean33 = tokenBuffer28._hasNativeId;
        int int34 = tokenBuffer28._appendAt;
        tokenBuffer28.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        boolean boolean39 = tokenBuffer38._hasNativeTypeIds;
        tokenBuffer38.writeFieldName("");
        int int42 = tokenBuffer38.getFeatureMask();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser47 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment43, objectCodec44, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema48 = parser47.getSchema();
        boolean boolean49 = parser47._hasNativeObjectIds;
        long long51 = parser47.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version52 = parser47.version();
        boolean boolean53 = parser47._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder54 = null;
        parser47._byteBuilder = byteArrayBuilder54;
        boolean boolean56 = parser47.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext57 = parser47._parsingContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = segment15.appendRaw((int) (byte) 0, 10, (java.lang.Object) (byte) -1, (java.lang.Object) tokenBuffer38, (java.lang.Object) parser47);
        tokenBuffer1._typeId = parser47;
        int int60 = tokenBuffer1.getHighestEscapedChar();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext61 = null;
        tokenBuffer1._writeContext = jsonWriteContext61;
        com.fasterxml.jackson.core.FormatSchema formatSchema63 = tokenBuffer1.getSchema();
        tokenBuffer1.writeOmittedField("hi!");
        boolean boolean66 = tokenBuffer1.isClosed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(formatSchema8);
        org.junit.Assert.assertNull(formatSchema14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(segment20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 79 + "'", int42 == 79);
        org.junit.Assert.assertNull(formatSchema48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonReadContext57);
        org.junit.Assert.assertNull(segment58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(formatSchema63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer5.asParser(objectCodec16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = tokenBuffer5.canUseSchema(formatSchema18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = parser24.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser24._segment = segment26;
        java.lang.Object obj29 = segment26.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec31);
        boolean boolean33 = tokenBuffer32._hasNativeTypeIds;
        tokenBuffer32.writeFieldName("");
        int int36 = tokenBuffer32.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema37 = tokenBuffer32.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = tokenBuffer32.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec40);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = tokenBuffer32.append(tokenBuffer41);
        com.fasterxml.jackson.core.JsonToken jsonToken43 = tokenBuffer32.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = segment26.append(16, jsonToken43);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        boolean boolean47 = tokenBuffer46._hasNativeTypeIds;
        tokenBuffer46.writeFieldName("");
        int int50 = tokenBuffer46.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema51 = tokenBuffer46.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = tokenBuffer46.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer56 = tokenBuffer46.append(tokenBuffer55);
        tokenBuffer5._append(jsonToken43, (java.lang.Object) tokenBuffer56);
        int int58 = tokenBuffer56._generatorFeatures;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer60 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec59);
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        tokenBuffer60._objectCodec = objectCodec61;
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer64 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec63);
        boolean boolean65 = tokenBuffer64._hasNativeTypeIds;
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer64.writeBinary(byteArray69);
        tokenBuffer60._typeId = tokenBuffer64;
        tokenBuffer64.writeBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment74 = tokenBuffer64._last;
        com.fasterxml.jackson.core.TreeNode treeNode75 = null;
        tokenBuffer64.writeTree(treeNode75);
        tokenBuffer56._typeId = tokenBuffer64;
        boolean boolean78 = tokenBuffer56.isClosed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(formatSchema25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79 + "'", int36 == 79);
        org.junit.Assert.assertNull(formatSchema37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(tokenBuffer42);
        org.junit.Assert.assertTrue("'" + jsonToken43 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken43.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 79 + "'", int50 == 79);
        org.junit.Assert.assertNull(formatSchema51);
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNotNull(tokenBuffer56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        boolean boolean16 = tokenBuffer15._hasNativeTypeIds;
        tokenBuffer15.writeFieldName("");
        int int19 = tokenBuffer15.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = tokenBuffer15.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer15.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = tokenBuffer15.append(tokenBuffer24);
        com.fasterxml.jackson.core.JsonToken jsonToken26 = tokenBuffer15.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = parser31.getSchema();
        boolean boolean33 = parser31._hasNativeObjectIds;
        long long35 = parser31.getValueAsLong((long) (byte) 1);
        parser31._closed = true;
        boolean boolean39 = parser31.getValueAsBoolean(true);
        int int40 = parser31.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken41 = parser31.getCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation42 = parser31.getCurrentLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken43 = parser31.peekNextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser48 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment44, objectCodec45, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = parser48.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment50 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser48._segment = segment50;
        java.lang.Boolean boolean52 = parser48.nextBooleanValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = segment6.append((int) ' ', jsonToken26, (java.lang.Object) parser31, (java.lang.Object) boolean52);
        java.lang.Object[] objArray54 = segment6._tokens;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(tokenBuffer25);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(jsonToken41);
        org.junit.Assert.assertNotNull(jsonLocation42);
        org.junit.Assert.assertNull(jsonToken43);
        org.junit.Assert.assertNull(formatSchema49);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(segment53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._first;
        tokenBuffer2.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer2.useDefaultPrettyPrinter();
        tokenBuffer2.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer2.getOutputContext();
        com.fasterxml.jackson.core.SerializableString serializableString10 = null;
        tokenBuffer2.writeString(serializableString10);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer2.setCharacterEscapes(characterEscapes12);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = tokenBuffer2.setFeatureMask((int) 'a');
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = tokenBuffer2.getCharacterEscapes();
        boolean boolean17 = tokenBuffer2.canWriteBinaryNatively();
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer2._reportUnsupportedOperation();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonGenerator15);
        org.junit.Assert.assertNull(characterEscapes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        java.lang.String str7 = parser4.getCurrentName();
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = null;
        boolean boolean9 = parser4.canUseSchema(formatSchema8);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer1.writeBinary(byteArray6);
        tokenBuffer1._mayHaveNativeIds = false;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = tokenBuffer1.setCharacterEscapes(characterEscapes10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer1.writeNumber(bigInteger12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator11);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        boolean boolean12 = parser4.getValueAsBoolean(true);
        int int13 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.getCurrentToken();
        int int15 = parser4.getCurrentTokenId();
        boolean boolean16 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = parser4._codec;
        boolean boolean19 = parser4.getValueAsBoolean(true);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(objectCodec17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        tokenBuffer5._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        tokenBuffer9._objectCodec = objectCodec10;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer13.writeBinary(byteArray18);
        tokenBuffer9._typeId = tokenBuffer13;
        boolean boolean21 = tokenBuffer13.isClosed();
        tokenBuffer5.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer13);
        java.lang.Object obj23 = tokenBuffer13.getOutputTarget();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer13);
        boolean boolean25 = tokenBuffer13._mayHaveNativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        tokenBuffer27._objectCodec = objectCodec28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        boolean boolean32 = tokenBuffer31._hasNativeTypeIds;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer31.writeBinary(byteArray36);
        tokenBuffer27._typeId = tokenBuffer31;
        boolean boolean39 = tokenBuffer31.isClosed();
        tokenBuffer13.writeObjectId((java.lang.Object) tokenBuffer31);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = tokenBuffer13.setPrettyPrinter(prettyPrinter41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = tokenBuffer13._objectCodec;
        boolean boolean44 = tokenBuffer13._hasNativeObjectIds;
        java.math.BigInteger bigInteger45 = null;
        tokenBuffer13.writeNumber(bigInteger45);
        tokenBuffer13.writeNumber((long) (byte) 0);
        boolean boolean49 = tokenBuffer13.isClosed();
        boolean boolean50 = tokenBuffer13.isClosed();
        tokenBuffer13._generatorFeatures = 7;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNull(objectCodec43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        double double11 = parser4.getValueAsDouble(0.0d);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser4.nextValue();
        int int13 = parser4.getValueAsInt();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer5.asParser(objectCodec16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = tokenBuffer5.canUseSchema(formatSchema18);
        tokenBuffer5._generatorFeatures = 0;
        tokenBuffer5.writeNumber((int) (short) 100);
        tokenBuffer5.writeNumberField("", 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = tokenBuffer5.asParser(objectCodec27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        tokenBuffer5._objectCodec = objectCodec29;
        tokenBuffer5.writeNumber((short) (byte) 0);
        java.lang.Class<?> wildcardClass33 = tokenBuffer5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumber(bigDecimal6);
        java.lang.String str8 = tokenBuffer1.toString();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = tokenBuffer1.asParser(objectCodec9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        tokenBuffer12._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = parser19.getSchema();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = tokenBuffer12.asParser((com.fasterxml.jackson.core.JsonParser) parser19);
        tokenBuffer12.writeNumberField("hi!", (float) 0);
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer12);
        tokenBuffer1.writeNull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[TokenBuffer: VALUE_NULL]" + "'", str8, "[TokenBuffer: VALUE_NULL]");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertNotNull(jsonParser21);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        com.fasterxml.jackson.core.Version version16 = parser15.version();
        java.lang.Object obj17 = parser15.getEmbeddedObject();
        int int18 = parser15.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        parser15._codec = objectCodec19;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = parser15.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        boolean boolean10 = segment6.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = segment6._next;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec12, true, false);
        java.lang.String str16 = parser15.nextTextValue();
        java.lang.Object obj17 = parser15.getTypeId();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = parser15.setFeatureMask(0);
        int int21 = parser15.nextIntValue((int) (short) -1);
        com.fasterxml.jackson.core.JsonToken jsonToken22 = parser15.nextToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(segment11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonToken22);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        tokenBuffer1._first = segment13;
        com.fasterxml.jackson.core.TreeNode treeNode15 = null;
        tokenBuffer1.writeTree(treeNode15);
        tokenBuffer1._generatorFeatures = 32;
        tokenBuffer1.writeNumber((float) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        parser4.setCodec(objectCodec6);
        parser4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = parser4.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        double double11 = parser4.getValueAsDouble(0.0d);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser4.nextValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = parser4.getCodec();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.nextValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext15 = parser4._parsingContext;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = parser4.setFeatureMask(2);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = parser4.disable(feature18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(objectCodec13);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNotNull(jsonReadContext15);
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setPrettyPrinter(prettyPrinter7);
        java.math.BigInteger bigInteger9 = null;
        tokenBuffer1.writeNumber(bigInteger9);
        boolean boolean11 = tokenBuffer1._hasNativeTypeIds;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._closed;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.getCurrentToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumber(bigDecimal6);
        java.lang.Object obj8 = tokenBuffer1._typeId;
        tokenBuffer1.writeNumber((double) 10L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11, true);
        java.lang.Object obj14 = tokenBuffer13._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        tokenBuffer16._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = tokenBuffer21._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment24, objectCodec25, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema29 = parser28.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment30 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser28._segment = segment30;
        java.lang.Object obj33 = segment30.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        boolean boolean37 = tokenBuffer36._hasNativeTypeIds;
        tokenBuffer36.writeFieldName("");
        int int40 = tokenBuffer36.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = tokenBuffer36.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = tokenBuffer36.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = tokenBuffer36.append(tokenBuffer45);
        com.fasterxml.jackson.core.JsonToken jsonToken47 = tokenBuffer36.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = segment30.append(16, jsonToken47);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment50 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser54 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment50, objectCodec51, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema55 = parser54.getSchema();
        boolean boolean56 = parser54._hasNativeObjectIds;
        long long58 = parser54.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version59 = parser54.version();
        boolean boolean60 = parser54._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder61 = null;
        parser54._byteBuilder = byteArrayBuilder61;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment63 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser67 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment63, objectCodec64, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema68 = parser67.getSchema();
        boolean boolean69 = parser67._hasNativeObjectIds;
        long long71 = parser67.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version72 = parser67.version();
        boolean boolean73 = parser67._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder74 = null;
        parser67._byteBuilder = byteArrayBuilder74;
        boolean boolean76 = parser67.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext77 = parser67._parsingContext;
        parser54._parsingContext = jsonReadContext77;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment79 = segment22.append(16, jsonToken47, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext77);
        tokenBuffer16._append(jsonToken47);
        tokenBuffer13._append(jsonToken47);
        tokenBuffer1._append(jsonToken47);
        char[] charArray85 = new char[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw(charArray85, 16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(segment22);
        org.junit.Assert.assertNull(formatSchema29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 79 + "'", int40 == 79);
        org.junit.Assert.assertNull(formatSchema41);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNotNull(tokenBuffer46);
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment48);
        org.junit.Assert.assertNull(formatSchema55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(formatSchema68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jsonReadContext77);
        org.junit.Assert.assertNotNull(segment79);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { ' ', '4' });
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = tokenBuffer1.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = tokenBuffer1.getSchema();
        int int11 = tokenBuffer1.getHighestEscapedChar();
        boolean boolean12 = tokenBuffer1.canWriteTypeId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(characterEscapes9);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer5.asParser(objectCodec16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = tokenBuffer5.canUseSchema(formatSchema18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = parser24.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser24._segment = segment26;
        java.lang.Object obj29 = segment26.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec31);
        boolean boolean33 = tokenBuffer32._hasNativeTypeIds;
        tokenBuffer32.writeFieldName("");
        int int36 = tokenBuffer32.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema37 = tokenBuffer32.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = tokenBuffer32.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec40);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = tokenBuffer32.append(tokenBuffer41);
        com.fasterxml.jackson.core.JsonToken jsonToken43 = tokenBuffer32.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = segment26.append(16, jsonToken43);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        boolean boolean47 = tokenBuffer46._hasNativeTypeIds;
        tokenBuffer46.writeFieldName("");
        int int50 = tokenBuffer46.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema51 = tokenBuffer46.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = tokenBuffer46.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer56 = tokenBuffer46.append(tokenBuffer55);
        tokenBuffer5._append(jsonToken43, (java.lang.Object) tokenBuffer56);
        int int58 = tokenBuffer56._generatorFeatures;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer60 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec59);
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        tokenBuffer60._objectCodec = objectCodec61;
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer64 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec63);
        boolean boolean65 = tokenBuffer64._hasNativeTypeIds;
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer64.writeBinary(byteArray69);
        tokenBuffer60._typeId = tokenBuffer64;
        tokenBuffer64.writeBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment74 = tokenBuffer64._last;
        com.fasterxml.jackson.core.TreeNode treeNode75 = null;
        tokenBuffer64.writeTree(treeNode75);
        tokenBuffer56._typeId = tokenBuffer64;
        tokenBuffer64.writeNumberField("hi!", 0.0d);
        tokenBuffer64.writeNumber("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(formatSchema25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79 + "'", int36 == 79);
        org.junit.Assert.assertNull(formatSchema37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(tokenBuffer42);
        org.junit.Assert.assertTrue("'" + jsonToken43 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken43.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 79 + "'", int50 == 79);
        org.junit.Assert.assertNull(formatSchema51);
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNotNull(tokenBuffer56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment74);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        boolean boolean3 = tokenBuffer1._mayHaveNativeIds;
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = tokenBuffer1.canUseSchema(formatSchema4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext6 = tokenBuffer1.getOutputContext();
        tokenBuffer1.writeNumberField("[TokenBuffer: START_ARRAY]", 35L);
        tokenBuffer1.writeNumber("[TokenBuffer: VALUE_NULL]");
        boolean boolean12 = tokenBuffer1.canOmitFields();
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = null;
        boolean boolean14 = tokenBuffer1.canUseSchema(formatSchema13);
        tokenBuffer1.writeNumber((float) (short) 10);
        tokenBuffer1._hasNativeId = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment5, objectCodec6, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser9.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser9._segment = segment11;
        tokenBuffer2.writeObjectField("", (java.lang.Object) segment11);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer2._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        tokenBuffer17._objectCodec = objectCodec18;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        boolean boolean22 = tokenBuffer21._hasNativeTypeIds;
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer21.writeBinary(byteArray26);
        tokenBuffer17._typeId = tokenBuffer21;
        tokenBuffer21.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = tokenBuffer21.asParser(objectCodec32);
        com.fasterxml.jackson.core.SerializableString serializableString34 = null;
        tokenBuffer21.writeString(serializableString34);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = tokenBuffer21.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        boolean boolean39 = tokenBuffer38._hasNativeTypeIds;
        tokenBuffer38._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = segment14.append(32, jsonToken36, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray44 = segment14._tokens;
        boolean boolean45 = segment14.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment14, objectCodec46, true, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment52, objectCodec53, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema57 = parser56.getSchema();
        parser56.close();
        com.fasterxml.jackson.core.JsonToken jsonToken59 = parser56.nextValue();
        com.fasterxml.jackson.core.JsonToken jsonToken60 = parser56.peekNextToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer62 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec61);
        boolean boolean63 = tokenBuffer62._hasNativeTypeIds;
        tokenBuffer62.close();
        tokenBuffer62.writeNumberField("hi!", (long) (short) 0);
        java.lang.Object obj68 = tokenBuffer62._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer70 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec69);
        tokenBuffer70._closed = false;
        tokenBuffer70.writeBooleanField("", true);
        boolean boolean76 = tokenBuffer70._hasNativeTypeIds;
        byte[] byteArray78 = new byte[] { (byte) 0 };
        tokenBuffer70.writeBinary(byteArray78);
        tokenBuffer62.writeBinary(byteArray78);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment82 = segment14.appendRaw((int) 'a', (int) (short) 1, (java.lang.Object) parser56, (java.lang.Object) byteArray78, (java.lang.Object) 0);
        java.lang.Object obj84 = segment82.get(11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(segment43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(formatSchema57);
        org.junit.Assert.assertNull(jsonToken59);
        org.junit.Assert.assertNull(jsonToken60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(segment82);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        tokenBuffer1.writeNumberField("hi!", (long) (short) 0);
        int int7 = tokenBuffer1._generatorFeatures;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        int int7 = tokenBuffer1._appendAt;
        tokenBuffer1.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = tokenBuffer1.setCodec(objectCodec10);
        tokenBuffer1.writeNumberField("hi!", (long) (-1));
        tokenBuffer1.writeBoolean(true);
        tokenBuffer1.writeNumber("[TokenBuffer: VALUE_EMBEDDED_OBJECT, END_ARRAY, VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator11);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        boolean boolean13 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext14 = parser4._parsingContext;
        com.fasterxml.jackson.core.SerializableString serializableString15 = null;
        boolean boolean16 = parser4.nextFieldName(serializableString15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = parser4.nextToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = parser4.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = parser4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonReadContext14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNotNull(jsonLocation18);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumber(bigDecimal6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer10._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser17._segment = segment19;
        java.lang.Object obj22 = segment19.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        boolean boolean26 = tokenBuffer25._hasNativeTypeIds;
        tokenBuffer25.writeFieldName("");
        int int29 = tokenBuffer25.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = tokenBuffer25.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer25.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = tokenBuffer25.append(tokenBuffer34);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = tokenBuffer25.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = segment19.append(16, jsonToken36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment39, objectCodec40, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema44 = parser43.getSchema();
        boolean boolean45 = parser43._hasNativeObjectIds;
        long long47 = parser43.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version48 = parser43.version();
        boolean boolean49 = parser43._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder50 = null;
        parser43._byteBuilder = byteArrayBuilder50;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment52, objectCodec53, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema57 = parser56.getSchema();
        boolean boolean58 = parser56._hasNativeObjectIds;
        long long60 = parser56.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version61 = parser56.version();
        boolean boolean62 = parser56._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder63 = null;
        parser56._byteBuilder = byteArrayBuilder63;
        boolean boolean65 = parser56.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext66 = parser56._parsingContext;
        parser43._parsingContext = jsonReadContext66;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = segment11.append(16, jsonToken36, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer70 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec69);
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator72 = tokenBuffer70.setCodec(objectCodec71);
        tokenBuffer1._append(jsonToken36, (java.lang.Object) tokenBuffer70);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment74 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser78 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment74, objectCodec75, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema79 = parser78.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment80 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser78._segment = segment80;
        int int82 = parser78.getTextLength();
        java.lang.Boolean boolean83 = parser78.nextBooleanValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment84 = parser78._segment;
        com.fasterxml.jackson.core.JsonParser jsonParser85 = tokenBuffer70.asParser((com.fasterxml.jackson.core.JsonParser) parser78);
        int int86 = parser78.getFeatureMask();
        java.lang.Object obj87 = parser78.getTypeId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(segment11);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 79 + "'", int29 == 79);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(tokenBuffer35);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment37);
        org.junit.Assert.assertNull(formatSchema44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(formatSchema57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonReadContext66);
        org.junit.Assert.assertNotNull(segment68);
        org.junit.Assert.assertNotNull(jsonGenerator72);
        org.junit.Assert.assertNull(formatSchema79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(boolean83);
        org.junit.Assert.assertNotNull(segment84);
        org.junit.Assert.assertNotNull(jsonParser85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1._hasNativeId = false;
        tokenBuffer1.writeEndArray();
        org.junit.Assert.assertNull(prettyPrinter2);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer6 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = tokenBuffer6.getSchema();
        boolean boolean8 = tokenBuffer6._hasNativeId;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(formatSchema7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        boolean boolean13 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext14 = parser4._parsingContext;
        com.fasterxml.jackson.core.SerializableString serializableString15 = null;
        boolean boolean16 = parser4.nextFieldName(serializableString15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = parser4.nextToken();
        boolean boolean18 = parser4._hasNativeIds;
        int int20 = parser4.nextIntValue((int) (short) 1);
        boolean boolean21 = parser4.isClosed();
        java.lang.String str23 = parser4.getValueAsString("hi!");
        boolean boolean25 = parser4.getValueAsBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal26 = parser4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonReadContext14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        tokenBuffer1.writeNullField("hi!");
        com.fasterxml.jackson.core.TreeNode treeNode6 = null;
        tokenBuffer1.writeTree(treeNode6);
        tokenBuffer1.writeStartArray((int) (byte) -1);
        boolean boolean10 = tokenBuffer1.isClosed();
        tokenBuffer1._closed = true;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        tokenBuffer1.writeNumber("hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = tokenBuffer1.setCharacterEscapes(characterEscapes9);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes11 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer1.setCharacterEscapes(characterEscapes11);
        java.lang.Object obj13 = tokenBuffer1._objectId;
        com.fasterxml.jackson.core.JsonToken jsonToken14 = tokenBuffer1.firstToken();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext15 = tokenBuffer1.getOutputContext();
        tokenBuffer1._generatorFeatures = '4';
        boolean boolean18 = tokenBuffer1.isClosed();
        com.fasterxml.jackson.core.SerializableString serializableString19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw(serializableString19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(jsonWriteContext15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        tokenBuffer5._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        tokenBuffer9._objectCodec = objectCodec10;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer13.writeBinary(byteArray18);
        tokenBuffer9._typeId = tokenBuffer13;
        boolean boolean21 = tokenBuffer13.isClosed();
        tokenBuffer5.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer13);
        java.lang.Object obj23 = tokenBuffer13.getOutputTarget();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer13);
        boolean boolean25 = tokenBuffer13._mayHaveNativeIds;
        tokenBuffer13.writeEndArray();
        com.fasterxml.jackson.core.Version version27 = tokenBuffer13.version();
        tokenBuffer13.writeNumber("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = tokenBuffer13.setCodec(objectCodec30);
        com.fasterxml.jackson.core.JsonToken jsonToken32 = tokenBuffer13.firstToken();
        java.lang.String str33 = tokenBuffer13.toString();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35, true);
        java.lang.Object obj38 = tokenBuffer37._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser44 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment40, objectCodec41, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema45 = parser44.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment46 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser44._segment = segment46;
        tokenBuffer37.writeObjectField("", (java.lang.Object) segment46);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment49 = tokenBuffer37._last;
        java.math.BigInteger bigInteger50 = null;
        tokenBuffer37.writeNumber(bigInteger50);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer53 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec52);
        boolean boolean54 = tokenBuffer53._hasNativeTypeIds;
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer53.writeBinary(byteArray58);
        tokenBuffer37.writeBinary(byteArray58, (int) (byte) 1, (int) (short) 1);
        tokenBuffer13.writeBinaryField("[TokenBuffer: FIELD_NAME(hi!), VALUE_FALSE, VALUE_NUMBER_INT, FIELD_NAME(hi!), VALUE_TRUE]", byteArray58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertTrue("'" + jsonToken32 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken32.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[TokenBuffer: VALUE_EMBEDDED_OBJECT, END_ARRAY, VALUE_NUMBER_FLOAT]" + "'", str33, "[TokenBuffer: VALUE_EMBEDDED_OBJECT, END_ARRAY, VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(formatSchema45);
        org.junit.Assert.assertNotNull(segment49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        long long12 = parser4.nextLongValue((long) 100);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext13 = parser4.getParsingContext();
        boolean boolean14 = parser4._hasNativeObjectIds;
        java.lang.String str15 = parser4.getValueAsString();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = parser4._byteBuilder;
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = parser4._location;
        int int19 = parser4.getValueAsInt(10);
        java.lang.String str20 = parser4.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation21 = parser4.getTokenLocation();
        java.lang.Boolean boolean22 = parser4.nextBooleanValue();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(jsonStreamContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteArrayBuilder16);
        org.junit.Assert.assertNull(jsonLocation17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(jsonLocation21);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadObjectId();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = parser4.setFeatureMask(79);
        java.lang.String str13 = parser4.getCurrentName();
        long long15 = parser4.getValueAsLong((long) (-1));
        java.lang.String str16 = parser4.nextTextValue();
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = parser4.getBinaryValue(base64Variant17);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._hasNativeIds;
        com.fasterxml.jackson.core.SerializableString serializableString8 = null;
        boolean boolean9 = parser4.nextFieldName(serializableString8);
        long long11 = parser4.nextLongValue((long) 2);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder12 = null;
        parser4._byteBuilder = byteArrayBuilder12;
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.nextToken();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = parser4.getCurrentToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._last;
        java.math.BigDecimal bigDecimal4 = null;
        tokenBuffer2.writeNumber(bigDecimal4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer2.setCodec(objectCodec6);
        tokenBuffer2.writeFieldName("[TokenBuffer: VALUE_NULL, END_OBJECT, FIELD_NAME([TokenBuffer: ]), VALUE_STRING]");
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertNotNull(jsonGenerator7);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeId;
        java.lang.Object obj3 = tokenBuffer1._typeId;
        com.fasterxml.jackson.core.Version version4 = tokenBuffer1.version();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment5, objectCodec6, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser9.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser9._segment = segment11;
        java.lang.Object obj14 = segment11.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        boolean boolean18 = tokenBuffer17._hasNativeTypeIds;
        tokenBuffer17.writeFieldName("");
        int int21 = tokenBuffer17.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = tokenBuffer17.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = tokenBuffer17.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = tokenBuffer17.append(tokenBuffer26);
        com.fasterxml.jackson.core.JsonToken jsonToken28 = tokenBuffer17.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment29 = segment11.append(16, jsonToken28);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser35 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment31, objectCodec32, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = parser35.getSchema();
        boolean boolean37 = parser35._hasNativeObjectIds;
        long long39 = parser35.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version40 = parser35.version();
        boolean boolean41 = parser35._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder42 = null;
        parser35._byteBuilder = byteArrayBuilder42;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser48 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment44, objectCodec45, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = parser48.getSchema();
        boolean boolean50 = parser48._hasNativeObjectIds;
        long long52 = parser48.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version53 = parser48.version();
        boolean boolean54 = parser48._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder55 = null;
        parser48._byteBuilder = byteArrayBuilder55;
        boolean boolean57 = parser48.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext58 = parser48._parsingContext;
        parser35._parsingContext = jsonReadContext58;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = segment3.append(16, jsonToken28, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext58);
        java.lang.Object obj62 = segment3.findTypeId((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser64 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment3, objectCodec63);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser66 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment3, objectCodec65);
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 79 + "'", int21 == 79);
        org.junit.Assert.assertNull(formatSchema22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertNotNull(tokenBuffer27);
        org.junit.Assert.assertTrue("'" + jsonToken28 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken28.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment29);
        org.junit.Assert.assertNull(formatSchema36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(formatSchema49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jsonReadContext58);
        org.junit.Assert.assertNotNull(segment60);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment5, objectCodec6, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser9.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser9._segment = segment11;
        tokenBuffer2.writeObjectField("", (java.lang.Object) segment11);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer2._last;
        java.math.BigInteger bigInteger15 = null;
        tokenBuffer2.writeNumber(bigInteger15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        boolean boolean19 = tokenBuffer18._hasNativeTypeIds;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer18.writeBinary(byteArray23);
        tokenBuffer2.writeBinary(byteArray23, (int) (byte) 1, (int) (short) 1);
        tokenBuffer2.writeNumber((float) (byte) 1);
        tokenBuffer2.writeNumber("hi!");
        tokenBuffer2._appendAt = (byte) 0;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = tokenBuffer2.setFeatureMask(52);
        java.lang.Object obj36 = tokenBuffer2.getOutputTarget();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        tokenBuffer38._objectCodec = objectCodec39;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = tokenBuffer38._objectCodec;
        boolean boolean42 = tokenBuffer38._closed;
        tokenBuffer38.writeNumber("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        tokenBuffer46._objectCodec = objectCodec47;
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer50 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec49);
        boolean boolean51 = tokenBuffer50._hasNativeTypeIds;
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer50.writeBinary(byteArray55);
        tokenBuffer46._typeId = tokenBuffer50;
        tokenBuffer50.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser62 = tokenBuffer50.asParser(objectCodec61);
        com.fasterxml.jackson.core.FormatSchema formatSchema63 = null;
        boolean boolean64 = tokenBuffer50.canUseSchema(formatSchema63);
        tokenBuffer50._generatorFeatures = 0;
        tokenBuffer50.writeNumber((int) (short) 100);
        tokenBuffer50.writeNumberField("", 0);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext72 = tokenBuffer50.getOutputContext();
        tokenBuffer38._writeContext = jsonWriteContext72;
        tokenBuffer2._writeContext = jsonWriteContext72;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(objectCodec41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext72);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        tokenBuffer1.writeNumberField("", (double) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        boolean boolean10 = tokenBuffer9._hasNativeId;
        tokenBuffer1._objectId = tokenBuffer9;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        tokenBuffer13._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        tokenBuffer17._objectCodec = objectCodec18;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        boolean boolean22 = tokenBuffer21._hasNativeTypeIds;
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer21.writeBinary(byteArray26);
        tokenBuffer17._typeId = tokenBuffer21;
        boolean boolean29 = tokenBuffer21.isClosed();
        tokenBuffer13.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = tokenBuffer9.append(tokenBuffer21);
        boolean boolean32 = tokenBuffer31._hasNativeTypeIds;
        boolean boolean33 = tokenBuffer31.canWriteTypeId();
        com.fasterxml.jackson.core.FormatSchema formatSchema34 = tokenBuffer31.getSchema();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext35 = tokenBuffer31._writeContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = tokenBuffer31._last;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tokenBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(formatSchema34);
        org.junit.Assert.assertNotNull(jsonWriteContext35);
        org.junit.Assert.assertNotNull(segment36);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer1.writeBinary(byteArray6);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer1._writeContext;
        java.math.BigDecimal bigDecimal11 = null;
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL]", bigDecimal11);
        boolean boolean13 = tokenBuffer1.isClosed();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = tokenBuffer1.asParser(objectCodec14);
        char[] charArray19 = new char[] { '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw(charArray19, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean19 = tokenBuffer14._hasNativeId;
        int int20 = tokenBuffer14._appendAt;
        tokenBuffer14.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = tokenBuffer14.useDefaultPrettyPrinter();
        tokenBuffer1._typeId = tokenBuffer14;
        tokenBuffer14.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        tokenBuffer27._objectCodec = objectCodec28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        boolean boolean32 = tokenBuffer31._hasNativeTypeIds;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer31.writeBinary(byteArray36);
        tokenBuffer27._typeId = tokenBuffer31;
        tokenBuffer27._mayHaveNativeIds = false;
        tokenBuffer14.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        boolean boolean44 = tokenBuffer43._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer47 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec46);
        tokenBuffer47._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer51 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec50);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        tokenBuffer51._objectCodec = objectCodec52;
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        boolean boolean56 = tokenBuffer55._hasNativeTypeIds;
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer55.writeBinary(byteArray60);
        tokenBuffer51._typeId = tokenBuffer55;
        boolean boolean63 = tokenBuffer55.isClosed();
        tokenBuffer47.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer55);
        java.lang.Object obj65 = tokenBuffer55.getOutputTarget();
        tokenBuffer43.writeObjectField("hi!", (java.lang.Object) tokenBuffer55);
        boolean boolean67 = tokenBuffer55._mayHaveNativeIds;
        tokenBuffer55.writeEndArray();
        com.fasterxml.jackson.core.Version version69 = tokenBuffer55.version();
        tokenBuffer55.writeNumber("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec72 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator73 = tokenBuffer55.setCodec(objectCodec72);
        com.fasterxml.jackson.core.JsonToken jsonToken74 = tokenBuffer55.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer76 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec75);
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        tokenBuffer76._objectCodec = objectCodec77;
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer80 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec79);
        boolean boolean81 = tokenBuffer80._hasNativeTypeIds;
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer80.writeBinary(byteArray85);
        tokenBuffer76._typeId = tokenBuffer80;
        tokenBuffer80.writeNumberField("hi!", (float) '#');
        boolean boolean91 = tokenBuffer80.canWriteObjectId();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter92 = tokenBuffer80.getPrettyPrinter();
        int int93 = tokenBuffer80.getHighestEscapedChar();
        boolean boolean94 = tokenBuffer80.canWriteBinaryNatively();
        tokenBuffer14._append(jsonToken74, (java.lang.Object) boolean94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(version69);
        org.junit.Assert.assertNotNull(jsonGenerator73);
        org.junit.Assert.assertTrue("'" + jsonToken74 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken74.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(prettyPrinter92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1.writeNumberField("[TokenBuffer: ]", (long) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = parser13.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser13._segment = segment15;
        java.lang.Object obj18 = segment15.findTypeId(16);
        java.lang.Object obj20 = segment15.findObjectId((int) ' ');
        java.lang.Object[] objArray21 = segment15._tokens;
        boolean boolean22 = segment15.hasIds();
        segment15._tokenTypes = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        boolean boolean28 = tokenBuffer27._hasNativeTypeIds;
        tokenBuffer27.writeFieldName("");
        int int31 = tokenBuffer27.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = tokenBuffer27.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer27.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = tokenBuffer27.append(tokenBuffer36);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = tokenBuffer27.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = segment15.append(100, jsonToken38);
        tokenBuffer1.writeTypeId((java.lang.Object) segment39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41, true);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = tokenBuffer43.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = parser49.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser49._segment = segment51;
        com.fasterxml.jackson.core.JsonToken jsonToken53 = parser49.getLastClearedToken();
        tokenBuffer43.writeTypeId((java.lang.Object) parser49);
        com.fasterxml.jackson.core.TreeNode treeNode55 = null;
        tokenBuffer43.writeTree(treeNode55);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = tokenBuffer1.append(tokenBuffer43);
        tokenBuffer57.writeBoolean(false);
        java.lang.Object obj60 = tokenBuffer57.getOutputTarget();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(formatSchema14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 79 + "'", int31 == 79);
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNotNull(tokenBuffer37);
        org.junit.Assert.assertTrue("'" + jsonToken38 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken38.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment39);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNull(formatSchema50);
        org.junit.Assert.assertNull(jsonToken53);
        org.junit.Assert.assertNotNull(tokenBuffer57);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._hasNativeIds;
        com.fasterxml.jackson.core.SerializableString serializableString8 = null;
        boolean boolean9 = parser4.nextFieldName(serializableString8);
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = parser4.configure(feature10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        tokenBuffer5._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        tokenBuffer9._objectCodec = objectCodec10;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer13.writeBinary(byteArray18);
        tokenBuffer9._typeId = tokenBuffer13;
        boolean boolean21 = tokenBuffer13.isClosed();
        tokenBuffer5.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer13);
        java.lang.Object obj23 = tokenBuffer13.getOutputTarget();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer13);
        boolean boolean25 = tokenBuffer13._mayHaveNativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = tokenBuffer13.asParser(objectCodec26);
        tokenBuffer13.close();
        tokenBuffer13.writeObjectFieldStart("[TokenBuffer: VALUE_EMBEDDED_OBJECT, END_ARRAY, VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser27);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._first;
        tokenBuffer2.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer2.useDefaultPrettyPrinter();
        tokenBuffer2.writeNumberField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT, END_ARRAY, VALUE_EMBEDDED_OBJECT]", (int) (byte) 0);
        boolean boolean11 = tokenBuffer2.canOmitFields();
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        java.lang.Object obj14 = parser4.getInputSource();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = parser4.getCodec();
        int int17 = parser4._segmentPtr;
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        boolean boolean19 = parser4.nextFieldName(serializableString18);
        int int20 = parser4._segmentPtr;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(objectCodec16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._generatorFeatures = (byte) -1;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer1.setCodec(objectCodec4);
        tokenBuffer1.writeNumber((long) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer10._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser17._segment = segment19;
        java.lang.Object obj22 = segment19.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        boolean boolean26 = tokenBuffer25._hasNativeTypeIds;
        tokenBuffer25.writeFieldName("");
        int int29 = tokenBuffer25.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = tokenBuffer25.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer25.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = tokenBuffer25.append(tokenBuffer34);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = tokenBuffer25.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = segment19.append(16, jsonToken36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment39, objectCodec40, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema44 = parser43.getSchema();
        boolean boolean45 = parser43._hasNativeObjectIds;
        long long47 = parser43.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version48 = parser43.version();
        boolean boolean49 = parser43._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder50 = null;
        parser43._byteBuilder = byteArrayBuilder50;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment52, objectCodec53, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema57 = parser56.getSchema();
        boolean boolean58 = parser56._hasNativeObjectIds;
        long long60 = parser56.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version61 = parser56.version();
        boolean boolean62 = parser56._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder63 = null;
        parser56._byteBuilder = byteArrayBuilder63;
        boolean boolean65 = parser56.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext66 = parser56._parsingContext;
        parser43._parsingContext = jsonReadContext66;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = segment11.append(16, jsonToken36, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer72 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec71);
        com.fasterxml.jackson.core.ObjectCodec objectCodec73 = null;
        tokenBuffer72._objectCodec = objectCodec73;
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = tokenBuffer72._objectCodec;
        java.lang.Object obj76 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer79 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec77, true);
        java.lang.Object obj80 = tokenBuffer79._objectId;
        tokenBuffer79.writeNumber((double) 16);
        tokenBuffer79._appendAt = 10;
        tokenBuffer79._mayHaveNativeIds = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment87 = segment11.appendRaw((int) (byte) 100, (int) (byte) 0, (java.lang.Object) objectCodec75, obj76, (java.lang.Object) tokenBuffer79);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap88 = segment11._nativeIds;
        tokenBuffer1._last = segment11;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap90 = segment11._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec91 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser94 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec91, false, false);
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertNotNull(segment11);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 79 + "'", int29 == 79);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(tokenBuffer35);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment37);
        org.junit.Assert.assertNull(formatSchema44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(formatSchema57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonReadContext66);
        org.junit.Assert.assertNotNull(segment68);
        org.junit.Assert.assertNull(objectCodec75);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(segment87);
        org.junit.Assert.assertNull(intMap88);
        org.junit.Assert.assertNull(intMap90);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        tokenBuffer1.writeNumberField("hi!", (long) (short) 0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter7 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeObjectFieldStart("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT]");
        tokenBuffer1.writeEndObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(prettyPrinter7);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter7 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeFieldName("[TokenBuffer: VALUE_NUMBER_INT]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(prettyPrinter7);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        parser4._location = jsonLocation9;
        boolean boolean11 = parser4.getValueAsBoolean();
        java.lang.String str13 = parser4.getValueAsString("[TokenBuffer: VALUE_STRING, VALUE_NUMBER_INT]");
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[TokenBuffer: VALUE_STRING, VALUE_NUMBER_INT]" + "'", str13, "[TokenBuffer: VALUE_STRING, VALUE_NUMBER_INT]");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        boolean boolean10 = segment6.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = segment6._next;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap12 = segment6._nativeIds;
        java.lang.Object obj14 = segment6.findTypeId((int) (short) 100);
        java.lang.Object[] objArray15 = segment6._tokens;
        long long16 = segment6._tokenTypes;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(segment11);
        org.junit.Assert.assertNull(intMap12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer5.writeBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = tokenBuffer5._last;
        com.fasterxml.jackson.core.TreeNode treeNode16 = null;
        tokenBuffer5.writeTree(treeNode16);
        tokenBuffer5.writeArrayFieldStart("[TokenBuffer: VALUE_NUMBER_INT]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment15);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        boolean boolean8 = parser4._hasNativeObjectIds;
        int int9 = parser4.getCurrentTokenId();
        boolean boolean10 = parser4.hasTextCharacters();
        int int12 = parser4.getValueAsInt((int) (short) -1);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.nextValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = parser4._codec;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNull(objectCodec14);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._first;
        tokenBuffer2.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer2.useDefaultPrettyPrinter();
        tokenBuffer2.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer2.getOutputContext();
        com.fasterxml.jackson.core.SerializableString serializableString10 = null;
        tokenBuffer2.writeString(serializableString10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        boolean boolean15 = tokenBuffer13._mayHaveNativeIds;
        tokenBuffer2.writeTypeId((java.lang.Object) tokenBuffer13);
        tokenBuffer13._appendAt = 32;
        tokenBuffer13._mayHaveNativeIds = true;
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeFieldName("");
        tokenBuffer1._mayHaveNativeIds = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        tokenBuffer1._objectCodec = objectCodec7;
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.setSchema(formatSchema9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(prettyPrinter2);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = tokenBuffer1._first;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = segment4.type(97);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec7);
        java.lang.String str10 = parser8.getValueAsString("[TokenBuffer: ]");
        java.lang.String str12 = parser8.getValueAsString("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = tokenBuffer15._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment18, objectCodec19, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = parser22.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser22._segment = segment24;
        java.lang.Object obj27 = segment24.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        boolean boolean31 = tokenBuffer30._hasNativeTypeIds;
        tokenBuffer30.writeFieldName("");
        int int34 = tokenBuffer30.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema35 = tokenBuffer30.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = tokenBuffer30.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer40 = tokenBuffer30.append(tokenBuffer39);
        com.fasterxml.jackson.core.JsonToken jsonToken41 = tokenBuffer30.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = segment24.append(16, jsonToken41);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment44 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser48 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment44, objectCodec45, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = parser48.getSchema();
        boolean boolean50 = parser48._hasNativeObjectIds;
        long long52 = parser48.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version53 = parser48.version();
        boolean boolean54 = parser48._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder55 = null;
        parser48._byteBuilder = byteArrayBuilder55;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment57 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser61 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment57, objectCodec58, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema62 = parser61.getSchema();
        boolean boolean63 = parser61._hasNativeObjectIds;
        long long65 = parser61.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version66 = parser61.version();
        boolean boolean67 = parser61._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder68 = null;
        parser61._byteBuilder = byteArrayBuilder68;
        boolean boolean70 = parser61.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext71 = parser61._parsingContext;
        parser48._parsingContext = jsonReadContext71;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment73 = segment16.append(16, jsonToken41, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext71);
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer77 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec76);
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        tokenBuffer77._objectCodec = objectCodec78;
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = tokenBuffer77._objectCodec;
        java.lang.Object obj81 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec82 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer84 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec82, true);
        java.lang.Object obj85 = tokenBuffer84._objectId;
        tokenBuffer84.writeNumber((double) 16);
        tokenBuffer84._appendAt = 10;
        tokenBuffer84._mayHaveNativeIds = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment92 = segment16.appendRaw((int) (byte) 100, (int) (byte) 0, (java.lang.Object) objectCodec80, obj81, (java.lang.Object) tokenBuffer84);
        parser8._segment = segment92;
        int int94 = parser8.getFeatureMask();
        org.junit.Assert.assertNotNull(segment4);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[TokenBuffer: ]" + "'", str10, "[TokenBuffer: ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(segment16);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 79 + "'", int34 == 79);
        org.junit.Assert.assertNull(formatSchema35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(tokenBuffer40);
        org.junit.Assert.assertTrue("'" + jsonToken41 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken41.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment42);
        org.junit.Assert.assertNull(formatSchema49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(formatSchema62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertNotNull(version66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jsonReadContext71);
        org.junit.Assert.assertNotNull(segment73);
        org.junit.Assert.assertNull(objectCodec80);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(segment92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        java.lang.Object obj14 = parser4.getInputSource();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        int int16 = tokenBuffer15.getFeatureMask();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext17 = tokenBuffer15.getOutputContext();
        tokenBuffer15.writeNumber("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]");
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext17);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        tokenBuffer5._objectCodec = objectCodec6;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        boolean boolean10 = tokenBuffer9._hasNativeTypeIds;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer9.writeBinary(byteArray14);
        tokenBuffer5._typeId = tokenBuffer9;
        boolean boolean17 = tokenBuffer9.isClosed();
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer9);
        java.lang.Object obj19 = tokenBuffer9.getOutputTarget();
        tokenBuffer9.writeEndObject();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        tokenBuffer5._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        tokenBuffer9._objectCodec = objectCodec10;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer13.writeBinary(byteArray18);
        tokenBuffer9._typeId = tokenBuffer13;
        boolean boolean21 = tokenBuffer13.isClosed();
        tokenBuffer5.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer13);
        java.lang.Object obj23 = tokenBuffer13.getOutputTarget();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer27.setCodec(objectCodec28);
        tokenBuffer1._appendRaw((int) '4', (java.lang.Object) tokenBuffer27);
        java.lang.Object obj31 = tokenBuffer27._typeId;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext32 = tokenBuffer27.getOutputContext();
        tokenBuffer27.writeNumberField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT, END_ARRAY, VALUE_EMBEDDED_OBJECT]", (int) (short) -1);
        tokenBuffer27.writeOmittedField("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]");
        com.fasterxml.jackson.core.FormatSchema formatSchema38 = tokenBuffer27.getSchema();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(jsonWriteContext32);
        org.junit.Assert.assertNull(formatSchema38);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        boolean boolean19 = parser17._hasNativeObjectIds;
        long long21 = parser17.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version22 = parser17.version();
        boolean boolean23 = parser17._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder24 = null;
        parser17._byteBuilder = byteArrayBuilder24;
        boolean boolean26 = parser17.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext27 = parser17._parsingContext;
        parser4._parsingContext = jsonReadContext27;
        double double30 = parser4.getValueAsDouble((double) (byte) 0);
        boolean boolean31 = parser4.canReadObjectId();
        int int32 = parser4._segmentPtr;
        java.lang.String str33 = parser4.getText();
        java.io.Writer writer34 = null;
        int int35 = parser4.releaseBuffered(writer34);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonReadContext27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        boolean boolean7 = parser4.hasTextCharacters();
        boolean boolean8 = parser4._hasNativeIds;
        java.io.OutputStream outputStream9 = null;
        int int10 = parser4.releaseBuffered(outputStream9);
        parser4.close();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext12 = parser4._parsingContext;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.nextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = parser4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        segment6._tokenTypes = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        boolean boolean19 = tokenBuffer18._hasNativeTypeIds;
        tokenBuffer18.writeFieldName("");
        int int22 = tokenBuffer18.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = tokenBuffer18.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = tokenBuffer18.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = tokenBuffer18.append(tokenBuffer27);
        com.fasterxml.jackson.core.JsonToken jsonToken29 = tokenBuffer18.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment30 = segment6.append(100, jsonToken29);
        java.lang.Object[] objArray31 = segment6._tokens;
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34);
        boolean boolean36 = tokenBuffer35._hasNativeTypeIds;
        tokenBuffer35.writeFieldName("");
        tokenBuffer35.writeNumberField("", (double) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        boolean boolean44 = tokenBuffer43._hasNativeId;
        tokenBuffer35._objectId = tokenBuffer43;
        java.math.BigInteger bigInteger46 = null;
        tokenBuffer43.writeNumber(bigInteger46);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter48 = tokenBuffer43.getPrettyPrinter();
        java.lang.Object obj49 = tokenBuffer43._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment50 = segment6.appendRaw(79, 100, (java.lang.Object) tokenBuffer43);
        long long51 = segment6._tokenTypes;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 79 + "'", int22 == 79);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNotNull(tokenBuffer28);
        org.junit.Assert.assertTrue("'" + jsonToken29 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken29.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(prettyPrinter48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(segment50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 97L + "'", long51 == 97L);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = tokenBuffer1.append(tokenBuffer10);
        int int12 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser17._segment = segment19;
        java.lang.Object obj22 = segment19.findTypeId(16);
        java.lang.Object obj24 = segment19.findObjectId((int) (byte) 100);
        tokenBuffer1._last = segment19;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser30 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment26, objectCodec27, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = parser30.getSchema();
        boolean boolean32 = parser30._hasNativeObjectIds;
        long long34 = parser30.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = null;
        parser30._location = jsonLocation35;
        com.fasterxml.jackson.core.FormatSchema formatSchema37 = null;
        boolean boolean38 = parser30.canUseSchema(formatSchema37);
        long long39 = parser30.getValueAsLong();
        boolean boolean41 = parser30.getValueAsBoolean(false);
        java.lang.Object obj42 = parser30.getInputSource();
        com.fasterxml.jackson.core.JsonToken jsonToken43 = parser30.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = parser30.getCodec();
        parser30.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser46 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser30);
        boolean boolean47 = jsonParser46.isExpectedStartArrayToken();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(tokenBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(formatSchema31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(jsonToken43);
        org.junit.Assert.assertNull(objectCodec44);
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadTypeId();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = parser4.getCurrentLocation();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = parser4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonLocation12);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = tokenBuffer1.append(tokenBuffer10);
        int int12 = tokenBuffer1._appendAt;
        java.lang.Object obj13 = tokenBuffer1.getOutputTarget();
        tokenBuffer1._hasNativeId = false;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = tokenBuffer1.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        boolean boolean19 = tokenBuffer18._hasNativeTypeIds;
        tokenBuffer18.close();
        tokenBuffer18.writeNumberField("hi!", (long) (short) 0);
        java.lang.Object obj24 = tokenBuffer18._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        tokenBuffer26._closed = false;
        tokenBuffer26.writeBooleanField("", true);
        boolean boolean32 = tokenBuffer26._hasNativeTypeIds;
        byte[] byteArray34 = new byte[] { (byte) 0 };
        tokenBuffer26.writeBinary(byteArray34);
        tokenBuffer18.writeBinary(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator16.writeBinary(byteArray34, 79, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 89 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(tokenBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0 });
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._last;
        java.math.BigDecimal bigDecimal4 = null;
        tokenBuffer2.writeNumber(bigDecimal4);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer2.setPrettyPrinter(prettyPrinter6);
        tokenBuffer2.writeArrayFieldStart("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        boolean boolean12 = tokenBuffer11._hasNativeTypeIds;
        tokenBuffer11.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext14 = tokenBuffer11.getOutputContext();
        boolean boolean15 = tokenBuffer11.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal16 = null;
        tokenBuffer11.writeNumber(bigDecimal16);
        java.lang.Object obj18 = tokenBuffer11._typeId;
        tokenBuffer11.writeNumber((double) 10L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer23 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21, true);
        java.lang.Object obj24 = tokenBuffer23._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        tokenBuffer26._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment32 = tokenBuffer31._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser38 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment34, objectCodec35, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = parser38.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser38._segment = segment40;
        java.lang.Object obj43 = segment40.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        boolean boolean47 = tokenBuffer46._hasNativeTypeIds;
        tokenBuffer46.writeFieldName("");
        int int50 = tokenBuffer46.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema51 = tokenBuffer46.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = tokenBuffer46.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer56 = tokenBuffer46.append(tokenBuffer55);
        com.fasterxml.jackson.core.JsonToken jsonToken57 = tokenBuffer46.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = segment40.append(16, jsonToken57);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser64 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment60, objectCodec61, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema65 = parser64.getSchema();
        boolean boolean66 = parser64._hasNativeObjectIds;
        long long68 = parser64.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version69 = parser64.version();
        boolean boolean70 = parser64._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder71 = null;
        parser64._byteBuilder = byteArrayBuilder71;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment73 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser77 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment73, objectCodec74, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema78 = parser77.getSchema();
        boolean boolean79 = parser77._hasNativeObjectIds;
        long long81 = parser77.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version82 = parser77.version();
        boolean boolean83 = parser77._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder84 = null;
        parser77._byteBuilder = byteArrayBuilder84;
        boolean boolean86 = parser77.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext87 = parser77._parsingContext;
        parser64._parsingContext = jsonReadContext87;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment89 = segment32.append(16, jsonToken57, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext87);
        tokenBuffer26._append(jsonToken57);
        tokenBuffer23._append(jsonToken57);
        tokenBuffer11._append(jsonToken57);
        tokenBuffer2._append(jsonToken57);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer2.writeRawValue("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT, VALUE_NULL, VALUE_NULL]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(segment32);
        org.junit.Assert.assertNull(formatSchema39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 79 + "'", int50 == 79);
        org.junit.Assert.assertNull(formatSchema51);
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNotNull(tokenBuffer56);
        org.junit.Assert.assertTrue("'" + jsonToken57 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken57.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment58);
        org.junit.Assert.assertNull(formatSchema65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(version69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(formatSchema78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertNotNull(version82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jsonReadContext87);
        org.junit.Assert.assertNotNull(segment89);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        int int7 = tokenBuffer1._appendAt;
        tokenBuffer1.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = tokenBuffer1.setCodec(objectCodec10);
        tokenBuffer1.writeNumberField("", (float) 35L);
        tokenBuffer1._appendAt = 1;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer1.asParser();
        tokenBuffer1.writeBoolean(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20, true);
        java.lang.Object obj23 = tokenBuffer22._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser29 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment25, objectCodec26, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = parser29.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser29._segment = segment31;
        tokenBuffer22.writeObjectField("", (java.lang.Object) segment31);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer22.useDefaultPrettyPrinter();
        boolean boolean35 = tokenBuffer22.canWriteObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser40 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment36, objectCodec37, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = parser40.getSchema();
        boolean boolean42 = parser40._hasNativeObjectIds;
        long long44 = parser40.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation45 = null;
        parser40._location = jsonLocation45;
        com.fasterxml.jackson.core.FormatSchema formatSchema47 = null;
        boolean boolean48 = parser40.canUseSchema(formatSchema47);
        long long49 = parser40.getValueAsLong();
        boolean boolean51 = parser40.getValueAsBoolean(false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation52 = parser40.getCurrentLocation();
        tokenBuffer22.writeObjectId((java.lang.Object) parser40);
        java.lang.String str54 = parser40.getText();
        tokenBuffer1._objectId = str54;
        tokenBuffer1.writeEndArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec57);
        boolean boolean59 = tokenBuffer58._hasNativeTypeIds;
        tokenBuffer58._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer58.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes66 = tokenBuffer58.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema67 = tokenBuffer58.getSchema();
        tokenBuffer58.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer70 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec69);
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        tokenBuffer70._objectCodec = objectCodec71;
        com.fasterxml.jackson.core.ObjectCodec objectCodec73 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer74 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec73);
        boolean boolean75 = tokenBuffer74._hasNativeTypeIds;
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer74.writeBinary(byteArray79);
        tokenBuffer70._typeId = tokenBuffer74;
        boolean boolean82 = tokenBuffer74.isClosed();
        tokenBuffer74._appendAt = 16;
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer86 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec85);
        boolean boolean87 = tokenBuffer86._hasNativeTypeIds;
        tokenBuffer86.close();
        tokenBuffer86.writeNumber((long) '4');
        byte[] byteArray92 = new byte[] {};
        tokenBuffer86.writeBinaryField("hi!", byteArray92);
        tokenBuffer74.writeBinary(byteArray92);
        tokenBuffer58.writeBinary(byteArray92);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeUTF8String(byteArray92, 12, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator11);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(formatSchema41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jsonLocation52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(characterEscapes66);
        org.junit.Assert.assertNull(formatSchema67);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] {});
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter2 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeStartObject();
        tokenBuffer1.writeNullField("[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_EMBEDDED_OBJECT]");
        tokenBuffer1.close();
        boolean boolean7 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeOmittedField("[TokenBuffer: ]");
        org.junit.Assert.assertNull(prettyPrinter2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        boolean boolean7 = parser4.hasTextCharacters();
        boolean boolean8 = parser4._hasNativeIds;
        java.io.OutputStream outputStream9 = null;
        int int10 = parser4.releaseBuffered(outputStream9);
        parser4.close();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext12 = parser4._parsingContext;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.nextToken();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = parser4.skipChildren();
        int int16 = parser4.nextIntValue((int) (byte) 1);
        parser4._closed = false;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext12);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser8);
        boolean boolean11 = tokenBuffer1.canOmitFields();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.setPrettyPrinter(prettyPrinter12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = tokenBuffer1.asParser();
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonParser14);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = segment6.type(0);
        boolean boolean18 = segment6.hasIds();
        int int20 = segment6.rawType((int) (byte) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        tokenBuffer22._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = tokenBuffer22._first;
        java.lang.Object obj27 = segment25.findObjectId((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter30 = tokenBuffer29.getPrettyPrinter();
        tokenBuffer29.writeFieldName("");
        tokenBuffer29._mayHaveNativeIds = false;
        boolean boolean35 = tokenBuffer29._hasNativeObjectIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = tokenBuffer29._last;
        segment25._next = segment36;
        segment6._next = segment36;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41, true);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = tokenBuffer43.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = parser49.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser49._segment = segment51;
        com.fasterxml.jackson.core.JsonToken jsonToken53 = parser49.getLastClearedToken();
        tokenBuffer43.writeTypeId((java.lang.Object) parser49);
        long long56 = parser49.nextLongValue(10L);
        parser49.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer59 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec58);
        boolean boolean60 = tokenBuffer59._hasNativeTypeIds;
        tokenBuffer59._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer59.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes67 = tokenBuffer59.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema68 = tokenBuffer59.getSchema();
        int int69 = tokenBuffer59.getHighestEscapedChar();
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer71 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec70);
        boolean boolean72 = tokenBuffer71._hasNativeTypeIds;
        tokenBuffer71._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer71.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes79 = tokenBuffer71.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema80 = tokenBuffer71.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer82 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec81);
        boolean boolean83 = tokenBuffer82._hasNativeTypeIds;
        tokenBuffer82.writeFieldName("");
        int int86 = tokenBuffer82.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema87 = tokenBuffer82.getSchema();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext88 = tokenBuffer82._writeContext;
        tokenBuffer71.writeObject((java.lang.Object) tokenBuffer82);
        tokenBuffer82.flush();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment91 = segment6.appendRaw(97, (int) (short) 10, (java.lang.Object) parser49, (java.lang.Object) tokenBuffer59, (java.lang.Object) tokenBuffer82);
        tokenBuffer59.writeNumber(0.0d);
        java.math.BigDecimal bigDecimal95 = null;
        tokenBuffer59.writeNumberField("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]", bigDecimal95);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(segment25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(prettyPrinter30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(segment36);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNull(formatSchema50);
        org.junit.Assert.assertNull(jsonToken53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(characterEscapes67);
        org.junit.Assert.assertNull(formatSchema68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(characterEscapes79);
        org.junit.Assert.assertNull(formatSchema80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 79 + "'", int86 == 79);
        org.junit.Assert.assertNull(formatSchema87);
        org.junit.Assert.assertNotNull(jsonWriteContext88);
        org.junit.Assert.assertNotNull(segment91);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        boolean boolean13 = tokenBuffer12._hasNativeTypeIds;
        tokenBuffer12.writeFieldName("");
        int int16 = tokenBuffer12.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = tokenBuffer12.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = tokenBuffer12.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = tokenBuffer12.append(tokenBuffer21);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = tokenBuffer12.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = segment6.append(16, jsonToken23);
        long long25 = segment24._tokenTypes;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser30 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment26, objectCodec27, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = parser30.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment32 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser30._segment = segment32;
        java.lang.Object obj35 = segment32.findTypeId(16);
        java.lang.Object obj37 = segment32.findObjectId((int) ' ');
        java.lang.Object[] objArray38 = segment32._tokens;
        boolean boolean39 = segment32.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser41 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment32, objectCodec40);
        com.fasterxml.jackson.core.JsonToken jsonToken43 = segment32.type((-1));
        segment24._next = segment32;
        boolean boolean45 = segment24.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment24, objectCodec46, true, false);
        segment24._tokenTypes = 79;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertNotNull(jsonGenerator19);
        org.junit.Assert.assertNotNull(tokenBuffer22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5L + "'", long25 == 5L);
        org.junit.Assert.assertNull(formatSchema31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(jsonToken43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = tokenBuffer1.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        boolean boolean11 = tokenBuffer1.canUseSchema(formatSchema10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = tokenBuffer14._first;
        tokenBuffer1.writeObject((java.lang.Object) segment15);
        tokenBuffer1.writeNumber((short) 10);
        tokenBuffer1.writeNullField("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(characterEscapes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(segment15);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer1._mayHaveNativeIds = false;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext15 = tokenBuffer1.getOutputContext();
        tokenBuffer1._objectId = 100.0d;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter18 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext19 = tokenBuffer1._writeContext;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonWriteContext15);
        org.junit.Assert.assertNull(prettyPrinter18);
        org.junit.Assert.assertNotNull(jsonWriteContext19);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        tokenBuffer5._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        tokenBuffer9._objectCodec = objectCodec10;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer13.writeBinary(byteArray18);
        tokenBuffer9._typeId = tokenBuffer13;
        boolean boolean21 = tokenBuffer13.isClosed();
        tokenBuffer5.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer13);
        java.lang.Object obj23 = tokenBuffer13.getOutputTarget();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer27.setCodec(objectCodec28);
        tokenBuffer1._appendRaw((int) '4', (java.lang.Object) tokenBuffer27);
        tokenBuffer1.writeObjectFieldStart("[TokenBuffer: VALUE_NULL]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        tokenBuffer34._generatorFeatures = (byte) -1;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer34.setCodec(objectCodec37);
        tokenBuffer34.close();
        boolean boolean40 = tokenBuffer34._hasNativeTypeIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment41 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser45 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment41, objectCodec42, true, true);
        int int47 = parser45.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken48 = parser45.peekNextToken();
        boolean boolean49 = parser45.canReadTypeId();
        tokenBuffer34.writeObjectId((java.lang.Object) boolean49);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer52 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec51);
        boolean boolean53 = tokenBuffer52._hasNativeTypeIds;
        tokenBuffer52._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer52.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes60 = tokenBuffer52.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema61 = tokenBuffer52.getSchema();
        tokenBuffer52.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer64 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec63);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        tokenBuffer64._objectCodec = objectCodec65;
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer68 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec67);
        boolean boolean69 = tokenBuffer68._hasNativeTypeIds;
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer68.writeBinary(byteArray73);
        tokenBuffer64._typeId = tokenBuffer68;
        boolean boolean76 = tokenBuffer68.isClosed();
        tokenBuffer68._appendAt = 16;
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer80 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec79);
        boolean boolean81 = tokenBuffer80._hasNativeTypeIds;
        tokenBuffer80.close();
        tokenBuffer80.writeNumber((long) '4');
        byte[] byteArray86 = new byte[] {};
        tokenBuffer80.writeBinaryField("hi!", byteArray86);
        tokenBuffer68.writeBinary(byteArray86);
        tokenBuffer52.writeBinary(byteArray86);
        tokenBuffer34.writeBinary(byteArray86);
        tokenBuffer1.writeBinary(byteArray86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNull(jsonToken48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(characterEscapes60);
        org.junit.Assert.assertNull(formatSchema61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        tokenBuffer1._first = segment13;
        java.math.BigInteger bigInteger15 = null;
        tokenBuffer1.writeNumber(bigInteger15);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter17 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer1.setPrettyPrinter(prettyPrinter17);
        tokenBuffer1.writeString("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        boolean boolean23 = tokenBuffer22._hasNativeTypeIds;
        tokenBuffer22.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        tokenBuffer26._objectCodec = objectCodec27;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        boolean boolean31 = tokenBuffer30._hasNativeTypeIds;
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer30.writeBinary(byteArray35);
        tokenBuffer26._typeId = tokenBuffer30;
        tokenBuffer30.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = tokenBuffer22.append(tokenBuffer30);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser46 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment42, objectCodec43, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema47 = parser46.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser46._segment = segment48;
        java.lang.Object obj51 = segment48.findTypeId(16);
        java.lang.Object obj53 = segment48.findObjectId((int) ' ');
        java.lang.Object[] objArray54 = segment48._tokens;
        boolean boolean55 = segment48.hasIds();
        segment48._tokenTypes = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer60 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec59);
        boolean boolean61 = tokenBuffer60._hasNativeTypeIds;
        tokenBuffer60.writeFieldName("");
        int int64 = tokenBuffer60.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema65 = tokenBuffer60.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator67 = tokenBuffer60.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer69 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec68);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer70 = tokenBuffer60.append(tokenBuffer69);
        com.fasterxml.jackson.core.JsonToken jsonToken71 = tokenBuffer60.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment72 = segment48.append(100, jsonToken71);
        tokenBuffer22._append(jsonToken71);
        tokenBuffer22.writeNumber((double) 16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer77 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec76);
        tokenBuffer77._closed = false;
        tokenBuffer77._closed = true;
        int int82 = tokenBuffer77._generatorFeatures;
        tokenBuffer22._objectId = int82;
        tokenBuffer22.writeNumberField("hi!", 3.0d);
        java.lang.Object obj87 = tokenBuffer22.getOutputTarget();
        tokenBuffer1.writeObjectId((java.lang.Object) tokenBuffer22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(tokenBuffer41);
        org.junit.Assert.assertNull(formatSchema47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 79 + "'", int64 == 79);
        org.junit.Assert.assertNull(formatSchema65);
        org.junit.Assert.assertNotNull(jsonGenerator67);
        org.junit.Assert.assertNotNull(tokenBuffer70);
        org.junit.Assert.assertTrue("'" + jsonToken71 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken71.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment72);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 79 + "'", int82 == 79);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        tokenBuffer1._mayHaveNativeIds = false;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext15 = tokenBuffer1.getOutputContext();
        tokenBuffer1._objectId = 100.0d;
        tokenBuffer1._hasNativeId = false;
        tokenBuffer1.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonWriteContext15);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = tokenBuffer1.append(tokenBuffer10);
        boolean boolean12 = tokenBuffer1.canOmitFields();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer14.writeFieldName("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer14.setHighestNonEscapedChar(32);
        tokenBuffer1._objectId = 32;
        boolean boolean24 = tokenBuffer1.canWriteTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        boolean boolean27 = tokenBuffer26._hasNativeTypeIds;
        tokenBuffer26.writeFieldName("");
        int int30 = tokenBuffer26.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = tokenBuffer26.getSchema();
        tokenBuffer26._closed = false;
        tokenBuffer26.close();
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer26);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = tokenBuffer1.setPrettyPrinter(prettyPrinter36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(tokenBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 79 + "'", int30 == 79);
        org.junit.Assert.assertNull(formatSchema31);
        org.junit.Assert.assertNotNull(jsonGenerator37);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder11 = null;
        parser4._byteBuilder = byteArrayBuilder11;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        tokenBuffer13.writeEndObject();
        tokenBuffer13.writeNumberField("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]", 32L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        boolean boolean20 = tokenBuffer19._hasNativeTypeIds;
        tokenBuffer19.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext22 = tokenBuffer19.getOutputContext();
        boolean boolean23 = tokenBuffer19.canWriteBinaryNatively();
        java.math.BigDecimal bigDecimal24 = null;
        tokenBuffer19.writeNumber(bigDecimal24);
        java.lang.Object obj26 = tokenBuffer19._typeId;
        tokenBuffer19.writeNumber((double) 10L);
        tokenBuffer19._hasNativeObjectIds = true;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer19.setCharacterEscapes(characterEscapes31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33, true);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = tokenBuffer35.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser41 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment37, objectCodec38, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema42 = parser41.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser41._segment = segment43;
        com.fasterxml.jackson.core.JsonToken jsonToken45 = parser41.getLastClearedToken();
        tokenBuffer35.writeTypeId((java.lang.Object) parser41);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext47 = parser41._parsingContext;
        java.lang.Object obj48 = parser41.getObjectId();
        java.lang.Object obj49 = parser41.getEmbeddedObject();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer50 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer52 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec51);
        boolean boolean53 = tokenBuffer52._hasNativeTypeIds;
        tokenBuffer52.close();
        tokenBuffer52.writeNumber((long) '4');
        byte[] byteArray58 = new byte[] {};
        tokenBuffer52.writeBinaryField("hi!", byteArray58);
        tokenBuffer50.writeBinary(byteArray58);
        jsonGenerator32.writeBinary(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer13.writeUTF8String(byteArray58, 3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNull(formatSchema42);
        org.junit.Assert.assertNull(jsonToken45);
        org.junit.Assert.assertNotNull(jsonReadContext47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        boolean boolean6 = tokenBuffer5._hasNativeTypeIds;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer5.writeBinary(byteArray10);
        tokenBuffer1._typeId = tokenBuffer5;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        boolean boolean15 = tokenBuffer14._hasNativeTypeIds;
        tokenBuffer14._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean19 = tokenBuffer14._hasNativeId;
        int int20 = tokenBuffer14._appendAt;
        tokenBuffer14.writeNumber((short) (byte) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = tokenBuffer14.useDefaultPrettyPrinter();
        tokenBuffer1._typeId = tokenBuffer14;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = null;
        tokenBuffer1.serialize(jsonGenerator25);
        tokenBuffer1.writeObject((java.lang.Object) 2);
        int int29 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer31.setCodec(objectCodec32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        boolean boolean37 = tokenBuffer36._hasNativeTypeIds;
        tokenBuffer36.writeFieldName("");
        int int40 = tokenBuffer36.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = tokenBuffer36.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = tokenBuffer36.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = tokenBuffer36.append(tokenBuffer45);
        int int47 = tokenBuffer36._appendAt;
        java.lang.Object obj48 = tokenBuffer36.getOutputTarget();
        tokenBuffer36._hasNativeId = false;
        tokenBuffer31.writeObjectField("hi!", (java.lang.Object) tokenBuffer36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer54 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec52, true);
        java.lang.Object obj55 = tokenBuffer54._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment57 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser61 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment57, objectCodec58, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema62 = parser61.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment63 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser61._segment = segment63;
        tokenBuffer54.writeObjectField("", (java.lang.Object) segment63);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment66 = tokenBuffer54._last;
        java.math.BigInteger bigInteger67 = null;
        tokenBuffer54.writeNumber(bigInteger67);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer70 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec69);
        boolean boolean71 = tokenBuffer70._hasNativeTypeIds;
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer70.writeBinary(byteArray75);
        tokenBuffer54.writeBinary(byteArray75, (int) (byte) 1, (int) (short) 1);
        tokenBuffer31.writeBinary(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeUTF8String(byteArray75, 7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 79 + "'", int40 == 79);
        org.junit.Assert.assertNull(formatSchema41);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNotNull(tokenBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(formatSchema62);
        org.junit.Assert.assertNotNull(segment66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeFieldName("");
        tokenBuffer1.writeEndObject();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer1._writeContext;
        java.lang.Object obj10 = tokenBuffer1.getOutputTarget();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter7 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer10._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser17._segment = segment19;
        java.lang.Object obj22 = segment19.findTypeId(16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        boolean boolean26 = tokenBuffer25._hasNativeTypeIds;
        tokenBuffer25.writeFieldName("");
        int int29 = tokenBuffer25.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = tokenBuffer25.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer25.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = tokenBuffer25.append(tokenBuffer34);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = tokenBuffer25.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = segment19.append(16, jsonToken36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment39, objectCodec40, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema44 = parser43.getSchema();
        boolean boolean45 = parser43._hasNativeObjectIds;
        long long47 = parser43.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version48 = parser43.version();
        boolean boolean49 = parser43._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder50 = null;
        parser43._byteBuilder = byteArrayBuilder50;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment52, objectCodec53, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema57 = parser56.getSchema();
        boolean boolean58 = parser56._hasNativeObjectIds;
        long long60 = parser56.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version61 = parser56.version();
        boolean boolean62 = parser56._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder63 = null;
        parser56._byteBuilder = byteArrayBuilder63;
        boolean boolean65 = parser56.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext66 = parser56._parsingContext;
        parser43._parsingContext = jsonReadContext66;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = segment11.append(16, jsonToken36, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext66);
        tokenBuffer1._last = segment11;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRawValue("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(prettyPrinter7);
        org.junit.Assert.assertNotNull(segment11);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 79 + "'", int29 == 79);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(tokenBuffer35);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment37);
        org.junit.Assert.assertNull(formatSchema44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(formatSchema57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonReadContext66);
        org.junit.Assert.assertNotNull(segment68);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        tokenBuffer1.writeNumber("hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = tokenBuffer1.setCharacterEscapes(characterEscapes9);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes11 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer1.setCharacterEscapes(characterEscapes11);
        java.lang.Object obj13 = tokenBuffer1._objectId;
        tokenBuffer1._closed = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        boolean boolean18 = tokenBuffer17._hasNativeTypeIds;
        tokenBuffer17.writeFieldName("");
        tokenBuffer17.writeNumberField("", (double) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        boolean boolean26 = tokenBuffer25._hasNativeId;
        tokenBuffer17._objectId = tokenBuffer25;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        tokenBuffer29._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer33 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        tokenBuffer33._objectCodec = objectCodec34;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec36);
        boolean boolean38 = tokenBuffer37._hasNativeTypeIds;
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer37.writeBinary(byteArray42);
        tokenBuffer33._typeId = tokenBuffer37;
        boolean boolean45 = tokenBuffer37.isClosed();
        tokenBuffer29.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer37);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer47 = tokenBuffer25.append(tokenBuffer37);
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer47);
        com.fasterxml.jackson.core.SerializableString serializableString49 = null;
        tokenBuffer47.writeString(serializableString49);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter51 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = tokenBuffer47.setPrettyPrinter(prettyPrinter51);
        tokenBuffer47.close();
        tokenBuffer47.writeBooleanField("", false);
        com.fasterxml.jackson.core.TreeNode treeNode57 = null;
        tokenBuffer47.writeTree(treeNode57);
        tokenBuffer47.writeNumberField("[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_EMBEDDED_OBJECT]", (double) 79);
        tokenBuffer47.writeNumberField("[TokenBuffer: VALUE_NULL]", (float) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tokenBuffer47);
        org.junit.Assert.assertNotNull(jsonGenerator52);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        java.lang.Object obj15 = segment6.findObjectId(10);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap16 = null;
        segment6._nativeIds = intMap16;
        java.lang.Object obj19 = segment6.get((int) (byte) 1);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        boolean boolean7 = parser4.hasTextCharacters();
        boolean boolean8 = parser4._hasNativeIds;
        java.io.OutputStream outputStream9 = null;
        int int10 = parser4.releaseBuffered(outputStream9);
        parser4.close();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext12 = parser4._parsingContext;
        int int13 = parser4.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = parser4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._closed = false;
        tokenBuffer1.writeNullField("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString6 = null;
        tokenBuffer1.writeString(serializableString6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes8 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1.writeStringField("", "");
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: VALUE_NULL]");
        tokenBuffer1._mayHaveNativeIds = false;
        org.junit.Assert.assertNull(characterEscapes8);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = tokenBuffer2.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser8._segment = segment10;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser8.getLastClearedToken();
        tokenBuffer2.writeTypeId((java.lang.Object) parser8);
        long long15 = parser8.nextLongValue(10L);
        parser8.close();
        double double18 = parser8.getValueAsDouble((double) 52);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        tokenBuffer1.writeNumberField("", (double) '#');
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        boolean boolean10 = tokenBuffer9._hasNativeId;
        tokenBuffer1._objectId = tokenBuffer9;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = parser17.getSchema();
        boolean boolean19 = parser17._hasNativeObjectIds;
        long long21 = parser17.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version22 = parser17.version();
        boolean boolean23 = parser17._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder24 = null;
        parser17._byteBuilder = byteArrayBuilder24;
        boolean boolean26 = parser17._hasNativeObjectIds;
        int int27 = parser17.getFeatureMask();
        com.fasterxml.jackson.core.JsonLocation jsonLocation28 = parser17._location;
        boolean boolean29 = parser17.canReadObjectId();
        tokenBuffer9.writeObjectField("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]", (java.lang.Object) parser17);
        com.fasterxml.jackson.core.Version version31 = parser17.version();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(jsonLocation28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(version31);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        boolean boolean10 = parser4._hasNativeTypeIds;
        java.lang.Object obj11 = parser4.getInputSource();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser13 = parser4.enable(feature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Object obj9 = segment6.findTypeId(16);
        java.lang.Object obj11 = segment6.findObjectId((int) ' ');
        java.lang.Object[] objArray12 = segment6._tokens;
        boolean boolean13 = segment6.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec14);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = segment6.type((-1));
        int int19 = segment6.rawType(100);
        java.lang.Object obj21 = segment6.findTypeId(0);
        segment6._tokenTypes = 52L;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap24 = segment6._nativeIds;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(intMap24);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        int int8 = parser4.getCurrentTokenId();
        int int10 = parser4.getValueAsInt((int) (byte) 10);
        boolean boolean11 = parser4.canReadObjectId();
        java.lang.String str12 = parser4.getCurrentName();
        parser4._segmentPtr = (short) -1;
        boolean boolean15 = parser4.getValueAsBoolean();
        double double17 = parser4.getValueAsDouble((double) 3);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        boolean boolean19 = parser4.nextFieldName(serializableString18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.0d + "'", double17 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._generatorFeatures = (byte) -1;
        boolean boolean4 = tokenBuffer1._closed;
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumberField("", bigDecimal6);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = parser13.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser13._segment = segment15;
        java.lang.Object obj18 = segment15.findTypeId((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec19);
        com.fasterxml.jackson.core.Version version21 = parser20.version();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema27 = parser26.getSchema();
        boolean boolean28 = parser26._hasNativeObjectIds;
        long long30 = parser26.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version31 = parser26.version();
        boolean boolean32 = parser26._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder33 = null;
        parser26._byteBuilder = byteArrayBuilder33;
        boolean boolean35 = parser26._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonLocation jsonLocation36 = parser26.getTokenLocation();
        parser20._location = jsonLocation36;
        com.fasterxml.jackson.core.JsonToken jsonToken38 = parser20.getCurrentToken();
        java.lang.String str39 = parser20.getValueAsString();
        tokenBuffer1.writeTypeId((java.lang.Object) str39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser42 = tokenBuffer1.asParser(objectCodec41);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertNull(formatSchema14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNull(formatSchema27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jsonLocation36);
        org.junit.Assert.assertNull(jsonToken38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(jsonParser42);
    }
}

