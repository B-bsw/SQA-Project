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
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: ]");
        boolean boolean21 = tokenBuffer1._mayHaveNativeIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema27 = parser26.getSchema();
        boolean boolean28 = parser26._hasNativeObjectIds;
        long long30 = parser26.getValueAsLong((long) (byte) 1);
        java.lang.String str31 = parser26.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken32 = parser26.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = parser26._codec;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = tokenBuffer1.deserialize((com.fasterxml.jackson.core.JsonParser) parser26, deserializationContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(formatSchema27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(jsonToken32);
        org.junit.Assert.assertNull(objectCodec33);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        long long29 = parser11.getValueAsLong();
        char[] charArray30 = parser11.getTextCharacters();
        boolean boolean32 = parser11.getValueAsBoolean(false);
        java.lang.Object obj33 = parser11.getTypeId();
        boolean boolean34 = parser11._hasNativeObjectIds;
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        tokenBuffer2.writeNumberField("", (double) 100L);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = tokenBuffer2.getCharacterEscapes();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec7, true);
        java.lang.Object obj10 = tokenBuffer9._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        tokenBuffer12._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = tokenBuffer17._last;
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
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment46 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser50 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment46, objectCodec47, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema51 = parser50.getSchema();
        boolean boolean52 = parser50._hasNativeObjectIds;
        long long54 = parser50.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version55 = parser50.version();
        boolean boolean56 = parser50._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder57 = null;
        parser50._byteBuilder = byteArrayBuilder57;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment59 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec60 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser63 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment59, objectCodec60, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema64 = parser63.getSchema();
        boolean boolean65 = parser63._hasNativeObjectIds;
        long long67 = parser63.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version68 = parser63.version();
        boolean boolean69 = parser63._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder70 = null;
        parser63._byteBuilder = byteArrayBuilder70;
        boolean boolean72 = parser63.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext73 = parser63._parsingContext;
        parser50._parsingContext = jsonReadContext73;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment75 = segment18.append(16, jsonToken43, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext73);
        tokenBuffer12._append(jsonToken43);
        tokenBuffer9._append(jsonToken43);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment78 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser82 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment78, objectCodec79, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema83 = parser82.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment84 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser82._segment = segment84;
        com.fasterxml.jackson.core.ObjectCodec objectCodec86 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser87 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment84, objectCodec86);
        tokenBuffer2._append(jsonToken43, (java.lang.Object) segment84);
        segment84._tokenTypes = 10L;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap91 = null;
        segment84._nativeIds = intMap91;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap93 = segment84._nativeIds;
        org.junit.Assert.assertNull(characterEscapes6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(segment18);
        org.junit.Assert.assertNull(formatSchema25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79 + "'", int36 == 79);
        org.junit.Assert.assertNull(formatSchema37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(tokenBuffer42);
        org.junit.Assert.assertTrue("'" + jsonToken43 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken43.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment44);
        org.junit.Assert.assertNull(formatSchema51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(version55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(formatSchema64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jsonReadContext73);
        org.junit.Assert.assertNotNull(segment75);
        org.junit.Assert.assertNull(formatSchema83);
        org.junit.Assert.assertNull(intMap93);
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
        boolean boolean16 = tokenBuffer5.canWriteObjectId();
        boolean boolean17 = tokenBuffer5.canWriteBinaryNatively();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = tokenBuffer18._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema26 = parser25.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser25._segment = segment27;
        java.lang.Object obj30 = segment27.findTypeId(16);
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
        com.fasterxml.jackson.core.JsonToken jsonToken44 = tokenBuffer33.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = segment27.append(16, jsonToken44);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment47 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment47, objectCodec48, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema52 = parser51.getSchema();
        boolean boolean53 = parser51._hasNativeObjectIds;
        long long55 = parser51.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version56 = parser51.version();
        boolean boolean57 = parser51._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder58 = null;
        parser51._byteBuilder = byteArrayBuilder58;
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
        boolean boolean73 = parser64.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext74 = parser64._parsingContext;
        parser51._parsingContext = jsonReadContext74;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment76 = segment19.append(16, jsonToken44, (java.lang.Object) (-1), (java.lang.Object) jsonReadContext74);
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer78 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec77);
        tokenBuffer78._closed = false;
        tokenBuffer78.writeNullField("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString83 = null;
        tokenBuffer78.writeString(serializableString83);
        tokenBuffer1._append(jsonToken44, (java.lang.Object) tokenBuffer78);
        com.fasterxml.jackson.core.ObjectCodec objectCodec86 = null;
        tokenBuffer78._objectCodec = objectCodec86;
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser89 = tokenBuffer78.asParser(objectCodec88);
        boolean boolean90 = tokenBuffer78._hasNativeId;
        java.lang.Object obj91 = tokenBuffer78._typeId;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonWriteContext15);
        org.junit.Assert.assertNotNull(segment19);
        org.junit.Assert.assertNull(formatSchema26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 79 + "'", int37 == 79);
        org.junit.Assert.assertNull(formatSchema38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(tokenBuffer43);
        org.junit.Assert.assertTrue("'" + jsonToken44 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken44.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment45);
        org.junit.Assert.assertNull(formatSchema52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertNotNull(version56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(formatSchema65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(version69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jsonReadContext74);
        org.junit.Assert.assertNotNull(segment76);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        int int6 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        int int13 = parser11.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser11.peekNextToken();
        int int15 = parser11.getCurrentTokenId();
        int int17 = parser11.getValueAsInt((int) (byte) 10);
        long long19 = parser11.getValueAsLong((long) '4');
        com.fasterxml.jackson.core.JsonParser jsonParser21 = parser11.setFeatureMask(0);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder22 = parser11._byteBuilder;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = parser11.nextToken();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext24 = parser11._parsingContext;
        boolean boolean25 = parser11.isClosed();
        com.fasterxml.jackson.core.JsonParser jsonParser26 = parser11.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser27 = tokenBuffer1.asParser(jsonParser26);
        int int28 = tokenBuffer1._appendAt;
        tokenBuffer1.writeNumber((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(byteArrayBuilder22);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNotNull(jsonReadContext24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
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
        int int8 = parser4.getTextLength();
        boolean boolean9 = parser4.canReadObjectId();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.getLastClearedToken();
        java.lang.Boolean boolean11 = parser4.nextBooleanValue();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer1.writeBinary(byteArray6);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer1._writeContext;
        tokenBuffer1.writeFieldName("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        boolean boolean14 = tokenBuffer13._hasNativeTypeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        tokenBuffer17._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        tokenBuffer21._objectCodec = objectCodec22;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        boolean boolean26 = tokenBuffer25._hasNativeTypeIds;
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer25.writeBinary(byteArray30);
        tokenBuffer21._typeId = tokenBuffer25;
        boolean boolean33 = tokenBuffer25.isClosed();
        tokenBuffer17.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer25);
        java.lang.Object obj35 = tokenBuffer25.getOutputTarget();
        tokenBuffer13.writeObjectField("hi!", (java.lang.Object) tokenBuffer25);
        boolean boolean37 = tokenBuffer25._mayHaveNativeIds;
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
        boolean boolean51 = tokenBuffer43.isClosed();
        tokenBuffer25.writeObjectId((java.lang.Object) tokenBuffer43);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = tokenBuffer25._first;
        java.lang.Object obj55 = segment53.findTypeId((int) '4');
        tokenBuffer1._first = segment53;
        tokenBuffer1.flush();
        int int58 = tokenBuffer1._generatorFeatures;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(segment53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 79 + "'", int58 == 79);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        int int8 = parser4.getTextLength();
        java.lang.Boolean boolean9 = parser4.nextBooleanValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = parser4._segment;
        java.lang.Object obj11 = parser4.getInputSource();
        parser4._closed = true;
        boolean boolean14 = parser4.canReadTypeId();
        boolean boolean15 = parser4.isExpectedStartArrayToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(segment10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = parser4.setFeatureMask((int) (byte) 10);
        long long10 = jsonParser9.getValueAsLong();
        int int12 = jsonParser9.nextIntValue(100);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = parser19.getSchema();
        boolean boolean21 = parser19._hasNativeObjectIds;
        long long23 = parser19.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version24 = parser19.version();
        double double26 = parser19.getValueAsDouble(0.0d);
        com.fasterxml.jackson.core.JsonToken jsonToken27 = parser19.nextValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = parser19.getCodec();
        com.fasterxml.jackson.core.JsonToken jsonToken29 = parser19.nextValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext30 = parser19._parsingContext;
        long long32 = parser19.getValueAsLong((long) (short) 1);
        boolean boolean33 = parser19.hasTextCharacters();
        java.lang.Object obj34 = parser19.getInputSource();
        tokenBuffer2.writeTypeId((java.lang.Object) parser19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(jsonToken27);
        org.junit.Assert.assertNull(objectCodec28);
        org.junit.Assert.assertNull(jsonToken29);
        org.junit.Assert.assertNotNull(jsonReadContext30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        boolean boolean8 = parser4._hasNativeObjectIds;
        int int9 = parser4.getCurrentTokenId();
        int int10 = parser4.getCurrentTokenId();
        java.lang.Object obj11 = parser4.getEmbeddedObject();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Boolean boolean8 = parser4.nextBooleanValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = parser4.skipChildren();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser14 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec11, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = parser14.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser14._segment = segment16;
        java.lang.Object obj19 = segment16.findTypeId((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser21 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec20);
        com.fasterxml.jackson.core.Version version22 = parser21.version();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment23 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser27 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment23, objectCodec24, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema28 = parser27.getSchema();
        boolean boolean29 = parser27._hasNativeObjectIds;
        long long31 = parser27.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version32 = parser27.version();
        boolean boolean33 = parser27._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder34 = null;
        parser27._byteBuilder = byteArrayBuilder34;
        boolean boolean36 = parser27._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonLocation jsonLocation37 = parser27.getTokenLocation();
        parser21._location = jsonLocation37;
        parser4.setLocation(jsonLocation37);
        parser4.close();
        com.fasterxml.jackson.core.Version version41 = parser4.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser43 = parser4.enable(feature42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(formatSchema15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNull(formatSchema28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jsonLocation37);
        org.junit.Assert.assertNotNull(version41);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        boolean boolean7 = parser4.hasTextCharacters();
        boolean boolean8 = parser4._hasNativeIds;
        java.io.OutputStream outputStream9 = null;
        int int10 = parser4.releaseBuffered(outputStream9);
        java.lang.Object obj11 = parser4.getInputSource();
        parser4._segmentPtr = '#';
        int int14 = parser4.getValueAsInt();
        boolean boolean15 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = parser4.getCurrentLocation();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._first;
        boolean boolean4 = tokenBuffer2._hasNativeTypeIds;
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = tokenBuffer2.canUseSchema(formatSchema5);
        tokenBuffer2.writeStartObject();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = tokenBuffer2.disable(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        tokenBuffer12._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = parser19.getSchema();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = tokenBuffer12.asParser((com.fasterxml.jackson.core.JsonParser) parser19);
        java.io.Writer writer22 = null;
        int int23 = parser19.releaseBuffered(writer22);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment24, objectCodec25, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema29 = parser28.getSchema();
        boolean boolean30 = parser28._hasNativeObjectIds;
        long long32 = parser28.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version33 = parser28.version();
        boolean boolean34 = parser28._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder35 = null;
        parser28._byteBuilder = byteArrayBuilder35;
        boolean boolean37 = parser28._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonLocation jsonLocation38 = parser28.getTokenLocation();
        parser19.setLocation(jsonLocation38);
        parser4.setLocation(jsonLocation38);
        java.lang.Boolean boolean41 = parser4.nextBooleanValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = parser4._codec;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(formatSchema29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jsonLocation38);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNull(objectCodec42);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        tokenBuffer1._hasNativeObjectIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        tokenBuffer1._objectCodec = objectCodec29;
        tokenBuffer1.writeNumber((short) 10);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext33 = tokenBuffer1.getOutputContext();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(jsonWriteContext33);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeFieldName("");
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = tokenBuffer1._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        boolean boolean12 = tokenBuffer11._hasNativeTypeIds;
        tokenBuffer11.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext14 = tokenBuffer11.getOutputContext();
        boolean boolean15 = tokenBuffer11.canWriteBinaryNatively();
        tokenBuffer11._appendAt = 79;
        tokenBuffer11._closed = false;
        boolean boolean20 = tokenBuffer11._hasNativeId;
        tokenBuffer1.writeObjectId((java.lang.Object) boolean20);
        tokenBuffer1._hasNativeObjectIds = true;
        tokenBuffer1.writeStartObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(formatSchema8);
        org.junit.Assert.assertNotNull(segment9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser33 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec32);
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
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeFieldName("");
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = tokenBuffer1._first;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = segment9.type(100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = tokenBuffer14.setCodec(objectCodec15);
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
        int int30 = tokenBuffer19._appendAt;
        java.lang.Object obj31 = tokenBuffer19.getOutputTarget();
        tokenBuffer19._hasNativeId = false;
        tokenBuffer14.writeObjectField("hi!", (java.lang.Object) tokenBuffer19);
        tokenBuffer19.writeStartArray((int) (byte) 10);
        com.fasterxml.jackson.core.JsonToken jsonToken37 = tokenBuffer19.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = segment9.append((int) (short) 100, jsonToken37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser42 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment38, objectCodec39, true, false);
        int int43 = parser42.getTextLength();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(formatSchema8);
        org.junit.Assert.assertNotNull(segment9);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 79 + "'", int23 == 79);
        org.junit.Assert.assertNull(formatSchema24);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(tokenBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + jsonToken37 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken37.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = parser4.getCurrentToken();
        long long17 = parser4.getValueAsLong((long) (short) -1);
        parser4._closed = false;
        long long20 = parser4.getValueAsLong();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = parser4.setFeatureMask(0);
        int int24 = parser4.getValueAsInt(0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser29 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment25, objectCodec26, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = parser29.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser29._segment = segment31;
        com.fasterxml.jackson.core.JsonToken jsonToken33 = parser29.getLastClearedToken();
        java.lang.String str34 = parser29.getText();
        boolean boolean35 = parser29.canReadTypeId();
        java.lang.Boolean boolean36 = parser29.nextBooleanValue();
        com.fasterxml.jackson.core.JsonToken jsonToken37 = parser29.nextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser42 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment38, objectCodec39, true, true);
        int int44 = parser42.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken45 = parser42.peekNextToken();
        int int46 = parser42.getCurrentTokenId();
        int int48 = parser42.getValueAsInt((int) (byte) 10);
        boolean boolean49 = parser42.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation50 = parser42.getTokenLocation();
        parser29.setLocation(jsonLocation50);
        parser4.setLocation(jsonLocation50);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = parser4._segment;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonReadContext14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertNull(jsonToken33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNull(jsonToken37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNull(jsonToken45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jsonLocation50);
        org.junit.Assert.assertNull(segment53);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
        int int11 = tokenBuffer1.getHighestEscapedChar();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext12 = tokenBuffer1._writeContext;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        tokenBuffer14._closed = false;
        tokenBuffer14.writeNullField("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString19 = null;
        tokenBuffer14.writeString(serializableString19);
        tokenBuffer14.writeNullField("[TokenBuffer: ]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        boolean boolean25 = tokenBuffer24._hasNativeTypeIds;
        tokenBuffer24.writeFieldName("");
        int int28 = tokenBuffer24.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema29 = tokenBuffer24.getSchema();
        tokenBuffer24.writeNumber("hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer24.setCharacterEscapes(characterEscapes32);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = tokenBuffer24.setCharacterEscapes(characterEscapes34);
        java.lang.Object obj36 = tokenBuffer24._objectId;
        com.fasterxml.jackson.core.JsonToken jsonToken37 = tokenBuffer24.firstToken();
        tokenBuffer14._append(jsonToken37);
        tokenBuffer1._append(jsonToken37);
        tokenBuffer1.writeObjectFieldStart("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jsonWriteContext12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 79 + "'", int28 == 79);
        org.junit.Assert.assertNull(formatSchema29);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + jsonToken37 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken37.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser23 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment19, objectCodec20, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = parser23.getSchema();
        boolean boolean25 = parser23._hasNativeObjectIds;
        long long27 = parser23.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation28 = null;
        parser23._location = jsonLocation28;
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = null;
        boolean boolean31 = parser23.canUseSchema(formatSchema30);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext32 = parser23._parsingContext;
        parser4._parsingContext = jsonReadContext32;
        boolean boolean34 = parser4._hasNativeIds;
        com.fasterxml.jackson.core.JsonToken jsonToken35 = parser4.nextValue();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(formatSchema24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonReadContext32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(jsonToken35);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        java.lang.Boolean boolean8 = parser4.nextBooleanValue();
        java.lang.String str10 = parser4.getValueAsString("");
        java.lang.String str11 = parser4.getText();
        boolean boolean13 = parser4.getValueAsBoolean(false);
        int int14 = parser4.getTextOffset();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = parser31.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment33 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser31._segment = segment33;
        java.lang.Object obj36 = segment33.findTypeId(16);
        boolean boolean37 = segment33.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser44 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment40, objectCodec41, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema45 = parser44.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment46 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser44._segment = segment46;
        java.lang.Object obj49 = segment46.findTypeId(16);
        boolean boolean50 = segment46.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = segment46._next;
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser55 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment46, objectCodec52, true, false);
        java.lang.String str56 = parser55.nextTextValue();
        boolean boolean57 = parser55.canReadTypeId();
        boolean boolean59 = parser55.getValueAsBoolean(false);
        com.fasterxml.jackson.core.Version version60 = parser55.version();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment61 = segment33.appendRaw((int) (short) 0, (int) (byte) 1, (java.lang.Object) version60);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap62 = segment33._nativeIds;
        int int64 = segment33.rawType((int) 'a');
        segment18._next = segment33;
        java.lang.Object[] objArray66 = segment33._tokens;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment67 = segment33._next;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(formatSchema17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(formatSchema45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(segment51);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNull(segment61);
        org.junit.Assert.assertNull(intMap62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[2.4.4-SNAPSHOT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[2.4.4-SNAPSHOT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNull(segment67);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = tokenBuffer1.setHighestNonEscapedChar((int) (short) 10);
        int int25 = tokenBuffer1._appendAt;
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeObjectRef(obj26);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(characterEscapes22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = parser4.getCurrentToken();
        parser4.clearCurrentToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        java.lang.Object obj17 = parser4.getInputSource();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment18, objectCodec19, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = parser22.getSchema();
        boolean boolean24 = parser22._hasNativeObjectIds;
        long long26 = parser22.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version27 = parser22.version();
        boolean boolean28 = parser22._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder29 = null;
        parser22._byteBuilder = byteArrayBuilder29;
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
        boolean boolean44 = parser35.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext45 = parser35._parsingContext;
        parser22._parsingContext = jsonReadContext45;
        parser4._parsingContext = jsonReadContext45;
        java.lang.String str48 = parser4.getValueAsString();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonReadContext14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(formatSchema36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonReadContext45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version9 = parser4.version();
        parser4._closed = true;
        int int13 = parser4.nextIntValue(0);
        int int14 = parser4.getFeatureMask();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = parser19.getSchema();
        boolean boolean21 = parser19._hasNativeObjectIds;
        long long23 = parser19.getValueAsLong((long) (byte) 1);
        java.lang.String str24 = parser19.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken25 = parser19.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = parser19._codec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        int int33 = parser31.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken34 = parser31.peekNextToken();
        int int35 = parser31.getCurrentTokenId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser40 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment36, objectCodec37, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = parser40.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser40._segment = segment42;
        com.fasterxml.jackson.core.JsonLocation jsonLocation44 = parser40.getTokenLocation();
        parser31.setLocation(jsonLocation44);
        parser19._location = jsonLocation44;
        parser4.setLocation(jsonLocation44);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = parser4._segment;
        java.lang.Boolean boolean49 = parser4.nextBooleanValue();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(formatSchema20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(jsonToken25);
        org.junit.Assert.assertNull(objectCodec26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(formatSchema41);
        org.junit.Assert.assertNotNull(jsonLocation44);
        org.junit.Assert.assertNull(segment48);
        org.junit.Assert.assertNull(boolean49);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        tokenBuffer1.writeNumber(1);
        tokenBuffer1._hasNativeId = false;
        tokenBuffer1._hasNativeObjectIds = true;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRawValue("[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_EMBEDDED_OBJECT]", 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(jsonGenerator29);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        java.lang.String str7 = parser4.getCurrentName();
        boolean boolean8 = parser4.isClosed();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        com.fasterxml.jackson.core.SerializableString serializableString31 = null;
        tokenBuffer27.writeString(serializableString31);
        boolean boolean33 = tokenBuffer27._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = tokenBuffer27.asParser(objectCodec34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonParser35);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        boolean boolean13 = parser11._closed;
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = parser11.getCurrentLocation();
        boolean boolean15 = parser11._hasNativeObjectIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = null;
        parser11._byteBuilder = byteArrayBuilder16;
        java.io.OutputStream outputStream18 = null;
        int int19 = parser11.releaseBuffered(outputStream18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = parser24.getSchema();
        boolean boolean26 = parser24._hasNativeObjectIds;
        long long28 = parser24.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version29 = parser24.version();
        boolean boolean30 = parser24._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder31 = null;
        parser24._byteBuilder = byteArrayBuilder31;
        boolean boolean33 = parser24.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext34 = parser24._parsingContext;
        com.fasterxml.jackson.core.SerializableString serializableString35 = null;
        boolean boolean36 = parser24.nextFieldName(serializableString35);
        com.fasterxml.jackson.core.JsonToken jsonToken37 = parser24.nextToken();
        boolean boolean38 = parser24._hasNativeIds;
        int int40 = parser24.nextIntValue((int) (short) 1);
        boolean boolean41 = parser24.isClosed();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser46 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment42, objectCodec43, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema47 = parser46.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser46._segment = segment48;
        java.lang.Object obj51 = segment48.findTypeId(16);
        java.lang.Object obj53 = segment48.findObjectId((int) ' ');
        parser24._segment = segment48;
        int int55 = parser24.getValueAsInt();
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = parser24.getCodec();
        java.io.OutputStream outputStream57 = null;
        int int58 = parser24.releaseBuffered(outputStream57);
        boolean boolean59 = parser24.isClosed();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser64 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment60, objectCodec61, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema65 = parser64.getSchema();
        boolean boolean66 = parser64._hasNativeObjectIds;
        boolean boolean67 = parser64.hasTextCharacters();
        int int68 = parser64.getTextLength();
        boolean boolean69 = parser64.canReadObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment70 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser74 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment70, objectCodec71, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema75 = parser74.getSchema();
        boolean boolean76 = parser74._hasNativeObjectIds;
        long long78 = parser74.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version79 = parser74.version();
        boolean boolean80 = parser74._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder81 = null;
        parser74._byteBuilder = byteArrayBuilder81;
        boolean boolean83 = parser74.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext84 = parser74._parsingContext;
        parser64._parsingContext = jsonReadContext84;
        parser24._parsingContext = jsonReadContext84;
        parser11._parsingContext = jsonReadContext84;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(formatSchema25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonReadContext34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jsonToken37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(formatSchema47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(objectCodec56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(formatSchema65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(formatSchema75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(version79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jsonReadContext84);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        parser4.close();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.nextValue();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.peekNextToken();
        boolean boolean9 = parser4.hasTextCharacters();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        tokenBuffer1.writeNumber((short) (byte) 10);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema26 = parser25.getSchema();
        boolean boolean27 = parser25._hasNativeObjectIds;
        long long29 = parser25.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version30 = parser25.version();
        double double32 = parser25.getValueAsDouble(0.0d);
        com.fasterxml.jackson.core.JsonToken jsonToken33 = parser25.nextValue();
        long long35 = parser25.getValueAsLong((long) (byte) -1);
        boolean boolean36 = parser25.isExpectedStartArrayToken();
        char[] charArray37 = parser25.getTextCharacters();
        com.fasterxml.jackson.core.SerializableString serializableString38 = null;
        boolean boolean39 = parser25.nextFieldName(serializableString38);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser44 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment40, objectCodec41, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema45 = parser44.getSchema();
        boolean boolean46 = parser44._hasNativeObjectIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment47 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment47, objectCodec48, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema52 = parser51.getSchema();
        boolean boolean53 = parser51._hasNativeObjectIds;
        long long55 = parser51.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version56 = parser51.version();
        boolean boolean57 = parser51._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder58 = null;
        parser51._byteBuilder = byteArrayBuilder58;
        boolean boolean60 = parser51.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext61 = parser51._parsingContext;
        com.fasterxml.jackson.core.SerializableString serializableString62 = null;
        boolean boolean63 = parser51.nextFieldName(serializableString62);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment64 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser68 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment64, objectCodec65, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema69 = parser68.getSchema();
        boolean boolean70 = parser68._hasNativeObjectIds;
        long long72 = parser68.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version73 = parser68.version();
        boolean boolean74 = parser68._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder75 = null;
        parser68._byteBuilder = byteArrayBuilder75;
        boolean boolean77 = parser68.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext78 = parser68._parsingContext;
        parser51._parsingContext = jsonReadContext78;
        parser44._parsingContext = jsonReadContext78;
        parser25._parsingContext = jsonReadContext78;
        com.fasterxml.jackson.core.Version version82 = parser25.version();
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.copyCurrentStructure((com.fasterxml.jackson.core.JsonParser) parser25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(formatSchema26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(jsonToken33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(charArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(formatSchema45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(formatSchema52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertNotNull(version56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jsonReadContext61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(formatSchema69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertNotNull(version73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jsonReadContext78);
        org.junit.Assert.assertNotNull(version82);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        tokenBuffer1.writeNumberField("hi!", (long) (short) 0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter7 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = tokenBuffer1.setPrettyPrinter(prettyPrinter8);
        tokenBuffer1.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        boolean boolean13 = tokenBuffer12._hasNativeTypeIds;
        tokenBuffer12.close();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = tokenBuffer12.useDefaultPrettyPrinter();
        tokenBuffer12._appendAt = (short) -1;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = tokenBuffer1.append(tokenBuffer12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(prettyPrinter7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonGenerator15);
        org.junit.Assert.assertNotNull(tokenBuffer18);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment3 = tokenBuffer2._first;
        tokenBuffer2.writeBooleanField("hi!", false);
        tokenBuffer2.writeNumber(0L);
        tokenBuffer2.writeBooleanField("hi!", true);
        java.lang.String str12 = tokenBuffer2.toString();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        tokenBuffer15._closed = false;
        tokenBuffer15.writeBooleanField("", true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer23 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec22);
        boolean boolean24 = tokenBuffer23._hasNativeTypeIds;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer23.writeBinary(byteArray28);
        tokenBuffer15.writeBinaryField("[TokenBuffer: VALUE_NULL]", byteArray28);
        tokenBuffer2.writeBinaryField("[TokenBuffer: VALUE_NUMBER_INT]", byteArray28);
        org.junit.Assert.assertNotNull(segment3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[TokenBuffer: FIELD_NAME(hi!), VALUE_FALSE, VALUE_NUMBER_INT, FIELD_NAME(hi!), VALUE_TRUE]" + "'", str12, "[TokenBuffer: FIELD_NAME(hi!), VALUE_FALSE, VALUE_NUMBER_INT, FIELD_NAME(hi!), VALUE_TRUE]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        int int21 = segment10.rawType((int) '4');
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        boolean boolean25 = tokenBuffer14._mayHaveNativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        tokenBuffer14._objectCodec = objectCodec26;
        tokenBuffer14._hasNativeObjectIds = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        boolean boolean32 = tokenBuffer31._hasNativeTypeIds;
        tokenBuffer31.writeFieldName("");
        int int35 = tokenBuffer31.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = tokenBuffer31.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer40 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec39);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = tokenBuffer31.append(tokenBuffer40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = tokenBuffer43.setCodec(objectCodec44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        boolean boolean49 = tokenBuffer48._hasNativeTypeIds;
        tokenBuffer48.writeFieldName("");
        int int52 = tokenBuffer48.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema53 = tokenBuffer48.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = tokenBuffer48.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec56);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = tokenBuffer48.append(tokenBuffer57);
        int int59 = tokenBuffer48._appendAt;
        java.lang.Object obj60 = tokenBuffer48.getOutputTarget();
        tokenBuffer48._hasNativeId = false;
        tokenBuffer43.writeObjectField("hi!", (java.lang.Object) tokenBuffer48);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer66 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec64, true);
        java.lang.Object obj67 = tokenBuffer66._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment69 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser73 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment69, objectCodec70, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema74 = parser73.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment75 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser73._segment = segment75;
        tokenBuffer66.writeObjectField("", (java.lang.Object) segment75);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment78 = tokenBuffer66._last;
        java.math.BigInteger bigInteger79 = null;
        tokenBuffer66.writeNumber(bigInteger79);
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer82 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec81);
        boolean boolean83 = tokenBuffer82._hasNativeTypeIds;
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        tokenBuffer82.writeBinary(byteArray87);
        tokenBuffer66.writeBinary(byteArray87, (int) (byte) 1, (int) (short) 1);
        tokenBuffer43.writeBinary(byteArray87);
        tokenBuffer40.writeBinary(byteArray87);
        tokenBuffer14.writeBinary(byteArray87);
        com.fasterxml.jackson.core.ObjectCodec objectCodec95 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator96 = tokenBuffer14.setCodec(objectCodec95);
        java.math.BigDecimal bigDecimal98 = null;
        jsonGenerator96.writeNumberField("", bigDecimal98);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 79 + "'", int35 == 79);
        org.junit.Assert.assertNull(formatSchema36);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(tokenBuffer41);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 79 + "'", int52 == 79);
        org.junit.Assert.assertNull(formatSchema53);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(tokenBuffer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(formatSchema74);
        org.junit.Assert.assertNotNull(segment78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator96);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer1.writeStringField("hi!", "hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = tokenBuffer1.getCharacterEscapes();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = tokenBuffer1.getSchema();
        tokenBuffer1.writeEndArray();
        boolean boolean12 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1.writeFieldName("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = tokenBuffer1._objectCodec;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(characterEscapes9);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(objectCodec15);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
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
        java.lang.Boolean boolean19 = parser4.nextBooleanValue();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = parser4._codec;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder12 = null;
        parser4._byteBuilder = byteArrayBuilder12;
        java.lang.String str15 = parser4.getValueAsString("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL]");
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(objectCodec11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL]" + "'", str15, "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL]");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        boolean boolean8 = parser4._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = parser4.nextValue();
        boolean boolean10 = parser4.getValueAsBoolean();
        boolean boolean11 = parser4.isClosed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = tokenBuffer2.getCodec();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer2.useDefaultPrettyPrinter();
        jsonGenerator5.writeObjectField("hi!", (java.lang.Object) 100L);
        jsonGenerator5.writeStringField("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(objectCodec4);
        org.junit.Assert.assertNotNull(jsonGenerator5);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        tokenBuffer1.writeNumber(1);
        tokenBuffer1._hasNativeId = false;
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser41 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment37, objectCodec38, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema42 = parser41.getSchema();
        boolean boolean43 = parser41._hasNativeObjectIds;
        long long45 = parser41.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version46 = parser41.version();
        parser41._closed = true;
        com.fasterxml.jackson.core.JsonLocation jsonLocation49 = parser41._location;
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = parser41.getSchema();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder51 = null;
        parser41._byteBuilder = byteArrayBuilder51;
        tokenBuffer1._objectId = parser41;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = parser41.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNull(formatSchema42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNull(jsonLocation49);
        org.junit.Assert.assertNull(formatSchema50);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter15 = tokenBuffer13.getPrettyPrinter();
        int int16 = tokenBuffer13.getHighestEscapedChar();
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = tokenBuffer22.asParser(objectCodec33);
        com.fasterxml.jackson.core.FormatSchema formatSchema35 = null;
        boolean boolean36 = tokenBuffer22.canUseSchema(formatSchema35);
        tokenBuffer22._generatorFeatures = 0;
        tokenBuffer22.writeNumber((int) (short) 100);
        tokenBuffer22.writeNumberField("", 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser45 = tokenBuffer22.asParser(objectCodec44);
        tokenBuffer13._typeId = jsonParser45;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(prettyPrinter15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonParser45);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
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
        tokenBuffer9.writeNumberField("hi!", (float) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = tokenBuffer1.append(tokenBuffer9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = tokenBuffer9._objectCodec;
        tokenBuffer9.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = tokenBuffer25._last;
        boolean boolean27 = tokenBuffer25.canWriteObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = tokenBuffer25._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser35 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment31, objectCodec32, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = parser35.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser35._segment = segment37;
        com.fasterxml.jackson.core.JsonToken jsonToken39 = parser35.getLastClearedToken();
        char[] charArray40 = parser35.getTextCharacters();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder41 = parser35._byteBuilder;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = segment28.appendRaw((int) '#', (int) (byte) -1, (java.lang.Object) parser35);
        tokenBuffer9._last = segment28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser45 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment28, objectCodec44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(tokenBuffer20);
        org.junit.Assert.assertNull(objectCodec21);
        org.junit.Assert.assertNotNull(segment26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(segment28);
        org.junit.Assert.assertNull(formatSchema36);
        org.junit.Assert.assertNull(jsonToken39);
        org.junit.Assert.assertNull(charArray40);
        org.junit.Assert.assertNull(byteArrayBuilder41);
        org.junit.Assert.assertNotNull(segment42);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = null;
        parser4._location = jsonLocation9;
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext12 = parser4._parsingContext;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonReadContext12);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = tokenBuffer1.setCodec(objectCodec2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer6 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec5);
        boolean boolean7 = tokenBuffer6._hasNativeTypeIds;
        tokenBuffer6.writeFieldName("");
        int int10 = tokenBuffer6.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = tokenBuffer6.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer6.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = tokenBuffer6.append(tokenBuffer15);
        int int17 = tokenBuffer6._appendAt;
        java.lang.Object obj18 = tokenBuffer6.getOutputTarget();
        tokenBuffer6._hasNativeId = false;
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer6);
        tokenBuffer6.writeNumber((float) 97);
        int int24 = tokenBuffer6._appendAt;
        tokenBuffer6.writeStringField("[TokenBuffer: VALUE_NULL]", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_FALSE, START_ARRAY, VALUE_NUMBER_INT]");
        tokenBuffer6.writeArrayFieldStart("[TokenBuffer: VALUE_EMBEDDED_OBJECT, END_ARRAY, VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNull(formatSchema11);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(tokenBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        boolean boolean6 = tokenBuffer1.isClosed();
        tokenBuffer1.writeStartArray(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13, true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = tokenBuffer15._first;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = segment16.type((int) ' ');
        tokenBuffer1._last = segment16;
        long long20 = segment16._tokenTypes;
        long long21 = segment16._tokenTypes;
        long long22 = segment16._tokenTypes;
        boolean boolean23 = segment16.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec24);
        boolean boolean26 = segment16.hasIds();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(tokenBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(segment16);
        org.junit.Assert.assertNull(jsonToken18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext14 = parser8._parsingContext;
        java.lang.Object obj15 = parser8.getObjectId();
        java.lang.Object obj16 = parser8.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = parser8.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        parser8._codec = objectCodec18;
        parser8.close();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(jsonReadContext14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        boolean boolean3 = tokenBuffer2._closed;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = tokenBuffer2.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = tokenBuffer2.setPrettyPrinter(prettyPrinter5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonGenerator4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec4);
        tokenBuffer5._closed = false;
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
        tokenBuffer5._append(jsonToken36);
        tokenBuffer2._append(jsonToken36);
        java.math.BigInteger bigInteger71 = null;
        tokenBuffer2.writeNumber(bigInteger71);
        tokenBuffer2._mayHaveNativeIds = true;
        boolean boolean75 = tokenBuffer2._mayHaveNativeIds;
        org.junit.Assert.assertNull(obj3);
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser4._segment = segment6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.getLastClearedToken();
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadTypeId();
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = parser4.isEnabled(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        tokenBuffer1.writeNumber((long) '4');
        tokenBuffer1.writeStartArray();
        tokenBuffer1._hasNativeTypeIds = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        parser4.clearCurrentToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema12 = parser11.getSchema();
        boolean boolean13 = parser11._hasNativeObjectIds;
        long long15 = parser11.getValueAsLong((long) (byte) 1);
        java.lang.String str16 = parser11.getText();
        boolean boolean17 = parser11.canReadTypeId();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser11);
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = parser11.getCurrentLocation();
        parser4.setLocation(jsonLocation19);
        boolean boolean21 = parser4._hasNativeObjectIds;
        boolean boolean22 = parser4.canReadTypeId();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(formatSchema12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonLocation19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = parser4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        boolean boolean12 = parser4.getValueAsBoolean(true);
        java.lang.String str13 = parser4.getText();
        boolean boolean14 = parser4._hasNativeObjectIds;
        boolean boolean15 = parser4.getValueAsBoolean();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeFieldName("");
        int int5 = tokenBuffer1.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        tokenBuffer1.writeNumber("hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = tokenBuffer1.setCharacterEscapes(characterEscapes9);
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
        com.fasterxml.jackson.core.FormatSchema formatSchema29 = null;
        boolean boolean30 = tokenBuffer16.canUseSchema(formatSchema29);
        tokenBuffer16._generatorFeatures = 0;
        tokenBuffer16.writeNumber((int) (short) 100);
        tokenBuffer16.writeEndArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec36);
        boolean boolean38 = tokenBuffer37._hasNativeTypeIds;
        tokenBuffer37.writeFieldName("");
        int int41 = tokenBuffer37.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema42 = tokenBuffer37.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = tokenBuffer37.setFeatureMask((-1));
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonGenerator44.setPrettyPrinter(prettyPrinter45);
        jsonGenerator46.writeNumberField("hi!", (double) '4');
        tokenBuffer16.writeObject((java.lang.Object) '4');
        tokenBuffer16.writeNumber("[TokenBuffer: ]");
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        tokenBuffer55._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = tokenBuffer55._first;
        com.fasterxml.jackson.core.JsonToken jsonToken60 = segment58.type(97);
        tokenBuffer16._first = segment58;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNull(formatSchema6);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 79 + "'", int41 == 79);
        org.junit.Assert.assertNull(formatSchema42);
        org.junit.Assert.assertNotNull(jsonGenerator44);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertNotNull(segment58);
        org.junit.Assert.assertNull(jsonToken60);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        boolean boolean30 = tokenBuffer2.canOmitFields();
        tokenBuffer2.writeArrayFieldStart("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = parser4._codec;
        int int12 = parser4.getFeatureMask();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder13 = parser4._byteBuilder;
        int int14 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = parser4.getLastClearedToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(objectCodec11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteArrayBuilder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        com.fasterxml.jackson.core.JsonToken jsonToken28 = tokenBuffer2.firstToken();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = tokenBuffer2.getCharacterEscapes();
        tokenBuffer2.writeString("[TokenBuffer: START_ARRAY]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + jsonToken28 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken28.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(characterEscapes29);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        tokenBuffer2.writeNumber((double) 16);
        int int6 = tokenBuffer2.getFeatureMask();
        tokenBuffer2.writeEndArray();
        tokenBuffer2._hasNativeObjectIds = true;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter10 = tokenBuffer2.getPrettyPrinter();
        com.fasterxml.jackson.core.Version version11 = tokenBuffer2.version();
        boolean boolean12 = tokenBuffer2._mayHaveNativeIds;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
        org.junit.Assert.assertNull(prettyPrinter10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonGenerator18.canUseSchema(formatSchema19);
        int int21 = jsonGenerator18.getHighestEscapedChar();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
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
        boolean boolean11 = parser4._hasNativeIds;
        java.lang.String str12 = parser4.getValueAsString();
        boolean boolean13 = parser4.hasTextCharacters();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = tokenBuffer1._objectCodec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = tokenBuffer1._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        tokenBuffer7._closed = false;
        tokenBuffer7.writeNullField("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer7.writeString(serializableString12);
        tokenBuffer1.writeTypeId((java.lang.Object) tokenBuffer7);
        java.math.BigInteger bigInteger15 = null;
        tokenBuffer7.writeNumber(bigInteger15);
        org.junit.Assert.assertNull(objectCodec4);
        org.junit.Assert.assertNotNull(segment5);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1._appendAt = 79;
        tokenBuffer1._closed = false;
        boolean boolean10 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = parser15.getSchema();
        boolean boolean17 = parser15._hasNativeObjectIds;
        long long19 = parser15.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version20 = parser15.version();
        boolean boolean21 = parser15._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder22 = null;
        parser15._byteBuilder = byteArrayBuilder22;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = parser15._segment;
        int int25 = parser15.getTextLength();
        boolean boolean26 = parser15._hasNativeObjectIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = parser31.getSchema();
        boolean boolean33 = parser31._hasNativeObjectIds;
        long long35 = parser31.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version36 = parser31.version();
        boolean boolean37 = parser31._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder38 = null;
        parser31._byteBuilder = byteArrayBuilder38;
        boolean boolean40 = parser31.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext41 = parser31._parsingContext;
        com.fasterxml.jackson.core.SerializableString serializableString42 = null;
        boolean boolean43 = parser31.nextFieldName(serializableString42);
        java.lang.Object obj44 = parser31.getInputSource();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = parser49.getSchema();
        boolean boolean51 = parser49._hasNativeObjectIds;
        long long53 = parser49.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version54 = parser49.version();
        boolean boolean55 = parser49._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder56 = null;
        parser49._byteBuilder = byteArrayBuilder56;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser62 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec59, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema63 = parser62.getSchema();
        boolean boolean64 = parser62._hasNativeObjectIds;
        long long66 = parser62.getValueAsLong((long) (byte) 1);
        com.fasterxml.jackson.core.Version version67 = parser62.version();
        boolean boolean68 = parser62._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder69 = null;
        parser62._byteBuilder = byteArrayBuilder69;
        boolean boolean71 = parser62.hasTextCharacters();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext72 = parser62._parsingContext;
        parser49._parsingContext = jsonReadContext72;
        parser31._parsingContext = jsonReadContext72;
        parser15._parsingContext = jsonReadContext72;
        tokenBuffer1.writeObjectId((java.lang.Object) jsonReadContext72);
        java.lang.Object obj77 = tokenBuffer1._typeId;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(formatSchema16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(segment24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(formatSchema32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonReadContext41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(formatSchema50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(version54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(formatSchema63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(version67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jsonReadContext72);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = tokenBuffer1.setCodec(objectCodec2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer6 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec5);
        boolean boolean7 = tokenBuffer6._hasNativeTypeIds;
        tokenBuffer6.writeFieldName("");
        int int10 = tokenBuffer6.getFeatureMask();
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = tokenBuffer6.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer6.setFeatureMask((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = tokenBuffer6.append(tokenBuffer15);
        int int17 = tokenBuffer6._appendAt;
        java.lang.Object obj18 = tokenBuffer6.getOutputTarget();
        tokenBuffer6._hasNativeId = false;
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) tokenBuffer6);
        tokenBuffer6.writeStartArray((int) (byte) 10);
        boolean boolean24 = tokenBuffer6._closed;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = tokenBuffer6.setHighestNonEscapedChar(35);
        boolean boolean27 = tokenBuffer6.isClosed();
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNull(formatSchema11);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(tokenBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        boolean boolean8 = parser4._hasNativeObjectIds;
        int int9 = parser4.getCurrentTokenId();
        java.lang.Object obj10 = parser4.getEmbeddedObject();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        java.lang.Object obj7 = parser4.getEmbeddedObject();
        int int8 = parser4.getFeatureMask();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = parser4.getParsingContext();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        boolean boolean8 = parser4.hasTextCharacters();
        double double9 = parser4.getValueAsDouble();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        boolean boolean10 = parser4.canReadTypeId();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = parser4.skipChildren();
        double double12 = parser4.getValueAsDouble();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext13 = parser4._parsingContext;
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = parser4._location;
        com.fasterxml.jackson.core.SerializableString serializableString15 = null;
        boolean boolean16 = parser4.nextFieldName(serializableString15);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(jsonReadContext13);
        org.junit.Assert.assertNull(jsonLocation14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        java.lang.Object obj3 = tokenBuffer2._objectId;
        tokenBuffer2.writeNumber((double) 16);
        int int6 = tokenBuffer2.getFeatureMask();
        tokenBuffer2.writeEndArray();
        tokenBuffer2._hasNativeObjectIds = true;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer2.writeRawValue("[TokenBuffer: VALUE_NUMBER_INT]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._hasNativeIds;
        com.fasterxml.jackson.core.SerializableString serializableString8 = null;
        boolean boolean9 = parser4.nextFieldName(serializableString8);
        long long11 = parser4.nextLongValue(1L);
        char[] charArray12 = parser4.getTextCharacters();
        java.lang.String str13 = parser4.getCurrentName();
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = parser4.configure(feature14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.close();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer1.getOutputContext();
        boolean boolean5 = tokenBuffer1.canWriteBinaryNatively();
        tokenBuffer1._appendAt = 79;
        tokenBuffer1._closed = false;
        boolean boolean10 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.TreeNode treeNode11 = null;
        tokenBuffer1.writeTree(treeNode11);
        com.fasterxml.jackson.core.SerializableString serializableString13 = null;
        tokenBuffer1.writeString(serializableString13);
        boolean boolean15 = tokenBuffer1.isClosed();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = tokenBuffer1._objectCodec;
        tokenBuffer1._hasNativeId = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectCodec16);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        com.fasterxml.jackson.core.JsonToken jsonToken29 = tokenBuffer1.firstToken();
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertTrue("'" + jsonToken29 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken29.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = parser8.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        parser8._segment = segment10;
        java.lang.Boolean boolean12 = parser8.nextBooleanValue();
        java.lang.String str14 = parser8.getValueAsString("");
        boolean boolean16 = parser8.getValueAsBoolean(true);
        com.fasterxml.jackson.core.Version version17 = parser8.version();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = parser8.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.copyCurrentEvent(jsonParser18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(jsonParser18);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        tokenBuffer1._hasNativeTypeIds = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser29 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment25, objectCodec26, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = parser29.getSchema();
        boolean boolean31 = parser29._hasNativeObjectIds;
        boolean boolean32 = parser29.hasTextCharacters();
        boolean boolean33 = parser29._hasNativeIds;
        java.io.OutputStream outputStream34 = null;
        int int35 = parser29.releaseBuffered(outputStream34);
        long long36 = parser29.getValueAsLong();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer40 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec39);
        boolean boolean41 = tokenBuffer40._hasNativeTypeIds;
        tokenBuffer40._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        tokenBuffer40.writeFieldName("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = tokenBuffer40.setHighestNonEscapedChar(32);
        java.math.BigDecimal bigDecimal50 = null;
        jsonGenerator48.writeNumberField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT]", bigDecimal50);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer53 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec52);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        tokenBuffer53._objectCodec = objectCodec54;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec57);
        tokenBuffer58._closed = false;
        tokenBuffer58.writeBooleanField("", true);
        boolean boolean64 = tokenBuffer58._hasNativeTypeIds;
        byte[] byteArray66 = new byte[] { (byte) 0 };
        tokenBuffer58.writeBinary(byteArray66);
        tokenBuffer53.writeBinaryField("", byteArray66);
        jsonGenerator48.writeBinary(byteArray66);
        tokenBuffer37.writeBinaryField("", byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeUTF8String(byteArray66, (int) (byte) 0, (int) (byte) 0);
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
        org.junit.Assert.assertNull(formatSchema30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 0 });
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        parser4._closed = true;
        boolean boolean11 = parser4.getValueAsBoolean();
        double double12 = parser4.getValueAsDouble();
        parser4._segmentPtr = (byte) -1;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext15 = parser4._parsingContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = parser4._segment;
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(jsonReadContext15);
        org.junit.Assert.assertNull(segment16);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = parser4.getCurrentToken();
        long long17 = parser4.getValueAsLong((long) (short) -1);
        parser4._closed = false;
        long long20 = parser4.getValueAsLong();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = parser4.setFeatureMask(0);
        boolean boolean23 = parser4._hasNativeTypeIds;
        java.lang.String str24 = parser4.getText();
        parser4.overrideCurrentName("[TokenBuffer: ]");
        parser4.overrideCurrentName("[TokenBuffer: VALUE_NULL]");
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonReadContext14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = tokenBuffer1._objectCodec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = tokenBuffer1._last;
        java.lang.Object obj7 = segment5.findTypeId((-1));
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = segment5._next;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap9 = segment5._nativeIds;
        java.lang.Object obj11 = segment5.get((int) (short) 0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment12 = segment5.next();
        org.junit.Assert.assertNull(objectCodec4);
        org.junit.Assert.assertNotNull(segment5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(segment8);
        org.junit.Assert.assertNull(intMap9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(segment12);
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
        java.math.BigDecimal bigDecimal6 = null;
        tokenBuffer1.writeNumber(bigDecimal6);
        java.lang.String str8 = tokenBuffer1.toString();
        tokenBuffer1.writeStartArray(79);
        tokenBuffer1.writeFieldName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[TokenBuffer: VALUE_NULL]" + "'", str8, "[TokenBuffer: VALUE_NULL]");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext14 = parser8._parsingContext;
        java.lang.Object obj15 = parser8.getObjectId();
        java.lang.Object obj16 = parser8.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = parser8.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = parser8.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(jsonReadContext14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        tokenBuffer1.writeStringField("[TokenBuffer: VALUE_NULL, END_OBJECT, FIELD_NAME([TokenBuffer: ]), VALUE_STRING]", "[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        boolean boolean2 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1._appendRaw((int) (byte) 0, (java.lang.Object) 100.0f);
        boolean boolean6 = tokenBuffer1._hasNativeId;
        int int7 = tokenBuffer1._appendAt;
        tokenBuffer1.writeFieldName("");
        tokenBuffer1.close();
        tokenBuffer1.writeEndArray();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeNumber("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer1.asParser(objectCodec16);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        tokenBuffer1.writeString(serializableString18);
        tokenBuffer1.writeNumber((int) (short) 1);
        java.lang.Object obj23 = null;
        tokenBuffer1._appendRaw((int) (short) 0, obj23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        tokenBuffer1._objectCodec = objectCodec2;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = tokenBuffer1._objectCodec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = tokenBuffer1._last;
        tokenBuffer1.writeBooleanField("hi!", true);
        com.fasterxml.jackson.core.TreeNode treeNode9 = null;
        tokenBuffer1.writeTree(treeNode9);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext11 = tokenBuffer1._writeContext;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext12 = tokenBuffer1.getOutputContext();
        org.junit.Assert.assertNull(objectCodec4);
        org.junit.Assert.assertNotNull(segment5);
        org.junit.Assert.assertNotNull(jsonWriteContext11);
        org.junit.Assert.assertNotNull(jsonWriteContext12);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int6 = parser4.getValueAsInt((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        int int8 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = parser4.skipChildren();
        double double11 = parser4.getValueAsDouble((double) 10.0f);
        boolean boolean12 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder13 = null;
        parser4._byteBuilder = byteArrayBuilder13;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = null;
        parser4._byteBuilder = byteArrayBuilder15;
        double double17 = parser4.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = parser4.enable(feature18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        boolean boolean7 = parser4._closed;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = parser4._codec;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = parser4.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectCodec8);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        parser4.overrideCurrentName("[TokenBuffer: START_ARRAY]");
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
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4._hasNativeObjectIds;
        long long8 = parser4.getValueAsLong((long) (byte) 1);
        java.lang.String str9 = parser4.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = parser4._codec;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = parser4.getParsingContext();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        parser4.setCodec(objectCodec13);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(objectCodec11);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        parser4.close();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.nextValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = parser4._segment;
        boolean boolean9 = parser4.isClosed();
        boolean boolean10 = parser4.hasCurrentToken();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(segment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        boolean boolean13 = parser11._closed;
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = parser11.getCurrentLocation();
        boolean boolean15 = parser11._hasNativeObjectIds;
        java.lang.String str16 = parser11.getCurrentName();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = parser11.setFeatureMask((int) (short) 100);
        boolean boolean19 = parser11.getValueAsBoolean();
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        boolean boolean6 = parser4.canReadObjectId();
        int int7 = parser4.getValueAsInt();
        java.lang.Object obj8 = parser4.getEmbeddedObject();
        boolean boolean9 = parser4.hasCurrentToken();
        java.io.Writer writer10 = null;
        int int11 = parser4.releaseBuffered(writer10);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        java.math.BigDecimal bigDecimal26 = null;
        tokenBuffer1.writeNumberField("", bigDecimal26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        tokenBuffer29._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment32 = tokenBuffer29._first;
        java.lang.Object obj34 = segment32.findObjectId((int) (byte) 1);
        tokenBuffer1._first = segment32;
        java.lang.Object obj36 = tokenBuffer1._objectId;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(segment32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
    }
}

