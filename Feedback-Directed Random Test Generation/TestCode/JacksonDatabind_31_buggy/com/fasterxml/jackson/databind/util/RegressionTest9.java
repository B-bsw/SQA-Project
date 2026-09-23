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
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        int int3 = tokenBuffer2._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = tokenBuffer2.forceUseOfBigDecimal(true);
        java.lang.Object obj6 = tokenBuffer5.getOutputTarget();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec7, true);
        boolean boolean10 = tokenBuffer9.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11, true);
        int int14 = tokenBuffer13._appendAt;
        tokenBuffer9.writeObject((java.lang.Object) int14);
        tokenBuffer9.writeNumber((int) (byte) 100);
        tokenBuffer5.writeObjectId((java.lang.Object) (byte) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19, true);
        int int22 = tokenBuffer21._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = tokenBuffer21.forceUseOfBigDecimal(true);
        boolean boolean25 = tokenBuffer24.canWriteTypeId();
        boolean boolean26 = tokenBuffer24._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec27, true);
        int int30 = tokenBuffer29._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = tokenBuffer29.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer32.setCodec(objectCodec33);
        java.lang.Object obj35 = tokenBuffer32.getCurrentValue();
        tokenBuffer32.writeBooleanField("hi!", true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext39 = tokenBuffer32.getOutputContext();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = tokenBuffer32._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41, true);
        int int44 = tokenBuffer43._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = tokenBuffer43.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = tokenBuffer46.setCodec(objectCodec47);
        java.lang.Object obj49 = tokenBuffer46.getCurrentValue();
        tokenBuffer46.writeBooleanField("hi!", true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext53 = tokenBuffer46.getOutputContext();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment54 = tokenBuffer46._last;
        segment40._next = segment54;
        tokenBuffer24._first = segment40;
        int int58 = segment40.rawType((int) (short) 0);
        tokenBuffer5._last = segment40;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser64 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment60, objectCodec61, true, true);
        double double65 = parser64.getValueAsDouble();
        parser64.close();
        java.lang.Boolean boolean67 = parser64.nextBooleanValue();
        long long68 = parser64.getValueAsLong();
        int int69 = parser64.getTextOffset();
        tokenBuffer5._objectId = int69;
        tokenBuffer5.writeEndObject();
        boolean boolean72 = tokenBuffer5._forceBigDecimal;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment73 = tokenBuffer5._last;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(jsonWriteContext39);
        org.junit.Assert.assertNotNull(segment40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer46);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(jsonWriteContext53);
        org.junit.Assert.assertNotNull(segment54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNull(boolean67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(segment73);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        java.lang.String str6 = parser4.nextTextValue();
        parser4.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        parser4._location = jsonLocation8;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = parser4.setFeatureMask(31);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        parser4.clearCurrentToken();
        int int9 = parser4.getValueAsInt((int) (short) -1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser14 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec11, true, true);
        double double15 = parser14.getValueAsDouble();
        java.lang.String str16 = parser14.nextTextValue();
        parser14.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = null;
        parser14._location = jsonLocation18;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext20 = parser14._parsingContext;
        parser4._parsingContext = jsonReadContext20;
        com.fasterxml.jackson.core.JsonLocation jsonLocation22 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = parser4.getCodec();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonReadContext20);
        org.junit.Assert.assertNotNull(jsonLocation22);
        org.junit.Assert.assertNull(objectCodec23);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        int int3 = tokenBuffer2._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = tokenBuffer2.forceUseOfBigDecimal(true);
        tokenBuffer2.writeBooleanField("", true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer2._writeContext;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = tokenBuffer2.setFeatureMask(1);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer2.setPrettyPrinter(prettyPrinter12);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext14 = tokenBuffer2._writeContext;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = tokenBuffer2.getCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = tokenBuffer2.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext18 = tokenBuffer2.getOutputContext();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer5);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertNotNull(jsonGenerator11);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonWriteContext14);
        org.junit.Assert.assertNull(objectCodec15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext18);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        java.lang.String str6 = parser4.nextTextValue();
        parser4.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = parser4.getCodec();
        parser4._closed = true;
        boolean boolean11 = parser4.requiresCustomCodec();
        java.lang.String str12 = parser4.nextFieldName();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder13 = null;
        parser4._byteBuilder = byteArrayBuilder13;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = parser4._codec;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectCodec8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectCodec15);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        int int3 = tokenBuffer2._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = tokenBuffer2.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer5.setCodec(objectCodec6);
        boolean boolean8 = tokenBuffer5.isClosed();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9, true);
        boolean boolean12 = tokenBuffer11.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13, true);
        int int16 = tokenBuffer15._appendAt;
        tokenBuffer11.writeObject((java.lang.Object) int16);
        tokenBuffer5._objectId = tokenBuffer11;
        tokenBuffer5.writeNumberField("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT]", (long) (short) 10);
        tokenBuffer5._appendAt = 100;
        int int24 = tokenBuffer5._appendAt;
        tokenBuffer5.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26, true);
        int int29 = tokenBuffer28._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = tokenBuffer28.forceUseOfBigDecimal(true);
        java.lang.Object obj32 = tokenBuffer31.getOutputTarget();
        boolean boolean33 = tokenBuffer31._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34, true);
        boolean boolean37 = tokenBuffer36.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer40 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38, true);
        int int41 = tokenBuffer40._appendAt;
        tokenBuffer36.writeObject((java.lang.Object) int41);
        tokenBuffer36.writeNumber((int) (byte) 100);
        int int45 = tokenBuffer36.getHighestEscapedChar();
        tokenBuffer31._typeId = int45;
        com.fasterxml.jackson.core.FormatSchema formatSchema47 = null;
        boolean boolean48 = tokenBuffer31.canUseSchema(formatSchema47);
        tokenBuffer31.writeNumber(1.0d);
        boolean boolean51 = tokenBuffer31._closed;
        tokenBuffer31._hasNativeObjectIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        tokenBuffer55.writeNullField("");
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = tokenBuffer31.append(tokenBuffer55);
        java.lang.String str59 = tokenBuffer55.toString();
        tokenBuffer55.writeFieldName("[TokenBuffer: VALUE_NULL, VALUE_NUMBER_INT]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer65 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec63, true);
        int int66 = tokenBuffer65._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer68 = tokenBuffer65.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator70 = tokenBuffer68.setCodec(objectCodec69);
        java.lang.Object obj71 = tokenBuffer68.getCurrentValue();
        int int72 = tokenBuffer68._generatorFeatures;
        byte[] byteArray79 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        tokenBuffer68.writeBinary(byteArray79);
        tokenBuffer55.writeBinaryField("", byteArray79);
        tokenBuffer5.writeBinary(byteArray79);
        tokenBuffer5._closed = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer5);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tokenBuffer58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[TokenBuffer: FIELD_NAME(), VALUE_NULL]" + "'", str59, "[TokenBuffer: FIELD_NAME(), VALUE_NULL]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer68);
        org.junit.Assert.assertNotNull(jsonGenerator70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 31 + "'", int72 == 31);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        int int3 = tokenBuffer2._appendAt;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext4 = tokenBuffer2._writeContext;
        com.fasterxml.jackson.core.SerializableString serializableString5 = null;
        tokenBuffer2.writeString(serializableString5);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = tokenBuffer2.forceUseOfBigDecimal(true);
        tokenBuffer8.writeRawValue("[TokenBuffer: FIELD_NAME(hi!), VALUE_NUMBER_INT, VALUE_TRUE]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11, true);
        int int14 = tokenBuffer13._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = null;
        boolean boolean21 = parser19.canUseSchema(formatSchema20);
        java.lang.Class<?> wildcardClass22 = parser19.getClass();
        tokenBuffer13._objectId = parser19;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24, true);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = tokenBuffer13.append(tokenBuffer26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer13.setCharacterEscapes(characterEscapes28);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer13.overrideStdFeatures(10, (int) 'a');
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = tokenBuffer13._objectCodec;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext34 = tokenBuffer13.getOutputContext();
        tokenBuffer8._writeContext = jsonWriteContext34;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer8.overrideStdFeatures((int) '#', (int) (byte) 0);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer8.setSchema(formatSchema39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jsonWriteContext4);
        org.junit.Assert.assertNotNull(tokenBuffer8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(tokenBuffer27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNull(objectCodec33);
        org.junit.Assert.assertNotNull(jsonWriteContext34);
        org.junit.Assert.assertNotNull(jsonGenerator38);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        parser4.clearCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8, true);
        int int11 = tokenBuffer10._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = tokenBuffer10.forceUseOfBigDecimal(true);
        java.lang.Object obj14 = tokenBuffer13.getOutputTarget();
        boolean boolean15 = tokenBuffer13._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16, true);
        int int19 = tokenBuffer18._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = null;
        boolean boolean26 = parser24.canUseSchema(formatSchema25);
        java.lang.Class<?> wildcardClass27 = parser24.getClass();
        tokenBuffer18._objectId = parser24;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29, true);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = tokenBuffer18.append(tokenBuffer31);
        tokenBuffer32.writeNumberField("hi!", 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = tokenBuffer32.setCodec(objectCodec36);
        tokenBuffer13.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec39, true);
        int int42 = tokenBuffer41._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer44 = tokenBuffer41.forceUseOfBigDecimal(true);
        boolean boolean45 = tokenBuffer44.canWriteTypeId();
        boolean boolean46 = tokenBuffer44._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer49 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47, true);
        int int50 = tokenBuffer49._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer52 = tokenBuffer49.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator54 = tokenBuffer52.setCodec(objectCodec53);
        java.lang.Object obj55 = tokenBuffer52.getCurrentValue();
        tokenBuffer52.writeBooleanField("hi!", true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext59 = tokenBuffer52.getOutputContext();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = tokenBuffer52._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer63 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec61, true);
        int int64 = tokenBuffer63._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer66 = tokenBuffer63.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = tokenBuffer66.setCodec(objectCodec67);
        java.lang.Object obj69 = tokenBuffer66.getCurrentValue();
        tokenBuffer66.writeBooleanField("hi!", true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext73 = tokenBuffer66.getOutputContext();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment74 = tokenBuffer66._last;
        segment60._next = segment74;
        tokenBuffer44._first = segment60;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser80 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment60, objectCodec77, false, false);
        tokenBuffer13._first = segment60;
        boolean boolean82 = segment60.hasIds();
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap83 = null;
        segment60._nativeIds = intMap83;
        parser4._segment = segment60;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment86 = parser4._segment;
        java.lang.Object[] objArray87 = segment86._tokens;
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser91 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment86, objectCodec88, false, false);
        double double92 = parser91.getValueAsDouble();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment93 = parser91._segment;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(tokenBuffer32);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer52);
        org.junit.Assert.assertNotNull(jsonGenerator54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(jsonWriteContext59);
        org.junit.Assert.assertNotNull(segment60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer66);
        org.junit.Assert.assertNotNull(jsonGenerator68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(jsonWriteContext73);
        org.junit.Assert.assertNotNull(segment74);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(segment86);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[hi!, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[hi!, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertNotNull(segment93);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        int int3 = tokenBuffer2._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = tokenBuffer2.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer5.setCodec(objectCodec6);
        boolean boolean8 = tokenBuffer5.isClosed();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10, true);
        boolean boolean13 = tokenBuffer12.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14, true);
        int int17 = tokenBuffer16._appendAt;
        tokenBuffer12.writeObject((java.lang.Object) int17);
        tokenBuffer5.writeObjectField("", (java.lang.Object) int17);
        tokenBuffer5.writeStartArray();
        tokenBuffer5.writeNull();
        tokenBuffer5.writeStartObject();
        java.lang.Object obj23 = tokenBuffer5.getCurrentValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24, true);
        int int27 = tokenBuffer26._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = tokenBuffer26.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = tokenBuffer29.setCodec(objectCodec30);
        java.lang.Object obj32 = tokenBuffer29.getCurrentValue();
        int int33 = tokenBuffer29._generatorFeatures;
        tokenBuffer29.writeObjectId((java.lang.Object) 10L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec36, true);
        int int39 = tokenBuffer38._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = tokenBuffer38.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = tokenBuffer41.setCodec(objectCodec42);
        boolean boolean44 = tokenBuffer41.isClosed();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec46, true);
        boolean boolean49 = tokenBuffer48.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer52 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec50, true);
        int int53 = tokenBuffer52._appendAt;
        tokenBuffer48.writeObject((java.lang.Object) int53);
        tokenBuffer41.writeObjectField("", (java.lang.Object) int53);
        boolean boolean56 = tokenBuffer41.canWriteTypeId();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = tokenBuffer29.append(tokenBuffer41);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes58 = tokenBuffer29.getCharacterEscapes();
        tokenBuffer5._objectId = tokenBuffer29;
        boolean boolean60 = tokenBuffer29._hasNativeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment61 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser65 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment61, objectCodec62, true, true);
        double double66 = parser65.getValueAsDouble();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment67 = parser65._segment;
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = parser65.getCodec();
        com.fasterxml.jackson.core.SerializableString serializableString69 = null;
        boolean boolean70 = parser65.nextFieldName(serializableString69);
        boolean boolean71 = parser65.isClosed();
        boolean boolean72 = parser65.isExpectedStartObjectToken();
        tokenBuffer29._objectId = parser65;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer5);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31 + "'", int33 == 31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer41);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tokenBuffer57);
        org.junit.Assert.assertNull(characterEscapes58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNull(segment67);
        org.junit.Assert.assertNull(objectCodec68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        int int3 = tokenBuffer2._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = tokenBuffer2.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer5.setCodec(objectCodec6);
        java.lang.Object obj8 = tokenBuffer5.getCurrentValue();
        tokenBuffer5.writeBooleanField("hi!", true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext12 = tokenBuffer5.getOutputContext();
        boolean boolean13 = tokenBuffer5.canWriteBinaryNatively();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer5._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser18 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment14, objectCodec15, false, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20, true);
        int int23 = tokenBuffer22._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = tokenBuffer22.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = tokenBuffer25.setCodec(objectCodec26);
        boolean boolean28 = tokenBuffer25.canWriteBinaryNatively();
        tokenBuffer25.writeObjectField("", (java.lang.Object) 10.0d);
        tokenBuffer25.writeNull();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = tokenBuffer25.asParser();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = tokenBuffer25.setCharacterEscapes(characterEscapes34);
        tokenBuffer25._closed = false;
        com.fasterxml.jackson.core.JsonToken jsonToken38 = tokenBuffer25.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = segment14.append(100, jsonToken38);
        java.lang.Object[] objArray40 = segment39._tokens;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer5);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(jsonWriteContext12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertTrue("'" + jsonToken38 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken38.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNotNull(segment39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        int int3 = tokenBuffer2._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = tokenBuffer2.forceUseOfBigDecimal(true);
        java.lang.Object obj6 = tokenBuffer5.getOutputTarget();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext7 = tokenBuffer5.getOutputContext();
        boolean boolean8 = tokenBuffer5.canWriteBinaryNatively();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer5._writeContext;
        boolean boolean10 = tokenBuffer5._closed;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = tokenBuffer5.asParser(objectCodec11);
        tokenBuffer5.writeString("[TokenBuffer: VALUE_NUMBER_INT, VALUE_EMBEDDED_OBJECT, FIELD_NAME(), VALUE_NUMBER_INT]");
        tokenBuffer5.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16, true);
        int int19 = tokenBuffer18._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = tokenBuffer18.forceUseOfBigDecimal(true);
        java.lang.Object obj22 = tokenBuffer21.getOutputTarget();
        boolean boolean23 = tokenBuffer21._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24, true);
        boolean boolean27 = tokenBuffer26.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28, true);
        int int31 = tokenBuffer30._appendAt;
        tokenBuffer26.writeObject((java.lang.Object) int31);
        tokenBuffer26.writeNumber((int) (byte) 100);
        int int35 = tokenBuffer26.getHighestEscapedChar();
        tokenBuffer21._typeId = int35;
        com.fasterxml.jackson.core.FormatSchema formatSchema37 = null;
        boolean boolean38 = tokenBuffer21.canUseSchema(formatSchema37);
        tokenBuffer21.writeNumber(1.0d);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = tokenBuffer21.forceUseOfBigDecimal(true);
        tokenBuffer42.writeNumber((short) (byte) 10);
        com.fasterxml.jackson.core.Version version45 = tokenBuffer42.version();
        tokenBuffer5.writeTypeId((java.lang.Object) tokenBuffer42);
        char[] charArray51 = new char[] { '#', '#', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer5.writeRawValue(charArray51, 27, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 27, count -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(jsonWriteContext7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(tokenBuffer21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tokenBuffer42);
        org.junit.Assert.assertNotNull(version45);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '#', '#', '#', '#' });
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        java.lang.Object obj6 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.Version version7 = parser4.version();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        java.lang.String str6 = parser4.nextTextValue();
        parser4.close();
        boolean boolean9 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = parser4.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder12 = parser4._byteBuilder;
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = parser4.getCurrentLocation();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = parser4.getParsingContext();
        com.fasterxml.jackson.core.Version version15 = parser4.version();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertNull(byteArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
        org.junit.Assert.assertNotNull(version15);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = parser4._segment;
        java.lang.String str7 = parser4.nextFieldName();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = parser4.skipChildren();
        boolean boolean9 = parser4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = parser4.getParsingContext();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = parser4.getCurrentLocation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(segment6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
        org.junit.Assert.assertNotNull(jsonLocation11);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        parser4.clearCurrentToken();
        int int9 = parser4.getValueAsInt((int) (short) -1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser14 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec11, true, true);
        double double15 = parser14.getValueAsDouble();
        java.lang.String str16 = parser14.nextTextValue();
        parser14.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = null;
        parser14._location = jsonLocation18;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext20 = parser14._parsingContext;
        parser4._parsingContext = jsonReadContext20;
        parser4._closed = false;
        boolean boolean24 = parser4.isExpectedStartObjectToken();
        int int25 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder26 = null;
        parser4._byteBuilder = byteArrayBuilder26;
        java.io.OutputStream outputStream28 = null;
        int int29 = parser4.releaseBuffered(outputStream28);
        int int30 = parser4.getFeatureMask();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonReadContext20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        parser4.close();
        java.lang.Boolean boolean7 = parser4.nextBooleanValue();
        long long8 = parser4.getValueAsLong();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = parser4.nextToken();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = parser4.setFeatureMask((int) (short) 0);
        int int12 = parser4.getTextOffset();
        java.lang.String str14 = parser4.getValueAsString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = null;
        boolean boolean21 = parser19.canUseSchema(formatSchema20);
        java.lang.String str22 = parser19.nextFieldName();
        boolean boolean24 = parser19.hasTokenId((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = parser19.skipChildren();
        boolean boolean26 = parser19.hasCurrentToken();
        java.lang.Boolean boolean27 = parser19.nextBooleanValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser32 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment28, objectCodec29, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema33 = null;
        boolean boolean34 = parser32.canUseSchema(formatSchema33);
        parser32.clearCurrentToken();
        int int37 = parser32.getValueAsInt((int) (short) -1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser42 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment38, objectCodec39, true, true);
        double double43 = parser42.getValueAsDouble();
        java.lang.String str44 = parser42.nextTextValue();
        parser42.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation46 = null;
        parser42._location = jsonLocation46;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext48 = parser42._parsingContext;
        parser32._parsingContext = jsonReadContext48;
        parser19._parsingContext = jsonReadContext48;
        parser4._parsingContext = jsonReadContext48;
        com.fasterxml.jackson.core.JsonLocation jsonLocation52 = parser4._location;
        boolean boolean53 = parser4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser jsonParser55 = parser4.setFeatureMask((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(jsonReadContext48);
        org.junit.Assert.assertNull(jsonLocation52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonParser55);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getFormatFeatures();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = null;
        parser4._parsingContext = jsonReadContext6;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment8, objectCodec9, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = null;
        boolean boolean14 = parser12.canUseSchema(formatSchema13);
        java.lang.String str15 = parser12.nextFieldName();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec17, true, true);
        double double21 = parser20.getValueAsDouble();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = parser20.getCodec();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment23 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser27 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment23, objectCodec24, true, true);
        double double28 = parser27.getValueAsDouble();
        java.lang.String str29 = parser27.nextTextValue();
        parser27.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation31 = null;
        parser27._location = jsonLocation31;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext33 = parser27._parsingContext;
        parser20._parsingContext = jsonReadContext33;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext35 = parser20._parsingContext;
        parser12._parsingContext = jsonReadContext35;
        parser4._parsingContext = jsonReadContext35;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = parser4.skipChildren();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = parser4._segment;
        com.fasterxml.jackson.core.JsonLocation jsonLocation40 = parser4._location;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(objectCodec22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(jsonReadContext33);
        org.junit.Assert.assertNotNull(jsonReadContext35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNull(segment39);
        org.junit.Assert.assertNull(jsonLocation40);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        java.lang.String str6 = parser4.nextTextValue();
        parser4.close();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = parser4.getParsingContext();
        int int9 = parser4.getValueAsInt();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder10 = parser4._byteBuilder;
        double double11 = parser4.getValueAsDouble();
        boolean boolean12 = parser4.canReadTypeId();
        boolean boolean13 = parser4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = parser4.getTokenLocation();
        boolean boolean15 = parser4._hasNativeTypeIds;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteArrayBuilder10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        double double5 = parser4.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = parser4.overrideStdFeatures((int) (short) 0, (int) '#');
        parser4.close();
        com.fasterxml.jackson.core.SerializableString serializableString10 = null;
        boolean boolean11 = parser4.nextFieldName(serializableString10);
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = parser4.getCurrentLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        boolean boolean14 = tokenBuffer13._mayHaveNativeIds;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }
}

