package com.fasterxml.jackson.databind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        java.io.Closeable closeable3 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = new com.fasterxml.jackson.databind.JsonMappingException(closeable3, "hi!", jsonLocation5);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException("java.lang.Float[\"\"]", (java.lang.Throwable) jsonMappingException6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE((java.io.IOException) jsonMappingException6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "com.fasterxml.jackson.databind.JsonMappingException: com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Character[0]) (through reference chain: java.lang.Short[?])", (java.lang.Throwable) jsonMappingException6);
        java.lang.String str10 = jsonMappingException6.toString();
        java.io.Closeable closeable12 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException15 = new com.fasterxml.jackson.databind.JsonMappingException(closeable12, "java.lang.Boolean[?]", jsonLocation14);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException16 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]", (java.lang.Throwable) jsonMappingException15);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference17 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference17.setIndex((int) '4');
        java.lang.String str20 = reference17.getFieldName();
        reference17.setIndex((int) (byte) 0);
        int int23 = reference17._index;
        reference17.setFieldName("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException16, (java.lang.Object) reference17, (int) (byte) 10);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference29 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) reference17, 1000);
        jsonMappingException6.prependPath((java.lang.Object) reference17, (int) (byte) 10);
        int int32 = reference17._index;
        java.lang.Object obj33 = reference17.getFrom();
        org.junit.Assert.assertNotNull(jsonMappingException8);
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: hi!" + "'", str10, "com.fasterxml.jackson.databind.JsonMappingException: hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(jsonMappingException27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Character[0])");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference4 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) (short) 0);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, reference4);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE((java.io.IOException) jsonMappingException2);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        java.lang.Throwable throwable9 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser7, "", throwable9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException10, (java.lang.Object) 10L, (int) (short) -1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation15 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException16 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation15);
        java.lang.StringBuilder stringBuilder17 = null;
        jsonMappingException16._appendPathDesc(stringBuilder17);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException16, (java.lang.Object) 100.0f, "");
        java.lang.String str22 = jsonMappingException21.getOriginalMessage();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException21, (java.lang.Object) (-1.0f), 10);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference27 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) false);
        int int28 = reference27.getIndex();
        jsonMappingException21.prependPath(reference27);
        reference27.setIndex(10);
        jsonMappingException10.prependPath(reference27);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        java.lang.Throwable throwable35 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException36 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser33, "", throwable35);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList37 = jsonMappingException36._path;
        java.lang.StringBuilder stringBuilder38 = null;
        java.lang.StringBuilder stringBuilder39 = jsonMappingException36.getPathReference(stringBuilder38);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference40 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException36, reference40);
        jsonMappingException10.prependPath((java.lang.Object) reference40, "com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        java.lang.String str44 = jsonMappingException10._buildMessage();
        java.lang.Throwable[] throwableArray45 = jsonMappingException10.getSuppressed();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException47 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException6, (java.lang.Object) jsonMappingException10, "Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException): hi!");
        java.lang.String str48 = jsonMappingException10._buildMessage();
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNotNull(jsonMappingException6);
        org.junit.Assert.assertNotNull(jsonMappingException10);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(jsonMappingException36);
        org.junit.Assert.assertNull(referenceList37);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(jsonMappingException41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " (through reference chain: UNKNOWN[\"com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]\"]->java.lang.Boolean[10]->java.lang.Long[?])" + "'", str44, " (through reference chain: UNKNOWN[\"com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]\"]->java.lang.Boolean[10]->java.lang.Long[?])");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertArrayEquals(throwableArray45, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(jsonMappingException47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + " (through reference chain: UNKNOWN[\"com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]\"]->java.lang.Boolean[10]->java.lang.Long[?])" + "'", str48, " (through reference chain: UNKNOWN[\"com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]\"]->java.lang.Boolean[10]->java.lang.Long[?])");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(deserializationContext0, "java.lang.Float[\"\"]->java.lang.Float[10]->java.lang.Float[\"\"]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("");
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = jsonMappingException4.getLocation();
        java.lang.Object obj6 = jsonMappingException4.getProcessor();
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList7 = jsonMappingException4._path;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException(" (through reference chain: UNKNOWN[\"UNKNOWN[52]\"])", (java.lang.Throwable) jsonMappingException4);
        java.lang.String str9 = jsonMappingException8.getOriginalMessage();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException10 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: java.lang.Float[\"\"]", jsonLocation1, (java.lang.Throwable) jsonMappingException8);
        java.lang.String str11 = jsonMappingException8.getPathReference();
        org.junit.Assert.assertNull(jsonLocation5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(referenceList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " (through reference chain: UNKNOWN[\"UNKNOWN[52]\"])" + "'", str9, " (through reference chain: UNKNOWN[\"UNKNOWN[52]\"])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference0 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference0.setIndex((int) '4');
        java.lang.String str3 = reference0.toString();
        java.lang.String str4 = reference0._desc;
        reference0._fieldName = "UNKNOWN[52]";
        java.lang.String str7 = reference0.getFieldName();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference8 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) reference0);
        reference0.setFieldName("UNKNOWN[\"UNKNOWN[52]\"]");
        reference0._desc = "com.fasterxml.jackson.databind.JsonMappingException: java.lang.Boolean[?]";
        java.lang.String str13 = reference0.toString();
        int int14 = reference0.getIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN[52]" + "'", str3, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UNKNOWN[52]" + "'", str4, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNKNOWN[52]" + "'", str7, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: java.lang.Boolean[?]" + "'", str13, "com.fasterxml.jackson.databind.JsonMappingException: java.lang.Boolean[?]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.io.Closeable closeable1 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException(closeable1, "java.lang.Boolean[?]", jsonLocation3);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]", (java.lang.Throwable) jsonMappingException4);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference6.setIndex((int) '4');
        java.lang.String str9 = reference6.getFieldName();
        reference6.setIndex((int) (byte) 0);
        int int12 = reference6._index;
        reference6.setFieldName("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException16 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException5, (java.lang.Object) reference6, (int) (byte) 10);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference18 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException16, "com.fasterxml.jackson.databind.JsonMappingException: ");
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference20 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj19);
        reference20._desc = "java.lang.Long[\"\"]";
        reference20._index = '4';
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException16, reference20);
        int int26 = reference20._index;
        reference20.setDescription("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference29 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference30 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference30.setIndex((int) '4');
        reference29._from = reference30;
        java.lang.String str34 = reference29._fieldName;
        reference29.setFieldName("com.fasterxml.jackson.databind.JsonMappingException[?]");
        int int37 = reference29.getIndex();
        java.lang.Object obj38 = reference29.writeReplace();
        com.fasterxml.jackson.core.JsonLocation jsonLocation40 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation40);
        java.lang.String str42 = jsonMappingException41.getOriginalMessage();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference44 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) false);
        int int45 = reference44.getIndex();
        java.lang.String str46 = reference44.toString();
        int int47 = reference44.getIndex();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException48 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException41, reference44);
        java.lang.Class<?> wildcardClass49 = reference44.getClass();
        reference29._from = reference44;
        java.lang.String str51 = reference29.getDescription();
        reference20._from = str51;
        reference20._fieldName = "UNKNOWN[52] (through reference chain: com.fasterxml.jackson.databind.Reference[?])";
        int int55 = reference20.getIndex();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jsonMappingException16);
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException[?]\"]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException[?]\"]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException[?]\"]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.Boolean[?]" + "'", str46, "java.lang.Boolean[?]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(jsonMappingException48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException[?]\"]" + "'", str51, "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException[?]\"]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException1 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        com.fasterxml.jackson.core.JsonLocation jsonLocation3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation3);
        java.lang.StringBuilder stringBuilder5 = null;
        jsonMappingException4._appendPathDesc(stringBuilder5);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException4, (java.lang.Object) 100.0f, "");
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList10 = jsonMappingException9._path;
        jsonMappingException1._path = referenceList10;
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference12 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference12._index = 'a';
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException16 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException1, (java.lang.Object) reference12, "com.fasterxml.jackson.databind.JsonMappingException[?]");
        java.lang.String str17 = reference12.getFieldName();
        reference12.setDescription("java.lang.Long[?]");
        reference12._fieldName = "com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Float[\"\"])";
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(jsonMappingException16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference0 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference0.setIndex((int) '4');
        java.lang.String str3 = reference0.toString();
        java.lang.String str4 = reference0.getFieldName();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException9 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser7, "");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference11 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) false);
        int int12 = reference11.getIndex();
        java.lang.String str13 = reference11.toString();
        int int14 = reference11.getIndex();
        jsonMappingException9.prependPath((java.lang.Object) reference11, 1000);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException17 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator5, "com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Character[0])", (java.lang.Throwable) jsonMappingException9);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        java.lang.Throwable throwable20 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException21 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser18, "", throwable20);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException21, (java.lang.Object) 10L, (int) (short) -1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation26 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation26);
        java.lang.StringBuilder stringBuilder28 = null;
        jsonMappingException27._appendPathDesc(stringBuilder28);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException32 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException27, (java.lang.Object) 100.0f, "");
        java.lang.String str33 = jsonMappingException32.getOriginalMessage();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException36 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException32, (java.lang.Object) (-1.0f), 10);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList37 = jsonMappingException32.getPath();
        jsonMappingException21.prependPath((java.lang.Object) jsonMappingException32, (int) (byte) 10);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference40 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException21);
        jsonMappingException9.addSuppressed((java.lang.Throwable) jsonMappingException21);
        reference0._from = jsonMappingException21;
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference44 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException21, "com.fasterxml.jackson.databind.JsonMappingException: Unexpected IOException (of type com.fasterxml.jackson.databind.JsonMappingException):  (through reference chain: java.lang.String[10]->UNKNOWN[\"\"])");
        int int45 = reference44.getIndex();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference46 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) reference44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN[52]" + "'", str3, "UNKNOWN[52]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jsonMappingException9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.Boolean[?]" + "'", str13, "java.lang.Boolean[?]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonMappingException17);
        org.junit.Assert.assertNotNull(jsonMappingException21);
        org.junit.Assert.assertNotNull(jsonMappingException24);
        org.junit.Assert.assertNotNull(jsonMappingException32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(jsonMappingException36);
        org.junit.Assert.assertNotNull(referenceList37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation4);
        java.lang.String str6 = jsonMappingException5.getOriginalMessage();
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = jsonMappingException5.getLocation();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference9 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException5, "java.lang.Boolean[?]");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation13);
        java.lang.String str15 = jsonMappingException14.getOriginalMessage();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = jsonMappingException14.getLocation();
        jsonMappingException14.prependPath((java.lang.Object) '#', (int) (short) 0);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator10, "hi!", (java.lang.Throwable) jsonMappingException14);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException23 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator21, "");
        java.lang.Object obj24 = jsonMappingException23.getProcessor();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference25 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException23);
        jsonMappingException20.prependPath(reference25);
        reference25._index = (byte) 0;
        int int29 = reference25._index;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException31 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException5, (java.lang.Object) reference25, (int) (byte) 100);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException32 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser1, "com.fasterxml.jackson.databind.JsonMappingException: hi! (through reference chain: UNKNOWN[\"java.lang.Boolean[?]\"]->java.lang.String[\"java.lang.Character[?]\"])", (java.lang.Throwable) jsonMappingException5);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException33 = new com.fasterxml.jackson.databind.JsonMappingException(" (through reference chain: java.lang.Float[\"\"])", (java.lang.Throwable) jsonMappingException32);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference34 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference34.setIndex((int) '4');
        java.lang.String str37 = reference34.toString();
        java.lang.String str38 = reference34._desc;
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference39 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) str38);
        jsonMappingException33.prependPath(reference39);
        java.lang.String str41 = reference39.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonLocation7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonLocation16);
        org.junit.Assert.assertNotNull(jsonMappingException20);
        org.junit.Assert.assertNotNull(jsonMappingException23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonMappingException31);
        org.junit.Assert.assertNotNull(jsonMappingException32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UNKNOWN[52]" + "'", str37, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UNKNOWN[52]" + "'", str38, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang.String[?]" + "'", str41, "java.lang.String[?]");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference0 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference0.setIndex((int) '4');
        java.lang.String str3 = reference0.toString();
        java.lang.Object obj4 = reference0.writeReplace();
        java.lang.String str5 = reference0._desc;
        reference0._desc = "UNKNOWN[?]";
        java.lang.Object obj8 = reference0._from;
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) reference0, (-1));
        reference0.setIndex(100);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        com.fasterxml.jackson.core.JsonLocation jsonLocation15 = jsonMappingException14.getLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException18 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation17);
        java.lang.StringBuilder stringBuilder19 = null;
        jsonMappingException18._appendPathDesc(stringBuilder19);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException23 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException18, (java.lang.Object) 100.0f, "");
        java.lang.String str24 = jsonMappingException23.getPathReference();
        java.io.Closeable closeable25 = null;
        jsonMappingException23._processor = closeable25;
        java.lang.Object obj27 = null;
        jsonMappingException23.prependPath(obj27, (int) (byte) 100);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException31 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException14, (java.lang.Object) jsonMappingException23, " (through reference chain: UNKNOWN[\"com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]\"]->java.lang.Boolean[10]->java.lang.Long[?])");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException33 = new com.fasterxml.jackson.databind.JsonMappingException("");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException35 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException14, (java.lang.Object) jsonMappingException33, (-1));
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference36 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        java.lang.Object obj37 = reference36._from;
        java.lang.String str38 = reference36._fieldName;
        java.lang.String str39 = reference36.getDescription();
        java.lang.String str40 = reference36.getDescription();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException35, reference36);
        reference0._from = jsonMappingException41;
        java.io.Closeable closeable43 = jsonMappingException41._processor;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN[52]" + "'", str3, "UNKNOWN[52]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "UNKNOWN[?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "UNKNOWN[?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "UNKNOWN[?]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UNKNOWN[52]" + "'", str5, "UNKNOWN[52]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(jsonLocation15);
        org.junit.Assert.assertNotNull(jsonMappingException23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.Float[\"\"]" + "'", str24, "java.lang.Float[\"\"]");
        org.junit.Assert.assertNotNull(jsonMappingException31);
        org.junit.Assert.assertNotNull(jsonMappingException35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UNKNOWN[?]" + "'", str39, "UNKNOWN[?]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UNKNOWN[?]" + "'", str40, "UNKNOWN[?]");
        org.junit.Assert.assertNotNull(jsonMappingException41);
        org.junit.Assert.assertNull(closeable43);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException3 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator1, "");
        java.lang.Object obj4 = jsonMappingException3.getProcessor();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        java.lang.Throwable throwable7 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser5, "", throwable7);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList9 = jsonMappingException8._path;
        java.lang.StringBuilder stringBuilder10 = null;
        java.lang.StringBuilder stringBuilder11 = jsonMappingException8.getPathReference(stringBuilder10);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList12 = jsonMappingException8._path;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException3, (java.lang.Object) referenceList12, (int) (byte) 0);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException15 = new com.fasterxml.jackson.databind.JsonMappingException("UNKNOWN[52]", (java.lang.Throwable) jsonMappingException14);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference16 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference16.setIndex((int) '4');
        java.lang.String str19 = reference16.toString();
        java.lang.Object obj20 = reference16.writeReplace();
        java.lang.String str21 = reference16._desc;
        reference16._desc = "java.lang.Character[\"UNKNOWN[52]\"]";
        java.lang.Object obj24 = null;
        reference16._from = obj24;
        reference16.setDescription("java.lang.Float[\"\"]");
        jsonMappingException14.prependPath(reference16);
        java.lang.String str29 = reference16.getDescription();
        reference16._index = (short) 0;
        org.junit.Assert.assertNotNull(jsonMappingException3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(jsonMappingException8);
        org.junit.Assert.assertNull(referenceList9);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNull(referenceList12);
        org.junit.Assert.assertNotNull(jsonMappingException14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UNKNOWN[52]" + "'", str19, "UNKNOWN[52]");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "java.lang.Float[\"\"]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "java.lang.Float[\"\"]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "java.lang.Float[\"\"]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UNKNOWN[52]" + "'", str21, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.Float[\"\"]" + "'", str29, "java.lang.Float[\"\"]");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference0 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference0.setIndex((int) '4');
        java.lang.String str3 = reference0.toString();
        java.lang.String str4 = reference0._desc;
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference5 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) str4);
        reference5.setIndex(1000);
        reference5._index = 0;
        java.lang.String str10 = reference5.getFieldName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN[52]" + "'", str3, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UNKNOWN[52]" + "'", str4, "UNKNOWN[52]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        java.io.Closeable closeable2 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException6 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: java.lang.Float[\"\"]", jsonLocation5);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = new com.fasterxml.jackson.databind.JsonMappingException(closeable2, " (through reference chain: java.lang.Character[0])", (java.lang.Throwable) jsonMappingException6);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "java.lang.Short[52]", (java.lang.Throwable) jsonMappingException7);
        org.junit.Assert.assertNotNull(jsonMappingException8);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator0 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException2 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator0, "");
        java.lang.Object obj3 = jsonMappingException2.getProcessor();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        java.lang.Throwable throwable6 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException7 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser4, "", throwable6);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList8 = jsonMappingException7._path;
        java.lang.StringBuilder stringBuilder9 = null;
        java.lang.StringBuilder stringBuilder10 = jsonMappingException7.getPathReference(stringBuilder9);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList11 = jsonMappingException7._path;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) referenceList11, (int) (byte) 0);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference15 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) (short) 0);
        java.lang.Object obj16 = reference15.getFrom();
        java.lang.Object obj17 = reference15._from;
        reference15.setDescription("com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Float[\"hi!\"])");
        java.lang.Object obj20 = reference15.getFrom();
        java.lang.String str21 = reference15.getFieldName();
        reference15._fieldName = "UNKNOWN[100]->java.lang.Float[\"\"]";
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) reference15, "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Long[?])\"]->java.util.LinkedList[\"java.lang.Byte[1000]\"]");
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        java.lang.Throwable throwable28 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser26, "", throwable28);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException32 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException29, (java.lang.Object) 10L, (int) (short) -1);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference33 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference33.setIndex((int) '4');
        java.lang.String str36 = reference33.toString();
        java.lang.String str37 = reference33._desc;
        reference33._fieldName = "UNKNOWN[52]";
        java.lang.String str40 = reference33.getFieldName();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException41 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException29, reference33);
        java.lang.Object obj42 = jsonMappingException41.getProcessor();
        com.fasterxml.jackson.core.JsonLocation jsonLocation44 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException45 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation44);
        java.lang.StringBuilder stringBuilder46 = null;
        jsonMappingException45._appendPathDesc(stringBuilder46);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException50 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException45, (java.lang.Object) 100.0f, "");
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList51 = jsonMappingException45._path;
        jsonMappingException41._path = referenceList51;
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference54 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException41, (int) (short) 10);
        reference54.setIndex((int) ' ');
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException58 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException2, (java.lang.Object) reference54, (int) ' ');
        org.junit.Assert.assertNotNull(jsonMappingException2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(jsonMappingException7);
        org.junit.Assert.assertNull(referenceList8);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNull(referenceList11);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(jsonMappingException32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UNKNOWN[52]" + "'", str36, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UNKNOWN[52]" + "'", str37, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UNKNOWN[52]" + "'", str40, "UNKNOWN[52]");
        org.junit.Assert.assertNotNull(jsonMappingException41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(jsonMappingException50);
        org.junit.Assert.assertNotNull(referenceList51);
        org.junit.Assert.assertNotNull(jsonMappingException58);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference0 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference0.setIndex((int) '4');
        java.lang.String str3 = reference0.toString();
        java.lang.Object obj4 = reference0.writeReplace();
        java.lang.Object obj5 = reference0._from;
        java.lang.String str6 = reference0.getFieldName();
        reference0.setFieldName("com.fasterxml.jackson.databind.Reference[\" (through reference chain: com.fasterxml.jackson.databind.Reference[10]->java.lang.Float[\"\"])\"]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UNKNOWN[52]" + "'", str3, "UNKNOWN[52]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "UNKNOWN[52]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "UNKNOWN[52]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "UNKNOWN[52]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation7);
        java.lang.StringBuilder stringBuilder9 = null;
        jsonMappingException8._appendPathDesc(stringBuilder9);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException8, (java.lang.Object) 100.0f, "");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException14 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]", jsonLocation5, (java.lang.Throwable) jsonMappingException8);
        java.lang.String str15 = jsonMappingException14._buildMessage();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation19);
        java.lang.StringBuilder stringBuilder21 = null;
        jsonMappingException20._appendPathDesc(stringBuilder21);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException25 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException20, (java.lang.Object) 100.0f, "");
        java.lang.String str26 = jsonMappingException25.getOriginalMessage();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException25, (java.lang.Object) (-1.0f), 10);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException30 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator16, "java.lang.Boolean[?]", (java.lang.Throwable) jsonMappingException29);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference31 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException32 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException29, reference31);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException34 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        com.fasterxml.jackson.core.JsonLocation jsonLocation36 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException37 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation36);
        java.lang.StringBuilder stringBuilder38 = null;
        jsonMappingException37._appendPathDesc(stringBuilder38);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException42 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException37, (java.lang.Object) 100.0f, "");
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList43 = jsonMappingException42._path;
        jsonMappingException34._path = referenceList43;
        jsonMappingException29._path = referenceList43;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException47 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException14, (java.lang.Object) referenceList43, "java.lang.Byte[1000]");
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference48 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference48.setIndex((int) '4');
        java.lang.String str51 = reference48.getFieldName();
        reference48.setIndex((int) (byte) 0);
        int int54 = reference48._index;
        int int55 = reference48._index;
        java.lang.String str56 = reference48._fieldName;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException58 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException47, (java.lang.Object) reference48, "com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Long[?])");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException59 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator2, "com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Short[\"hi!\"]->java.lang.Float[\"\"])", (java.lang.Throwable) jsonMappingException47);
        java.lang.String str60 = jsonMappingException47.getPathReference();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException61 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser0, "com.fasterxml.jackson.databind.JsonMappingException[\"com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Long[?])\"]", (java.lang.Throwable) jsonMappingException47);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]" + "'", str15, "com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        org.junit.Assert.assertNotNull(jsonMappingException25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNotNull(jsonMappingException30);
        org.junit.Assert.assertNotNull(jsonMappingException32);
        org.junit.Assert.assertNotNull(jsonMappingException42);
        org.junit.Assert.assertNotNull(referenceList43);
        org.junit.Assert.assertNotNull(jsonMappingException47);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(jsonMappingException58);
        org.junit.Assert.assertNotNull(jsonMappingException59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Long[?])\"]->java.util.LinkedList[\"java.lang.Byte[1000]\"]" + "'", str60, "com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Long[?])\"]->java.util.LinkedList[\"java.lang.Byte[1000]\"]");
        org.junit.Assert.assertNotNull(jsonMappingException61);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext0 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation3 = null;
        java.io.Closeable closeable5 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException8 = new com.fasterxml.jackson.databind.JsonMappingException(closeable5, "java.lang.Boolean[?]", jsonLocation7);
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException11 = new com.fasterxml.jackson.databind.JsonMappingException("", jsonLocation10);
        java.lang.StringBuilder stringBuilder12 = null;
        jsonMappingException11._appendPathDesc(stringBuilder12);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException16 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException11, (java.lang.Object) 100.0f, "");
        java.lang.String str17 = jsonMappingException16.getOriginalMessage();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException20 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException16, (java.lang.Object) (-1.0f), 10);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList21 = jsonMappingException20.getPath();
        jsonMappingException8.prependPath((java.lang.Object) referenceList21, (int) 'a');
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        java.lang.Throwable throwable26 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException27 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser24, "", throwable26);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException30 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException27, (java.lang.Object) 10L, (int) (short) -1);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference31 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference31.setIndex((int) '4');
        java.lang.String str34 = reference31.toString();
        java.lang.String str35 = reference31._desc;
        reference31._fieldName = "UNKNOWN[52]";
        java.lang.String str38 = reference31.getFieldName();
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException39 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException27, reference31);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference40 = new com.fasterxml.jackson.databind.JsonMappingException.Reference();
        reference40.setIndex((int) '4');
        java.lang.String str43 = reference40.toString();
        java.lang.Object obj44 = reference40.writeReplace();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference45 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) reference40);
        jsonMappingException27.prependPath(reference40);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = null;
        java.lang.Throwable throwable49 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException50 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser47, "", throwable49);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList51 = jsonMappingException50._path;
        java.lang.StringBuilder stringBuilder52 = null;
        java.lang.StringBuilder stringBuilder53 = jsonMappingException50.getPathReference(stringBuilder52);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList54 = jsonMappingException50.getPath();
        reference40._from = jsonMappingException50;
        jsonMappingException8.addSuppressed((java.lang.Throwable) jsonMappingException50);
        java.lang.StringBuilder stringBuilder57 = null;
        jsonMappingException50._appendPathDesc(stringBuilder57);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException59 = new com.fasterxml.jackson.databind.JsonMappingException(" (through reference chain: com.fasterxml.jackson.databind.JsonMappingException[\"java.lang.Character[\"UNKNOWN[52]\"]\"]->java.lang.Boolean[?])", (java.lang.Throwable) jsonMappingException50);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException60 = new com.fasterxml.jackson.databind.JsonMappingException("com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: UNKNOWN[52]->java.lang.Long[?])", jsonLocation3, (java.lang.Throwable) jsonMappingException59);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonMappingException jsonMappingException61 = com.fasterxml.jackson.databind.JsonMappingException.from(deserializationContext0, "com.fasterxml.jackson.databind.JsonMappingException: java.lang.Long[\"\"] (through reference chain: com.fasterxml.jackson.databind.Reference[\"com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Character[0])\"])", (java.lang.Throwable) jsonMappingException60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonMappingException16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonMappingException20);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(jsonMappingException27);
        org.junit.Assert.assertNotNull(jsonMappingException30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UNKNOWN[52]" + "'", str34, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UNKNOWN[52]" + "'", str35, "UNKNOWN[52]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UNKNOWN[52]" + "'", str38, "UNKNOWN[52]");
        org.junit.Assert.assertNotNull(jsonMappingException39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UNKNOWN[52]" + "'", str43, "UNKNOWN[52]");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "UNKNOWN[52]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "UNKNOWN[52]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "UNKNOWN[52]");
        org.junit.Assert.assertNotNull(jsonMappingException50);
        org.junit.Assert.assertNull(referenceList51);
        org.junit.Assert.assertNull(stringBuilder53);
        org.junit.Assert.assertNotNull(referenceList54);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException1 = new com.fasterxml.jackson.databind.JsonMappingException("UNKNOWN[0]");
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        java.lang.Throwable throwable4 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser2, "", throwable4);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList6 = jsonMappingException5._path;
        java.lang.StringBuilder stringBuilder7 = null;
        java.lang.StringBuilder stringBuilder8 = jsonMappingException5.getPathReference(stringBuilder7);
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList9 = jsonMappingException5.getPath();
        java.lang.String str10 = jsonMappingException5._buildMessage();
        java.util.List<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList11 = jsonMappingException5.getPath();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference12 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) referenceList11);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException13 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException1, reference12);
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference15 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) jsonMappingException1, "com.fasterxml.jackson.databind.Reference[1000]");
        java.lang.String str16 = jsonMappingException1.getPathReference();
        java.lang.String str17 = jsonMappingException1.getOriginalMessage();
        java.lang.String str18 = jsonMappingException1.getOriginalMessage();
        java.lang.Throwable[] throwableArray19 = jsonMappingException1.getSuppressed();
        java.lang.String str20 = jsonMappingException1.getPathReference();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException24 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonGenerator22, "");
        java.lang.Object obj25 = jsonMappingException24.getProcessor();
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        java.lang.Throwable throwable28 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException29 = com.fasterxml.jackson.databind.JsonMappingException.from(jsonParser26, "", throwable28);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList30 = jsonMappingException29._path;
        java.lang.StringBuilder stringBuilder31 = null;
        java.lang.StringBuilder stringBuilder32 = jsonMappingException29.getPathReference(stringBuilder31);
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList33 = jsonMappingException29._path;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException35 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath((java.lang.Throwable) jsonMappingException24, (java.lang.Object) referenceList33, (int) (byte) 0);
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException36 = new com.fasterxml.jackson.databind.JsonMappingException("UNKNOWN[52]", (java.lang.Throwable) jsonMappingException35);
        java.lang.String str37 = jsonMappingException36.toString();
        com.fasterxml.jackson.core.JsonLocation jsonLocation38 = jsonMappingException36.getLocation();
        java.lang.StringBuilder stringBuilder39 = null;
        java.lang.StringBuilder stringBuilder40 = jsonMappingException36.getPathReference(stringBuilder39);
        java.lang.String str41 = jsonMappingException36.toString();
        java.util.LinkedList<com.fasterxml.jackson.databind.JsonMappingException.Reference> referenceList42 = jsonMappingException36._path;
        jsonMappingException1.addSuppressed((java.lang.Throwable) jsonMappingException36);
        org.junit.Assert.assertNotNull(jsonMappingException5);
        org.junit.Assert.assertNull(referenceList6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNotNull(jsonMappingException13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.util.EmptyList[?]" + "'", str16, "java.util.EmptyList[?]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UNKNOWN[0]" + "'", str17, "UNKNOWN[0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UNKNOWN[0]" + "'", str18, "UNKNOWN[0]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.util.EmptyList[?]" + "'", str20, "java.util.EmptyList[?]");
        org.junit.Assert.assertNotNull(jsonMappingException24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(jsonMappingException29);
        org.junit.Assert.assertNull(referenceList30);
        org.junit.Assert.assertNull(stringBuilder32);
        org.junit.Assert.assertNull(referenceList33);
        org.junit.Assert.assertNotNull(jsonMappingException35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]" + "'", str37, "com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        org.junit.Assert.assertNull(jsonLocation38);
        org.junit.Assert.assertNull(stringBuilder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]" + "'", str41, "com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52]");
        org.junit.Assert.assertNull(referenceList42);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider0 = null;
        com.fasterxml.jackson.core.JsonLocation jsonLocation3 = null;
        com.fasterxml.jackson.databind.JsonMappingException jsonMappingException4 = new com.fasterxml.jackson.databind.JsonMappingException("UNKNOWN[52] (through reference chain: com.fasterxml.jackson.databind.JsonMappingException[97])", jsonLocation3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonMappingException jsonMappingException5 = com.fasterxml.jackson.databind.JsonMappingException.from(serializerProvider0, "com.fasterxml.jackson.databind.JsonMappingException: com.fasterxml.jackson.databind.JsonMappingException: UNKNOWN[52] (through reference chain: UNKNOWN[97])", (java.lang.Throwable) jsonMappingException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

