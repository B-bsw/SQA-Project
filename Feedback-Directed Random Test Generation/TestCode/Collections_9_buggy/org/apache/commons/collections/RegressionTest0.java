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
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.START_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "${" + "'", str0, "${");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.collections.ExtendedProperties.include = "";
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.END_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "}" + "'", str0, "}");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = extendedProperties2.getInclude();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Class<?> wildcardClass3 = propertiesTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.addProperty("hi!", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        // The following exception was thrown during execution in test generation
        try {
            float float12 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.include;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        long long13 = extendedProperties0.getLong("/", (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short15 = extendedProperties0.getShort("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        int int5 = extendedProperties0.getInteger("}", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = extendedProperties0.getByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi! doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        extendedProperties0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties0.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean10 = extendedProperties0.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedProperties0.getBoolean("}", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '}' doesn't map to a Boolean object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        boolean boolean14 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short21 = extendedProperties15.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj23 = extendedProperties15.remove((java.lang.Object) '#');
        float float26 = extendedProperties15.getFloat("${", 1.0f);
        java.util.List list28 = extendedProperties15.getList("}");
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = extendedProperties0.put((java.lang.Object) extendedProperties15, obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer.DELIMITER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections.ExtendedProperties.include = "/";
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections.ExtendedProperties.include = "${";
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        java.lang.String str10 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedProperties3.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = extendedProperties10.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Vector vector10 = extendedProperties0.getVector("/");
        extendedProperties0.basePath = "/";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = extendedProperties0.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(vector10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        extendedProperties13.setInclude("");
        java.util.Vector vector20 = null;
        java.util.Vector vector21 = extendedProperties13.getVector("", vector20);
        java.util.Vector vector22 = extendedProperties0.getVector(",", vector21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(vector22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        java.lang.String str8 = extendedProperties0.file;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        boolean boolean12 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedProperties0.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = extendedProperties0.getBoolean("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "/" + "'", obj3, "/");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        extendedProperties10.setInclude("");
        // The following exception was thrown during execution in test generation
        try {
            int int30 = extendedProperties10.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        java.lang.Double double15 = extendedProperties0.getDouble("/", (java.lang.Double) 10.0d);
        extendedProperties0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "${" + "'", str9, "${");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = extendedProperties0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", "}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        boolean boolean14 = extendedProperties0.getBoolean("/", true);
        boolean boolean15 = extendedProperties0.isInitialized;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        int int5 = extendedProperties0.getInteger("}", (int) (short) 0);
        extendedProperties0.setInclude("/");
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedProperties0.put((java.lang.Object) "", obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        int int5 = extendedProperties0.getInteger("}", (int) (short) 0);
        extendedProperties0.setInclude("/");
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        double double29 = extendedProperties10.getDouble("}", (double) 10);
        java.lang.String str30 = extendedProperties10.basePath;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str10 = extendedProperties0.getString("hi!");
        float float13 = extendedProperties0.getFloat("}", 10.0f);
        extendedProperties0.setInclude("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = extendedProperties15.subset("${");
        long long20 = extendedProperties15.getLong("/", (long) (byte) 0);
        extendedProperties15.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = extendedProperties15.remove(obj24);
        extendedProperties0.setProperty("hi!", obj24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNull(extendedProperties17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.file;
        int int25 = extendedProperties3.getInt("}", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int11 = extendedProperties8.getInteger("${", (java.lang.Integer) 10);
        extendedProperties8.setInclude("");
        java.util.Vector vector15 = null;
        java.util.Vector vector16 = extendedProperties8.getVector("", vector15);
        java.util.Vector vector17 = extendedProperties0.getVector("hi!", vector15);
        java.lang.String[] strArray19 = extendedProperties0.getStringArray("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        java.lang.String str13 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            float float15 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "${" + "'", str13, "${");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties(",", "${");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.util.ArrayList arrayList8 = extendedProperties0.keysAsListed;
        java.lang.Class<?> wildcardClass9 = arrayList8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "${" + "'", str7, "${");
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        boolean boolean9 = extendedProperties0.isInitialized();
        double double12 = extendedProperties0.getDouble("${", (double) '4');
        java.lang.String str14 = extendedProperties0.getString("/");
        // The following exception was thrown during execution in test generation
        try {
            short short16 = extendedProperties0.getShort("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Object obj14 = extendedProperties0.getProperty("");
        // The following exception was thrown during execution in test generation
        try {
            float float16 = extendedProperties0.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        java.lang.String str10 = extendedProperties0.fileSeparator;
        java.lang.String str11 = extendedProperties0.basePath;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        double double29 = extendedProperties10.getDouble("}", (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = extendedProperties10.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.String str7 = extendedProperties0.testBoolean("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedProperties0.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        short short14 = extendedProperties0.getShort(",", (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = extendedProperties0.getBoolean("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Object obj14 = extendedProperties0.getProperty("");
        // The following exception was thrown during execution in test generation
        try {
            float float16 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) -1);
        boolean boolean11 = extendedProperties0.isInitialized;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "${" + "'", str7, "${");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.Float float13 = extendedProperties0.getFloat("/", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        java.lang.Object obj18 = extendedProperties14.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte21 = extendedProperties14.getByte("/", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str25 = extendedProperties23.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int29 = extendedProperties26.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short32 = extendedProperties26.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj34 = extendedProperties26.remove((java.lang.Object) '#');
        java.lang.String str35 = extendedProperties26.file;
        extendedProperties23.combine(extendedProperties26);
        extendedProperties14.addProperty("hi!", (java.lang.Object) extendedProperties23);
        extendedProperties0.combine(extendedProperties14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = extendedProperties0.getString("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: 'hi!' doesn't map to a String object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "}" + "'", str25, "}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        long long15 = extendedProperties0.getLong("", 100L);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = extendedProperties17.subset("${");
        long long22 = extendedProperties17.getLong("/", (long) (byte) 0);
        extendedProperties17.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object obj27 = extendedProperties17.remove(obj26);
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.setProperty("/", obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(extendedProperties19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        java.util.Properties properties16 = extendedProperties0.getProperties("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInt("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        extendedProperties0.isInitialized = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        double double15 = extendedProperties0.getDouble("/", (double) 100);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.Integer int11 = extendedProperties0.getInteger("/", (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str13 = extendedProperties0.getString("${", ",");
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int11 = extendedProperties8.getInteger("${", (java.lang.Integer) 10);
        extendedProperties8.setInclude("");
        java.util.Vector vector15 = null;
        java.util.Vector vector16 = extendedProperties8.getVector("", vector15);
        java.util.Vector vector17 = extendedProperties0.getVector("hi!", vector15);
        java.util.Iterator iterator18 = extendedProperties0.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        java.util.Iterator iterator13 = extendedProperties0.getKeys();
        java.lang.String[] strArray15 = extendedProperties0.getStringArray("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.Double double24 = extendedProperties3.getDouble("${", (java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("hi!");
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedProperties5.getLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(extendedProperties5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int19 = extendedProperties16.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short22 = extendedProperties16.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj24 = extendedProperties16.remove((java.lang.Object) '#');
        java.util.Vector vector26 = extendedProperties16.getVector("/");
        java.util.Vector vector27 = extendedProperties0.getVector("${", vector26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 100 + "'", short22 == (short) 100);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str13 = extendedProperties0.getString("${", ",");
        java.lang.String str16 = extendedProperties0.getString(",", "hi!");
        extendedProperties0.display();
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = extendedProperties0.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.io.OutputStream outputStream11 = null;
        extendedProperties0.save(outputStream11, "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int11 = extendedProperties8.getInteger("${", (java.lang.Integer) 10);
        extendedProperties8.setInclude("");
        java.util.Vector vector15 = null;
        java.util.Vector vector16 = extendedProperties8.getVector("", vector15);
        java.util.Vector vector17 = extendedProperties0.getVector("hi!", vector15);
        java.lang.Long long20 = extendedProperties0.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int24 = extendedProperties21.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj26 = extendedProperties21.getProperty("${");
        java.lang.Long long29 = extendedProperties21.getLong("/", (java.lang.Long) 10L);
        boolean boolean30 = extendedProperties21.isInitialized();
        double double33 = extendedProperties21.getDouble("${", (double) '4');
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        int int37 = extendedProperties34.getInt("}", (int) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int41 = extendedProperties38.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short44 = extendedProperties38.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj46 = extendedProperties38.remove((java.lang.Object) '#');
        extendedProperties38.fileSeparator = "${";
        java.lang.String str49 = extendedProperties38.fileSeparator;
        java.util.ArrayList arrayList50 = extendedProperties38.keysAsListed;
        extendedProperties34.keysAsListed = arrayList50;
        extendedProperties21.keysAsListed = arrayList50;
        extendedProperties0.keysAsListed = arrayList50;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 100 + "'", short44 == (short) 100);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "${" + "'", str49, "${");
        org.junit.Assert.assertNotNull(arrayList50);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        java.lang.Integer int10 = extendedProperties0.getInteger("${", (java.lang.Integer) 0);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        boolean boolean6 = extendedProperties0.getBoolean("", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Iterator iterator10 = extendedProperties0.getKeys("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = extendedProperties0.getShort("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "${" + "'", str9, "${");
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.Float float13 = extendedProperties0.getFloat("/", (java.lang.Float) (-1.0f));
        java.lang.String str15 = extendedProperties0.getString(",");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        extendedProperties0.display();
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        java.lang.Short short14 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties0.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        double double29 = extendedProperties10.getDouble("}", (double) 10);
        java.util.List list31 = extendedProperties10.getList("${");
        java.io.InputStream inputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties10.load(inputStream32, "${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", ",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        extendedProperties0.setInclude("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.util.Iterator iterator10 = extendedProperties0.getKeys("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        java.lang.String str13 = extendedProperties0.getInclude();
        java.lang.Object obj15 = extendedProperties0.getProperty(",");
        // The following exception was thrown during execution in test generation
        try {
            float float18 = extendedProperties0.getFloat("${", (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "${" + "'", str13, "${");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str10 = extendedProperties0.getString("hi!");
        float float13 = extendedProperties0.getFloat("}", 10.0f);
        int int16 = extendedProperties0.getInt("}", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        boolean boolean9 = extendedProperties0.isInitialized();
        double double12 = extendedProperties0.getDouble("${", (double) '4');
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        int int16 = extendedProperties13.getInt("}", (int) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        extendedProperties17.fileSeparator = "${";
        java.lang.String str28 = extendedProperties17.fileSeparator;
        java.util.ArrayList arrayList29 = extendedProperties17.keysAsListed;
        extendedProperties13.keysAsListed = arrayList29;
        extendedProperties0.keysAsListed = arrayList29;
        // The following exception was thrown during execution in test generation
        try {
            byte byte33 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "${" + "'", str28, "${");
        org.junit.Assert.assertNotNull(arrayList29);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.String str3 = propertiesTokenizer1.nextToken("}");
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "${" + "'", str3, "${");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections.ExtendedProperties.include = ",";
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        java.util.Iterator iterator13 = extendedProperties0.getKeys("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.String str3 = propertiesTokenizer1.nextToken("}");
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "${" + "'", str3, "${");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.io.OutputStream outputStream11 = null;
        extendedProperties0.save(outputStream11, "");
        // The following exception was thrown during execution in test generation
        try {
            short short15 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Vector vector10 = extendedProperties0.getVector("/");
        extendedProperties0.basePath = "/";
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(vector10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        int int5 = extendedProperties0.getInteger("}", (int) (short) 0);
        java.lang.Class<?> wildcardClass6 = extendedProperties0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        java.lang.Integer int10 = extendedProperties0.getInteger("${", (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedProperties0.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken(",");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        extendedProperties0.display();
        java.lang.Float float9 = extendedProperties0.getFloat("/", (java.lang.Float) 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        extendedProperties0.basePath = ",";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        java.lang.String str20 = extendedProperties0.testBoolean("/");
        extendedProperties0.setInclude("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Short short7 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        java.lang.Integer int10 = extendedProperties0.getInteger("${", (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short12 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.Integer int11 = extendedProperties0.getInteger("/", (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = extendedProperties0.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = extendedProperties3.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        short short14 = extendedProperties0.getShort(",", (short) 0);
        java.lang.String str16 = extendedProperties0.interpolate(",");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.String str8 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            short short10 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.clearProperty("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        extendedProperties0.fileSeparator = ",";
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str24 = extendedProperties22.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int28 = extendedProperties25.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short31 = extendedProperties25.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj33 = extendedProperties25.remove((java.lang.Object) '#');
        java.lang.String str34 = extendedProperties25.file;
        extendedProperties22.combine(extendedProperties25);
        java.lang.String str36 = extendedProperties22.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int41 = extendedProperties38.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short44 = extendedProperties38.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj46 = extendedProperties38.remove((java.lang.Object) '#');
        java.util.Vector vector48 = extendedProperties38.getVector("/");
        java.util.Vector vector49 = extendedProperties22.getVector("${", vector48);
        java.util.List list50 = extendedProperties0.getList("", (java.util.List) vector49);
        java.lang.String str51 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 100 + "'", short44 == (short) 100);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertNotNull(vector49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "," + "'", str51, ",");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.Byte byte9 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties0.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean10 = extendedProperties0.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        boolean boolean4 = extendedProperties0.isInitialized;
        boolean boolean5 = extendedProperties0.isInitialized;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str10 = extendedProperties0.getString("hi!");
        float float13 = extendedProperties0.getFloat("}", 10.0f);
        java.lang.Byte byte16 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        int int4 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.fileSeparator;
        extendedProperties3.display();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = extendedProperties3.getDouble("", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a Double object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        boolean boolean10 = extendedProperties0.isInitialized();
        double double13 = extendedProperties0.getDouble("hi!", (double) 0);
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream14, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties3.fileSeparator;
        boolean boolean15 = extendedProperties3.isInitialized();
        java.lang.String str17 = extendedProperties3.getString(",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedProperties0.getInteger("${", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = extendedProperties0.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.String str7 = extendedProperties0.testBoolean("");
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = extendedProperties0.getByte("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '} doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", "/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        extendedProperties13.setInclude("");
        java.lang.String str19 = extendedProperties13.fileSeparator;
        java.lang.Boolean boolean22 = extendedProperties13.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray24 = extendedProperties13.getStringArray("hi!");
        boolean boolean27 = extendedProperties13.getBoolean("/", true);
        double double30 = extendedProperties13.getDouble(",", 1.0d);
        extendedProperties0.addProperty("/", (java.lang.Object) double30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.lang.Long long14 = extendedProperties0.getLong("}", (java.lang.Long) 100L);
        extendedProperties0.setInclude(",");
        java.util.Iterator iterator17 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.basePath;
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            byte byte12 = extendedProperties0.getByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi! doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj21 = extendedProperties13.remove((java.lang.Object) '#');
        extendedProperties13.fileSeparator = "${";
        long long26 = extendedProperties13.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int31 = extendedProperties28.getInteger("${", (java.lang.Integer) 10);
        extendedProperties28.setInclude("");
        java.util.Vector vector35 = null;
        java.util.Vector vector36 = extendedProperties28.getVector("", vector35);
        java.lang.String str37 = extendedProperties13.interpolateHelper("hi!", (java.util.List) vector36);
        java.util.List list38 = extendedProperties0.getList("/", (java.util.List) vector36);
        extendedProperties0.file = "/";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.Integer int11 = extendedProperties0.getInteger("/", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        extendedProperties12.setInclude("");
        java.lang.String str18 = extendedProperties12.fileSeparator;
        boolean boolean19 = extendedProperties12.isInitialized();
        java.lang.String str20 = extendedProperties12.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        java.lang.String str22 = extendedProperties0.file;
        boolean boolean25 = extendedProperties0.getBoolean("hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        int int15 = extendedProperties0.getInt("/", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections.ExtendedProperties.include = "}";
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        java.lang.Byte byte15 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.Float float13 = extendedProperties0.getFloat("/", (java.lang.Float) (-1.0f));
        java.util.List list15 = extendedProperties0.getList("");
        java.util.Iterator iterator17 = extendedProperties0.getKeys(",");
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.io.OutputStream outputStream11 = null;
        extendedProperties0.save(outputStream11, "");
        java.lang.String str16 = extendedProperties0.getString(",", "/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties3.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties3.combine(extendedProperties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        boolean boolean16 = extendedProperties0.getBoolean("hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.Float float13 = extendedProperties0.getFloat("/", (java.lang.Float) (-1.0f));
        java.lang.Byte byte16 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 10);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", ",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties(",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        java.util.Properties properties16 = extendedProperties0.getProperties("hi!");
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream17, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Double double10 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        extendedProperties0.basePath = "}";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int24 = extendedProperties21.getInteger("${", (java.lang.Integer) 10);
        extendedProperties21.setInclude("");
        java.util.Vector vector28 = null;
        java.util.Vector vector29 = extendedProperties21.getVector("", vector28);
        java.util.Vector vector30 = extendedProperties13.getVector("hi!", vector28);
        java.util.Vector vector31 = extendedProperties0.getVector("/", vector28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = extendedProperties0.getBoolean("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(vector31);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "/" + "'", obj4, "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        java.util.List list13 = extendedProperties0.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int17 = extendedProperties14.getInteger("${", (java.lang.Integer) 10);
        extendedProperties14.setInclude("");
        java.util.Vector vector21 = null;
        java.util.Vector vector22 = extendedProperties14.getVector("", vector21);
        java.lang.String str23 = extendedProperties14.file;
        boolean boolean24 = extendedProperties14.isInitialized();
        java.lang.Object obj25 = extendedProperties0.remove((java.lang.Object) boolean24);
        java.lang.Integer int28 = extendedProperties0.getInteger("}", (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.Integer int11 = extendedProperties0.getInteger("/", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        extendedProperties12.setInclude("");
        java.lang.String str18 = extendedProperties12.fileSeparator;
        boolean boolean19 = extendedProperties12.isInitialized();
        java.lang.String str20 = extendedProperties12.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        java.lang.Object obj23 = extendedProperties0.getProperty("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.interpolate("}");
        int int14 = extendedProperties9.getInteger("}", (int) (short) 0);
        extendedProperties0.combine(extendedProperties9);
        int int18 = extendedProperties9.getInteger("${", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        boolean boolean10 = extendedProperties0.isInitialized();
        double double13 = extendedProperties0.getDouble("hi!", (double) 0);
        java.lang.Class<?> wildcardClass14 = extendedProperties0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties0.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean10 = extendedProperties0.isInitialized();
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("/");
        java.lang.String str13 = extendedProperties0.basePath;
        java.lang.String str14 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("hi!");
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties5.save(outputStream6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(extendedProperties5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        java.lang.String str12 = extendedProperties0.file;
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean(",", (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int7 = extendedProperties4.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short10 = extendedProperties4.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj12 = extendedProperties4.remove((java.lang.Object) '#');
        extendedProperties4.fileSeparator = "${";
        java.lang.String str15 = extendedProperties4.fileSeparator;
        java.util.ArrayList arrayList16 = extendedProperties4.keysAsListed;
        extendedProperties0.keysAsListed = arrayList16;
        java.lang.Integer int20 = extendedProperties0.getInteger("}", (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "${" + "'", str15, "${");
        org.junit.Assert.assertNotNull(arrayList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Double double10 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = extendedProperties11.subset("${");
        long long16 = extendedProperties11.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        extendedProperties17.fileSeparator = "${";
        java.lang.String str28 = extendedProperties17.fileSeparator;
        java.util.ArrayList arrayList29 = extendedProperties17.keysAsListed;
        extendedProperties11.keysAsListed = arrayList29;
        extendedProperties0.putAll((java.util.Map) extendedProperties11);
        java.lang.Long long34 = extendedProperties11.getLong("}", (java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "${" + "'", str28, "${");
        org.junit.Assert.assertNotNull(arrayList29);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int11 = extendedProperties8.getInteger("${", (java.lang.Integer) 10);
        extendedProperties8.setInclude("");
        java.util.Vector vector15 = null;
        java.util.Vector vector16 = extendedProperties8.getVector("", vector15);
        java.util.Vector vector17 = extendedProperties0.getVector("hi!", vector15);
        java.lang.Long long20 = extendedProperties0.getLong("hi!", (java.lang.Long) 10L);
        int int23 = extendedProperties0.getInt("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = extendedProperties0.getBoolean(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = extendedProperties3.getBoolean("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a Boolean object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short18 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj20 = extendedProperties12.remove((java.lang.Object) '#');
        extendedProperties12.fileSeparator = "${";
        java.lang.String str23 = extendedProperties12.fileSeparator;
        java.util.Vector vector25 = extendedProperties12.getVector("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str29 = extendedProperties27.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int33 = extendedProperties30.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short36 = extendedProperties30.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj38 = extendedProperties30.remove((java.lang.Object) '#');
        java.lang.String str39 = extendedProperties30.file;
        extendedProperties27.combine(extendedProperties30);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int45 = extendedProperties42.getInteger("${", (java.lang.Integer) 10);
        extendedProperties42.setInclude("");
        java.util.Vector vector49 = null;
        java.util.Vector vector50 = extendedProperties42.getVector("", vector49);
        java.util.Vector vector51 = extendedProperties27.getVector("hi!", vector49);
        java.util.Vector vector52 = extendedProperties12.getVector("/", vector51);
        java.lang.String str53 = extendedProperties0.interpolateHelper("hi!", (java.util.List) vector52);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "${" + "'", str23, "${");
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "}" + "'", str29, "}");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertNotNull(vector52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        java.util.Properties properties20 = extendedProperties0.getProperties("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        java.lang.Double double15 = extendedProperties0.getDouble("${", (java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.lang.Object obj11 = extendedProperties0.getProperty("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        java.lang.String str12 = extendedProperties0.file;
        boolean boolean13 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        java.lang.Object obj19 = extendedProperties15.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte22 = extendedProperties15.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties15.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str26 = extendedProperties15.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int31 = extendedProperties28.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short34 = extendedProperties28.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj36 = extendedProperties28.remove((java.lang.Object) '#');
        extendedProperties28.fileSeparator = "${";
        long long41 = extendedProperties28.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int46 = extendedProperties43.getInteger("${", (java.lang.Integer) 10);
        extendedProperties43.setInclude("");
        java.util.Vector vector50 = null;
        java.util.Vector vector51 = extendedProperties43.getVector("", vector50);
        java.lang.String str52 = extendedProperties28.interpolateHelper("hi!", (java.util.List) vector51);
        java.util.List list53 = extendedProperties15.getList("/", (java.util.List) vector51);
        java.lang.String str54 = extendedProperties0.interpolateHelper("/", (java.util.List) vector51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "}" + "'", str26, "}");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(vector51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/" + "'", str54, "/");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        short short15 = extendedProperties0.getShort("}", (short) (byte) 0);
        java.lang.String str17 = extendedProperties0.testBoolean("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties3.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties3.getInt("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        extendedProperties15.setInclude("");
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties15.getVector("", vector22);
        java.util.Vector vector24 = extendedProperties0.getVector("hi!", vector22);
        java.util.Iterator iterator26 = extendedProperties0.getKeys("");
        extendedProperties0.isInitialized = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        java.util.Properties properties16 = extendedProperties0.getProperties("hi!");
        java.lang.String str17 = extendedProperties0.file;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        boolean boolean10 = extendedProperties0.isInitialized();
        double double13 = extendedProperties0.getDouble("hi!", (double) 0);
        java.lang.String str15 = extendedProperties0.testBoolean("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        java.lang.Class<?> wildcardClass12 = extendedProperties0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("hi!");
        java.lang.String str8 = extendedProperties0.getString("", "");
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties10.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj21 = extendedProperties13.remove((java.lang.Object) '#');
        java.lang.String str22 = extendedProperties13.file;
        extendedProperties10.combine(extendedProperties13);
        java.lang.String str24 = extendedProperties10.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        double double28 = extendedProperties10.getDouble("}", (double) (short) 100);
        extendedProperties10.basePath = "${";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Double double10 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        extendedProperties12.setInclude("");
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties12.getVector("", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector("${", vector19);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int25 = extendedProperties22.getInteger("${", (java.lang.Integer) 10);
        extendedProperties22.setInclude("");
        java.lang.String str28 = extendedProperties22.fileSeparator;
        boolean boolean29 = extendedProperties22.isInitialized();
        extendedProperties0.putAll((java.util.Map) extendedProperties22);
        extendedProperties0.file = ",";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str10 = extendedProperties0.getString("hi!");
        extendedProperties0.file = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte5 = extendedProperties2.getByte("/", (java.lang.Byte) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        long long13 = extendedProperties0.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        extendedProperties15.setInclude("");
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties15.getVector("", vector22);
        java.lang.String str24 = extendedProperties0.interpolateHelper("hi!", (java.util.List) vector23);
        java.util.Iterator iterator26 = extendedProperties0.getKeys("/");
        // The following exception was thrown during execution in test generation
        try {
            byte byte28 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.String[] strArray12 = extendedProperties0.getStringArray(",");
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        java.util.List list13 = extendedProperties0.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int17 = extendedProperties14.getInteger("${", (java.lang.Integer) 10);
        extendedProperties14.setInclude("");
        java.util.Vector vector21 = null;
        java.util.Vector vector22 = extendedProperties14.getVector("", vector21);
        java.lang.String str23 = extendedProperties14.file;
        boolean boolean24 = extendedProperties14.isInitialized();
        java.lang.Object obj25 = extendedProperties0.remove((java.lang.Object) boolean24);
        java.util.Iterator iterator26 = extendedProperties0.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        java.lang.String str24 = extendedProperties10.fileSeparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.Byte byte7 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.interpolate("}");
        int int14 = extendedProperties9.getInteger("}", (int) (short) 0);
        extendedProperties0.combine(extendedProperties9);
        java.lang.String str17 = extendedProperties0.getString("${");
        int int20 = extendedProperties0.getInt(",", (int) (byte) 1);
        java.io.OutputStream outputStream21 = null;
        extendedProperties0.save(outputStream21, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj18 = extendedProperties13.getProperty("${");
        java.lang.Long long21 = extendedProperties13.getLong("/", (java.lang.Long) 10L);
        java.lang.String str22 = extendedProperties13.getInclude();
        java.util.List list24 = null;
        java.util.List list25 = extendedProperties13.getList("/", list24);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int29 = extendedProperties26.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short32 = extendedProperties26.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj34 = extendedProperties26.remove((java.lang.Object) '#');
        extendedProperties26.fileSeparator = "${";
        float float39 = extendedProperties26.getFloat("", (float) (byte) -1);
        java.lang.Class<?> wildcardClass40 = extendedProperties26.getClass();
        java.lang.Object obj41 = extendedProperties0.put((java.lang.Object) list24, (java.lang.Object) wildcardClass40);
        // The following exception was thrown during execution in test generation
        try {
            float float43 = extendedProperties0.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        byte byte11 = extendedProperties0.getByte("", (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = extendedProperties0.getShort("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.io.OutputStream outputStream11 = null;
        extendedProperties0.save(outputStream11, "");
        java.lang.Integer int16 = extendedProperties0.getInteger(",", (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.util.Properties properties11 = extendedProperties0.getProperties("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str10 = extendedProperties0.getString("hi!");
        float float13 = extendedProperties0.getFloat("}", 10.0f);
        java.lang.Byte byte16 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        java.lang.Integer int10 = extendedProperties0.getInteger("${", (java.lang.Integer) 0);
        java.lang.Byte byte13 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        java.lang.String str20 = extendedProperties0.testBoolean("/");
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int26 = extendedProperties23.getInteger("${", (java.lang.Integer) 10);
        extendedProperties23.setInclude("");
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties23.getVector("", vector30);
        java.lang.String str32 = extendedProperties23.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int36 = extendedProperties33.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short39 = extendedProperties33.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj41 = extendedProperties33.remove((java.lang.Object) '#');
        float float44 = extendedProperties33.getFloat("${", 1.0f);
        boolean boolean45 = extendedProperties33.isInitialized;
        extendedProperties23.putAll((java.util.Map) extendedProperties33);
        extendedProperties0.combine(extendedProperties23);
        java.lang.String str49 = extendedProperties0.getString("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.collections.ExtendedProperties.include = "hi!";
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) -1);
        java.util.Iterator iterator11 = extendedProperties0.getKeys();
        java.lang.String str13 = extendedProperties0.testBoolean("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int11 = extendedProperties8.getInteger("${", (java.lang.Integer) 10);
        extendedProperties8.setInclude("");
        java.util.Vector vector15 = null;
        java.util.Vector vector16 = extendedProperties8.getVector("", vector15);
        java.util.Vector vector17 = extendedProperties0.getVector("hi!", vector15);
        java.lang.Long long20 = extendedProperties0.getLong("hi!", (java.lang.Long) 10L);
        int int23 = extendedProperties0.getInt("", (int) ' ');
        boolean boolean24 = extendedProperties0.isInitialized();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Vector vector10 = extendedProperties0.getVector("/");
        extendedProperties0.basePath = "/";
        java.lang.String[] strArray14 = extendedProperties0.getStringArray("/");
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties3.fileSeparator;
        boolean boolean15 = extendedProperties3.isInitialized();
        java.lang.String str17 = extendedProperties3.testBoolean("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str21 = extendedProperties19.interpolate("}");
        java.lang.Object obj23 = extendedProperties19.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte26 = extendedProperties19.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties19.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray31 = extendedProperties19.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str35 = extendedProperties33.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int39 = extendedProperties36.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short42 = extendedProperties36.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj44 = extendedProperties36.remove((java.lang.Object) '#');
        java.lang.String str45 = extendedProperties36.file;
        extendedProperties33.combine(extendedProperties36);
        java.lang.String str47 = extendedProperties33.fileSeparator;
        java.util.Properties properties49 = extendedProperties33.getProperties("hi!");
        java.util.Properties properties50 = extendedProperties19.getProperties("${", properties49);
        java.util.Properties properties51 = extendedProperties3.getProperties("", properties49);
        java.lang.String[] strArray53 = extendedProperties3.getStringArray(",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "}" + "'", str21, "}");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "}" + "'", str35, "}");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 100 + "'", short42 == (short) 100);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "/" + "'", str47, "/");
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        int int14 = extendedProperties11.getInt("}", (int) (byte) 0);
        boolean boolean15 = extendedProperties11.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int19 = extendedProperties16.getInteger("${", (java.lang.Integer) 10);
        extendedProperties16.setInclude("");
        java.util.Vector vector23 = null;
        java.util.Vector vector24 = extendedProperties16.getVector("", vector23);
        java.lang.String str25 = extendedProperties16.file;
        boolean boolean26 = extendedProperties16.isInitialized();
        java.lang.Object obj27 = extendedProperties0.put((java.lang.Object) boolean15, (java.lang.Object) extendedProperties16);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized;
        java.lang.String str8 = extendedProperties0.file;
        java.lang.String str9 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties3.getInclude();
        boolean boolean17 = extendedProperties3.getBoolean("", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = extendedProperties3.subset("/");
        java.lang.Class<?> wildcardClass20 = extendedProperties3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(extendedProperties19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        long long15 = extendedProperties0.getLong("", 100L);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str18 = extendedProperties16.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int22 = extendedProperties19.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short25 = extendedProperties19.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj27 = extendedProperties19.remove((java.lang.Object) '#');
        java.lang.String str28 = extendedProperties19.file;
        extendedProperties16.combine(extendedProperties19);
        java.lang.String str30 = extendedProperties16.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int34 = extendedProperties31.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short37 = extendedProperties31.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj39 = extendedProperties31.remove((java.lang.Object) '#');
        extendedProperties31.fileSeparator = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str44 = extendedProperties42.interpolate("}");
        int int47 = extendedProperties42.getInteger("}", (int) (short) 0);
        extendedProperties31.combine(extendedProperties42);
        java.lang.Object obj49 = extendedProperties0.put((java.lang.Object) str30, (java.lang.Object) extendedProperties42);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 100 + "'", short25 == (short) 100);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "}" + "'", str44, "}");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = extendedProperties13.subset("${");
        long long18 = extendedProperties13.getLong("/", (long) (byte) 0);
        extendedProperties0.putAll((java.util.Map) extendedProperties13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(extendedProperties15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short18 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj20 = extendedProperties12.remove((java.lang.Object) '#');
        java.lang.String str21 = extendedProperties12.file;
        extendedProperties9.combine(extendedProperties12);
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties9);
        java.util.Properties properties25 = extendedProperties9.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str29 = extendedProperties27.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int33 = extendedProperties30.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short36 = extendedProperties30.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj38 = extendedProperties30.remove((java.lang.Object) '#');
        java.lang.String str39 = extendedProperties30.file;
        extendedProperties27.combine(extendedProperties30);
        java.lang.String str41 = extendedProperties30.fileSeparator;
        boolean boolean42 = extendedProperties30.isInitialized();
        java.lang.String str43 = extendedProperties30.basePath;
        java.lang.String[] strArray45 = extendedProperties30.getStringArray("");
        extendedProperties9.setProperty("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "}" + "'", str29, "}");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "/" + "'", str41, "/");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        java.lang.String str26 = extendedProperties17.file;
        extendedProperties14.combine(extendedProperties17);
        java.lang.String str28 = extendedProperties14.fileSeparator;
        java.util.Properties properties30 = extendedProperties14.getProperties("hi!");
        java.util.Properties properties31 = extendedProperties0.getProperties("${", properties30);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(extendedProperties32);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.file;
        java.lang.String str24 = extendedProperties3.testBoolean(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str28 = extendedProperties26.interpolate("}");
        java.lang.Object obj30 = extendedProperties26.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte33 = extendedProperties26.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties26.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray38 = extendedProperties26.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str42 = extendedProperties40.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int46 = extendedProperties43.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short49 = extendedProperties43.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj51 = extendedProperties43.remove((java.lang.Object) '#');
        java.lang.String str52 = extendedProperties43.file;
        extendedProperties40.combine(extendedProperties43);
        java.lang.String str54 = extendedProperties40.fileSeparator;
        java.util.Properties properties56 = extendedProperties40.getProperties("hi!");
        java.util.Properties properties57 = extendedProperties26.getProperties("${", properties56);
        java.util.Properties properties58 = extendedProperties3.getProperties("}", properties57);
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "}" + "'", str28, "}");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "}" + "'", str42, "}");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/" + "'", str54, "/");
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNotNull(extendedProperties59);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int10 = extendedProperties7.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short13 = extendedProperties7.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj15 = extendedProperties7.remove((java.lang.Object) '#');
        float float18 = extendedProperties7.getFloat("${", 1.0f);
        java.util.List list20 = extendedProperties7.getList("}");
        java.lang.String str21 = extendedProperties0.interpolateHelper("${", list20);
        java.lang.String str24 = extendedProperties0.getString(",", "}");
        short short27 = extendedProperties0.getShort("${", (short) (byte) 100);
        long long30 = extendedProperties0.getLong("", (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = extendedProperties32.subset("${");
        long long37 = extendedProperties32.getLong("/", (long) (byte) 0);
        extendedProperties32.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Object obj42 = extendedProperties32.remove(obj41);
        java.lang.String str45 = extendedProperties32.getString("${", ",");
        java.lang.String str48 = extendedProperties32.getString(",", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = extendedProperties32.subset("");
        extendedProperties0.setProperty("", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "${" + "'", str21, "${");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNull(extendedProperties34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "}" + "'", str45, "}");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(extendedProperties50);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Boolean boolean11 = extendedProperties0.getBoolean("${", (java.lang.Boolean) true);
        extendedProperties0.basePath = "${";
        java.util.ArrayList arrayList14 = extendedProperties0.keysAsListed;
        java.lang.String str15 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float18 = extendedProperties0.getFloat("${", (java.lang.Float) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '${' doesn't map to a Float object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = extendedProperties0.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        int int3 = propertiesTokenizer1.countTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        int int5 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.basePath;
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int14 = extendedProperties11.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short17 = extendedProperties11.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str18 = extendedProperties11.getInclude();
        java.util.ArrayList arrayList19 = extendedProperties11.keysAsListed;
        extendedProperties0.keysAsListed = arrayList19;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(arrayList19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties10.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj21 = extendedProperties13.remove((java.lang.Object) '#');
        java.lang.String str22 = extendedProperties13.file;
        extendedProperties10.combine(extendedProperties13);
        java.lang.String str24 = extendedProperties10.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        boolean boolean28 = extendedProperties10.getBoolean("/", false);
        long long31 = extendedProperties10.getLong("/", (long) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.util.Properties properties13 = extendedProperties0.getProperties("/");
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = extendedProperties0.getByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: 'hi!' doesn't map to a Byte object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        float float14 = extendedProperties0.getFloat("}", (float) (short) 0);
        java.io.OutputStream outputStream15 = null;
        extendedProperties0.save(outputStream15, "}");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedProperties0.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int17 = extendedProperties14.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short20 = extendedProperties14.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj22 = extendedProperties14.remove((java.lang.Object) '#');
        java.lang.String str23 = extendedProperties14.file;
        extendedProperties11.combine(extendedProperties14);
        java.lang.String str25 = extendedProperties11.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int30 = extendedProperties27.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short33 = extendedProperties27.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj35 = extendedProperties27.remove((java.lang.Object) '#');
        java.util.Vector vector37 = extendedProperties27.getVector("/");
        java.util.Vector vector38 = extendedProperties11.getVector("${", vector37);
        java.lang.String str39 = extendedProperties0.interpolateHelper("}", (java.util.List) vector37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        java.util.List list13 = extendedProperties0.getList("}");
        java.util.ArrayList arrayList14 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(arrayList14);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        float float13 = extendedProperties0.getFloat("", (float) (byte) -1);
        long long16 = extendedProperties0.getLong("", (long) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        boolean boolean13 = extendedProperties0.isInitialized;
        java.lang.String str14 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        java.lang.Object obj18 = extendedProperties14.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte21 = extendedProperties14.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties14.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str25 = extendedProperties14.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int30 = extendedProperties27.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short33 = extendedProperties27.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj35 = extendedProperties27.remove((java.lang.Object) '#');
        extendedProperties27.fileSeparator = "${";
        long long40 = extendedProperties27.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int45 = extendedProperties42.getInteger("${", (java.lang.Integer) 10);
        extendedProperties42.setInclude("");
        java.util.Vector vector49 = null;
        java.util.Vector vector50 = extendedProperties42.getVector("", vector49);
        java.lang.String str51 = extendedProperties27.interpolateHelper("hi!", (java.util.List) vector50);
        java.util.List list52 = extendedProperties14.getList("/", (java.util.List) vector50);
        java.util.Vector vector53 = extendedProperties0.getVector(",", vector50);
        java.lang.Integer int56 = extendedProperties0.getInteger("hi!", (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties10.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj21 = extendedProperties13.remove((java.lang.Object) '#');
        java.lang.String str22 = extendedProperties13.file;
        extendedProperties10.combine(extendedProperties13);
        java.lang.String str24 = extendedProperties10.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        boolean boolean28 = extendedProperties10.getBoolean("/", false);
        java.lang.String str30 = extendedProperties10.interpolate("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "${" + "'", str30, "${");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.interpolate("}");
        int int14 = extendedProperties9.getInteger("}", (int) (short) 0);
        extendedProperties0.combine(extendedProperties9);
        java.lang.String str17 = extendedProperties0.getString("${");
        int int20 = extendedProperties0.getInt(",", (int) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int24 = extendedProperties21.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short27 = extendedProperties21.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj29 = extendedProperties21.remove((java.lang.Object) '#');
        float float32 = extendedProperties21.getFloat("${", 1.0f);
        java.util.List list34 = extendedProperties21.getList("}");
        java.util.Properties properties36 = extendedProperties21.getProperties("/");
        extendedProperties0.combine(extendedProperties21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int10 = extendedProperties7.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short13 = extendedProperties7.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj15 = extendedProperties7.remove((java.lang.Object) '#');
        float float18 = extendedProperties7.getFloat("${", 1.0f);
        java.util.List list20 = extendedProperties7.getList("}");
        java.lang.String str21 = extendedProperties0.interpolateHelper("${", list20);
        java.lang.String str22 = extendedProperties0.getInclude();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "${" + "'", str21, "${");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties0.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean10 = extendedProperties0.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            byte byte12 = extendedProperties0.getByte("}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '}' doesn't map to a Byte object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) -1);
        java.util.Iterator iterator11 = extendedProperties0.getKeys();
        extendedProperties0.clearProperty("/");
        boolean boolean14 = extendedProperties0.isInitialized;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) -1);
        java.util.Iterator iterator11 = extendedProperties0.getKeys();
        extendedProperties0.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj20 = extendedProperties15.getProperty("${");
        java.util.Iterator iterator21 = extendedProperties15.getKeys();
        java.lang.String str24 = extendedProperties15.getString("}", "}");
        extendedProperties15.display();
        extendedProperties0.setProperty("/", (java.lang.Object) extendedProperties15);
        java.lang.Object obj28 = extendedProperties15.getProperty("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        extendedProperties0.clearProperty("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int11 = extendedProperties8.getInteger("${", (java.lang.Integer) 10);
        extendedProperties8.setInclude("");
        java.util.Vector vector15 = null;
        java.util.Vector vector16 = extendedProperties8.getVector("", vector15);
        java.util.Vector vector17 = extendedProperties0.getVector("hi!", vector15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = extendedProperties0.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertNotNull(vector17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.Integer int11 = extendedProperties0.getInteger("/", (java.lang.Integer) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        extendedProperties12.setInclude("");
        java.lang.String str18 = extendedProperties12.fileSeparator;
        boolean boolean19 = extendedProperties12.isInitialized();
        java.lang.String str20 = extendedProperties12.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        java.lang.String str22 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int27 = extendedProperties24.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short30 = extendedProperties24.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties24.setProperty("}", (java.lang.Object) 0.0d);
        java.lang.String str35 = extendedProperties24.getString("");
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 100 + "'", short30 == (short) 100);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        java.lang.String str20 = extendedProperties0.testBoolean("/");
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int26 = extendedProperties23.getInteger("${", (java.lang.Integer) 10);
        extendedProperties23.setInclude("");
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties23.getVector("", vector30);
        java.lang.String str32 = extendedProperties23.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int36 = extendedProperties33.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short39 = extendedProperties33.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj41 = extendedProperties33.remove((java.lang.Object) '#');
        float float44 = extendedProperties33.getFloat("${", 1.0f);
        boolean boolean45 = extendedProperties33.isInitialized;
        extendedProperties23.putAll((java.util.Map) extendedProperties33);
        extendedProperties0.combine(extendedProperties23);
        extendedProperties23.file = "/";
        java.lang.Byte byte52 = extendedProperties23.getByte("${", (java.lang.Byte) (byte) 100);
        java.lang.String str54 = extendedProperties23.testBoolean(",");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 100 + "'", byte52 == (byte) 100);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.io.OutputStream outputStream11 = null;
        extendedProperties0.save(outputStream11, "");
        java.util.Iterator iterator14 = extendedProperties0.getKeys();
        java.util.Properties properties16 = extendedProperties0.getProperties("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.Float float13 = extendedProperties0.getFloat("/", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        java.lang.Object obj18 = extendedProperties14.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte21 = extendedProperties14.getByte("/", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str25 = extendedProperties23.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int29 = extendedProperties26.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short32 = extendedProperties26.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj34 = extendedProperties26.remove((java.lang.Object) '#');
        java.lang.String str35 = extendedProperties26.file;
        extendedProperties23.combine(extendedProperties26);
        extendedProperties14.addProperty("hi!", (java.lang.Object) extendedProperties23);
        extendedProperties0.combine(extendedProperties14);
        java.lang.Boolean boolean41 = extendedProperties14.getBoolean("${", (java.lang.Boolean) false);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "}" + "'", str25, "}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties0.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean10 = extendedProperties0.isInitialized();
        extendedProperties0.display();
        java.lang.Object obj13 = extendedProperties0.getProperty("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        java.lang.String str16 = extendedProperties0.getString("");
        java.lang.String str18 = extendedProperties0.interpolate("${");
        extendedProperties0.clearProperty("");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer23 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        extendedProperties0.setProperty(",", (java.lang.Object) propertiesTokenizer23);
        java.lang.String str25 = propertiesTokenizer23.nextToken();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "${" + "'", str18, "${");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties3.fileSeparator;
        boolean boolean15 = extendedProperties3.isInitialized();
        java.lang.String str17 = extendedProperties3.testBoolean("hi!");
        java.lang.Double double20 = extendedProperties3.getDouble("hi!", (java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        java.lang.String str10 = extendedProperties0.fileSeparator;
        java.util.List list12 = extendedProperties0.getList("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties(",", "/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        double double29 = extendedProperties10.getDouble("}", (double) 10);
        short short32 = extendedProperties10.getShort("/", (short) (byte) 100);
        boolean boolean33 = extendedProperties10.isInitialized;
        float float36 = extendedProperties10.getFloat(",", (float) (short) 0);
        java.lang.String[] strArray38 = extendedProperties10.getStringArray(",");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties0.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean10 = extendedProperties0.isInitialized();
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("/");
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("${", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        java.lang.String str16 = extendedProperties0.getString("");
        java.lang.String str18 = extendedProperties0.interpolate("${");
        extendedProperties0.clearProperty("");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer23 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        extendedProperties0.setProperty(",", (java.lang.Object) propertiesTokenizer23);
        java.lang.String str27 = extendedProperties0.getString("hi!", "/");
        boolean boolean28 = extendedProperties0.isInitialized;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "${" + "'", str18, "${");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/" + "'", str27, "/");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str13 = extendedProperties0.getString("${", ",");
        java.lang.Double double16 = extendedProperties0.getDouble("hi!", (java.lang.Double) 1.0d);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.interpolate("}");
        int int16 = extendedProperties11.getInteger("}", (int) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        java.lang.Float float20 = extendedProperties11.getFloat(",", (java.lang.Float) (-1.0f));
        java.io.InputStream inputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties11.load(inputStream21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str13 = extendedProperties0.getString("${", ",");
        extendedProperties0.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = extendedProperties0.subset("/");
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNull(extendedProperties17);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        extendedProperties15.setInclude("");
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties15.getVector("", vector22);
        java.util.Vector vector24 = extendedProperties0.getVector("hi!", vector22);
        java.lang.Double double27 = extendedProperties0.getDouble("/", (java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.Class<?> wildcardClass11 = extendedProperties0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        java.lang.String str13 = extendedProperties0.getInclude();
        java.lang.Object obj15 = extendedProperties0.getProperty(",");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str8 = extendedProperties0.interpolate("hi!");
        java.lang.String str10 = extendedProperties0.interpolate("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "${" + "'", str10, "${");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        extendedProperties0.fileSeparator = ",";
        java.lang.String str22 = extendedProperties0.testBoolean("}");
        int int25 = extendedProperties0.getInt("", (int) (short) 100);
        java.util.Properties properties27 = extendedProperties0.getProperties("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str13 = extendedProperties11.interpolate("}");
        int int16 = extendedProperties11.getInteger("}", (int) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream18, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        java.lang.String str12 = extendedProperties0.file;
        boolean boolean13 = extendedProperties0.isInitialized;
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties17 = extendedProperties15.subset("${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(extendedProperties15);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str11 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long14 = extendedProperties0.getLong("hi!", (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: 'hi!' doesn't map to a Long object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str10 = extendedProperties0.getString("hi!");
        float float13 = extendedProperties0.getFloat("}", 10.0f);
        java.lang.Byte byte16 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 10);
        java.lang.String str19 = extendedProperties0.getString("${", "${");
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "${" + "'", str19, "${");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Long long5 = extendedProperties0.getLong(",", (java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int24 = extendedProperties21.getInteger("${", (java.lang.Integer) 10);
        extendedProperties21.setInclude("");
        java.util.Vector vector28 = null;
        java.util.Vector vector29 = extendedProperties21.getVector("", vector28);
        java.util.Vector vector30 = extendedProperties13.getVector("hi!", vector28);
        java.util.Vector vector31 = extendedProperties0.getVector("/", vector28);
        boolean boolean34 = extendedProperties0.getBoolean("", false);
        boolean boolean35 = extendedProperties0.isInitialized();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        java.lang.Object obj18 = extendedProperties14.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte21 = extendedProperties14.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties14.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str25 = extendedProperties14.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int30 = extendedProperties27.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short33 = extendedProperties27.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj35 = extendedProperties27.remove((java.lang.Object) '#');
        extendedProperties27.fileSeparator = "${";
        long long40 = extendedProperties27.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int45 = extendedProperties42.getInteger("${", (java.lang.Integer) 10);
        extendedProperties42.setInclude("");
        java.util.Vector vector49 = null;
        java.util.Vector vector50 = extendedProperties42.getVector("", vector49);
        java.lang.String str51 = extendedProperties27.interpolateHelper("hi!", (java.util.List) vector50);
        java.util.List list52 = extendedProperties14.getList("/", (java.util.List) vector50);
        java.util.Vector vector53 = extendedProperties0.getVector(",", vector50);
        java.lang.Boolean boolean56 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(vector50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(vector53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        short short14 = extendedProperties0.getShort("", (short) (byte) -1);
        extendedProperties0.display();
        java.lang.String str17 = extendedProperties0.testBoolean("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int10 = extendedProperties7.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short13 = extendedProperties7.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj15 = extendedProperties7.remove((java.lang.Object) '#');
        float float18 = extendedProperties7.getFloat("${", 1.0f);
        java.util.List list20 = extendedProperties7.getList("}");
        java.lang.String str21 = extendedProperties0.interpolateHelper("${", list20);
        java.lang.String str24 = extendedProperties0.getString(",", "}");
        short short27 = extendedProperties0.getShort("${", (short) (byte) 100);
        long long30 = extendedProperties0.getLong("", (-1L));
        java.util.ArrayList arrayList31 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "${" + "'", str21, "${");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(arrayList31);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int21 = extendedProperties18.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short24 = extendedProperties18.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj26 = extendedProperties18.remove((java.lang.Object) '#');
        java.lang.String str27 = extendedProperties18.file;
        extendedProperties15.combine(extendedProperties18);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int33 = extendedProperties30.getInteger("${", (java.lang.Integer) 10);
        extendedProperties30.setInclude("");
        java.util.Vector vector37 = null;
        java.util.Vector vector38 = extendedProperties30.getVector("", vector37);
        java.util.Vector vector39 = extendedProperties15.getVector("hi!", vector37);
        java.util.Vector vector40 = extendedProperties0.getVector("/", vector39);
        java.lang.String str41 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        java.lang.String str12 = extendedProperties0.file;
        java.lang.String str13 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/" + "'", str13, "/");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        extendedProperties10.setInclude("");
        java.io.InputStream inputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties10.load(inputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        java.lang.String str10 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("hi!");
        extendedProperties0.setInclude("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(extendedProperties5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean(",", (java.lang.Boolean) true);
        long long13 = extendedProperties0.getLong(",", 10L);
        java.io.OutputStream outputStream14 = null;
        extendedProperties0.save(outputStream14, "}");
        byte byte19 = extendedProperties0.getByte("", (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.String str5 = extendedProperties0.interpolate("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("}", (java.lang.Short) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int11 = extendedProperties8.getInteger("${", (java.lang.Integer) 10);
        extendedProperties8.setInclude("");
        java.util.Vector vector15 = null;
        java.util.Vector vector16 = extendedProperties8.getVector("", vector15);
        java.util.Vector vector17 = extendedProperties0.getVector("hi!", vector15);
        java.lang.Long long20 = extendedProperties0.getLong("hi!", (java.lang.Long) 10L);
        int int23 = extendedProperties0.getInt("", (int) ' ');
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = extendedProperties25.subset("${");
        long long30 = extendedProperties25.getLong("/", (long) (byte) 0);
        extendedProperties25.addProperty("${", (java.lang.Object) "}");
        java.lang.Boolean boolean36 = extendedProperties25.getBoolean("${", (java.lang.Boolean) true);
        java.lang.Object obj37 = extendedProperties0.put((java.lang.Object) (-1.0f), (java.lang.Object) boolean36);
        java.lang.Short short40 = extendedProperties0.getShort(",", (java.lang.Short) (short) 1);
        java.lang.String str42 = extendedProperties0.interpolate("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 1 + "'", short40 == (short) 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "}" + "'", str42, "}");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.util.Iterator iterator22 = extendedProperties3.getKeys();
        extendedProperties3.basePath = "hi!";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.interpolate("}");
        int int14 = extendedProperties9.getInteger("}", (int) (short) 0);
        extendedProperties0.combine(extendedProperties9);
        java.lang.String str17 = extendedProperties0.getString("${");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedProperties0.getInt(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.Double double16 = extendedProperties3.getDouble("", (java.lang.Double) (-1.0d));
        java.lang.String[] strArray18 = extendedProperties3.getStringArray("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Vector vector10 = extendedProperties0.getVector("/");
        extendedProperties0.basePath = "/";
        java.lang.String[] strArray14 = extendedProperties0.getStringArray("/");
        boolean boolean15 = extendedProperties0.isInitialized;
        byte byte18 = extendedProperties0.getByte("", (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        extendedProperties0.basePath = "}";
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(extendedProperties7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        boolean boolean13 = extendedProperties0.isInitialized;
        double double16 = extendedProperties0.getDouble("}", (double) (short) 1);
        boolean boolean17 = extendedProperties0.isInitialized;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        short short14 = extendedProperties0.getShort(",", (short) 0);
        short short17 = extendedProperties0.getShort("${", (short) 1);
        extendedProperties0.setProperty("${", (java.lang.Object) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int24 = extendedProperties21.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj26 = extendedProperties21.getProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int31 = extendedProperties28.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short34 = extendedProperties28.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj36 = extendedProperties28.remove((java.lang.Object) '#');
        float float39 = extendedProperties28.getFloat("${", 1.0f);
        java.util.List list41 = extendedProperties28.getList("}");
        java.lang.String str42 = extendedProperties21.interpolateHelper("${", list41);
        extendedProperties0.combine(extendedProperties21);
        java.lang.String[] strArray45 = extendedProperties0.getStringArray("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "${" + "'", str42, "${");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        double double29 = extendedProperties10.getDouble("}", (double) 10);
        java.util.List list31 = extendedProperties10.getList("${");
        java.lang.Object obj33 = extendedProperties10.getProperty("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj18 = extendedProperties13.getProperty("${");
        java.lang.Long long21 = extendedProperties13.getLong("/", (java.lang.Long) 10L);
        java.lang.String str22 = extendedProperties13.getInclude();
        java.util.List list24 = null;
        java.util.List list25 = extendedProperties13.getList("/", list24);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int29 = extendedProperties26.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short32 = extendedProperties26.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj34 = extendedProperties26.remove((java.lang.Object) '#');
        extendedProperties26.fileSeparator = "${";
        float float39 = extendedProperties26.getFloat("", (float) (byte) -1);
        java.lang.Class<?> wildcardClass40 = extendedProperties26.getClass();
        java.lang.Object obj41 = extendedProperties0.put((java.lang.Object) list24, (java.lang.Object) wildcardClass40);
        // The following exception was thrown during execution in test generation
        try {
            byte byte43 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        short short14 = extendedProperties0.getShort(",", (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        double double11 = extendedProperties0.getDouble("${", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj18 = extendedProperties13.getProperty("${");
        java.lang.Long long21 = extendedProperties13.getLong("/", (java.lang.Long) 10L);
        java.lang.String str22 = extendedProperties13.getInclude();
        java.lang.Short short25 = extendedProperties13.getShort("", (java.lang.Short) (short) 0);
        java.util.Vector vector27 = extendedProperties13.getVector("}");
        extendedProperties0.addProperty("", (java.lang.Object) "}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertNotNull(vector27);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str3 = propertiesTokenizer1.nextToken(",");
        java.lang.String str5 = propertiesTokenizer1.nextToken("");
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        java.lang.Object obj7 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        java.lang.String str20 = extendedProperties0.testBoolean("/");
        extendedProperties0.setInclude("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int26 = extendedProperties23.getInteger("${", (java.lang.Integer) 10);
        extendedProperties23.setInclude("");
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties23.getVector("", vector30);
        java.lang.String str32 = extendedProperties23.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int36 = extendedProperties33.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short39 = extendedProperties33.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj41 = extendedProperties33.remove((java.lang.Object) '#');
        float float44 = extendedProperties33.getFloat("${", 1.0f);
        boolean boolean45 = extendedProperties33.isInitialized;
        extendedProperties23.putAll((java.util.Map) extendedProperties33);
        extendedProperties0.combine(extendedProperties23);
        java.util.ArrayList arrayList48 = null;
        extendedProperties0.keysAsListed = arrayList48;
        java.lang.String str50 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/" + "'", str50, "/");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        int int3 = propertiesTokenizer1.countTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        extendedProperties0.display();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short14 = extendedProperties0.getShort("${", (java.lang.Short) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.file;
        java.lang.String str23 = extendedProperties3.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int28 = extendedProperties25.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short31 = extendedProperties25.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties25.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean35 = extendedProperties25.isInitialized();
        extendedProperties3.setProperty("", (java.lang.Object) boolean35);
        // The following exception was thrown during execution in test generation
        try {
            float float38 = extendedProperties3.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a Float object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        java.util.List list13 = extendedProperties0.getList("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int17 = extendedProperties14.getInteger("${", (java.lang.Integer) 10);
        extendedProperties14.setInclude("");
        java.util.Vector vector21 = null;
        java.util.Vector vector22 = extendedProperties14.getVector("", vector21);
        java.lang.String str23 = extendedProperties14.file;
        boolean boolean24 = extendedProperties14.isInitialized();
        java.lang.Object obj25 = extendedProperties0.remove((java.lang.Object) boolean24);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("/", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        java.util.List list13 = extendedProperties0.getList("}");
        java.util.Properties properties15 = extendedProperties0.getProperties("/");
        short short18 = extendedProperties0.getShort("", (short) (byte) 100);
        extendedProperties0.setInclude("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = extendedProperties0.subset("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertNull(extendedProperties22);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        boolean boolean12 = extendedProperties0.isInitialized;
        java.lang.Byte byte15 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) 10);
        extendedProperties0.fileSeparator = "}";
        java.lang.Byte byte20 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int9 = extendedProperties6.getInteger("${", (java.lang.Integer) 10);
        long long12 = extendedProperties6.getLong("/", (long) (short) 100);
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.io.OutputStream outputStream14 = null;
        extendedProperties0.save(outputStream14, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties10.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj21 = extendedProperties13.remove((java.lang.Object) '#');
        java.lang.String str22 = extendedProperties13.file;
        extendedProperties10.combine(extendedProperties13);
        java.lang.String str24 = extendedProperties10.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        double double28 = extendedProperties10.getDouble("}", (double) (short) 100);
        extendedProperties10.file = "}";
        java.lang.String str31 = extendedProperties10.getInclude();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int10 = extendedProperties7.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short13 = extendedProperties7.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj15 = extendedProperties7.remove((java.lang.Object) '#');
        float float18 = extendedProperties7.getFloat("${", 1.0f);
        java.util.List list20 = extendedProperties7.getList("}");
        java.lang.String str21 = extendedProperties0.interpolateHelper("${", list20);
        java.lang.String str24 = extendedProperties0.getString(",", "}");
        short short27 = extendedProperties0.getShort("${", (short) (byte) 100);
        java.util.Iterator iterator28 = extendedProperties0.getKeys();
        long long31 = extendedProperties0.getLong("/", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "${" + "'", str21, "${");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.util.ArrayList arrayList4 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        java.lang.String str26 = extendedProperties17.file;
        extendedProperties14.combine(extendedProperties17);
        java.lang.String str28 = extendedProperties14.fileSeparator;
        java.util.Properties properties30 = extendedProperties14.getProperties("hi!");
        java.util.Properties properties31 = extendedProperties0.getProperties("${", properties30);
        java.lang.String str33 = extendedProperties0.interpolate("hi!");
        extendedProperties0.display();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Boolean boolean11 = extendedProperties0.getBoolean("${", (java.lang.Boolean) true);
        extendedProperties0.basePath = "${";
        java.util.ArrayList arrayList14 = extendedProperties0.keysAsListed;
        java.lang.String str15 = extendedProperties0.file;
        java.util.Properties properties17 = extendedProperties0.getProperties(",");
        extendedProperties0.setInclude("");
        extendedProperties0.setInclude(",");
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        boolean boolean12 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int13 = extendedProperties10.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short16 = extendedProperties10.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj18 = extendedProperties10.remove((java.lang.Object) '#');
        float float21 = extendedProperties10.getFloat("${", 1.0f);
        boolean boolean22 = extendedProperties10.isInitialized;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        byte byte26 = extendedProperties10.getByte("hi!", (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float28 = extendedProperties10.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str13 = extendedProperties0.getString("${", ",");
        java.lang.String str16 = extendedProperties0.getString(",", "hi!");
        boolean boolean17 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedProperties0.getInteger("${", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.Double double16 = extendedProperties0.getDouble(",", (java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        short short14 = extendedProperties0.getShort("", (short) (byte) -1);
        byte byte17 = extendedProperties0.getByte("", (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties10.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj21 = extendedProperties13.remove((java.lang.Object) '#');
        java.lang.String str22 = extendedProperties13.file;
        extendedProperties10.combine(extendedProperties13);
        java.lang.String str24 = extendedProperties10.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        double double28 = extendedProperties10.getDouble("}", (double) (short) 100);
        extendedProperties10.file = "}";
        java.util.Iterator iterator31 = extendedProperties10.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.basePath;
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream10, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Double double10 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = extendedProperties11.subset("${");
        long long16 = extendedProperties11.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        extendedProperties17.fileSeparator = "${";
        java.lang.String str28 = extendedProperties17.fileSeparator;
        java.util.ArrayList arrayList29 = extendedProperties17.keysAsListed;
        extendedProperties11.keysAsListed = arrayList29;
        extendedProperties0.putAll((java.util.Map) extendedProperties11);
        java.lang.Boolean boolean34 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "${" + "'", str28, "${");
        org.junit.Assert.assertNotNull(arrayList29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int7 = extendedProperties4.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short10 = extendedProperties4.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj12 = extendedProperties4.remove((java.lang.Object) '#');
        extendedProperties4.fileSeparator = "${";
        java.lang.String str15 = extendedProperties4.fileSeparator;
        java.util.ArrayList arrayList16 = extendedProperties4.keysAsListed;
        extendedProperties0.keysAsListed = arrayList16;
        short short20 = extendedProperties0.getShort("${", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "${" + "'", str15, "${");
        org.junit.Assert.assertNotNull(arrayList16);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.Float float13 = extendedProperties0.getFloat("/", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        java.lang.Object obj18 = extendedProperties14.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte21 = extendedProperties14.getByte("/", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str25 = extendedProperties23.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int29 = extendedProperties26.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short32 = extendedProperties26.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj34 = extendedProperties26.remove((java.lang.Object) '#');
        java.lang.String str35 = extendedProperties26.file;
        extendedProperties23.combine(extendedProperties26);
        extendedProperties14.addProperty("hi!", (java.lang.Object) extendedProperties23);
        extendedProperties0.combine(extendedProperties14);
        java.lang.String str41 = extendedProperties14.getString("}", "");
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "}" + "'", str25, "}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str8 = extendedProperties0.interpolate("hi!");
        double double11 = extendedProperties0.getDouble("${", (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedProperties0.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        java.lang.String str13 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        boolean boolean14 = extendedProperties0.getBoolean("/", true);
        java.lang.String str16 = extendedProperties0.testBoolean("");
        java.lang.Double double19 = extendedProperties0.getDouble("}", (java.lang.Double) 1.0d);
        java.lang.String[] strArray21 = extendedProperties0.getStringArray("");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        short short14 = extendedProperties0.getShort(",", (short) 0);
        extendedProperties0.file = "${";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Double double10 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        extendedProperties12.setInclude("");
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties12.getVector("", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector("${", vector19);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int25 = extendedProperties22.getInteger("${", (java.lang.Integer) 10);
        extendedProperties22.setInclude("");
        java.lang.String str28 = extendedProperties22.fileSeparator;
        boolean boolean29 = extendedProperties22.isInitialized();
        extendedProperties0.putAll((java.util.Map) extendedProperties22);
        float float33 = extendedProperties22.getFloat("${", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int10 = extendedProperties7.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short13 = extendedProperties7.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj15 = extendedProperties7.remove((java.lang.Object) '#');
        float float18 = extendedProperties7.getFloat("${", 1.0f);
        java.util.List list20 = extendedProperties7.getList("}");
        java.lang.String str21 = extendedProperties0.interpolateHelper("${", list20);
        java.lang.String str24 = extendedProperties0.getString(",", "}");
        short short27 = extendedProperties0.getShort("${", (short) (byte) 100);
        long long30 = extendedProperties0.getLong("", (-1L));
        java.lang.String str31 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int35 = extendedProperties32.getInteger("${", (java.lang.Integer) 10);
        extendedProperties32.setInclude("");
        java.lang.String str38 = extendedProperties32.fileSeparator;
        java.lang.Boolean boolean41 = extendedProperties32.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray43 = extendedProperties32.getStringArray("hi!");
        short short46 = extendedProperties32.getShort(",", (short) 0);
        short short49 = extendedProperties32.getShort("${", (short) 1);
        extendedProperties32.setProperty("${", (java.lang.Object) (byte) 1);
        extendedProperties0.putAll((java.util.Map) extendedProperties32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "${" + "'", str21, "${");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/" + "'", str38, "/");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 0 + "'", short46 == (short) 0);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 1 + "'", short49 == (short) 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        java.lang.String str16 = extendedProperties0.getString("");
        // The following exception was thrown during execution in test generation
        try {
            byte byte18 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        long long13 = extendedProperties0.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        extendedProperties15.setInclude("");
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties15.getVector("", vector22);
        java.lang.String str24 = extendedProperties0.interpolateHelper("hi!", (java.util.List) vector23);
        java.util.Iterator iterator26 = extendedProperties0.getKeys("/");
        java.io.OutputStream outputStream27 = null;
        extendedProperties0.save(outputStream27, "/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        long long13 = extendedProperties0.getLong("/", (long) (short) 0);
        int int16 = extendedProperties0.getInteger("/", (int) (byte) 10);
        java.lang.Byte byte19 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        java.util.Iterator iterator13 = extendedProperties0.getKeys();
        int int16 = extendedProperties0.getInt("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.file;
        java.lang.String str24 = extendedProperties3.testBoolean(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str28 = extendedProperties26.interpolate("}");
        java.lang.Object obj30 = extendedProperties26.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte33 = extendedProperties26.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties26.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray38 = extendedProperties26.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str42 = extendedProperties40.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int46 = extendedProperties43.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short49 = extendedProperties43.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj51 = extendedProperties43.remove((java.lang.Object) '#');
        java.lang.String str52 = extendedProperties43.file;
        extendedProperties40.combine(extendedProperties43);
        java.lang.String str54 = extendedProperties40.fileSeparator;
        java.util.Properties properties56 = extendedProperties40.getProperties("hi!");
        java.util.Properties properties57 = extendedProperties26.getProperties("${", properties56);
        java.util.Properties properties58 = extendedProperties3.getProperties("}", properties57);
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "}" + "'", str28, "}");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "}" + "'", str42, "}");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/" + "'", str54, "/");
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNotNull(extendedProperties59);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", "${");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Vector vector10 = extendedProperties0.getVector("/");
        extendedProperties0.basePath = "/";
        java.lang.String[] strArray14 = extendedProperties0.getStringArray("${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        java.lang.Double double15 = extendedProperties0.getDouble("/", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties16.subset("${");
        long long21 = extendedProperties16.getLong("/", (long) (byte) 0);
        extendedProperties16.addProperty("${", (java.lang.Object) "}");
        java.lang.Boolean boolean27 = extendedProperties16.getBoolean("${", (java.lang.Boolean) true);
        extendedProperties16.basePath = "${";
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer31 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str33 = propertiesTokenizer31.nextToken(",");
        java.lang.Object obj34 = extendedProperties0.put((java.lang.Object) extendedProperties16, (java.lang.Object) str33);
        byte byte37 = extendedProperties16.getByte("", (byte) 1);
        boolean boolean40 = extendedProperties16.getBoolean("/", false);
        java.lang.Object obj42 = extendedProperties16.remove((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(extendedProperties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 1 + "'", byte37 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.util.ArrayList arrayList8 = extendedProperties0.keysAsListed;
        float float11 = extendedProperties0.getFloat("/", (float) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        boolean boolean9 = extendedProperties0.isInitialized();
        java.lang.String str10 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Double double10 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        extendedProperties12.setInclude("");
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties12.getVector("", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector("${", vector19);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int25 = extendedProperties22.getInteger("${", (java.lang.Integer) 10);
        extendedProperties22.setInclude("");
        java.lang.String str28 = extendedProperties22.fileSeparator;
        boolean boolean29 = extendedProperties22.isInitialized();
        extendedProperties0.putAll((java.util.Map) extendedProperties22);
        java.lang.String str32 = extendedProperties22.interpolate("${");
        java.lang.Long long35 = extendedProperties22.getLong(",", (java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = extendedProperties22.getBoolean("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "${" + "'", str32, "${");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.String str7 = extendedProperties0.testBoolean("");
        extendedProperties0.fileSeparator = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = extendedProperties11.subset("${");
        long long16 = extendedProperties11.getLong("/", (long) (byte) 0);
        extendedProperties11.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object obj21 = extendedProperties11.remove(obj20);
        java.lang.String str24 = extendedProperties11.getString("${", ",");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int29 = extendedProperties26.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj31 = extendedProperties26.getProperty("${");
        java.util.Iterator iterator32 = extendedProperties26.getKeys();
        extendedProperties11.addProperty("/", (java.lang.Object) iterator32);
        extendedProperties0.addProperty("${", (java.lang.Object) "/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(extendedProperties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.lang.Long long14 = extendedProperties0.getLong("}", (java.lang.Long) 100L);
        extendedProperties0.setInclude(",");
        java.lang.String str18 = extendedProperties0.testBoolean(",");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.Double double7 = extendedProperties0.getDouble("}", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short18 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj20 = extendedProperties12.remove((java.lang.Object) '#');
        java.lang.String str21 = extendedProperties12.file;
        extendedProperties9.combine(extendedProperties12);
        java.lang.String str23 = extendedProperties9.fileSeparator;
        java.util.Properties properties25 = extendedProperties9.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties25);
        java.util.Properties properties27 = extendedProperties0.getProperties("", properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties25);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(extendedProperties26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(extendedProperties28);
        org.junit.Assert.assertNotNull(extendedProperties29);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        boolean boolean14 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        extendedProperties15.setInclude("");
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties15.getVector("", vector22);
        java.lang.String str24 = extendedProperties15.file;
        boolean boolean25 = extendedProperties15.isInitialized();
        extendedProperties0.combine(extendedProperties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int30 = extendedProperties27.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short33 = extendedProperties27.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties27.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean37 = extendedProperties27.isInitialized();
        extendedProperties15.combine(extendedProperties27);
        extendedProperties27.basePath = "/";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        java.lang.Integer int15 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = extendedProperties0.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        boolean boolean9 = extendedProperties0.isInitialized();
        double double12 = extendedProperties0.getDouble("${", (double) '4');
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties0.subset("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int19 = extendedProperties16.getInteger("${", (java.lang.Integer) 10);
        extendedProperties16.setInclude("");
        java.util.Vector vector23 = null;
        java.util.Vector vector24 = extendedProperties16.getVector("", vector23);
        java.lang.String str25 = extendedProperties16.file;
        int int28 = extendedProperties16.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean31 = extendedProperties16.getBoolean("}", (java.lang.Boolean) false);
        float float34 = extendedProperties16.getFloat("", (-1.0f));
        extendedProperties16.fileSeparator = ",";
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str40 = extendedProperties38.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int44 = extendedProperties41.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short47 = extendedProperties41.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj49 = extendedProperties41.remove((java.lang.Object) '#');
        java.lang.String str50 = extendedProperties41.file;
        extendedProperties38.combine(extendedProperties41);
        java.lang.String str52 = extendedProperties38.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int57 = extendedProperties54.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short60 = extendedProperties54.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj62 = extendedProperties54.remove((java.lang.Object) '#');
        java.util.Vector vector64 = extendedProperties54.getVector("/");
        java.util.Vector vector65 = extendedProperties38.getVector("${", vector64);
        java.util.List list66 = extendedProperties16.getList("", (java.util.List) vector65);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list67 = extendedProperties14.getList("", list66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "}" + "'", str40, "}");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 100 + "'", short47 == (short) 100);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(vector64);
        org.junit.Assert.assertNotNull(vector65);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        extendedProperties15.setInclude("");
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties15.getVector("", vector22);
        java.util.Vector vector24 = extendedProperties0.getVector("hi!", vector22);
        extendedProperties0.isInitialized = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertNotNull(vector24);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        boolean boolean6 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "${" + "'", str4, "${");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        java.util.Iterator iterator13 = extendedProperties0.getKeys();
        java.lang.Long long16 = extendedProperties0.getLong("${", (java.lang.Long) 10L);
        java.lang.String str17 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        long long14 = extendedProperties0.getLong("", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.String str8 = extendedProperties0.basePath;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        int int3 = extendedProperties0.getInt("}", (int) (byte) 0);
        java.util.List list5 = extendedProperties0.getList("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        java.lang.String str12 = extendedProperties0.file;
        boolean boolean13 = extendedProperties0.isInitialized;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        boolean boolean13 = extendedProperties0.isInitialized;
        java.io.OutputStream outputStream14 = null;
        extendedProperties0.save(outputStream14, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        int int3 = propertiesTokenizer1.countTokens();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Vector vector10 = extendedProperties0.getVector("/");
        extendedProperties0.basePath = "/";
        java.lang.String[] strArray14 = extendedProperties0.getStringArray("/");
        java.lang.Integer int17 = extendedProperties0.getInteger("hi!", (java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int10 = extendedProperties7.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short13 = extendedProperties7.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj15 = extendedProperties7.remove((java.lang.Object) '#');
        float float18 = extendedProperties7.getFloat("${", 1.0f);
        java.util.List list20 = extendedProperties7.getList("}");
        java.lang.String str21 = extendedProperties0.interpolateHelper("${", list20);
        java.lang.String str24 = extendedProperties0.getString(",", "}");
        java.lang.String str27 = extendedProperties0.getString(",", "${");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "${" + "'", str21, "${");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "${" + "'", str27, "${");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        long long15 = extendedProperties0.getLong("", 100L);
        float float18 = extendedProperties0.getFloat("}", 100.0f);
        java.lang.Float float21 = extendedProperties0.getFloat("hi!", (java.lang.Float) (-1.0f));
        int int24 = extendedProperties0.getInteger(",", (int) (byte) -1);
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        java.lang.Double double15 = extendedProperties0.getDouble("/", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties16.subset("${");
        long long21 = extendedProperties16.getLong("/", (long) (byte) 0);
        extendedProperties16.addProperty("${", (java.lang.Object) "}");
        java.lang.Boolean boolean27 = extendedProperties16.getBoolean("${", (java.lang.Boolean) true);
        extendedProperties16.basePath = "${";
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer31 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str33 = propertiesTokenizer31.nextToken(",");
        java.lang.Object obj34 = extendedProperties0.put((java.lang.Object) extendedProperties16, (java.lang.Object) str33);
        java.lang.Object obj36 = extendedProperties16.getProperty("");
        java.lang.Integer int39 = extendedProperties16.getInteger("hi!", (java.lang.Integer) 10);
        java.lang.Double double42 = extendedProperties16.getDouble("", (java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(extendedProperties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("${");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        extendedProperties0.display();
        int int13 = extendedProperties0.getInteger("/", (int) ' ');
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken("/");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) -1);
        java.util.Iterator iterator11 = extendedProperties0.getKeys();
        extendedProperties0.clearProperty("/");
        java.lang.Byte byte16 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        java.lang.String str10 = extendedProperties0.fileSeparator;
        java.lang.Byte byte13 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = extendedProperties0.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties15.basePath = "/";
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertNull(extendedProperties15);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.String str2 = propertiesTokenizer1.nextToken();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str5 = propertiesTokenizer1.nextToken("${");
        java.lang.Object obj6 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/" + "'", str2, "/");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        float float14 = extendedProperties0.getFloat("}", (float) (short) 0);
        java.io.OutputStream outputStream15 = null;
        extendedProperties0.save(outputStream15, "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int22 = extendedProperties19.getInteger("${", (java.lang.Integer) 10);
        extendedProperties19.setInclude("");
        java.util.Vector vector26 = null;
        java.util.Vector vector27 = extendedProperties19.getVector("", vector26);
        java.lang.String str28 = extendedProperties19.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int32 = extendedProperties29.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short35 = extendedProperties29.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj37 = extendedProperties29.remove((java.lang.Object) '#');
        float float40 = extendedProperties29.getFloat("${", 1.0f);
        boolean boolean41 = extendedProperties29.isInitialized;
        extendedProperties19.putAll((java.util.Map) extendedProperties29);
        byte byte45 = extendedProperties29.getByte("hi!", (byte) 10);
        double double48 = extendedProperties29.getDouble("}", (double) 10);
        java.util.List list50 = extendedProperties29.getList("${");
        java.util.List list51 = extendedProperties0.getList("${", list50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 10 + "'", byte45 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.Boolean boolean11 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        boolean boolean14 = extendedProperties0.getBoolean("hi!", false);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int19 = extendedProperties16.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short22 = extendedProperties16.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj24 = extendedProperties16.remove((java.lang.Object) '#');
        extendedProperties16.fileSeparator = "${";
        java.lang.String str27 = extendedProperties16.fileSeparator;
        java.util.Vector vector29 = extendedProperties16.getVector("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str33 = extendedProperties31.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int37 = extendedProperties34.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short40 = extendedProperties34.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj42 = extendedProperties34.remove((java.lang.Object) '#');
        java.lang.String str43 = extendedProperties34.file;
        extendedProperties31.combine(extendedProperties34);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int49 = extendedProperties46.getInteger("${", (java.lang.Integer) 10);
        extendedProperties46.setInclude("");
        java.util.Vector vector53 = null;
        java.util.Vector vector54 = extendedProperties46.getVector("", vector53);
        java.util.Vector vector55 = extendedProperties31.getVector("hi!", vector53);
        java.util.Vector vector56 = extendedProperties16.getVector("/", vector55);
        java.util.Vector vector57 = extendedProperties0.getVector(",", vector55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 100 + "'", short22 == (short) 100);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "${" + "'", str27, "${");
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "}" + "'", str33, "}");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 100 + "'", short40 == (short) 100);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertNotNull(vector57);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.util.Iterator iterator22 = extendedProperties3.getKeys();
        java.lang.String str24 = extendedProperties3.interpolate("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        int int28 = extendedProperties25.getInt("}", (int) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int32 = extendedProperties29.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short35 = extendedProperties29.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj37 = extendedProperties29.remove((java.lang.Object) '#');
        extendedProperties29.fileSeparator = "${";
        java.lang.String str40 = extendedProperties29.fileSeparator;
        java.util.ArrayList arrayList41 = extendedProperties29.keysAsListed;
        extendedProperties25.keysAsListed = arrayList41;
        extendedProperties3.keysAsListed = arrayList41;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "${" + "'", str40, "${");
        org.junit.Assert.assertNotNull(arrayList41);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int21 = extendedProperties18.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short24 = extendedProperties18.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj26 = extendedProperties18.remove((java.lang.Object) '#');
        java.lang.String str27 = extendedProperties18.file;
        extendedProperties15.combine(extendedProperties18);
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int33 = extendedProperties30.getInteger("${", (java.lang.Integer) 10);
        extendedProperties30.setInclude("");
        java.util.Vector vector37 = null;
        java.util.Vector vector38 = extendedProperties30.getVector("", vector37);
        java.util.Vector vector39 = extendedProperties15.getVector("hi!", vector37);
        java.util.Vector vector40 = extendedProperties0.getVector("/", vector39);
        java.lang.String str42 = extendedProperties0.testBoolean("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        extendedProperties0.setProperty("}", (java.lang.Object) 0.0d);
        boolean boolean10 = extendedProperties0.isInitialized();
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("/");
        java.lang.String str13 = extendedProperties0.basePath;
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream14, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.util.Iterator iterator6 = extendedProperties0.getKeys();
        java.lang.String str9 = extendedProperties0.getString("}", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str12 = extendedProperties10.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short19 = extendedProperties13.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj21 = extendedProperties13.remove((java.lang.Object) '#');
        java.lang.String str22 = extendedProperties13.file;
        extendedProperties10.combine(extendedProperties13);
        java.lang.String str24 = extendedProperties10.fileSeparator;
        extendedProperties0.putAll((java.util.Map) extendedProperties10);
        boolean boolean26 = extendedProperties10.isInitialized;
        int int29 = extendedProperties10.getInteger("/", (int) (byte) 100);
        java.io.InputStream inputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties10.load(inputStream30, "${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Long long3 = extendedProperties0.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int8 = extendedProperties5.getInteger("${", (java.lang.Integer) 10);
        extendedProperties5.setInclude("");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties5.getVector("", vector12);
        java.lang.String str14 = extendedProperties5.basePath;
        java.util.Iterator iterator15 = extendedProperties5.getKeys();
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties5);
        int int19 = extendedProperties5.getInt("${", 32);
        java.io.OutputStream outputStream20 = null;
        extendedProperties5.save(outputStream20, "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.basePath;
        boolean boolean17 = extendedProperties0.getBoolean("/", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        extendedProperties0.fileSeparator = ",";
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str24 = extendedProperties22.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int28 = extendedProperties25.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short31 = extendedProperties25.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj33 = extendedProperties25.remove((java.lang.Object) '#');
        java.lang.String str34 = extendedProperties25.file;
        extendedProperties22.combine(extendedProperties25);
        java.lang.String str36 = extendedProperties22.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int41 = extendedProperties38.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short44 = extendedProperties38.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj46 = extendedProperties38.remove((java.lang.Object) '#');
        java.util.Vector vector48 = extendedProperties38.getVector("/");
        java.util.Vector vector49 = extendedProperties22.getVector("${", vector48);
        java.util.List list50 = extendedProperties0.getList("", (java.util.List) vector49);
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int54 = extendedProperties51.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short57 = extendedProperties51.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str58 = extendedProperties51.getInclude();
        java.util.ArrayList arrayList59 = extendedProperties51.keysAsListed;
        extendedProperties0.keysAsListed = arrayList59;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 100 + "'", short44 == (short) 100);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertNotNull(vector49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 100 + "'", short57 == (short) 100);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(arrayList59);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.util.Vector vector10 = extendedProperties0.getVector("/");
        extendedProperties0.basePath = "/";
        java.lang.String[] strArray14 = extendedProperties0.getStringArray("/");
        java.util.Properties properties16 = extendedProperties0.getProperties("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties0.subset("/");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(extendedProperties18);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        int int5 = propertiesTokenizer1.countTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        java.lang.String str14 = extendedProperties0.fileSeparator;
        java.lang.String str16 = extendedProperties0.getString("");
        java.lang.String str18 = extendedProperties0.interpolate("${");
        extendedProperties0.clearProperty("");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer23 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        extendedProperties0.setProperty(",", (java.lang.Object) propertiesTokenizer23);
        java.lang.Object obj25 = propertiesTokenizer23.nextElement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "${" + "'", str18, "${");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "/" + "'", obj25, "/");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str7 = extendedProperties0.getInclude();
        java.lang.Short short10 = extendedProperties0.getShort("/", (java.lang.Short) (short) -1);
        java.util.Iterator iterator11 = extendedProperties0.getKeys();
        extendedProperties0.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj20 = extendedProperties15.getProperty("${");
        java.util.Iterator iterator21 = extendedProperties15.getKeys();
        java.lang.String str24 = extendedProperties15.getString("}", "}");
        extendedProperties15.display();
        extendedProperties0.setProperty("/", (java.lang.Object) extendedProperties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int31 = extendedProperties28.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short34 = extendedProperties28.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.String str36 = extendedProperties28.interpolate("hi!");
        double double39 = extendedProperties28.getDouble("${", (double) (byte) 0);
        extendedProperties0.setProperty("${", (java.lang.Object) extendedProperties28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        extendedProperties0.basePath = "/";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        float float11 = extendedProperties0.getFloat("${", 1.0f);
        extendedProperties0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = extendedProperties23.subset("${");
        long long28 = extendedProperties23.getLong("/", (long) (byte) 0);
        extendedProperties23.addProperty("${", (java.lang.Object) "}");
        java.lang.Boolean boolean34 = extendedProperties23.getBoolean("${", (java.lang.Boolean) true);
        extendedProperties23.basePath = "${";
        java.util.ArrayList arrayList37 = extendedProperties23.keysAsListed;
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int42 = extendedProperties39.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short45 = extendedProperties39.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj47 = extendedProperties39.remove((java.lang.Object) '#');
        extendedProperties39.fileSeparator = "${";
        java.lang.String str50 = extendedProperties39.fileSeparator;
        java.lang.Long long53 = extendedProperties39.getLong("}", (java.lang.Long) 100L);
        extendedProperties39.setInclude(",");
        java.lang.String str56 = extendedProperties39.getInclude();
        extendedProperties23.setProperty("/", (java.lang.Object) str56);
        java.lang.Object obj58 = extendedProperties3.remove((java.lang.Object) str56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(extendedProperties25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 100 + "'", short45 == (short) 100);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "${" + "'", str50, "${");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "," + "'", str56, ",");
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        byte byte11 = extendedProperties0.getByte("", (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short18 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj20 = extendedProperties12.remove((java.lang.Object) '#');
        java.util.Vector vector22 = extendedProperties12.getVector("/");
        extendedProperties12.basePath = "/";
        java.lang.String[] strArray26 = extendedProperties12.getStringArray("/");
        extendedProperties0.putAll((java.util.Map) extendedProperties12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        int int2 = propertiesTokenizer1.countTokens();
        int int3 = propertiesTokenizer1.countTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        int int6 = propertiesTokenizer1.countTokens();
        java.lang.String str8 = propertiesTokenizer1.nextToken("${");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "${" + "'", str4, "${");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("hi!");
        java.lang.String str8 = extendedProperties0.getString("", "");
        int int11 = extendedProperties0.getInteger("hi!", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.basePath = "/";
        short short14 = extendedProperties0.getShort("", (short) (byte) -1);
        java.util.Iterator iterator16 = extendedProperties0.getKeys("}");
        java.lang.Integer int19 = extendedProperties0.getInteger("", (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int17 = extendedProperties14.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short20 = extendedProperties14.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj22 = extendedProperties14.remove((java.lang.Object) '#');
        java.lang.String str23 = extendedProperties14.file;
        extendedProperties14.basePath = "/";
        java.lang.Short short28 = extendedProperties14.getShort("hi!", (java.lang.Short) (short) 10);
        extendedProperties3.putAll((java.util.Map) extendedProperties14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 10 + "'", short28 == (short) 10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        extendedProperties0.addProperty("${", (java.lang.Object) "}");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = extendedProperties0.remove(obj9);
        java.lang.String str12 = extendedProperties0.testBoolean("");
        long long15 = extendedProperties0.getLong("", 100L);
        java.util.Iterator iterator16 = extendedProperties0.getKeys();
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Long long3 = extendedProperties0.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int8 = extendedProperties5.getInteger("${", (java.lang.Integer) 10);
        extendedProperties5.setInclude("");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties5.getVector("", vector12);
        java.lang.String str14 = extendedProperties5.basePath;
        java.util.Iterator iterator15 = extendedProperties5.getKeys();
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties5);
        extendedProperties5.clearProperty("${");
        extendedProperties5.file = ",";
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str11 = extendedProperties9.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int15 = extendedProperties12.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short18 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj20 = extendedProperties12.remove((java.lang.Object) '#');
        java.lang.String str21 = extendedProperties12.file;
        extendedProperties9.combine(extendedProperties12);
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties9);
        java.util.Iterator iterator24 = extendedProperties9.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int28 = extendedProperties25.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj30 = extendedProperties25.getProperty("${");
        java.util.Iterator iterator31 = extendedProperties25.getKeys();
        java.lang.String str34 = extendedProperties25.getString("}", "}");
        extendedProperties9.putAll((java.util.Map) extendedProperties25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "}" + "'", str34, "}");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        java.lang.String str26 = extendedProperties17.file;
        extendedProperties14.combine(extendedProperties17);
        java.lang.String str28 = extendedProperties14.fileSeparator;
        java.util.Properties properties30 = extendedProperties14.getProperties("hi!");
        java.util.Properties properties31 = extendedProperties0.getProperties("${", properties30);
        java.lang.String str32 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int36 = extendedProperties33.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short39 = extendedProperties33.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj41 = extendedProperties33.remove((java.lang.Object) '#');
        extendedProperties33.fileSeparator = "${";
        java.lang.String str44 = extendedProperties33.fileSeparator;
        java.util.ArrayList arrayList45 = extendedProperties33.keysAsListed;
        extendedProperties0.keysAsListed = arrayList45;
        java.lang.String str47 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = extendedProperties48.subset("${");
        long long53 = extendedProperties48.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int57 = extendedProperties54.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short60 = extendedProperties54.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj62 = extendedProperties54.remove((java.lang.Object) '#');
        extendedProperties54.fileSeparator = "${";
        java.lang.String str65 = extendedProperties54.fileSeparator;
        java.util.ArrayList arrayList66 = extendedProperties54.keysAsListed;
        extendedProperties48.keysAsListed = arrayList66;
        extendedProperties0.putAll((java.util.Map) extendedProperties48);
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = extendedProperties48.subset("}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "${" + "'", str44, "${");
        org.junit.Assert.assertNotNull(arrayList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "/" + "'", str47, "/");
        org.junit.Assert.assertNull(extendedProperties50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "${" + "'", str65, "${");
        org.junit.Assert.assertNotNull(arrayList66);
        org.junit.Assert.assertNull(extendedProperties70);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int18 = extendedProperties15.getInteger("${", (java.lang.Integer) 10);
        extendedProperties15.setInclude("");
        java.util.Vector vector22 = null;
        java.util.Vector vector23 = extendedProperties15.getVector("", vector22);
        java.util.Vector vector24 = extendedProperties0.getVector("hi!", vector22);
        java.util.Iterator iterator26 = extendedProperties0.getKeys("");
        int int29 = extendedProperties0.getInteger("hi!", (int) (short) 0);
        java.util.Iterator iterator31 = extendedProperties0.getKeys("/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(vector23);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties2 = extendedProperties0.subset("${");
        long long5 = extendedProperties0.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = extendedProperties7.subset("${");
        extendedProperties0.setProperty("}", (java.lang.Object) "${");
        java.lang.Float float13 = extendedProperties0.getFloat("/", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        java.lang.Object obj18 = extendedProperties14.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte21 = extendedProperties14.getByte("/", (java.lang.Byte) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str25 = extendedProperties23.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int29 = extendedProperties26.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short32 = extendedProperties26.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj34 = extendedProperties26.remove((java.lang.Object) '#');
        java.lang.String str35 = extendedProperties26.file;
        extendedProperties23.combine(extendedProperties26);
        extendedProperties14.addProperty("hi!", (java.lang.Object) extendedProperties23);
        extendedProperties0.combine(extendedProperties14);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int43 = extendedProperties40.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short46 = extendedProperties40.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj48 = extendedProperties40.remove((java.lang.Object) '#');
        float float51 = extendedProperties40.getFloat("${", 1.0f);
        java.util.List list53 = extendedProperties40.getList("}");
        java.util.Properties properties55 = extendedProperties40.getProperties("/");
        java.util.Properties properties56 = extendedProperties14.getProperties(",", properties55);
        extendedProperties14.clearProperty("");
        org.junit.Assert.assertNull(extendedProperties2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "}" + "'", str25, "}");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 100 + "'", short32 == (short) 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 100 + "'", short46 == (short) 100);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Long long3 = extendedProperties0.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int8 = extendedProperties5.getInteger("${", (java.lang.Integer) 10);
        extendedProperties5.setInclude("");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties5.getVector("", vector12);
        java.lang.String str14 = extendedProperties5.basePath;
        java.util.Iterator iterator15 = extendedProperties5.getKeys();
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties5);
        java.util.Iterator iterator18 = extendedProperties0.getKeys("/");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        extendedProperties0.setInclude("}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str16 = extendedProperties14.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        java.lang.String str26 = extendedProperties17.file;
        extendedProperties14.combine(extendedProperties17);
        java.lang.String str28 = extendedProperties14.fileSeparator;
        java.util.Properties properties30 = extendedProperties14.getProperties("hi!");
        java.util.Properties properties31 = extendedProperties0.getProperties("${", properties30);
        java.lang.String str32 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int36 = extendedProperties33.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short39 = extendedProperties33.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj41 = extendedProperties33.remove((java.lang.Object) '#');
        extendedProperties33.fileSeparator = "${";
        java.lang.String str44 = extendedProperties33.fileSeparator;
        java.util.ArrayList arrayList45 = extendedProperties33.keysAsListed;
        extendedProperties0.keysAsListed = arrayList45;
        java.lang.String str47 = extendedProperties0.fileSeparator;
        boolean boolean48 = extendedProperties0.isInitialized();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "${" + "'", str44, "${");
        org.junit.Assert.assertNotNull(arrayList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "/" + "'", str47, "/");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.lang.String str6 = extendedProperties0.fileSeparator;
        boolean boolean7 = extendedProperties0.isInitialized();
        java.lang.Double double10 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = extendedProperties11.subset("${");
        long long16 = extendedProperties11.getLong("/", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int20 = extendedProperties17.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short23 = extendedProperties17.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj25 = extendedProperties17.remove((java.lang.Object) '#');
        extendedProperties17.fileSeparator = "${";
        java.lang.String str28 = extendedProperties17.fileSeparator;
        java.util.ArrayList arrayList29 = extendedProperties17.keysAsListed;
        extendedProperties11.keysAsListed = arrayList29;
        extendedProperties0.putAll((java.util.Map) extendedProperties11);
        java.lang.Integer int34 = extendedProperties11.getInteger("}", (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "${" + "'", str28, "${");
        org.junit.Assert.assertNotNull(arrayList29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj8 = extendedProperties0.remove((java.lang.Object) '#');
        extendedProperties0.fileSeparator = "${";
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        short short15 = extendedProperties0.getShort("}", (short) (byte) 0);
        java.lang.String str16 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "${" + "'", str16, "${");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "${" + "'", obj2, "${");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short6 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 100);
        float float9 = extendedProperties0.getFloat("${", (float) (byte) 10);
        java.lang.String str10 = extendedProperties0.getInclude();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        java.lang.Object obj5 = extendedProperties0.getProperty("${");
        java.lang.Long long8 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties0.getInclude();
        java.util.List list11 = null;
        java.util.List list12 = extendedProperties0.getList("/", list11);
        java.lang.Double double15 = extendedProperties0.getDouble("/", (java.lang.Double) 10.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties16.subset("${");
        long long21 = extendedProperties16.getLong("/", (long) (byte) 0);
        extendedProperties16.addProperty("${", (java.lang.Object) "}");
        java.lang.Boolean boolean27 = extendedProperties16.getBoolean("${", (java.lang.Boolean) true);
        extendedProperties16.basePath = "${";
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer31 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str33 = propertiesTokenizer31.nextToken(",");
        java.lang.Object obj34 = extendedProperties0.put((java.lang.Object) extendedProperties16, (java.lang.Object) str33);
        java.lang.Object obj36 = extendedProperties16.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str39 = extendedProperties37.interpolate("}");
        java.lang.Object obj41 = extendedProperties37.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte44 = extendedProperties37.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties37.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray49 = extendedProperties37.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str53 = extendedProperties51.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int57 = extendedProperties54.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short60 = extendedProperties54.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj62 = extendedProperties54.remove((java.lang.Object) '#');
        java.lang.String str63 = extendedProperties54.file;
        extendedProperties51.combine(extendedProperties54);
        java.lang.String str65 = extendedProperties51.fileSeparator;
        java.util.Properties properties67 = extendedProperties51.getProperties("hi!");
        java.util.Properties properties68 = extendedProperties37.getProperties("${", properties67);
        java.lang.String str69 = extendedProperties37.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int73 = extendedProperties70.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short76 = extendedProperties70.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj78 = extendedProperties70.remove((java.lang.Object) '#');
        extendedProperties70.fileSeparator = "${";
        java.lang.String str81 = extendedProperties70.fileSeparator;
        java.util.ArrayList arrayList82 = extendedProperties70.keysAsListed;
        extendedProperties37.keysAsListed = arrayList82;
        extendedProperties16.keysAsListed = arrayList82;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(extendedProperties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "}" + "'", str53, "}");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "/" + "'", str65, "/");
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) 100 + "'", short76 == (short) 100);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "${" + "'", str81, "${");
        org.junit.Assert.assertNotNull(arrayList82);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int6 = extendedProperties3.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short9 = extendedProperties3.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj11 = extendedProperties3.remove((java.lang.Object) '#');
        java.lang.String str12 = extendedProperties3.file;
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str17 = extendedProperties15.interpolate("}");
        int int20 = extendedProperties15.getInteger("}", (int) (short) 0);
        extendedProperties3.setProperty("", (java.lang.Object) (short) 0);
        java.lang.String str22 = extendedProperties3.file;
        java.lang.String str24 = extendedProperties3.testBoolean(",");
        extendedProperties3.clearProperty("hi!");
        java.lang.String str27 = extendedProperties3.file;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.file;
        int int12 = extendedProperties0.getInteger("", (int) (short) -1);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("}", (java.lang.Boolean) false);
        float float18 = extendedProperties0.getFloat("", (-1.0f));
        java.lang.String str20 = extendedProperties0.testBoolean("/");
        extendedProperties0.setInclude("");
        boolean boolean23 = extendedProperties0.isInitialized;
        short short26 = extendedProperties0.getShort("}", (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = extendedProperties0.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int3 = extendedProperties0.getInteger("${", (java.lang.Integer) 10);
        extendedProperties0.setInclude("");
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties0.getVector("", vector7);
        java.lang.String str9 = extendedProperties0.basePath;
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.String str12 = extendedProperties0.getString(",");
        extendedProperties0.fileSeparator = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str2 = extendedProperties0.interpolate("}");
        java.lang.Object obj4 = extendedProperties0.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte7 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties0.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int16 = extendedProperties13.getInteger("${", (java.lang.Integer) 10);
        extendedProperties13.setInclude("");
        java.util.Vector vector20 = null;
        java.util.Vector vector21 = extendedProperties13.getVector("", vector20);
        java.lang.String str22 = extendedProperties13.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int26 = extendedProperties23.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short29 = extendedProperties23.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj31 = extendedProperties23.remove((java.lang.Object) '#');
        float float34 = extendedProperties23.getFloat("${", 1.0f);
        boolean boolean35 = extendedProperties23.isInitialized;
        extendedProperties13.putAll((java.util.Map) extendedProperties23);
        byte byte39 = extendedProperties23.getByte("hi!", (byte) 10);
        double double42 = extendedProperties23.getDouble("}", (double) 10);
        java.util.List list44 = extendedProperties23.getList("${");
        java.lang.String str46 = extendedProperties23.testBoolean("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str49 = extendedProperties47.interpolate("}");
        java.lang.Object obj51 = extendedProperties47.remove((java.lang.Object) (byte) 10);
        java.lang.Byte byte54 = extendedProperties47.getByte("/", (java.lang.Byte) (byte) 1);
        extendedProperties47.addProperty("hi!", (java.lang.Object) 100);
        java.lang.String str58 = extendedProperties47.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties60 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int63 = extendedProperties60.getInteger("${", (java.lang.Integer) 10);
        java.lang.Short short66 = extendedProperties60.getShort("hi!", (java.lang.Short) (short) 100);
        java.lang.Object obj68 = extendedProperties60.remove((java.lang.Object) '#');
        extendedProperties60.fileSeparator = "${";
        long long73 = extendedProperties60.getLong("/", (long) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties75 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Integer int78 = extendedProperties75.getInteger("${", (java.lang.Integer) 10);
        extendedProperties75.setInclude("");
        java.util.Vector vector82 = null;
        java.util.Vector vector83 = extendedProperties75.getVector("", vector82);
        java.lang.String str84 = extendedProperties60.interpolateHelper("hi!", (java.util.List) vector83);
        java.util.List list85 = extendedProperties47.getList("/", (java.util.List) vector83);
        java.lang.Object obj86 = extendedProperties0.put((java.lang.Object) "/", (java.lang.Object) "/");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 10 + "'", byte39 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "}" + "'", str49, "}");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 100 + "'", short66 == (short) 100);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(vector83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNull(obj86);
    }
}

