package org.apache.commons.collections;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.collections.ExtendedProperties.include = "hi!";
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer.DELIMITER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.include;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            float float3 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.END_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "}" + "'", str0, "}");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream1, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        // The following exception was thrown during execution in test generation
        try {
            short short10 = extendedProperties0.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        // The following exception was thrown during execution in test generation
        try {
            float float10 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties4.load(inputStream10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        // The following exception was thrown during execution in test generation
        try {
            float float4 = extendedProperties0.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties3.load(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float17 = extendedProperties0.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.START_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "${" + "'", str0, "${");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = extendedProperties4.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedProperties0.getLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        // The following exception was thrown during execution in test generation
        try {
            short short6 = extendedProperties3.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = "";
        java.lang.String str16 = extendedProperties0.file;
        java.lang.String str17 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties0.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = extendedProperties20.getString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(extendedProperties20);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        boolean boolean16 = extendedProperties0.getBoolean("${", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.String str6 = propertiesTokenizer1.nextToken("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties8.getString("");
        int int13 = extendedProperties8.getInt("hi!", (int) 'a');
        boolean boolean16 = extendedProperties8.getBoolean(",", false);
        java.util.Vector vector18 = extendedProperties8.getVector("");
        java.util.Vector vector19 = extendedProperties4.getVector("", vector18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator20 = extendedProperties4.getKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(vector19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.lang.String str13 = extendedProperties4.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            short short15 = extendedProperties4.getShort("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        double double7 = extendedProperties3.getDouble("", (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = extendedProperties0.getBoolean("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.lang.String str13 = extendedProperties4.basePath;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = extendedProperties0.getShort("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections.ExtendedProperties.include = ",";
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        extendedProperties3.setInclude("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        short short7 = extendedProperties3.getShort("", (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = extendedProperties3.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        java.lang.Long long11 = extendedProperties0.getLong("hi!", (java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        java.util.ArrayList arrayList8 = null;
        extendedProperties7.keysAsListed = arrayList8;
        boolean boolean10 = extendedProperties7.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.combine(extendedProperties7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(extendedProperties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        java.lang.Class<?> wildcardClass10 = properties6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.lang.Class<?> wildcardClass19 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        short short7 = extendedProperties3.getShort("", (short) (byte) 10);
        long long10 = extendedProperties3.getLong("", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        extendedProperties3.setProperty("", (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        // The following exception was thrown during execution in test generation
        try {
            float float15 = extendedProperties0.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", ",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        extendedProperties4.file = "";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.String str27 = extendedProperties7.getInclude();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "}" + "'", str27, "}");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        extendedProperties0.display();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedProperties0.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Iterator iterator19 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str5 = extendedProperties0.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean8 = extendedProperties7.isInitialized;
        java.util.Properties properties10 = extendedProperties7.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        java.util.Properties properties12 = extendedProperties0.getProperties("/", properties10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedProperties0.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(extendedProperties11);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        float float21 = extendedProperties0.getFloat("/", (float) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.util.Properties properties8 = extendedProperties4.getProperties("/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        extendedProperties0.clearProperty("/");
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        java.lang.String str11 = extendedProperties4.getString("/");
        short short14 = extendedProperties4.getShort("}", (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties4.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        extendedProperties0.fileSeparator = "";
        java.lang.Double double7 = extendedProperties0.getDouble("/", (java.lang.Double) 97.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = extendedProperties4.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        java.lang.Short short21 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean23 = extendedProperties22.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean26 = extendedProperties25.isInitialized;
        java.util.Properties properties28 = extendedProperties25.getProperties(",");
        java.util.Properties properties29 = extendedProperties22.getProperties("/", properties28);
        java.util.Iterator iterator31 = extendedProperties22.getKeys("/");
        extendedProperties0.combine(extendedProperties22);
        java.io.OutputStream outputStream33 = null;
        extendedProperties22.save(outputStream33, ",");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        extendedProperties0.basePath = "}";
        short short11 = extendedProperties0.getShort("/", (short) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties0.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            double double23 = extendedProperties20.getDouble("${", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(extendedProperties20);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = extendedProperties0.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", ",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = extendedProperties0.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        double double11 = extendedProperties0.getDouble("/", (double) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        java.lang.String str11 = extendedProperties4.getString("/");
        short short14 = extendedProperties4.getShort("}", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties16.fileSeparator;
        java.lang.Long long20 = extendedProperties16.getLong("/", (java.lang.Long) (-1L));
        extendedProperties16.clearProperty("/");
        byte byte25 = extendedProperties16.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str29 = extendedProperties27.getString("");
        java.lang.String str30 = extendedProperties27.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str34 = extendedProperties32.getString("");
        int int37 = extendedProperties32.getInt("hi!", (int) 'a');
        boolean boolean40 = extendedProperties32.getBoolean(",", false);
        java.util.Vector vector42 = extendedProperties32.getVector("");
        java.util.Vector vector43 = extendedProperties27.getVector("", vector42);
        java.util.List list44 = extendedProperties16.getList("/", (java.util.List) vector43);
        java.util.List list45 = extendedProperties4.getList("}", list44);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str49 = extendedProperties47.getString("");
        int int52 = extendedProperties47.getInt("hi!", (int) 'a');
        boolean boolean55 = extendedProperties47.getBoolean(",", false);
        java.util.List list57 = null;
        java.util.List list58 = extendedProperties47.getList("hi!", list57);
        extendedProperties47.setInclude("}");
        java.util.Iterator iterator62 = extendedProperties47.getKeys(",");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties4.setProperty("hi!", (java.lang.Object) iterator62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/" + "'", str30, "/");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(iterator62);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.util.Vector vector8 = extendedProperties4.getVector("${");
        extendedProperties4.file = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNotNull(vector8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedProperties4.getInteger("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        java.lang.String str6 = extendedProperties0.testBoolean("/");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean12 = extendedProperties11.isInitialized;
        java.util.Properties properties14 = extendedProperties11.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties14);
        java.util.Properties properties16 = extendedProperties9.getProperties("}", properties14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        java.lang.String[] strArray6 = extendedProperties0.getStringArray("hi!");
        extendedProperties0.clearProperty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.lang.String str13 = extendedProperties4.getInclude();
        java.lang.Short short16 = extendedProperties4.getShort("/", (java.lang.Short) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties4.subset("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str7 = extendedProperties5.getString("");
        int int10 = extendedProperties5.getInt("hi!", (int) 'a');
        boolean boolean13 = extendedProperties5.getBoolean(",", false);
        java.util.Vector vector15 = extendedProperties5.getVector("");
        java.util.Vector vector16 = extendedProperties0.getVector("", vector15);
        java.lang.String str18 = extendedProperties0.interpolate("}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(vector15);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str7 = extendedProperties4.basePath;
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = extendedProperties4.getByte("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.getString("");
        java.lang.String str14 = extendedProperties9.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean17 = extendedProperties16.isInitialized;
        java.util.Properties properties19 = extendedProperties16.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties19);
        java.util.Properties properties21 = extendedProperties9.getProperties("/", properties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str23 = extendedProperties22.fileSeparator;
        java.lang.Long long26 = extendedProperties22.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList27 = extendedProperties22.keysAsListed;
        extendedProperties9.keysAsListed = arrayList27;
        extendedProperties8.keysAsListed = arrayList27;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(extendedProperties20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(arrayList27);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = extendedProperties0.subset("hi!");
        // The following exception was thrown during execution in test generation
        try {
            short short6 = extendedProperties3.getShort("", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(extendedProperties3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        int int12 = extendedProperties0.getInteger("hi!", 10);
        int int15 = extendedProperties0.getInteger("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = extendedProperties7.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.io.InputStream inputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties7.load(inputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties(",", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        java.lang.Short short21 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean23 = extendedProperties22.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean26 = extendedProperties25.isInitialized;
        java.util.Properties properties28 = extendedProperties25.getProperties(",");
        java.util.Properties properties29 = extendedProperties22.getProperties("/", properties28);
        java.util.Iterator iterator31 = extendedProperties22.getKeys("/");
        extendedProperties0.combine(extendedProperties22);
        java.lang.Byte byte35 = extendedProperties22.getByte("hi!", (java.lang.Byte) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        extendedProperties0.clearProperty("");
        extendedProperties0.clearProperty(",");
        short short11 = extendedProperties0.getShort("${", (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Iterator iterator19 = extendedProperties0.getKeys();
        short short22 = extendedProperties0.getShort("}", (short) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken(",");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        java.io.OutputStream outputStream28 = null;
        extendedProperties16.save(outputStream28, "");
        extendedProperties16.addProperty("}", (java.lang.Object) (byte) -1);
        extendedProperties0.combine(extendedProperties16);
        java.lang.Boolean boolean37 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.util.Iterator iterator39 = extendedProperties0.getKeys(",");
        boolean boolean40 = extendedProperties0.isInitialized;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        java.util.Properties properties16 = extendedProperties4.getProperties("}");
        java.lang.String str19 = extendedProperties4.getString(",", "hi!");
        java.util.List list21 = null;
        java.lang.String str22 = extendedProperties4.interpolateHelper(",", list21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties8.getString("");
        int int13 = extendedProperties8.getInt("hi!", (int) 'a');
        boolean boolean16 = extendedProperties8.getBoolean(",", false);
        java.util.Vector vector18 = extendedProperties8.getVector("");
        java.util.Vector vector19 = extendedProperties4.getVector("", vector18);
        java.lang.Integer int22 = extendedProperties4.getInteger("hi!", (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(vector19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        float float4 = extendedProperties0.getFloat("${", (float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = "";
        java.lang.Long long18 = extendedProperties0.getLong("", (java.lang.Long) 0L);
        java.lang.String str21 = extendedProperties0.getString("${", "}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "}" + "'", str21, "}");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.Object obj28 = extendedProperties0.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties0.subset("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str32 = extendedProperties31.fileSeparator;
        double double35 = extendedProperties31.getDouble("", (double) 'a');
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str37 = extendedProperties36.fileSeparator;
        java.lang.Long long40 = extendedProperties36.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList41 = extendedProperties36.keysAsListed;
        extendedProperties31.keysAsListed = arrayList41;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties30.keysAsListed = arrayList41;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(extendedProperties30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/" + "'", str32, "/");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(arrayList41);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        int int8 = extendedProperties0.getInt("/", 32);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken(",");
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties0.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties20.setInclude("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(extendedProperties20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties8.getString("");
        int int13 = extendedProperties8.getInt("hi!", (int) 'a');
        boolean boolean16 = extendedProperties8.getBoolean(",", false);
        java.util.Vector vector18 = extendedProperties8.getVector("");
        java.util.Vector vector19 = extendedProperties4.getVector("", vector18);
        java.lang.Object obj21 = extendedProperties4.getProperty("hi!");
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties4.load(inputStream22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(vector19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.util.Iterator iterator13 = extendedProperties0.getKeys("}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties0.save(outputStream12, "");
        java.lang.Boolean boolean17 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str20 = extendedProperties19.fileSeparator;
        java.lang.Long long23 = extendedProperties19.getLong("/", (java.lang.Long) (-1L));
        extendedProperties19.clearProperty("/");
        byte byte28 = extendedProperties19.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str32 = extendedProperties30.getString("");
        int int35 = extendedProperties30.getInt("hi!", (int) 'a');
        boolean boolean38 = extendedProperties30.getBoolean(",", false);
        java.util.Vector vector40 = extendedProperties30.getVector("");
        java.util.Vector vector41 = extendedProperties19.getVector("/", vector40);
        java.lang.String str42 = extendedProperties0.interpolateHelper("/", (java.util.List) vector40);
        // The following exception was thrown during execution in test generation
        try {
            float float44 = extendedProperties0.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Class<?> wildcardClass7 = propertiesTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties0.save(outputStream12, "");
        java.lang.Boolean boolean17 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str20 = extendedProperties19.fileSeparator;
        java.lang.Long long23 = extendedProperties19.getLong("/", (java.lang.Long) (-1L));
        extendedProperties19.clearProperty("/");
        byte byte28 = extendedProperties19.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str32 = extendedProperties30.getString("");
        int int35 = extendedProperties30.getInt("hi!", (int) 'a');
        boolean boolean38 = extendedProperties30.getBoolean(",", false);
        java.util.Vector vector40 = extendedProperties30.getVector("");
        java.util.Vector vector41 = extendedProperties19.getVector("/", vector40);
        java.lang.String str42 = extendedProperties0.interpolateHelper("/", (java.util.List) vector40);
        java.lang.String str43 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "}" + "'", str43, "}");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.lang.String str2 = extendedProperties0.getInclude();
        java.lang.String str3 = extendedProperties0.basePath;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        // The following exception was thrown during execution in test generation
        try {
            byte byte13 = extendedProperties0.getByte("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        extendedProperties0.clearProperty("");
        extendedProperties0.clearProperty(",");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = "";
        java.lang.Long long18 = extendedProperties0.getLong("", (java.lang.Long) 0L);
        int int21 = extendedProperties0.getInteger("", (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties8.getString("");
        int int13 = extendedProperties8.getInt("hi!", (int) 'a');
        boolean boolean16 = extendedProperties8.getBoolean(",", false);
        java.util.Vector vector18 = extendedProperties8.getVector("");
        java.util.Vector vector19 = extendedProperties4.getVector("", vector18);
        extendedProperties4.isInitialized = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(vector19);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        short short7 = extendedProperties3.getShort("", (short) (byte) 10);
        extendedProperties3.basePath = "}";
        extendedProperties3.clearProperty("${");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        java.lang.String str7 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        int int29 = extendedProperties0.getInteger("hi!", 32);
        java.util.List list31 = null;
        java.lang.String str32 = extendedProperties0.interpolateHelper("hi!", list31);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.util.ArrayList arrayList7 = extendedProperties4.keysAsListed;
        java.lang.Boolean boolean10 = extendedProperties4.getBoolean("/", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(arrayList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        java.io.OutputStream outputStream28 = null;
        extendedProperties16.save(outputStream28, "");
        extendedProperties16.addProperty("}", (java.lang.Object) (byte) -1);
        extendedProperties0.combine(extendedProperties16);
        extendedProperties16.display();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = extendedProperties16.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean29 = extendedProperties28.isInitialized;
        java.util.Properties properties31 = extendedProperties28.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties31);
        java.util.ArrayList arrayList33 = null;
        extendedProperties32.keysAsListed = arrayList33;
        java.util.Vector vector36 = extendedProperties32.getVector("${");
        java.lang.String str37 = extendedProperties7.interpolateHelper("/", (java.util.List) vector36);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(extendedProperties32);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        java.io.OutputStream outputStream28 = null;
        extendedProperties16.save(outputStream28, "");
        extendedProperties16.addProperty("}", (java.lang.Object) (byte) -1);
        extendedProperties0.combine(extendedProperties16);
        extendedProperties16.display();
        java.io.InputStream inputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties16.load(inputStream36, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        extendedProperties4.file = "";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        extendedProperties0.clearProperty("");
        extendedProperties0.clearProperty(",");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInt(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        boolean boolean15 = extendedProperties4.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean18 = extendedProperties17.isInitialized;
        java.util.Properties properties20 = extendedProperties17.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        java.util.Properties properties22 = extendedProperties4.getProperties("}", properties20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(extendedProperties23);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties8.getString("");
        int int13 = extendedProperties8.getInt("hi!", (int) 'a');
        boolean boolean16 = extendedProperties8.getBoolean(",", false);
        java.util.Vector vector18 = extendedProperties8.getVector("");
        java.util.Vector vector19 = extendedProperties4.getVector("", vector18);
        java.lang.Object obj21 = extendedProperties4.getProperty("hi!");
        java.lang.String str22 = extendedProperties4.file;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(vector19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str6 = extendedProperties5.fileSeparator;
        java.lang.Long long9 = extendedProperties5.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList10 = extendedProperties5.keysAsListed;
        extendedProperties0.keysAsListed = arrayList10;
        java.lang.String str12 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.Object obj8 = extendedProperties0.getProperty("/");
        extendedProperties0.fileSeparator = ",";
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        java.io.OutputStream outputStream28 = null;
        extendedProperties16.save(outputStream28, "");
        extendedProperties16.addProperty("}", (java.lang.Object) (byte) -1);
        extendedProperties0.combine(extendedProperties16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = extendedProperties16.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        java.util.Iterator iterator6 = extendedProperties0.getKeys("${");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        byte byte11 = extendedProperties0.getByte(",", (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str5 = extendedProperties0.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean8 = extendedProperties7.isInitialized;
        java.util.Properties properties10 = extendedProperties7.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        java.util.Properties properties12 = extendedProperties0.getProperties("/", properties10);
        java.lang.String str13 = extendedProperties0.fileSeparator;
        byte byte16 = extendedProperties0.getByte("", (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(extendedProperties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/" + "'", str13, "/");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean17 = extendedProperties16.isInitialized;
        java.util.Properties properties19 = extendedProperties16.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties19);
        java.util.ArrayList arrayList21 = null;
        extendedProperties20.keysAsListed = arrayList21;
        boolean boolean23 = extendedProperties20.isInitialized();
        java.lang.Byte byte26 = extendedProperties20.getByte(",", (java.lang.Byte) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.combine(extendedProperties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(extendedProperties20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.Float float9 = extendedProperties4.getFloat("}", (java.lang.Float) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        extendedProperties0.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean13 = extendedProperties12.isInitialized;
        java.util.Properties properties15 = extendedProperties12.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        java.util.ArrayList arrayList17 = null;
        extendedProperties16.keysAsListed = arrayList17;
        boolean boolean19 = extendedProperties16.isInitialized();
        java.lang.Object obj21 = extendedProperties16.getProperty("hi!");
        java.lang.String str23 = extendedProperties16.getString("/");
        short short26 = extendedProperties16.getShort("}", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str29 = extendedProperties28.fileSeparator;
        java.lang.Long long32 = extendedProperties28.getLong("/", (java.lang.Long) (-1L));
        extendedProperties28.clearProperty("/");
        byte byte37 = extendedProperties28.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str41 = extendedProperties39.getString("");
        java.lang.String str42 = extendedProperties39.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str46 = extendedProperties44.getString("");
        int int49 = extendedProperties44.getInt("hi!", (int) 'a');
        boolean boolean52 = extendedProperties44.getBoolean(",", false);
        java.util.Vector vector54 = extendedProperties44.getVector("");
        java.util.Vector vector55 = extendedProperties39.getVector("", vector54);
        java.util.List list56 = extendedProperties28.getList("/", (java.util.List) vector55);
        java.util.List list57 = extendedProperties16.getList("}", list56);
        java.lang.String str58 = extendedProperties0.interpolateHelper("", list56);
        extendedProperties0.basePath = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 10 + "'", short26 == (short) 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/" + "'", str29, "/");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        int int12 = extendedProperties0.getInteger("hi!", 10);
        java.util.Vector vector14 = extendedProperties0.getVector("hi!");
        java.lang.String str16 = extendedProperties0.getString("/");
        java.util.Iterator iterator18 = extendedProperties0.getKeys("");
        extendedProperties0.clearProperty("}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.lang.Float float10 = extendedProperties0.getFloat("hi!", (java.lang.Float) 0.0f);
        java.lang.String str12 = extendedProperties0.testBoolean("}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties0.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedProperties20.getInteger("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(extendedProperties20);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        int int12 = extendedProperties0.getInteger("hi!", 10);
        java.util.Vector vector14 = extendedProperties0.getVector("hi!");
        java.lang.Class<?> wildcardClass15 = extendedProperties0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        extendedProperties0.file = ",";
        java.lang.Boolean boolean11 = extendedProperties0.getBoolean("${", (java.lang.Boolean) true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        boolean boolean7 = extendedProperties0.isInitialized;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.Object obj8 = extendedProperties0.getProperty("/");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        java.lang.Long long9 = extendedProperties0.getLong(",", (java.lang.Long) 100L);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        boolean boolean7 = extendedProperties0.getBoolean("hi!", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties9.fileSeparator;
        java.lang.Long long13 = extendedProperties9.getLong("/", (java.lang.Long) (-1L));
        extendedProperties9.clearProperty("/");
        byte byte18 = extendedProperties9.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties20.getString("");
        int int25 = extendedProperties20.getInt("hi!", (int) 'a');
        boolean boolean28 = extendedProperties20.getBoolean(",", false);
        java.util.Vector vector30 = extendedProperties20.getVector("");
        java.util.Vector vector31 = extendedProperties9.getVector("/", vector30);
        java.util.Vector vector32 = extendedProperties0.getVector("hi!", vector30);
        byte byte35 = extendedProperties0.getByte("", (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        java.lang.String str7 = extendedProperties0.testBoolean("/");
        java.lang.String str9 = extendedProperties0.testBoolean("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = extendedProperties0.getByte("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        extendedProperties7.clearProperty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Iterator iterator19 = extendedProperties0.getKeys();
        java.lang.String str21 = extendedProperties0.getString("");
        java.lang.String[] strArray23 = extendedProperties0.getStringArray("");
        java.io.InputStream inputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("hi!", "/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean7 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.Object obj28 = extendedProperties0.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties0.subset("hi!");
        extendedProperties0.file = "/";
        java.io.OutputStream outputStream33 = null;
        extendedProperties0.save(outputStream33, "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(extendedProperties30);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean28 = extendedProperties27.isInitialized;
        java.util.Properties properties30 = extendedProperties27.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties30);
        java.util.ArrayList arrayList32 = null;
        extendedProperties31.keysAsListed = arrayList32;
        boolean boolean34 = extendedProperties31.isInitialized();
        java.lang.Object obj36 = extendedProperties31.getProperty("hi!");
        java.lang.String str38 = extendedProperties31.getString("/");
        extendedProperties31.fileSeparator = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.combine(extendedProperties31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(extendedProperties31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Byte byte10 = extendedProperties4.getByte(",", (java.lang.Byte) (byte) 1);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties4.load(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        int int4 = propertiesTokenizer1.countTokens();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        int int7 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties11.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties11.subset("hi!");
        int int17 = extendedProperties11.getInteger("", 0);
        extendedProperties0.setProperty("", (java.lang.Object) "");
        java.lang.String str19 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            float float21 = extendedProperties0.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Iterator iterator19 = extendedProperties0.getKeys();
        java.lang.String str21 = extendedProperties0.getString("");
        java.util.Vector vector23 = extendedProperties0.getVector("}");
        extendedProperties0.display();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(vector23);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        extendedProperties0.clearProperty("/");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.Object obj28 = extendedProperties0.getProperty("hi!");
        extendedProperties0.fileSeparator = "}";
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str33 = extendedProperties31.getString("");
        java.lang.String str36 = extendedProperties31.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean39 = extendedProperties38.isInitialized;
        java.util.Properties properties41 = extendedProperties38.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties41);
        java.util.Properties properties43 = extendedProperties31.getProperties("/", properties41);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str45 = extendedProperties44.fileSeparator;
        java.lang.Long long48 = extendedProperties44.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList49 = extendedProperties44.keysAsListed;
        extendedProperties31.keysAsListed = arrayList49;
        extendedProperties0.keysAsListed = arrayList49;
        java.util.Iterator iterator52 = extendedProperties0.getKeys();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(extendedProperties42);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/" + "'", str45, "/");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(arrayList49);
        org.junit.Assert.assertNotNull(iterator52);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        java.lang.String str6 = extendedProperties0.testBoolean("");
        java.util.Properties properties8 = extendedProperties0.getProperties("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        extendedProperties4.clearProperty("hi!");
        boolean boolean12 = extendedProperties4.isInitialized();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean6 = extendedProperties5.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean9 = extendedProperties8.isInitialized;
        java.util.Properties properties11 = extendedProperties8.getProperties(",");
        java.util.Properties properties12 = extendedProperties5.getProperties("/", properties11);
        java.util.Iterator iterator14 = extendedProperties5.getKeys("/");
        extendedProperties0.combine(extendedProperties5);
        extendedProperties0.setProperty("${", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str5 = extendedProperties0.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean8 = extendedProperties7.isInitialized;
        java.util.Properties properties10 = extendedProperties7.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        java.util.Properties properties12 = extendedProperties0.getProperties("/", properties10);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(extendedProperties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(extendedProperties13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = extendedProperties0.subset("hi!");
        long long6 = extendedProperties0.getLong("}", 100L);
        java.util.Properties properties8 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean11 = extendedProperties10.isInitialized;
        java.util.Properties properties13 = extendedProperties10.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        java.util.Properties properties15 = extendedProperties0.getProperties("/", properties13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(extendedProperties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        java.lang.String str7 = extendedProperties0.testBoolean("/");
        java.util.Iterator iterator8 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInt("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        byte byte9 = extendedProperties0.getByte(",", (byte) 100);
        extendedProperties0.file = ",";
        float float14 = extendedProperties0.getFloat("hi!", (float) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties20.getString("");
        int int25 = extendedProperties20.getInt("hi!", (int) 'a');
        boolean boolean28 = extendedProperties20.getBoolean(",", false);
        java.util.List list30 = null;
        java.util.List list31 = extendedProperties20.getList("hi!", list30);
        extendedProperties20.setInclude("}");
        java.util.Iterator iterator35 = extendedProperties20.getKeys(",");
        short short38 = extendedProperties20.getShort("/", (short) 10);
        java.util.Iterator iterator39 = extendedProperties20.getKeys();
        extendedProperties20.isInitialized = false;
        extendedProperties0.addProperty("${", (java.lang.Object) false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        int int21 = extendedProperties0.getInteger("}", (int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties0.subset(",");
        java.util.Properties properties22 = extendedProperties0.getProperties("${");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        short short7 = extendedProperties3.getShort("", (short) (byte) 10);
        extendedProperties3.display();
        extendedProperties3.basePath = "}";
        java.lang.String str11 = extendedProperties3.basePath;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("${");
        extendedProperties0.setProperty(",", (java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte8 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ',' doesn't map to a Byte object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        long long18 = extendedProperties0.getLong("", (-1L));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken(",");
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        int int12 = extendedProperties0.getInteger("hi!", 10);
        java.util.Vector vector14 = extendedProperties0.getVector("hi!");
        java.lang.String str15 = extendedProperties0.fileSeparator;
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/" + "'", str15, "/");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        byte byte18 = extendedProperties0.getByte("}", (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        long long29 = extendedProperties7.getLong(",", (long) (short) 0);
        float float32 = extendedProperties7.getFloat("/", (float) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = extendedProperties0.subset("hi!");
        long long6 = extendedProperties0.getLong("}", 100L);
        java.util.Properties properties8 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.getString("");
        java.lang.String str12 = extendedProperties9.fileSeparator;
        java.lang.Long long15 = extendedProperties9.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        extendedProperties16.setInclude("}");
        java.util.Iterator iterator31 = extendedProperties16.getKeys(",");
        short short34 = extendedProperties16.getShort("/", (short) 10);
        extendedProperties9.combine(extendedProperties16);
        java.lang.Object obj37 = extendedProperties9.getProperty("hi!");
        extendedProperties9.fileSeparator = "}";
        java.util.List list41 = extendedProperties9.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str45 = extendedProperties43.getString("");
        java.lang.String str48 = extendedProperties43.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean51 = extendedProperties50.isInitialized;
        java.util.Properties properties53 = extendedProperties50.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties53);
        java.util.Properties properties55 = extendedProperties43.getProperties("/", properties53);
        java.util.Properties properties56 = extendedProperties9.getProperties("${", properties53);
        extendedProperties0.combine(extendedProperties9);
        java.lang.String str58 = extendedProperties9.basePath;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(extendedProperties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(extendedProperties54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = extendedProperties0.subset("hi!");
        long long6 = extendedProperties0.getLong("}", 100L);
        java.util.Properties properties8 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.getString("");
        java.lang.String str12 = extendedProperties9.fileSeparator;
        java.lang.Long long15 = extendedProperties9.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        extendedProperties16.setInclude("}");
        java.util.Iterator iterator31 = extendedProperties16.getKeys(",");
        short short34 = extendedProperties16.getShort("/", (short) 10);
        extendedProperties9.combine(extendedProperties16);
        java.lang.Object obj37 = extendedProperties9.getProperty("hi!");
        extendedProperties9.fileSeparator = "}";
        java.util.List list41 = extendedProperties9.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str45 = extendedProperties43.getString("");
        java.lang.String str48 = extendedProperties43.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean51 = extendedProperties50.isInitialized;
        java.util.Properties properties53 = extendedProperties50.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties53);
        java.util.Properties properties55 = extendedProperties43.getProperties("/", properties53);
        java.util.Properties properties56 = extendedProperties9.getProperties("${", properties53);
        extendedProperties0.combine(extendedProperties9);
        java.lang.String[] strArray59 = extendedProperties9.getStringArray(",");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(extendedProperties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(extendedProperties54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] {});
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        boolean boolean15 = extendedProperties4.isInitialized();
        short short18 = extendedProperties4.getShort("}", (short) (byte) -1);
        java.lang.String str21 = extendedProperties4.getString("hi!", ",");
        boolean boolean22 = extendedProperties4.isInitialized;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        extendedProperties0.clearProperty("/");
        byte byte13 = extendedProperties0.getByte("hi!", (byte) -1);
        java.lang.String str15 = extendedProperties0.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties16.fileSeparator;
        double double20 = extendedProperties16.getDouble("", (double) 'a');
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties21.fileSeparator;
        java.lang.Long long25 = extendedProperties21.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList26 = extendedProperties21.keysAsListed;
        extendedProperties16.keysAsListed = arrayList26;
        extendedProperties0.keysAsListed = arrayList26;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(arrayList26);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        int int6 = propertiesTokenizer1.countTokens();
        boolean boolean7 = propertiesTokenizer1.hasMoreElements();
        boolean boolean8 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        extendedProperties0.setInclude("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        float float12 = extendedProperties4.getFloat("${", 0.0f);
        float float15 = extendedProperties4.getFloat("", (float) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 35.0f + "'", float15 == 35.0f);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        java.util.Properties properties16 = extendedProperties4.getProperties("}");
        java.lang.String str19 = extendedProperties4.getString(",", "hi!");
        java.lang.String str21 = extendedProperties4.interpolate(",");
        extendedProperties4.isInitialized = false;
        extendedProperties4.clearProperty("/");
        java.lang.String str27 = extendedProperties4.testBoolean("}");
        java.lang.Long long30 = extendedProperties4.getLong("", (java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator31 = extendedProperties4.getKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean6 = extendedProperties5.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean9 = extendedProperties8.isInitialized;
        java.util.Properties properties11 = extendedProperties8.getProperties(",");
        java.util.Properties properties12 = extendedProperties5.getProperties("/", properties11);
        java.util.Iterator iterator14 = extendedProperties5.getKeys("/");
        extendedProperties0.combine(extendedProperties5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        int int4 = propertiesTokenizer1.countTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken("${");
        boolean boolean7 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        java.lang.String str7 = extendedProperties0.testBoolean("/");
        java.util.Iterator iterator8 = extendedProperties0.getKeys();
        java.util.Iterator iterator9 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        java.util.Properties properties16 = extendedProperties4.getProperties("}");
        java.lang.String str19 = extendedProperties4.getString(",", "hi!");
        java.lang.String str21 = extendedProperties4.interpolate(",");
        extendedProperties4.isInitialized = false;
        extendedProperties4.clearProperty("/");
        java.lang.String str27 = extendedProperties4.testBoolean("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str30 = extendedProperties29.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = extendedProperties29.subset("hi!");
        long long35 = extendedProperties29.getLong("}", 100L);
        java.util.Properties properties37 = extendedProperties29.getProperties(",");
        java.lang.String str39 = extendedProperties29.interpolate("");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties4.addProperty("", (java.lang.Object) str39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/" + "'", str30, "/");
        org.junit.Assert.assertNull(extendedProperties32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties11.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties11.subset("hi!");
        int int17 = extendedProperties11.getInteger("", 0);
        extendedProperties0.setProperty("", (java.lang.Object) "");
        java.lang.String str19 = extendedProperties0.basePath;
        java.lang.String str21 = extendedProperties0.interpolate("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        extendedProperties4.clearProperty("hi!");
        int int14 = extendedProperties4.getInt("}", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties4.getInteger("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        java.lang.Short short21 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean23 = extendedProperties22.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean26 = extendedProperties25.isInitialized;
        java.util.Properties properties28 = extendedProperties25.getProperties(",");
        java.util.Properties properties29 = extendedProperties22.getProperties("/", properties28);
        java.util.Iterator iterator31 = extendedProperties22.getKeys("/");
        extendedProperties0.combine(extendedProperties22);
        java.io.OutputStream outputStream33 = null;
        extendedProperties0.save(outputStream33, "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        long long29 = extendedProperties0.getLong("${", (long) (short) 10);
        java.lang.String str30 = extendedProperties0.getInclude();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "}" + "'", str30, "}");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        byte byte21 = extendedProperties0.getByte(",", (byte) 10);
        java.util.ArrayList arrayList22 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertNotNull(arrayList22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.Object obj28 = extendedProperties0.getProperty("hi!");
        extendedProperties0.fileSeparator = "}";
        java.util.List list32 = extendedProperties0.getList("hi!");
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.lang.String str2 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = extendedProperties0.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties0.save(outputStream12, "");
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = extendedProperties7.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        java.lang.String str16 = extendedProperties0.basePath;
        short short19 = extendedProperties0.getShort(",", (short) 100);
        java.lang.Boolean boolean22 = extendedProperties0.getBoolean(",", (java.lang.Boolean) true);
        java.lang.String str24 = extendedProperties0.getString("}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str5 = extendedProperties0.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean8 = extendedProperties7.isInitialized;
        java.util.Properties properties10 = extendedProperties7.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        java.util.Properties properties12 = extendedProperties0.getProperties("/", properties10);
        extendedProperties0.fileSeparator = "${";
        long long17 = extendedProperties0.getLong(",", (long) 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(extendedProperties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = "";
        java.lang.Long long18 = extendedProperties0.getLong("", (java.lang.Long) 0L);
        long long21 = extendedProperties0.getLong("hi!", (long) 35);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = extendedProperties0.getShort("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        byte byte9 = extendedProperties0.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.getString("");
        java.lang.String str14 = extendedProperties11.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.Vector vector26 = extendedProperties16.getVector("");
        java.util.Vector vector27 = extendedProperties11.getVector("", vector26);
        java.util.List list28 = extendedProperties0.getList("/", (java.util.List) vector27);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str32 = extendedProperties30.getString("");
        int int35 = extendedProperties30.getInt("hi!", (int) 'a');
        boolean boolean38 = extendedProperties30.getBoolean(",", false);
        java.util.List list40 = null;
        java.util.List list41 = extendedProperties30.getList("hi!", list40);
        extendedProperties30.setInclude("}");
        java.util.Iterator iterator45 = extendedProperties30.getKeys(",");
        short short48 = extendedProperties30.getShort("/", (short) 10);
        java.util.Iterator iterator49 = extendedProperties30.getKeys();
        java.lang.String str51 = extendedProperties30.getString("");
        java.lang.String[] strArray53 = extendedProperties30.getStringArray("");
        extendedProperties0.setProperty("${", (java.lang.Object) "");
        java.lang.String str55 = extendedProperties0.getInclude();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 10 + "'", short48 == (short) 10);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "}" + "'", str55, "}");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        java.lang.Double double8 = extendedProperties0.getDouble(",", (java.lang.Double) 1.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Iterator iterator19 = extendedProperties0.getKeys();
        java.lang.String str21 = extendedProperties0.getString("");
        java.util.Vector vector23 = extendedProperties0.getVector("}");
        java.lang.Boolean boolean26 = extendedProperties0.getBoolean(",", (java.lang.Boolean) false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean18 = extendedProperties17.isInitialized;
        java.util.Properties properties20 = extendedProperties17.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        java.util.ArrayList arrayList22 = null;
        extendedProperties21.keysAsListed = arrayList22;
        java.lang.String str26 = extendedProperties21.getString("hi!", "/");
        java.lang.Float float29 = extendedProperties21.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList30 = null;
        extendedProperties21.keysAsListed = arrayList30;
        java.util.Properties properties33 = extendedProperties21.getProperties("}");
        java.lang.String str36 = extendedProperties21.getString(",", "hi!");
        java.lang.String str38 = extendedProperties21.interpolate(",");
        extendedProperties21.isInitialized = false;
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean43 = extendedProperties42.isInitialized;
        java.util.Properties properties45 = extendedProperties42.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties45);
        java.util.ArrayList arrayList47 = null;
        extendedProperties46.keysAsListed = arrayList47;
        java.lang.String str51 = extendedProperties46.getString("hi!", "/");
        java.lang.Float float54 = extendedProperties46.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList55 = null;
        extendedProperties46.keysAsListed = arrayList55;
        boolean boolean57 = extendedProperties46.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean60 = extendedProperties59.isInitialized;
        java.util.Properties properties62 = extendedProperties59.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties62);
        java.util.Properties properties64 = extendedProperties46.getProperties("}", properties62);
        java.util.Properties properties65 = extendedProperties21.getProperties(",", properties62);
        java.util.Properties properties66 = extendedProperties0.getProperties(",", properties65);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/" + "'", str26, "/");
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "," + "'", str38, ",");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(extendedProperties46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "/" + "'", str51, "/");
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNotNull(extendedProperties63);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(properties66);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        int int12 = extendedProperties0.getInteger("hi!", 10);
        java.util.Vector vector14 = extendedProperties0.getVector("hi!");
        java.lang.String str16 = extendedProperties0.getString("/");
        byte byte19 = extendedProperties0.getByte("hi!", (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Vector vector20 = extendedProperties0.getVector("hi!");
        java.lang.String str22 = extendedProperties0.testBoolean("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        java.io.OutputStream outputStream28 = null;
        extendedProperties16.save(outputStream28, "");
        extendedProperties16.addProperty("}", (java.lang.Object) (byte) -1);
        extendedProperties0.combine(extendedProperties16);
        java.lang.Integer int37 = extendedProperties16.getInteger("/", (java.lang.Integer) (-1));
        java.io.InputStream inputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties16.load(inputStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        boolean boolean2 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        java.lang.Short short21 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean23 = extendedProperties22.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean26 = extendedProperties25.isInitialized;
        java.util.Properties properties28 = extendedProperties25.getProperties(",");
        java.util.Properties properties29 = extendedProperties22.getProperties("/", properties28);
        java.util.Iterator iterator31 = extendedProperties22.getKeys("/");
        extendedProperties0.combine(extendedProperties22);
        java.lang.String[] strArray34 = extendedProperties22.getStringArray("${");
        extendedProperties22.basePath = "${";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.collections.ExtendedProperties.include = "";
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = extendedProperties0.subset("hi!");
        long long6 = extendedProperties0.getLong("}", 100L);
        java.util.Properties properties8 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.getString("");
        java.lang.String str12 = extendedProperties9.fileSeparator;
        java.lang.Long long15 = extendedProperties9.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        extendedProperties16.setInclude("}");
        java.util.Iterator iterator31 = extendedProperties16.getKeys(",");
        short short34 = extendedProperties16.getShort("/", (short) 10);
        extendedProperties9.combine(extendedProperties16);
        java.lang.Object obj37 = extendedProperties9.getProperty("hi!");
        extendedProperties9.fileSeparator = "}";
        java.util.List list41 = extendedProperties9.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str45 = extendedProperties43.getString("");
        java.lang.String str48 = extendedProperties43.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean51 = extendedProperties50.isInitialized;
        java.util.Properties properties53 = extendedProperties50.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties53);
        java.util.Properties properties55 = extendedProperties43.getProperties("/", properties53);
        java.util.Properties properties56 = extendedProperties9.getProperties("${", properties53);
        extendedProperties0.combine(extendedProperties9);
        java.lang.Double double60 = extendedProperties9.getDouble("${", (java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(extendedProperties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(extendedProperties54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.lang.String str13 = extendedProperties4.getInclude();
        boolean boolean16 = extendedProperties4.getBoolean("", false);
        java.lang.String str17 = extendedProperties4.fileSeparator;
        boolean boolean18 = extendedProperties4.isInitialized();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Iterator iterator19 = extendedProperties0.getKeys();
        java.lang.String str21 = extendedProperties0.getString("");
        java.util.Vector vector23 = extendedProperties0.getVector("}");
        java.lang.Class<?> wildcardClass24 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        byte byte9 = extendedProperties0.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.getString("");
        java.lang.String str14 = extendedProperties11.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.Vector vector26 = extendedProperties16.getVector("");
        java.util.Vector vector27 = extendedProperties11.getVector("", vector26);
        java.util.List list28 = extendedProperties0.getList("/", (java.util.List) vector27);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str32 = extendedProperties30.getString("");
        int int35 = extendedProperties30.getInt("hi!", (int) 'a');
        boolean boolean38 = extendedProperties30.getBoolean(",", false);
        java.util.List list40 = null;
        java.util.List list41 = extendedProperties30.getList("hi!", list40);
        extendedProperties30.setInclude("}");
        java.util.Iterator iterator45 = extendedProperties30.getKeys(",");
        short short48 = extendedProperties30.getShort("/", (short) 10);
        java.util.Iterator iterator49 = extendedProperties30.getKeys();
        java.lang.String str51 = extendedProperties30.getString("");
        java.lang.String[] strArray53 = extendedProperties30.getStringArray("");
        extendedProperties0.setProperty("${", (java.lang.Object) "");
        long long57 = extendedProperties0.getLong("}", (long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 10 + "'", short48 == (short) 10);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        double double9 = extendedProperties0.getDouble("", (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", ",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        float float4 = extendedProperties0.getFloat("${", (float) (byte) 1);
        java.util.Vector vector6 = extendedProperties0.getVector("}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(vector6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        java.util.Properties properties16 = extendedProperties4.getProperties("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(extendedProperties17);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        boolean boolean5 = extendedProperties0.isInitialized();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean10 = extendedProperties9.isInitialized;
        java.util.Properties properties12 = extendedProperties9.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties12);
        extendedProperties0.combine(extendedProperties13);
        extendedProperties13.display();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(extendedProperties13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        long long29 = extendedProperties7.getLong(",", (long) (short) 0);
        extendedProperties7.fileSeparator = "}";
        java.lang.Boolean boolean34 = extendedProperties7.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Double double37 = extendedProperties7.getDouble("${", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str41 = extendedProperties39.getString("");
        java.lang.String str42 = extendedProperties39.fileSeparator;
        java.lang.Long long45 = extendedProperties39.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str48 = extendedProperties46.getString("");
        int int51 = extendedProperties46.getInt("hi!", (int) 'a');
        boolean boolean54 = extendedProperties46.getBoolean(",", false);
        java.util.List list56 = null;
        java.util.List list57 = extendedProperties46.getList("hi!", list56);
        extendedProperties46.setInclude("}");
        java.util.Iterator iterator61 = extendedProperties46.getKeys(",");
        short short64 = extendedProperties46.getShort("/", (short) 10);
        extendedProperties39.combine(extendedProperties46);
        java.lang.Object obj67 = extendedProperties39.getProperty("hi!");
        extendedProperties39.fileSeparator = "}";
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str72 = extendedProperties70.getString("");
        java.lang.String str75 = extendedProperties70.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties77 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean78 = extendedProperties77.isInitialized;
        java.util.Properties properties80 = extendedProperties77.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties81 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties80);
        java.util.Properties properties82 = extendedProperties70.getProperties("/", properties80);
        org.apache.commons.collections.ExtendedProperties extendedProperties83 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str84 = extendedProperties83.fileSeparator;
        java.lang.Long long87 = extendedProperties83.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList88 = extendedProperties83.keysAsListed;
        extendedProperties70.keysAsListed = arrayList88;
        extendedProperties39.keysAsListed = arrayList88;
        java.lang.String str91 = extendedProperties7.interpolateHelper("/", (java.util.List) arrayList88);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) 10 + "'", short64 == (short) 10);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(properties80);
        org.junit.Assert.assertNotNull(extendedProperties81);
        org.junit.Assert.assertNotNull(properties82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "/" + "'", str84, "/");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(arrayList88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "/" + "'", str91, "/");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        int int12 = extendedProperties0.getInteger("hi!", 10);
        float float15 = extendedProperties0.getFloat("${", (float) (-1));
        java.lang.Float float18 = extendedProperties0.getFloat("", (java.lang.Float) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        boolean boolean15 = extendedProperties4.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean18 = extendedProperties17.isInitialized;
        java.util.Properties properties20 = extendedProperties17.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        java.util.Properties properties22 = extendedProperties4.getProperties("}", properties20);
        float float25 = extendedProperties4.getFloat(",", 100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.String str4 = extendedProperties0.getInclude();
        java.lang.Double double7 = extendedProperties0.getDouble(",", (java.lang.Double) 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        short short7 = extendedProperties3.getShort("", (short) (byte) 10);
        long long10 = extendedProperties3.getLong("${", (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = extendedProperties3.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        java.util.Properties properties16 = extendedProperties4.getProperties("}");
        java.lang.String str19 = extendedProperties4.getString(",", "hi!");
        java.lang.String str21 = extendedProperties4.interpolate(",");
        extendedProperties4.isInitialized = false;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean26 = extendedProperties25.isInitialized;
        java.util.Properties properties28 = extendedProperties25.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties28);
        java.util.ArrayList arrayList30 = null;
        extendedProperties29.keysAsListed = arrayList30;
        java.lang.String str34 = extendedProperties29.getString("hi!", "/");
        java.lang.Float float37 = extendedProperties29.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList38 = null;
        extendedProperties29.keysAsListed = arrayList38;
        boolean boolean40 = extendedProperties29.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean43 = extendedProperties42.isInitialized;
        java.util.Properties properties45 = extendedProperties42.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties45);
        java.util.Properties properties47 = extendedProperties29.getProperties("}", properties45);
        java.util.Properties properties48 = extendedProperties4.getProperties(",", properties45);
        java.util.Vector vector50 = extendedProperties4.getVector("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(extendedProperties29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/" + "'", str34, "/");
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(extendedProperties46);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(vector50);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.Object obj28 = extendedProperties0.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties0.subset("hi!");
        java.lang.String str31 = extendedProperties0.basePath;
        java.lang.Long long34 = extendedProperties0.getLong("${", (java.lang.Long) 1L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(extendedProperties30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        extendedProperties0.clearProperty("");
        extendedProperties0.clearProperty(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = extendedProperties0.subset("${");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNull(extendedProperties10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        java.lang.String str16 = extendedProperties0.basePath;
        short short19 = extendedProperties0.getShort(",", (short) 100);
        java.lang.String str20 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "}" + "'", str20, "}");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        extendedProperties4.clearProperty("hi!");
        java.util.Properties properties13 = extendedProperties4.getProperties(",");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Object obj11 = extendedProperties4.getProperty(",");
        java.util.Properties properties13 = extendedProperties4.getProperties("hi!");
        java.lang.String str14 = extendedProperties4.getInclude();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        double double10 = extendedProperties4.getDouble("/", (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short short12 = extendedProperties4.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        java.lang.Long long9 = extendedProperties0.getLong(",", (java.lang.Long) 100L);
        java.lang.Byte byte12 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean15 = extendedProperties14.isInitialized;
        java.util.Properties properties17 = extendedProperties14.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties17);
        java.util.ArrayList arrayList19 = null;
        extendedProperties18.keysAsListed = arrayList19;
        java.lang.String str23 = extendedProperties18.getString("hi!", "/");
        extendedProperties18.clearProperty("hi!");
        extendedProperties0.setProperty("}", (java.lang.Object) extendedProperties18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(extendedProperties18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str5 = extendedProperties0.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean8 = extendedProperties7.isInitialized;
        java.util.Properties properties10 = extendedProperties7.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties10);
        java.util.Properties properties12 = extendedProperties0.getProperties("/", properties10);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str14 = extendedProperties13.fileSeparator;
        java.lang.Long long17 = extendedProperties13.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList18 = extendedProperties13.keysAsListed;
        extendedProperties0.keysAsListed = arrayList18;
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(extendedProperties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(arrayList18);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.String str5 = propertiesTokenizer1.nextToken(",");
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList5 = extendedProperties0.keysAsListed;
        extendedProperties0.basePath = "}";
        java.util.List list9 = null;
        java.util.List list10 = extendedProperties0.getList("}", list9);
        java.lang.String[] strArray12 = extendedProperties0.getStringArray(",");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        java.lang.Object obj17 = extendedProperties0.getProperty("");
        // The following exception was thrown during execution in test generation
        try {
            float float19 = extendedProperties0.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList5 = extendedProperties0.keysAsListed;
        extendedProperties0.basePath = "}";
        java.util.List list9 = null;
        java.util.List list10 = extendedProperties0.getList("}", list9);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean13 = extendedProperties12.isInitialized;
        java.util.Properties properties15 = extendedProperties12.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        java.util.ArrayList arrayList17 = null;
        extendedProperties16.keysAsListed = arrayList17;
        boolean boolean19 = extendedProperties16.isInitialized();
        java.lang.Object obj21 = extendedProperties16.getProperty("hi!");
        java.lang.String str23 = extendedProperties16.getString("/");
        extendedProperties16.fileSeparator = "hi!";
        extendedProperties16.file = "/";
        extendedProperties0.setProperty("}", (java.lang.Object) "/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str8 = extendedProperties6.getString("");
        int int11 = extendedProperties6.getInt("hi!", (int) 'a');
        boolean boolean14 = extendedProperties6.getBoolean(",", false);
        java.util.List list16 = null;
        java.util.List list17 = extendedProperties6.getList("hi!", list16);
        java.util.List list18 = extendedProperties0.getList("}", list17);
        byte byte21 = extendedProperties0.getByte(",", (byte) 10);
        short short24 = extendedProperties0.getShort(",", (short) 0);
        java.lang.String str25 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        long long29 = extendedProperties0.getLong("${", (long) (short) 10);
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.String str6 = propertiesTokenizer1.nextToken(",");
        java.lang.String str8 = propertiesTokenizer1.nextToken("/");
        java.lang.Object obj9 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = "";
        java.lang.String str16 = extendedProperties0.file;
        java.lang.String str17 = extendedProperties0.file;
        short short20 = extendedProperties0.getShort("/", (short) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        int int9 = extendedProperties0.getInt("hi!", (int) (byte) -1);
        java.lang.String str10 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties8.getString("");
        int int13 = extendedProperties8.getInt("hi!", (int) 'a');
        boolean boolean16 = extendedProperties8.getBoolean(",", false);
        java.util.Vector vector18 = extendedProperties8.getVector("");
        java.util.Vector vector19 = extendedProperties4.getVector("", vector18);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties20.getString("");
        int int25 = extendedProperties20.getInt("hi!", (int) 'a');
        boolean boolean28 = extendedProperties20.getBoolean(",", false);
        java.util.List list30 = null;
        java.util.List list31 = extendedProperties20.getList("hi!", list30);
        extendedProperties20.setInclude("}");
        java.util.Iterator iterator35 = extendedProperties20.getKeys(",");
        short short38 = extendedProperties20.getShort("/", (short) 10);
        java.util.Iterator iterator39 = extendedProperties20.getKeys();
        java.lang.String str41 = extendedProperties20.getString("");
        java.util.Vector vector43 = extendedProperties20.getVector("}");
        extendedProperties4.combine(extendedProperties20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(vector19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(vector43);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str5 = extendedProperties0.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset(",");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(extendedProperties7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        java.lang.String str6 = extendedProperties0.testBoolean("/");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte9 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: 'hi!' doesn't map to a Byte object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties0.save(outputStream12, "");
        java.lang.Boolean boolean17 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        java.lang.String str18 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str21 = extendedProperties20.fileSeparator;
        double double24 = extendedProperties20.getDouble("", (double) 'a');
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = extendedProperties0.getShort(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        boolean boolean15 = extendedProperties4.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean18 = extendedProperties17.isInitialized;
        java.util.Properties properties20 = extendedProperties17.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties20);
        java.util.Properties properties22 = extendedProperties4.getProperties("}", properties20);
        extendedProperties4.file = "${";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties0.save(outputStream12, "");
        java.lang.Boolean boolean17 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str20 = extendedProperties19.fileSeparator;
        java.lang.Long long23 = extendedProperties19.getLong("/", (java.lang.Long) (-1L));
        extendedProperties19.clearProperty("/");
        byte byte28 = extendedProperties19.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str32 = extendedProperties30.getString("");
        int int35 = extendedProperties30.getInt("hi!", (int) 'a');
        boolean boolean38 = extendedProperties30.getBoolean(",", false);
        java.util.Vector vector40 = extendedProperties30.getVector("");
        java.util.Vector vector41 = extendedProperties19.getVector("/", vector40);
        java.lang.String str42 = extendedProperties0.interpolateHelper("/", (java.util.List) vector40);
        double double45 = extendedProperties0.getDouble("/", (double) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.lang.String str21 = extendedProperties0.getString("/", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str23 = extendedProperties22.fileSeparator;
        java.lang.Long long26 = extendedProperties22.getLong("/", (java.lang.Long) (-1L));
        extendedProperties22.setInclude("");
        java.lang.String str30 = extendedProperties22.interpolate(",");
        extendedProperties22.clearProperty("/");
        java.lang.Byte byte35 = extendedProperties22.getByte(",", (java.lang.Byte) (byte) 10);
        extendedProperties0.combine(extendedProperties22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "," + "'", str30, ",");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        short short7 = extendedProperties3.getShort("", (short) (byte) 10);
        extendedProperties3.display();
        extendedProperties3.basePath = "}";
        java.lang.Object obj12 = extendedProperties3.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "${");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        extendedProperties0.clearProperty("");
        java.lang.String str9 = extendedProperties0.getString(",", "/");
        java.lang.String str12 = extendedProperties0.getString("}", "");
        java.lang.Float float15 = extendedProperties0.getFloat("hi!", (java.lang.Float) 10.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Float float12 = extendedProperties4.getFloat("/", (java.lang.Float) 0.0f);
        java.util.ArrayList arrayList13 = null;
        extendedProperties4.keysAsListed = arrayList13;
        java.util.Properties properties16 = extendedProperties4.getProperties("}");
        java.lang.String str19 = extendedProperties4.getString(",", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str23 = extendedProperties21.getString("");
        int int26 = extendedProperties21.getInt("hi!", (int) 'a');
        boolean boolean29 = extendedProperties21.getBoolean(",", false);
        java.util.List list31 = null;
        java.util.List list32 = extendedProperties21.getList("hi!", list31);
        java.io.OutputStream outputStream33 = null;
        extendedProperties21.save(outputStream33, "");
        java.lang.Boolean boolean38 = extendedProperties21.getBoolean("}", (java.lang.Boolean) false);
        java.util.Properties properties40 = extendedProperties21.getProperties("/");
        java.util.Properties properties41 = extendedProperties4.getProperties("${", properties40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties0.save(outputStream12, "");
        extendedProperties0.addProperty("}", (java.lang.Object) (byte) -1);
        java.lang.Float float20 = extendedProperties0.getFloat("/", (java.lang.Float) 100.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties21.basePath;
        java.lang.String str24 = extendedProperties21.interpolate(",");
        java.lang.Long long27 = extendedProperties21.getLong("", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str30 = extendedProperties28.getString("");
        java.lang.String str33 = extendedProperties28.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean36 = extendedProperties35.isInitialized;
        java.util.Properties properties38 = extendedProperties35.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties38);
        java.util.Properties properties40 = extendedProperties28.getProperties("/", properties38);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str42 = extendedProperties41.fileSeparator;
        java.lang.Long long45 = extendedProperties41.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList46 = extendedProperties41.keysAsListed;
        extendedProperties28.keysAsListed = arrayList46;
        extendedProperties21.keysAsListed = arrayList46;
        extendedProperties0.keysAsListed = arrayList46;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "," + "'", str24, ",");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(extendedProperties39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(arrayList46);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("${");
        extendedProperties0.setProperty(",", (java.lang.Object) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean8 = extendedProperties7.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.addProperty("hi!", (java.lang.Object) extendedProperties10);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str15 = extendedProperties13.getString("");
        int int18 = extendedProperties13.getInt("hi!", (int) 'a');
        boolean boolean21 = extendedProperties13.getBoolean(",", false);
        java.util.List list23 = null;
        java.util.List list24 = extendedProperties13.getList("hi!", list23);
        java.util.List list25 = extendedProperties7.getList("}", list24);
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties7);
        extendedProperties0.fileSeparator = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            short short30 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        int int2 = propertiesTokenizer1.countTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        java.lang.String str7 = extendedProperties0.testBoolean("/");
        java.util.Iterator iterator8 = extendedProperties0.getKeys();
        java.lang.Double double11 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        java.util.Iterator iterator4 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean6 = extendedProperties5.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean9 = extendedProperties8.isInitialized;
        java.util.Properties properties11 = extendedProperties8.getProperties(",");
        java.util.Properties properties12 = extendedProperties5.getProperties("/", properties11);
        java.util.Iterator iterator14 = extendedProperties5.getKeys("/");
        extendedProperties0.combine(extendedProperties5);
        java.lang.String str17 = extendedProperties0.interpolate(",");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("${");
        java.lang.Float float5 = extendedProperties0.getFloat("${", (java.lang.Float) 0.0f);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = extendedProperties0.subset("hi!");
        int int6 = extendedProperties0.getInteger("", 0);
        java.lang.Byte byte9 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(extendedProperties3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        boolean boolean7 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean8 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        byte byte14 = extendedProperties0.getByte("hi!", (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str7 = extendedProperties5.getString("");
        int int10 = extendedProperties5.getInt("hi!", (int) 'a');
        boolean boolean13 = extendedProperties5.getBoolean(",", false);
        java.util.Vector vector15 = extendedProperties5.getVector("");
        java.util.Vector vector16 = extendedProperties0.getVector("", vector15);
        java.lang.String str17 = extendedProperties0.getInclude();
        java.lang.Short short20 = extendedProperties0.getShort("/", (java.lang.Short) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(vector15);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.Object obj28 = extendedProperties0.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties0.subset("hi!");
        java.lang.String str32 = extendedProperties0.interpolate("/");
        extendedProperties0.isInitialized = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(extendedProperties30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/" + "'", str32, "/");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        java.lang.String str11 = extendedProperties4.getString("/");
        extendedProperties4.fileSeparator = "hi!";
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties4.load(inputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        java.lang.Class<?> wildcardClass6 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Object obj11 = extendedProperties4.getProperty(",");
        java.util.Properties properties13 = extendedProperties4.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        byte byte9 = extendedProperties0.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.getString("");
        int int16 = extendedProperties11.getInt("hi!", (int) 'a');
        boolean boolean19 = extendedProperties11.getBoolean(",", false);
        java.util.Vector vector21 = extendedProperties11.getVector("");
        java.util.Vector vector22 = extendedProperties0.getVector("/", vector21);
        boolean boolean23 = extendedProperties0.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            byte byte25 = extendedProperties0.getByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi! doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.Object obj15 = extendedProperties0.getProperty(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        extendedProperties16.setInclude("}");
        java.util.Iterator iterator31 = extendedProperties16.getKeys(",");
        short short34 = extendedProperties16.getShort("/", (short) 10);
        java.lang.String str37 = extendedProperties16.getString("/", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str40 = extendedProperties39.fileSeparator;
        double double43 = extendedProperties39.getDouble("", (double) 'a');
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str45 = extendedProperties44.fileSeparator;
        java.lang.Long long48 = extendedProperties44.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList49 = extendedProperties44.keysAsListed;
        extendedProperties39.keysAsListed = arrayList49;
        java.lang.String str51 = extendedProperties16.interpolateHelper("", (java.util.List) arrayList49);
        extendedProperties0.keysAsListed = arrayList49;
        // The following exception was thrown during execution in test generation
        try {
            long long54 = extendedProperties0.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/" + "'", str40, "/");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/" + "'", str45, "/");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(arrayList49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        short short18 = extendedProperties0.getShort("/", (short) 10);
        java.util.Iterator iterator19 = extendedProperties0.getKeys();
        java.lang.String str21 = extendedProperties0.getString("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str24 = extendedProperties23.fileSeparator;
        java.lang.Long long27 = extendedProperties23.getLong("/", (java.lang.Long) (-1L));
        extendedProperties23.clearProperty("/");
        byte byte32 = extendedProperties23.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str36 = extendedProperties34.getString("");
        java.lang.String str37 = extendedProperties34.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str41 = extendedProperties39.getString("");
        int int44 = extendedProperties39.getInt("hi!", (int) 'a');
        boolean boolean47 = extendedProperties39.getBoolean(",", false);
        java.util.Vector vector49 = extendedProperties39.getVector("");
        java.util.Vector vector50 = extendedProperties34.getVector("", vector49);
        java.util.List list51 = extendedProperties23.getList("/", (java.util.List) vector50);
        java.lang.String str52 = extendedProperties0.interpolateHelper("", (java.util.List) vector50);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/" + "'", str37, "/");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(vector49);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        java.lang.String str9 = extendedProperties4.getString("hi!", "/");
        java.lang.Object obj11 = extendedProperties4.getProperty(",");
        java.util.Properties properties13 = extendedProperties4.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        extendedProperties14.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str19 = extendedProperties18.fileSeparator;
        java.lang.Long long22 = extendedProperties18.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList23 = extendedProperties18.keysAsListed;
        extendedProperties18.basePath = "}";
        java.util.List list27 = null;
        java.util.List list28 = extendedProperties18.getList("}", list27);
        java.lang.String str29 = extendedProperties14.interpolateHelper("}", list28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "}" + "'", str29, "}");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        long long29 = extendedProperties7.getLong(",", (long) (short) 0);
        extendedProperties7.fileSeparator = "}";
        java.lang.Boolean boolean34 = extendedProperties7.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Double double37 = extendedProperties7.getDouble("${", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean40 = extendedProperties39.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean43 = extendedProperties42.isInitialized;
        java.util.Properties properties45 = extendedProperties42.getProperties(",");
        java.util.Properties properties46 = extendedProperties39.getProperties("/", properties45);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties45);
        java.util.Properties properties48 = extendedProperties7.getProperties("${", properties45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(extendedProperties47);
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("${");
        extendedProperties0.setProperty(",", (java.lang.Object) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean8 = extendedProperties7.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.addProperty("hi!", (java.lang.Object) extendedProperties10);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str15 = extendedProperties13.getString("");
        int int18 = extendedProperties13.getInt("hi!", (int) 'a');
        boolean boolean21 = extendedProperties13.getBoolean(",", false);
        java.util.List list23 = null;
        java.util.List list24 = extendedProperties13.getList("hi!", list23);
        java.util.List list25 = extendedProperties7.getList("}", list24);
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties7);
        java.lang.Integer int29 = extendedProperties0.getInteger("/", (java.lang.Integer) 35);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = extendedProperties0.subset("/");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNull(extendedProperties31);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        byte byte9 = extendedProperties0.getByte(",", (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = extendedProperties0.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        byte byte9 = extendedProperties0.getByte(",", (byte) 100);
        extendedProperties0.file = "/";
        // The following exception was thrown during execution in test generation
        try {
            float float13 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.String str28 = extendedProperties0.testBoolean("/");
        java.lang.Long long31 = extendedProperties0.getLong("hi!", (java.lang.Long) (-1L));
        extendedProperties0.basePath = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.String str27 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "}" + "'", str27, "}");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        int int3 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        java.lang.String str8 = extendedProperties0.testBoolean("/");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        float float4 = extendedProperties0.getFloat("${", (float) (byte) 1);
        boolean boolean7 = extendedProperties0.getBoolean("/", true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        extendedProperties0.display();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        java.lang.String str11 = extendedProperties4.getString("/");
        byte byte14 = extendedProperties4.getByte("", (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties16.fileSeparator;
        java.lang.Long long20 = extendedProperties16.getLong("/", (java.lang.Long) (-1L));
        extendedProperties16.clearProperty("/");
        byte byte25 = extendedProperties16.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str29 = extendedProperties27.getString("");
        int int32 = extendedProperties27.getInt("hi!", (int) 'a');
        boolean boolean35 = extendedProperties27.getBoolean(",", false);
        java.util.Vector vector37 = extendedProperties27.getVector("");
        java.util.Vector vector38 = extendedProperties16.getVector("/", vector37);
        java.lang.String str39 = extendedProperties4.interpolateHelper("hi!", (java.util.List) vector37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken(",");
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str7 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertNotNull(extendedProperties10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.String str28 = extendedProperties0.testBoolean("/");
        java.util.List list30 = extendedProperties0.getList("${");
        java.util.List list32 = extendedProperties0.getList("}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        extendedProperties0.fileSeparator = "";
        java.lang.String str16 = extendedProperties0.file;
        java.lang.String str17 = extendedProperties0.file;
        java.lang.String str18 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        extendedProperties0.fileSeparator = "";
        java.lang.String str5 = extendedProperties0.file;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = extendedProperties0.subset("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean7 = extendedProperties6.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.addProperty("hi!", (java.lang.Object) extendedProperties9);
        java.lang.String str11 = extendedProperties9.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str14 = extendedProperties13.basePath;
        java.lang.String str16 = extendedProperties13.interpolate(",");
        boolean boolean17 = extendedProperties13.isInitialized;
        java.lang.String str18 = extendedProperties13.file;
        java.lang.String str20 = extendedProperties13.testBoolean("/");
        extendedProperties9.setProperty("", (java.lang.Object) extendedProperties13);
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties5.combine(extendedProperties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNull(extendedProperties3);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        boolean boolean7 = extendedProperties0.getBoolean("hi!", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties9.fileSeparator;
        java.lang.Long long13 = extendedProperties9.getLong("/", (java.lang.Long) (-1L));
        extendedProperties9.clearProperty("/");
        byte byte18 = extendedProperties9.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties20.getString("");
        int int25 = extendedProperties20.getInt("hi!", (int) 'a');
        boolean boolean28 = extendedProperties20.getBoolean(",", false);
        java.util.Vector vector30 = extendedProperties20.getVector("");
        java.util.Vector vector31 = extendedProperties9.getVector("/", vector30);
        java.util.Vector vector32 = extendedProperties0.getVector("hi!", vector30);
        java.lang.String str34 = extendedProperties0.testBoolean("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties0.save(outputStream12, "");
        boolean boolean17 = extendedProperties0.getBoolean("/", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean10 = extendedProperties9.isInitialized;
        java.util.Properties properties12 = extendedProperties9.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties12);
        java.util.ArrayList arrayList14 = null;
        extendedProperties13.keysAsListed = arrayList14;
        java.lang.String str18 = extendedProperties13.getString("hi!", "/");
        java.lang.Object obj20 = extendedProperties13.getProperty(",");
        java.util.Properties properties22 = extendedProperties13.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str26 = extendedProperties24.getString("");
        int int29 = extendedProperties24.getInt("hi!", (int) 'a');
        boolean boolean32 = extendedProperties24.getBoolean(",", false);
        java.util.List list34 = null;
        java.util.List list35 = extendedProperties24.getList("hi!", list34);
        java.io.OutputStream outputStream36 = null;
        extendedProperties24.save(outputStream36, "");
        java.lang.Boolean boolean41 = extendedProperties24.getBoolean("}", (java.lang.Boolean) false);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str44 = extendedProperties43.fileSeparator;
        java.lang.Long long47 = extendedProperties43.getLong("/", (java.lang.Long) (-1L));
        extendedProperties43.clearProperty("/");
        byte byte52 = extendedProperties43.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str56 = extendedProperties54.getString("");
        int int59 = extendedProperties54.getInt("hi!", (int) 'a');
        boolean boolean62 = extendedProperties54.getBoolean(",", false);
        java.util.Vector vector64 = extendedProperties54.getVector("");
        java.util.Vector vector65 = extendedProperties43.getVector("/", vector64);
        java.lang.String str66 = extendedProperties24.interpolateHelper("/", (java.util.List) vector64);
        java.util.Vector vector67 = extendedProperties13.getVector("", vector64);
        extendedProperties0.addProperty("${", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(extendedProperties13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "/" + "'", str44, "/");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 100 + "'", byte52 == (byte) 100);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertNotNull(vector65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "/" + "'", str66, "/");
        org.junit.Assert.assertNotNull(vector67);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        java.lang.Short short21 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean23 = extendedProperties22.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean26 = extendedProperties25.isInitialized;
        java.util.Properties properties28 = extendedProperties25.getProperties(",");
        java.util.Properties properties29 = extendedProperties22.getProperties("/", properties28);
        java.util.Iterator iterator31 = extendedProperties22.getKeys("/");
        extendedProperties0.combine(extendedProperties22);
        java.lang.String[] strArray34 = extendedProperties22.getStringArray("${");
        extendedProperties22.isInitialized = false;
        int int39 = extendedProperties22.getInteger("/", (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        byte byte6 = extendedProperties0.getByte("/", (byte) 10);
        boolean boolean9 = extendedProperties0.getBoolean("hi!", false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.lang.String str15 = extendedProperties0.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.getString("");
        int int21 = extendedProperties16.getInt("hi!", (int) 'a');
        boolean boolean24 = extendedProperties16.getBoolean(",", false);
        java.util.List list26 = null;
        java.util.List list27 = extendedProperties16.getList("hi!", list26);
        java.io.OutputStream outputStream28 = null;
        extendedProperties16.save(outputStream28, "");
        extendedProperties16.addProperty("}", (java.lang.Object) (byte) -1);
        extendedProperties0.combine(extendedProperties16);
        java.lang.Integer int37 = extendedProperties16.getInteger("/", (java.lang.Integer) (-1));
        java.lang.Double double40 = extendedProperties16.getDouble("hi!", (java.lang.Double) 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        java.lang.String str8 = extendedProperties0.interpolate(",");
        extendedProperties0.clearProperty("/");
        java.lang.Byte byte13 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 10);
        java.util.ArrayList arrayList14 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertNotNull(arrayList14);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        double double4 = extendedProperties0.getDouble("", (double) 'a');
        boolean boolean7 = extendedProperties0.getBoolean("hi!", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str10 = extendedProperties9.fileSeparator;
        java.lang.Long long13 = extendedProperties9.getLong("/", (java.lang.Long) (-1L));
        extendedProperties9.clearProperty("/");
        byte byte18 = extendedProperties9.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str22 = extendedProperties20.getString("");
        int int25 = extendedProperties20.getInt("hi!", (int) 'a');
        boolean boolean28 = extendedProperties20.getBoolean(",", false);
        java.util.Vector vector30 = extendedProperties20.getVector("");
        java.util.Vector vector31 = extendedProperties9.getVector("/", vector30);
        java.util.Vector vector32 = extendedProperties0.getVector("hi!", vector30);
        byte byte35 = extendedProperties0.getByte("${", (byte) 10);
        long long38 = extendedProperties0.getLong("/", (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 10 + "'", byte35 == (byte) 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        short short6 = extendedProperties0.getShort("", (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.lang.Float float10 = extendedProperties0.getFloat("", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.getString("");
        java.lang.String str14 = extendedProperties11.fileSeparator;
        java.lang.String str15 = extendedProperties11.getInclude();
        int int18 = extendedProperties11.getInt("hi!", (int) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str21 = extendedProperties20.fileSeparator;
        java.lang.Long long24 = extendedProperties20.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList25 = extendedProperties20.keysAsListed;
        java.lang.String str26 = extendedProperties11.interpolateHelper("hi!", (java.util.List) arrayList25);
        extendedProperties0.keysAsListed = arrayList25;
        java.lang.Boolean boolean30 = extendedProperties0.getBoolean("${", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        java.lang.String str7 = extendedProperties0.basePath;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        int int5 = extendedProperties0.getInt("hi!", (int) 'a');
        boolean boolean8 = extendedProperties0.getBoolean(",", false);
        java.util.List list10 = null;
        java.util.List list11 = extendedProperties0.getList("hi!", list10);
        extendedProperties0.setInclude("}");
        java.util.Iterator iterator15 = extendedProperties0.getKeys(",");
        double double18 = extendedProperties0.getDouble("/", (double) (short) 1);
        java.lang.Short short21 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean23 = extendedProperties22.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean26 = extendedProperties25.isInitialized;
        java.util.Properties properties28 = extendedProperties25.getProperties(",");
        java.util.Properties properties29 = extendedProperties22.getProperties("/", properties28);
        java.util.Iterator iterator31 = extendedProperties22.getKeys("/");
        extendedProperties0.combine(extendedProperties22);
        extendedProperties0.setInclude("${");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean4 = extendedProperties3.isInitialized;
        java.util.Properties properties6 = extendedProperties3.getProperties(",");
        java.util.Properties properties7 = extendedProperties0.getProperties("/", properties6);
        java.util.Iterator iterator9 = extendedProperties0.getKeys("/");
        int int12 = extendedProperties0.getInteger("hi!", 10);
        float float15 = extendedProperties0.getFloat("${", (float) (-1));
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = extendedProperties0.subset("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNull(extendedProperties17);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        byte byte9 = extendedProperties0.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.getString("");
        int int16 = extendedProperties11.getInt("hi!", (int) 'a');
        boolean boolean19 = extendedProperties11.getBoolean(",", false);
        java.util.Vector vector21 = extendedProperties11.getVector("");
        java.util.Vector vector22 = extendedProperties0.getVector("/", vector21);
        java.lang.String str23 = extendedProperties0.basePath;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str6 = extendedProperties5.basePath;
        java.lang.String str8 = extendedProperties5.interpolate(",");
        java.lang.Long long11 = extendedProperties5.getLong("", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str14 = extendedProperties12.getString("");
        java.lang.String str17 = extendedProperties12.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean20 = extendedProperties19.isInitialized;
        java.util.Properties properties22 = extendedProperties19.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties22);
        java.util.Properties properties24 = extendedProperties12.getProperties("/", properties22);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str26 = extendedProperties25.fileSeparator;
        java.lang.Long long29 = extendedProperties25.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList30 = extendedProperties25.keysAsListed;
        extendedProperties12.keysAsListed = arrayList30;
        extendedProperties5.keysAsListed = arrayList30;
        extendedProperties4.keysAsListed = arrayList30;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNotNull(extendedProperties23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/" + "'", str26, "/");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(arrayList30);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str29 = extendedProperties28.fileSeparator;
        java.lang.Long long32 = extendedProperties28.getLong("/", (java.lang.Long) (-1L));
        extendedProperties28.clearProperty("/");
        byte byte37 = extendedProperties28.getByte(",", (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str41 = extendedProperties39.getString("");
        int int44 = extendedProperties39.getInt("hi!", (int) 'a');
        boolean boolean47 = extendedProperties39.getBoolean(",", false);
        java.util.Vector vector49 = extendedProperties39.getVector("");
        java.util.Vector vector50 = extendedProperties28.getVector("/", vector49);
        java.util.Vector vector51 = extendedProperties0.getVector("${", vector49);
        short short54 = extendedProperties0.getShort("/", (short) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/" + "'", str29, "/");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(vector49);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 1 + "'", short54 == (short) 1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        long long29 = extendedProperties7.getLong(",", (long) (short) 0);
        extendedProperties7.fileSeparator = "}";
        java.lang.Boolean boolean34 = extendedProperties7.getBoolean(",", (java.lang.Boolean) false);
        long long37 = extendedProperties7.getLong("}", (long) '#');
        long long40 = extendedProperties7.getLong("}", 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.basePath;
        java.lang.String str3 = extendedProperties0.interpolate(",");
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String str5 = extendedProperties0.file;
        int int8 = extendedProperties0.getInt("/", 32);
        java.util.Properties properties10 = extendedProperties0.getProperties("}");
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream11, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.clearProperty("/");
        java.lang.Long long9 = extendedProperties0.getLong(",", (java.lang.Long) 100L);
        java.lang.Byte byte12 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) -1);
        int int15 = extendedProperties0.getInt(",", 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        double double25 = extendedProperties7.getDouble("/", (double) (short) 1);
        extendedProperties0.combine(extendedProperties7);
        long long29 = extendedProperties7.getLong(",", (long) (short) 0);
        extendedProperties7.fileSeparator = "}";
        java.lang.Boolean boolean34 = extendedProperties7.getBoolean(",", (java.lang.Boolean) false);
        java.lang.Byte byte37 = extendedProperties7.getByte("}", (java.lang.Byte) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float39 = extendedProperties7.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 10 + "'", byte37 == (byte) 10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties3);
        short short7 = extendedProperties3.getShort("", (short) (byte) 10);
        extendedProperties3.display();
        extendedProperties3.basePath = "}";
        java.lang.Byte byte13 = extendedProperties3.getByte("hi!", (java.lang.Byte) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Long long4 = extendedProperties0.getLong("/", (java.lang.Long) (-1L));
        java.util.ArrayList arrayList5 = extendedProperties0.keysAsListed;
        java.lang.Double double8 = extendedProperties0.getDouble("/", (java.lang.Double) 97.0d);
        java.lang.Long long11 = extendedProperties0.getLong(",", (java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        java.lang.Object obj9 = extendedProperties4.getProperty("hi!");
        java.util.ArrayList arrayList10 = null;
        extendedProperties4.keysAsListed = arrayList10;
        extendedProperties4.isInitialized = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer(",");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str7 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        double double10 = extendedProperties4.getDouble("/", (double) (byte) -1);
        double double13 = extendedProperties4.getDouble("/", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.getString("");
        java.lang.String str3 = extendedProperties0.fileSeparator;
        java.lang.Long long6 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str9 = extendedProperties7.getString("");
        int int12 = extendedProperties7.getInt("hi!", (int) 'a');
        boolean boolean15 = extendedProperties7.getBoolean(",", false);
        java.util.List list17 = null;
        java.util.List list18 = extendedProperties7.getList("hi!", list17);
        extendedProperties7.setInclude("}");
        java.util.Iterator iterator22 = extendedProperties7.getKeys(",");
        short short25 = extendedProperties7.getShort("/", (short) 10);
        extendedProperties0.combine(extendedProperties7);
        java.lang.Object obj28 = extendedProperties0.getProperty("hi!");
        extendedProperties0.fileSeparator = "}";
        java.util.List list32 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str36 = extendedProperties34.getString("");
        java.lang.String str39 = extendedProperties34.getString("hi!", "");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean42 = extendedProperties41.isInitialized;
        java.util.Properties properties44 = extendedProperties41.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties44);
        java.util.Properties properties46 = extendedProperties34.getProperties("/", properties44);
        java.util.Properties properties47 = extendedProperties0.getProperties("${", properties44);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = extendedProperties0.getDouble("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(extendedProperties45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        boolean boolean1 = extendedProperties0.isInitialized;
        java.util.Properties properties3 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties3);
        java.util.ArrayList arrayList5 = null;
        extendedProperties4.keysAsListed = arrayList5;
        boolean boolean7 = extendedProperties4.isInitialized();
        double double10 = extendedProperties4.getDouble("/", (double) (byte) -1);
        java.lang.Double double13 = extendedProperties4.getDouble("}", (java.lang.Double) 97.0d);
        extendedProperties4.clearProperty("");
        java.util.ArrayList arrayList16 = null;
        extendedProperties4.keysAsListed = arrayList16;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = extendedProperties4.getKeys("${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(extendedProperties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }
}

