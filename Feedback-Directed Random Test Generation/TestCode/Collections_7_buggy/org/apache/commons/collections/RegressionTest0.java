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
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer.DELIMITER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
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
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = extendedProperties0.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str5 = extendedProperties0.getString("", "hi!");
        java.lang.Integer int8 = extendedProperties0.getInteger("", (java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties6.load(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = extendedProperties1.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties3.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedProperties3.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(extendedProperties6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties3.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator8 = extendedProperties6.getKeys("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(extendedProperties6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        java.lang.Class<?> wildcardClass5 = extendedProperties3.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.END_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "}" + "'", str0, "}");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties3.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = extendedProperties6.getList("}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(extendedProperties6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties(",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        boolean boolean4 = extendedProperties0.isInitialized();
        long long7 = extendedProperties0.getLong("", (long) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        java.lang.String str5 = extendedProperties0.getString("");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = extendedProperties0.getDouble("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.io.OutputStream outputStream11 = null;
        extendedProperties0.save(outputStream11, "}");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = extendedProperties1.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = extendedProperties1.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties3.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedProperties6.getInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(extendedProperties6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setProperty("hi!", (java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double10 = extendedProperties1.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.lang.String str16 = extendedProperties6.getString(",", "/");
        // The following exception was thrown during execution in test generation
        try {
            short short18 = extendedProperties6.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections.ExtendedProperties.include = ",";
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        extendedProperties12.isInitialized = true;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedProperties6.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.Float float5 = extendedProperties0.getFloat(",", (java.lang.Float) 0.0f);
        float float8 = extendedProperties0.getFloat(",", (float) (short) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        boolean boolean4 = extendedProperties0.isInitialized();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Short short18 = extendedProperties1.getShort(",", (java.lang.Short) (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = extendedProperties0.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.START_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "${" + "'", str0, "${");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.io.InputStream inputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.lang.String str13 = extendedProperties1.getString("}");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties(",", ",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        short short10 = extendedProperties1.getShort("}", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setProperty("hi!", (java.lang.Object) (-1L));
        extendedProperties12.clearProperty("hi!");
        extendedProperties1.combine(extendedProperties12);
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties12.load(inputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.include;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.util.Iterator iterator14 = extendedProperties6.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.combine(extendedProperties21);
        extendedProperties21.basePath = "hi!";
        extendedProperties15.putAll((java.util.Map) extendedProperties21);
        java.lang.String str27 = extendedProperties21.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.ArrayList arrayList40 = extendedProperties29.keysAsListed;
        java.util.List list41 = extendedProperties21.getList("", (java.util.List) arrayList40);
        extendedProperties6.keysAsListed = arrayList40;
        double double45 = extendedProperties6.getDouble("}", (double) (short) 0);
        java.lang.Boolean boolean48 = extendedProperties6.getBoolean("hi!", (java.lang.Boolean) false);
        java.util.ArrayList arrayList49 = null;
        extendedProperties6.keysAsListed = arrayList49;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        boolean boolean3 = extendedProperties0.isInitialized();
        java.lang.String str4 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator8 = extendedProperties6.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator11 = extendedProperties9.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties9.combine(extendedProperties12);
        extendedProperties12.basePath = "hi!";
        extendedProperties6.putAll((java.util.Map) extendedProperties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.putAll((java.util.Map) extendedProperties19);
        short short23 = extendedProperties19.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector25 = null;
        java.util.Vector vector26 = extendedProperties19.getVector(",", vector25);
        java.util.Vector vector27 = extendedProperties6.getVector(",", vector26);
        java.util.Vector vector28 = extendedProperties0.getVector("${", vector27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertNotNull(vector28);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        int int4 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.putAll((java.util.Map) extendedProperties13);
        short short17 = extendedProperties13.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties13.getVector(",", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector(",", vector20);
        java.util.Iterator iterator23 = extendedProperties0.getKeys("}");
        java.lang.String str25 = extendedProperties0.getString("/");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("/", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.util.Iterator iterator21 = extendedProperties12.getKeys();
        java.lang.Boolean boolean24 = extendedProperties12.getBoolean("/", (java.lang.Boolean) true);
        java.io.InputStream inputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties12.load(inputStream25, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        boolean boolean11 = extendedProperties0.isInitialized;
        java.lang.Float float14 = extendedProperties0.getFloat("}", (java.lang.Float) 1.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        java.lang.String str5 = extendedProperties0.getString("");
        int int8 = extendedProperties0.getInt("hi!", (int) (byte) 100);
        short short11 = extendedProperties0.getShort("/", (short) 0);
        java.lang.String str12 = extendedProperties0.basePath;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        extendedProperties3.fileSeparator = "hi!";
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.collections.ExtendedProperties.include = "${";
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.Object obj4 = extendedProperties1.getProperty("");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = extendedProperties1.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        byte byte11 = extendedProperties1.getByte("${", (byte) 10);
        java.lang.String[] strArray13 = extendedProperties1.getStringArray(",");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties0.fileSeparator = ",";
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = extendedProperties0.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.ArrayList arrayList11 = extendedProperties0.keysAsListed;
        extendedProperties0.file = "/";
        java.lang.Long long16 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            short short18 = extendedProperties0.getShort("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String[] strArray5 = extendedProperties0.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.putAll((java.util.Map) extendedProperties8);
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties8);
        java.lang.Object obj12 = extendedProperties8.getProperty(",");
        extendedProperties8.fileSeparator = "}";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.Float float5 = extendedProperties0.getFloat(",", (java.lang.Float) 0.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator8 = extendedProperties6.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator11 = extendedProperties9.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties9.combine(extendedProperties12);
        extendedProperties12.basePath = "hi!";
        extendedProperties6.putAll((java.util.Map) extendedProperties12);
        java.util.Properties properties18 = null;
        java.util.Properties properties19 = extendedProperties12.getProperties("", properties18);
        java.util.Iterator iterator20 = extendedProperties12.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator26 = extendedProperties24.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.combine(extendedProperties27);
        extendedProperties27.basePath = "hi!";
        extendedProperties21.putAll((java.util.Map) extendedProperties27);
        java.lang.String str33 = extendedProperties27.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator40 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.combine(extendedProperties41);
        extendedProperties41.basePath = "hi!";
        extendedProperties35.putAll((java.util.Map) extendedProperties41);
        java.util.ArrayList arrayList46 = extendedProperties35.keysAsListed;
        java.util.List list47 = extendedProperties27.getList("", (java.util.List) arrayList46);
        extendedProperties12.keysAsListed = arrayList46;
        double double51 = extendedProperties12.getDouble("}", (double) (short) 0);
        java.lang.Boolean boolean54 = extendedProperties12.getBoolean("hi!", (java.lang.Boolean) false);
        extendedProperties0.combine(extendedProperties12);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Long long18 = extendedProperties1.getLong(",", (java.lang.Long) 0L);
        extendedProperties1.setInclude(",");
        java.io.InputStream inputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream21, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections.ExtendedProperties.include = "";
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setProperty("hi!", (java.lang.Object) (-1L));
        extendedProperties12.clearProperty("hi!");
        extendedProperties1.combine(extendedProperties12);
        boolean boolean23 = extendedProperties1.isInitialized();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = extendedProperties1.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        java.lang.String str18 = extendedProperties6.testBoolean("");
        extendedProperties6.setInclude("${");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        extendedProperties0.basePath = "${";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str8 = extendedProperties1.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator15 = extendedProperties13.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.combine(extendedProperties16);
        extendedProperties16.basePath = "hi!";
        extendedProperties10.putAll((java.util.Map) extendedProperties16);
        java.lang.String str22 = extendedProperties16.getString("hi!");
        java.util.Properties properties24 = extendedProperties16.getProperties("");
        extendedProperties1.setProperty("}", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties0.isInitialized = false;
        java.lang.String[] strArray8 = extendedProperties0.getStringArray(",");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        double double6 = extendedProperties0.getDouble("hi!", 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        boolean boolean4 = extendedProperties0.isInitialized();
        extendedProperties0.setInclude("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float3 = extendedProperties0.getFloat("", (java.lang.Float) 1.0f);
        java.io.OutputStream outputStream4 = null;
        extendedProperties0.save(outputStream4, "");
        boolean boolean7 = extendedProperties0.isInitialized;
        java.lang.Float float10 = extendedProperties0.getFloat("}", (java.lang.Float) 100.0f);
        int int13 = extendedProperties0.getInt("", (int) (byte) -1);
        java.lang.Integer int16 = extendedProperties0.getInteger("}", (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        java.lang.String str13 = extendedProperties1.getInclude();
        java.io.OutputStream outputStream14 = null;
        extendedProperties1.save(outputStream14, "}");
        java.util.Iterator iterator17 = extendedProperties1.getKeys();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.Double double13 = extendedProperties0.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator19 = extendedProperties17.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.combine(extendedProperties20);
        extendedProperties20.basePath = "hi!";
        extendedProperties14.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList25 = extendedProperties14.keysAsListed;
        extendedProperties0.keysAsListed = arrayList25;
        java.util.Iterator iterator28 = extendedProperties0.getKeys("/");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str20 = extendedProperties3.interpolate("hi!");
        java.util.List list22 = extendedProperties3.getList("hi!");
        short short25 = extendedProperties3.getShort("", (short) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.String str8 = extendedProperties1.getInclude();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        int int5 = extendedProperties0.getInt("}", (-1));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        boolean boolean13 = extendedProperties1.getBoolean("", false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        boolean boolean25 = extendedProperties17.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            short short27 = extendedProperties17.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        double double6 = extendedProperties0.getDouble("}", 0.0d);
        extendedProperties0.clearProperty("}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties3.subset("/");
        java.lang.String str22 = extendedProperties3.testBoolean("}");
        boolean boolean23 = extendedProperties3.isInitialized;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator7 = extendedProperties5.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties11.basePath = "hi!";
        extendedProperties5.putAll((java.util.Map) extendedProperties11);
        java.lang.String str17 = extendedProperties11.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator24 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.combine(extendedProperties25);
        extendedProperties25.basePath = "hi!";
        extendedProperties19.putAll((java.util.Map) extendedProperties25);
        java.util.ArrayList arrayList30 = extendedProperties19.keysAsListed;
        java.util.List list31 = extendedProperties11.getList("", (java.util.List) arrayList30);
        java.util.List list32 = extendedProperties0.getList("hi!", list31);
        java.lang.Double double35 = extendedProperties0.getDouble("}", (java.lang.Double) (-1.0d));
        java.lang.Byte byte38 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) 0);
        double double41 = extendedProperties0.getDouble(",", (double) (short) 100);
        extendedProperties0.setInclude("${");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        java.lang.String str5 = extendedProperties0.getString("");
        java.util.Vector vector7 = extendedProperties0.getVector("hi!");
        java.lang.Class<?> wildcardClass8 = extendedProperties0.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(vector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.lang.String str21 = extendedProperties12.basePath;
        java.util.List list23 = extendedProperties12.getList("/");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Long long8 = extendedProperties1.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties1.basePath;
        boolean boolean10 = extendedProperties1.isInitialized;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = extendedProperties3.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.List list12 = extendedProperties6.getList("");
        boolean boolean13 = extendedProperties6.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.combine(extendedProperties21);
        extendedProperties21.basePath = "hi!";
        extendedProperties15.putAll((java.util.Map) extendedProperties21);
        java.lang.Double double28 = extendedProperties15.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.ArrayList arrayList40 = extendedProperties29.keysAsListed;
        extendedProperties15.keysAsListed = arrayList40;
        java.lang.String str42 = extendedProperties6.interpolateHelper("hi!", (java.util.List) arrayList40);
        boolean boolean43 = extendedProperties6.isInitialized();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator7 = extendedProperties5.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties11.basePath = "hi!";
        extendedProperties5.putAll((java.util.Map) extendedProperties11);
        java.lang.String str17 = extendedProperties11.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator24 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.combine(extendedProperties25);
        extendedProperties25.basePath = "hi!";
        extendedProperties19.putAll((java.util.Map) extendedProperties25);
        java.util.ArrayList arrayList30 = extendedProperties19.keysAsListed;
        java.util.List list31 = extendedProperties11.getList("", (java.util.List) arrayList30);
        java.util.List list32 = extendedProperties0.getList("hi!", list31);
        java.lang.Double double35 = extendedProperties0.getDouble("}", (java.lang.Double) (-1.0d));
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator39 = extendedProperties37.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator42 = extendedProperties40.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.combine(extendedProperties43);
        extendedProperties43.basePath = "hi!";
        extendedProperties37.putAll((java.util.Map) extendedProperties43);
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties49.putAll((java.util.Map) extendedProperties50);
        short short54 = extendedProperties50.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector56 = null;
        java.util.Vector vector57 = extendedProperties50.getVector(",", vector56);
        java.util.Vector vector58 = extendedProperties37.getVector(",", vector57);
        java.lang.String str59 = extendedProperties0.interpolateHelper("hi!", (java.util.List) vector57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) -1 + "'", short54 == (short) -1);
        org.junit.Assert.assertNotNull(vector57);
        org.junit.Assert.assertNotNull(vector58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator15 = extendedProperties13.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.combine(extendedProperties16);
        extendedProperties16.basePath = "hi!";
        extendedProperties10.putAll((java.util.Map) extendedProperties16);
        java.util.List list22 = extendedProperties16.getList("");
        boolean boolean23 = extendedProperties16.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator27 = extendedProperties25.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator30 = extendedProperties28.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.combine(extendedProperties31);
        extendedProperties31.basePath = "hi!";
        extendedProperties25.putAll((java.util.Map) extendedProperties31);
        java.lang.Double double38 = extendedProperties25.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator41 = extendedProperties39.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator44 = extendedProperties42.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties42.combine(extendedProperties45);
        extendedProperties45.basePath = "hi!";
        extendedProperties39.putAll((java.util.Map) extendedProperties45);
        java.util.ArrayList arrayList50 = extendedProperties39.keysAsListed;
        extendedProperties25.keysAsListed = arrayList50;
        java.lang.String str52 = extendedProperties16.interpolateHelper("hi!", (java.util.List) arrayList50);
        extendedProperties1.putAll((java.util.Map) extendedProperties16);
        java.io.InputStream inputStream54 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream54, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        extendedProperties1.fileSeparator = "";
        int int17 = extendedProperties1.getInt("}", (int) (short) -1);
        java.lang.String str18 = extendedProperties1.file;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.Double double13 = extendedProperties0.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator19 = extendedProperties17.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.combine(extendedProperties20);
        extendedProperties20.basePath = "hi!";
        extendedProperties14.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList25 = extendedProperties14.keysAsListed;
        extendedProperties0.keysAsListed = arrayList25;
        byte byte29 = extendedProperties0.getByte("${", (byte) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Long long8 = extendedProperties1.getLong("hi!", (java.lang.Long) 10L);
        java.io.OutputStream outputStream9 = null;
        extendedProperties1.save(outputStream9, "");
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        extendedProperties1.display();
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream15, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(vector13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.Byte byte6 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        long long16 = extendedProperties1.getLong("hi!", (long) '#');
        int int19 = extendedProperties1.getInteger("}", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = extendedProperties1.getLong("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        java.util.Iterator iterator10 = extendedProperties1.getKeys(",");
        short short13 = extendedProperties1.getShort("${", (short) 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties0.isInitialized = false;
        extendedProperties0.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector23 = null;
        java.util.Vector vector24 = extendedProperties17.getVector(",", vector23);
        java.lang.String str25 = extendedProperties13.interpolateHelper("", (java.util.List) vector23);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.putAll((java.util.Map) extendedProperties27);
        short short31 = extendedProperties27.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator33 = extendedProperties27.getKeys("hi!");
        extendedProperties13.putAll((java.util.Map) extendedProperties27);
        java.lang.String str35 = extendedProperties27.getInclude();
        java.lang.String str37 = extendedProperties27.testBoolean("/");
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties27);
        java.lang.Double double41 = extendedProperties27.getDouble("", (java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        boolean boolean3 = extendedProperties0.isInitialized();
        java.lang.String str4 = extendedProperties0.getInclude();
        java.lang.Double double7 = extendedProperties0.getDouble("${", (java.lang.Double) 0.0d);
        java.util.List list9 = extendedProperties0.getList(",");
        boolean boolean10 = extendedProperties0.isInitialized;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        java.lang.String str26 = extendedProperties3.interpolate("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list30 = null;
        java.lang.String str31 = extendedProperties28.interpolateHelper("", list30);
        boolean boolean32 = extendedProperties28.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator36 = extendedProperties34.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator39 = extendedProperties37.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties37.combine(extendedProperties40);
        extendedProperties40.basePath = "hi!";
        extendedProperties34.putAll((java.util.Map) extendedProperties40);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties46.putAll((java.util.Map) extendedProperties47);
        short short51 = extendedProperties47.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector53 = null;
        java.util.Vector vector54 = extendedProperties47.getVector(",", vector53);
        java.util.Vector vector55 = extendedProperties34.getVector(",", vector54);
        java.util.Vector vector56 = extendedProperties28.getVector(",", vector54);
        java.lang.String str57 = extendedProperties3.interpolateHelper(",", (java.util.List) vector56);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/" + "'", str26, "/");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) -1 + "'", short51 == (short) -1);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "," + "'", str57, ",");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float3 = extendedProperties0.getFloat("", (java.lang.Float) 1.0f);
        java.io.OutputStream outputStream4 = null;
        extendedProperties0.save(outputStream4, "");
        boolean boolean7 = extendedProperties0.isInitialized;
        java.lang.Float float10 = extendedProperties0.getFloat("}", (java.lang.Float) 100.0f);
        int int13 = extendedProperties0.getInt("", (int) (byte) -1);
        java.lang.Integer int16 = extendedProperties0.getInteger("hi!", (java.lang.Integer) (-1));
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        java.lang.Float float23 = extendedProperties18.getFloat(",", (java.lang.Float) 0.0f);
        extendedProperties0.addProperty("hi!", (java.lang.Object) ",");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list5 = null;
        java.lang.String str6 = extendedProperties3.interpolateHelper("", list5);
        boolean boolean7 = extendedProperties3.isInitialized();
        boolean boolean8 = extendedProperties3.isInitialized();
        extendedProperties0.addProperty("", (java.lang.Object) boolean8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        extendedProperties0.clearProperty("/");
        int int6 = extendedProperties0.getInt(",", (int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator14 = extendedProperties12.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties15.combine(extendedProperties18);
        extendedProperties18.basePath = "hi!";
        extendedProperties12.putAll((java.util.Map) extendedProperties18);
        java.util.Properties properties24 = null;
        java.util.Properties properties25 = extendedProperties18.getProperties("", properties24);
        extendedProperties6.setProperty("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str20 = extendedProperties3.interpolate("hi!");
        java.util.List list22 = extendedProperties3.getList("hi!");
        long long25 = extendedProperties3.getLong(",", (long) (byte) 1);
        boolean boolean28 = extendedProperties3.getBoolean("", false);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str5 = extendedProperties0.getString("", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.lang.Long long14 = extendedProperties7.getLong("hi!", (java.lang.Long) 10L);
        java.io.OutputStream outputStream15 = null;
        extendedProperties7.save(outputStream15, "");
        java.util.Vector vector19 = extendedProperties7.getVector("hi!");
        extendedProperties7.display();
        extendedProperties0.combine(extendedProperties7);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(vector19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str8 = extendedProperties1.file;
        java.lang.Float float11 = extendedProperties1.getFloat("", (java.lang.Float) 1.0f);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.ArrayList arrayList11 = extendedProperties0.keysAsListed;
        extendedProperties0.file = "/";
        java.lang.Long long16 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(extendedProperties18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator7 = extendedProperties5.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties11.basePath = "hi!";
        extendedProperties5.putAll((java.util.Map) extendedProperties11);
        java.lang.String str17 = extendedProperties11.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator24 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.combine(extendedProperties25);
        extendedProperties25.basePath = "hi!";
        extendedProperties19.putAll((java.util.Map) extendedProperties25);
        java.util.ArrayList arrayList30 = extendedProperties19.keysAsListed;
        java.util.List list31 = extendedProperties11.getList("", (java.util.List) arrayList30);
        java.util.List list32 = extendedProperties0.getList("hi!", list31);
        java.lang.Double double35 = extendedProperties0.getDouble("}", (java.lang.Double) (-1.0d));
        java.lang.Byte byte38 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) 0);
        extendedProperties0.file = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.String[] strArray15 = extendedProperties8.getStringArray("");
        java.lang.String str16 = extendedProperties8.file;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties0.isInitialized = false;
        extendedProperties0.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector23 = null;
        java.util.Vector vector24 = extendedProperties17.getVector(",", vector23);
        java.lang.String str25 = extendedProperties13.interpolateHelper("", (java.util.List) vector23);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.putAll((java.util.Map) extendedProperties27);
        short short31 = extendedProperties27.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator33 = extendedProperties27.getKeys("hi!");
        extendedProperties13.putAll((java.util.Map) extendedProperties27);
        java.lang.String str35 = extendedProperties27.getInclude();
        java.lang.String str37 = extendedProperties27.testBoolean("/");
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties27);
        byte byte41 = extendedProperties27.getByte("/", (byte) 0);
        extendedProperties27.clearProperty("}");
        java.lang.String str44 = extendedProperties27.basePath;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        float float29 = extendedProperties1.getFloat("", 10.0f);
        java.lang.String str30 = extendedProperties1.getInclude();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "," + "'", str30, ",");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        java.lang.String str13 = extendedProperties1.getInclude();
        double double16 = extendedProperties1.getDouble("", (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte byte18 = extendedProperties1.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Short short8 = extendedProperties1.getShort(",", (java.lang.Short) (short) 0);
        extendedProperties1.fileSeparator = ",";
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedProperties1.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        int int14 = extendedProperties1.getInteger("", 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Short short8 = extendedProperties1.getShort(",", (java.lang.Short) (short) 0);
        short short11 = extendedProperties1.getShort("${", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        java.lang.Object obj12 = extendedProperties1.getProperty(",");
        float float15 = extendedProperties1.getFloat(",", (float) (byte) 0);
        extendedProperties1.addProperty("", (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        extendedProperties1.display();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        boolean boolean16 = extendedProperties3.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.putAll((java.util.Map) extendedProperties19);
        short short23 = extendedProperties19.getShort("hi!", (short) (byte) -1);
        extendedProperties19.setInclude(",");
        java.lang.String[] strArray27 = extendedProperties19.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.Properties properties41 = null;
        java.util.Properties properties42 = extendedProperties35.getProperties("", properties41);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties42);
        java.util.Properties properties44 = extendedProperties19.getProperties("}", properties42);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties44);
        java.util.Properties properties46 = extendedProperties3.getProperties("/", properties44);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(extendedProperties43);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(extendedProperties45);
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        java.lang.String str26 = extendedProperties3.interpolate("/");
        double double29 = extendedProperties3.getDouble("hi!", (double) '4');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/" + "'", str26, "/");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.ArrayList arrayList11 = extendedProperties0.keysAsListed;
        extendedProperties0.file = "/";
        double double16 = extendedProperties0.getDouble("", (double) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        java.util.ArrayList arrayList14 = extendedProperties6.keysAsListed;
        java.lang.Integer int17 = extendedProperties6.getInteger("/", (java.lang.Integer) (-1));
        int int20 = extendedProperties6.getInteger("/", 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.putAll((java.util.Map) extendedProperties14);
        java.lang.String str16 = extendedProperties13.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.combine(extendedProperties24);
        extendedProperties24.basePath = "hi!";
        extendedProperties18.putAll((java.util.Map) extendedProperties24);
        java.lang.String str30 = extendedProperties24.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.combine(extendedProperties38);
        extendedProperties38.basePath = "hi!";
        extendedProperties32.putAll((java.util.Map) extendedProperties38);
        java.util.ArrayList arrayList43 = extendedProperties32.keysAsListed;
        java.util.List list44 = extendedProperties24.getList("", (java.util.List) arrayList43);
        java.util.List list45 = extendedProperties13.getList("hi!", list44);
        java.lang.Double double48 = extendedProperties13.getDouble("}", (java.lang.Double) (-1.0d));
        java.util.Iterator iterator49 = extendedProperties13.getKeys();
        extendedProperties1.addProperty("", (java.lang.Object) iterator49);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(arrayList43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator49);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Long long18 = extendedProperties1.getLong(",", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties1.subset("}");
        java.lang.Long long23 = extendedProperties1.getLong("", (java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float float25 = extendedProperties1.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        boolean boolean4 = propertiesTokenizer1.hasMoreElements();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        extendedProperties1.basePath = "${";
        java.util.Vector vector17 = extendedProperties1.getVector("");
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream18, "${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(vector17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        boolean boolean4 = extendedProperties0.isInitialized();
        java.io.OutputStream outputStream5 = null;
        extendedProperties0.save(outputStream5, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String[] strArray5 = extendedProperties0.getStringArray("");
        java.lang.Object obj7 = extendedProperties0.getProperty(",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        java.util.List list28 = extendedProperties1.getList(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties1.subset("/");
        java.lang.String str32 = extendedProperties1.testBoolean("${");
        float float35 = extendedProperties1.getFloat(",", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(extendedProperties30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        float float4 = extendedProperties0.getFloat("/", (float) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.putAll((java.util.Map) extendedProperties19);
        short short23 = extendedProperties19.getShort("hi!", (short) (byte) -1);
        extendedProperties19.setInclude(",");
        java.util.Iterator iterator26 = extendedProperties19.getKeys();
        int int29 = extendedProperties19.getInteger("hi!", (int) 'a');
        java.util.Vector vector31 = extendedProperties19.getVector("hi!");
        extendedProperties6.addProperty("${", (java.lang.Object) extendedProperties19);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(vector31);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Long long8 = extendedProperties1.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties1.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.putAll((java.util.Map) extendedProperties24);
        short short28 = extendedProperties24.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties24.getVector(",", vector30);
        java.util.Vector vector32 = extendedProperties11.getVector(",", vector31);
        java.util.Iterator iterator34 = extendedProperties11.getKeys("}");
        extendedProperties1.setProperty("/", (java.lang.Object) iterator34);
        java.io.InputStream inputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(iterator34);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.String[] strArray15 = extendedProperties8.getStringArray("");
        java.lang.String str16 = extendedProperties8.getInclude();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = extendedProperties1.subset("");
        // The following exception was thrown during execution in test generation
        try {
            long long30 = extendedProperties1.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(extendedProperties28);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.Long long5 = extendedProperties0.getLong(",", (java.lang.Long) 0L);
        java.lang.String str6 = extendedProperties0.file;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = extendedProperties0.getDouble("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        long long16 = extendedProperties1.getLong("hi!", (long) '#');
        int int19 = extendedProperties1.getInteger("}", (int) (byte) 0);
        boolean boolean20 = extendedProperties1.isInitialized();
        java.lang.Float float23 = extendedProperties1.getFloat("hi!", (java.lang.Float) 1.0f);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections.ExtendedProperties.include = "/";
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        extendedProperties1.display();
        java.lang.Integer int14 = extendedProperties1.getInteger("/", (java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        boolean boolean4 = extendedProperties0.isInitialized;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        java.lang.Object obj12 = extendedProperties1.getProperty(",");
        // The following exception was thrown during execution in test generation
        try {
            float float14 = extendedProperties1.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        boolean boolean2 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.String str6 = propertiesTokenizer1.nextToken(",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        extendedProperties1.basePath = "${";
        java.util.Vector vector17 = extendedProperties1.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.putAll((java.util.Map) extendedProperties20);
        short short24 = extendedProperties20.getShort("hi!", (short) (byte) -1);
        java.lang.Long long27 = extendedProperties20.getLong("hi!", (java.lang.Long) 10L);
        java.io.OutputStream outputStream28 = null;
        extendedProperties20.save(outputStream28, "");
        java.util.Vector vector32 = extendedProperties20.getVector("hi!");
        java.util.List list33 = extendedProperties1.getList(",", (java.util.List) vector32);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator40 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.combine(extendedProperties41);
        extendedProperties41.basePath = "hi!";
        extendedProperties35.putAll((java.util.Map) extendedProperties41);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.putAll((java.util.Map) extendedProperties48);
        short short52 = extendedProperties48.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector54 = null;
        java.util.Vector vector55 = extendedProperties48.getVector(",", vector54);
        java.util.Vector vector56 = extendedProperties35.getVector(",", vector55);
        java.util.Vector vector57 = extendedProperties1.getVector("/", vector55);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -1 + "'", short24 == (short) -1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) -1 + "'", short52 == (short) -1);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertNotNull(vector57);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        float float19 = extendedProperties6.getFloat("", (-1.0f));
        extendedProperties6.setInclude("${");
        java.lang.String str23 = extendedProperties6.getString("/");
        java.lang.String str25 = extendedProperties6.testBoolean("/");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator18 = extendedProperties12.getKeys("hi!");
        java.lang.Short short21 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.lang.String str30 = extendedProperties23.file;
        extendedProperties12.putAll((java.util.Map) extendedProperties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.putAll((java.util.Map) extendedProperties34);
        short short38 = extendedProperties34.getShort("hi!", (short) (byte) -1);
        extendedProperties34.setInclude(",");
        java.lang.String[] strArray42 = extendedProperties34.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator46 = extendedProperties44.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator49 = extendedProperties47.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.combine(extendedProperties50);
        extendedProperties50.basePath = "hi!";
        extendedProperties44.putAll((java.util.Map) extendedProperties50);
        java.util.Properties properties56 = null;
        java.util.Properties properties57 = extendedProperties50.getProperties("", properties56);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties57);
        java.util.Properties properties59 = extendedProperties34.getProperties("}", properties57);
        java.util.Properties properties60 = extendedProperties12.getProperties(",", properties57);
        java.lang.Float float63 = extendedProperties12.getFloat("}", (java.lang.Float) 0.0f);
        extendedProperties6.putAll((java.util.Map) extendedProperties12);
        java.lang.String[] strArray66 = extendedProperties6.getStringArray("hi!");
        java.lang.Float float69 = extendedProperties6.getFloat("}", (java.lang.Float) 0.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(extendedProperties58);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 0.0f + "'", float69 == 0.0f);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        boolean boolean2 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        int int4 = propertiesTokenizer1.countTokens();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        java.lang.String[] strArray6 = extendedProperties3.getStringArray("");
        java.util.Vector vector8 = extendedProperties3.getVector("");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.lang.Integer int16 = extendedProperties6.getInteger("}", (java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass17 = extendedProperties6.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator7 = extendedProperties5.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties11.basePath = "hi!";
        extendedProperties5.putAll((java.util.Map) extendedProperties11);
        java.lang.String str17 = extendedProperties11.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator24 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.combine(extendedProperties25);
        extendedProperties25.basePath = "hi!";
        extendedProperties19.putAll((java.util.Map) extendedProperties25);
        java.util.ArrayList arrayList30 = extendedProperties19.keysAsListed;
        java.util.List list31 = extendedProperties11.getList("", (java.util.List) arrayList30);
        java.util.List list32 = extendedProperties0.getList("hi!", list31);
        java.lang.Double double35 = extendedProperties0.getDouble("}", (java.lang.Double) (-1.0d));
        java.lang.Byte byte38 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) 0);
        double double41 = extendedProperties0.getDouble(",", (double) (short) 100);
        java.io.InputStream inputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str8 = extendedProperties1.file;
        // The following exception was thrown during execution in test generation
        try {
            short short10 = extendedProperties1.getShort("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.Double double13 = extendedProperties0.getDouble("/", (java.lang.Double) 0.0d);
        java.lang.String str14 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        extendedProperties17.setInclude(",");
        java.lang.String[] strArray25 = extendedProperties17.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator29 = extendedProperties27.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator32 = extendedProperties30.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.combine(extendedProperties33);
        extendedProperties33.basePath = "hi!";
        extendedProperties27.putAll((java.util.Map) extendedProperties33);
        java.util.Properties properties39 = null;
        java.util.Properties properties40 = extendedProperties33.getProperties("", properties39);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties40);
        java.util.Properties properties42 = extendedProperties17.getProperties("}", properties40);
        extendedProperties0.setProperty("${", (java.lang.Object) properties42);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(extendedProperties41);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.util.Iterator iterator14 = extendedProperties6.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.combine(extendedProperties21);
        extendedProperties21.basePath = "hi!";
        extendedProperties15.putAll((java.util.Map) extendedProperties21);
        java.lang.String str27 = extendedProperties21.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.ArrayList arrayList40 = extendedProperties29.keysAsListed;
        java.util.List list41 = extendedProperties21.getList("", (java.util.List) arrayList40);
        extendedProperties6.keysAsListed = arrayList40;
        double double45 = extendedProperties6.getDouble("}", (double) (short) 0);
        java.lang.Boolean boolean48 = extendedProperties6.getBoolean("hi!", (java.lang.Boolean) false);
        java.lang.Long long51 = extendedProperties6.getLong("/", (java.lang.Long) 35L);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35L + "'", long51 == 35L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        long long16 = extendedProperties1.getLong("hi!", (long) '#');
        long long19 = extendedProperties1.getLong("", 35L);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        int int5 = extendedProperties1.getInteger("}", 0);
        extendedProperties1.setProperty("", (java.lang.Object) (short) 10);
        short short10 = extendedProperties1.getShort("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        java.lang.Float float29 = extendedProperties1.getFloat("", (java.lang.Float) 100.0f);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        java.util.ArrayList arrayList14 = extendedProperties6.keysAsListed;
        java.lang.Integer int17 = extendedProperties6.getInteger("/", (java.lang.Integer) (-1));
        java.util.Iterator iterator19 = extendedProperties6.getKeys("");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.String[] strArray15 = extendedProperties8.getStringArray("");
        java.util.Iterator iterator16 = extendedProperties8.getKeys();
        boolean boolean19 = extendedProperties8.getBoolean("", true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        long long16 = extendedProperties1.getLong("hi!", (long) '#');
        int int19 = extendedProperties1.getInteger("}", (int) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.putAll((java.util.Map) extendedProperties22);
        short short26 = extendedProperties22.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector28 = null;
        java.util.Vector vector29 = extendedProperties22.getVector(",", vector28);
        java.lang.String str30 = extendedProperties1.interpolateHelper("hi!", (java.util.List) vector29);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) -1 + "'", short26 == (short) -1);
        org.junit.Assert.assertNotNull(vector29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        extendedProperties3.fileSeparator = "${";
        java.lang.Boolean boolean29 = extendedProperties3.getBoolean("/", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator19 = extendedProperties17.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.combine(extendedProperties20);
        extendedProperties20.basePath = "hi!";
        extendedProperties14.putAll((java.util.Map) extendedProperties20);
        int int27 = extendedProperties20.getInt(",", (int) (short) 0);
        java.util.ArrayList arrayList28 = extendedProperties20.keysAsListed;
        extendedProperties8.keysAsListed = arrayList28;
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator32 = extendedProperties30.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator35 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.combine(extendedProperties36);
        extendedProperties36.basePath = "hi!";
        extendedProperties30.putAll((java.util.Map) extendedProperties36);
        int int43 = extendedProperties36.getInt(",", (int) (short) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator47 = extendedProperties45.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator50 = extendedProperties48.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties48.combine(extendedProperties51);
        extendedProperties51.basePath = "hi!";
        extendedProperties45.putAll((java.util.Map) extendedProperties51);
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties57.putAll((java.util.Map) extendedProperties58);
        short short62 = extendedProperties58.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector64 = null;
        java.util.Vector vector65 = extendedProperties58.getVector(",", vector64);
        java.util.Vector vector66 = extendedProperties45.getVector(",", vector65);
        java.util.Vector vector67 = extendedProperties36.getVector(",", vector66);
        java.util.ArrayList arrayList68 = extendedProperties36.keysAsListed;
        extendedProperties8.keysAsListed = arrayList68;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(arrayList28);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) -1 + "'", short62 == (short) -1);
        org.junit.Assert.assertNotNull(vector65);
        org.junit.Assert.assertNotNull(vector66);
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertNotNull(arrayList68);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        double double6 = extendedProperties0.getDouble("}", 0.0d);
        java.lang.Long long9 = extendedProperties0.getLong(",", (java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.ArrayList arrayList11 = extendedProperties0.keysAsListed;
        extendedProperties0.file = "/";
        java.lang.Long long16 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Properties properties20 = extendedProperties18.getProperties("}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(extendedProperties18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties3.subset("/");
        java.lang.String str22 = extendedProperties3.testBoolean("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator26 = extendedProperties24.getKeys("");
        java.lang.String str27 = extendedProperties24.basePath;
        java.lang.String str29 = extendedProperties24.getString("");
        java.util.Vector vector31 = extendedProperties24.getVector("hi!");
        java.lang.String str32 = extendedProperties3.interpolateHelper("}", (java.util.List) vector31);
        java.lang.Long long35 = extendedProperties3.getLong("/", (java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "}" + "'", str32, "}");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String str5 = extendedProperties0.getString("");
        java.util.List list7 = extendedProperties0.getList("");
        extendedProperties0.isInitialized = true;
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties10);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.putAll((java.util.Map) extendedProperties14);
        short short18 = extendedProperties14.getShort("hi!", (short) (byte) -1);
        extendedProperties14.setInclude(",");
        java.util.Iterator iterator21 = extendedProperties14.getKeys();
        int int24 = extendedProperties14.getInteger("hi!", (int) 'a');
        java.util.Vector vector26 = extendedProperties14.getVector("hi!");
        extendedProperties14.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.putAll((java.util.Map) extendedProperties31);
        short short35 = extendedProperties31.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator37 = extendedProperties31.getKeys("hi!");
        java.lang.Short short40 = extendedProperties31.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties41.putAll((java.util.Map) extendedProperties42);
        short short46 = extendedProperties42.getShort("hi!", (short) (byte) -1);
        extendedProperties42.setInclude(",");
        java.lang.String str49 = extendedProperties42.file;
        extendedProperties31.putAll((java.util.Map) extendedProperties42);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.putAll((java.util.Map) extendedProperties53);
        short short57 = extendedProperties53.getShort("hi!", (short) (byte) -1);
        extendedProperties53.setInclude(",");
        java.lang.String[] strArray61 = extendedProperties53.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator65 = extendedProperties63.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties66 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator68 = extendedProperties66.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties69 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties66.combine(extendedProperties69);
        extendedProperties69.basePath = "hi!";
        extendedProperties63.putAll((java.util.Map) extendedProperties69);
        java.util.Properties properties75 = null;
        java.util.Properties properties76 = extendedProperties69.getProperties("", properties75);
        org.apache.commons.collections.ExtendedProperties extendedProperties77 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties76);
        java.util.Properties properties78 = extendedProperties53.getProperties("}", properties76);
        java.util.Properties properties79 = extendedProperties31.getProperties(",", properties76);
        java.util.Properties properties80 = extendedProperties14.getProperties(",", properties76);
        java.util.Properties properties81 = extendedProperties0.getProperties("/", properties76);
        org.apache.commons.collections.ExtendedProperties extendedProperties82 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) -1 + "'", short35 == (short) -1);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 10 + "'", short40 == (short) 10);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) -1 + "'", short46 == (short) -1);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) -1 + "'", short57 == (short) -1);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(extendedProperties77);
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNotNull(properties80);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(extendedProperties82);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float3 = extendedProperties0.getFloat("", (java.lang.Float) 1.0f);
        java.io.OutputStream outputStream4 = null;
        extendedProperties0.save(outputStream4, "");
        boolean boolean7 = extendedProperties0.isInitialized;
        double double10 = extendedProperties0.getDouble(",", 1.0d);
        java.lang.Byte byte13 = extendedProperties0.getByte("hi!", (java.lang.Byte) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        java.lang.Class<?> wildcardClass16 = properties13.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        double double8 = extendedProperties1.getDouble(",", (double) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator15 = extendedProperties13.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.combine(extendedProperties16);
        extendedProperties16.basePath = "hi!";
        extendedProperties10.putAll((java.util.Map) extendedProperties16);
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = extendedProperties16.getProperties("", properties22);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties23);
        extendedProperties1.setProperty(",", (java.lang.Object) extendedProperties25);
        // The following exception was thrown during execution in test generation
        try {
            byte byte28 = extendedProperties25.getByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi! doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(extendedProperties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.util.Iterator iterator22 = extendedProperties12.getKeys("${");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator8 = extendedProperties6.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator11 = extendedProperties9.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties9.combine(extendedProperties12);
        extendedProperties12.basePath = "hi!";
        extendedProperties6.putAll((java.util.Map) extendedProperties12);
        java.util.ArrayList arrayList17 = extendedProperties6.keysAsListed;
        extendedProperties1.keysAsListed = arrayList17;
        java.lang.String str20 = extendedProperties1.getString("");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.List list12 = extendedProperties6.getList("");
        java.lang.String str14 = extendedProperties6.testBoolean("");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        boolean boolean4 = propertiesTokenizer1.hasMoreElements();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        int int6 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.String str12 = extendedProperties6.interpolate(",");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        java.io.OutputStream outputStream25 = null;
        extendedProperties3.save(outputStream25, "");
        java.lang.String str28 = extendedProperties3.getInclude();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/" + "'", str28, "/");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.util.List list22 = extendedProperties12.getList("hi!");
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties12.load(inputStream23, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float12 = extendedProperties1.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties0.isInitialized = false;
        java.lang.String str8 = extendedProperties0.interpolate("");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.lang.String[] strArray31 = extendedProperties23.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator35 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator38 = extendedProperties36.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.combine(extendedProperties39);
        extendedProperties39.basePath = "hi!";
        extendedProperties33.putAll((java.util.Map) extendedProperties39);
        java.util.Properties properties45 = null;
        java.util.Properties properties46 = extendedProperties39.getProperties("", properties45);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties46);
        java.util.Properties properties48 = extendedProperties23.getProperties("}", properties46);
        java.util.Properties properties49 = extendedProperties1.getProperties(",", properties46);
        java.lang.String str52 = extendedProperties1.getString("${", ",");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(extendedProperties47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "," + "'", str52, ",");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        extendedProperties3.basePath = ",";
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.combine(extendedProperties24);
        extendedProperties24.basePath = "hi!";
        extendedProperties18.putAll((java.util.Map) extendedProperties24);
        java.lang.String str30 = extendedProperties24.getString("hi!");
        java.lang.String str33 = extendedProperties24.getString("/", "hi!");
        extendedProperties3.combine(extendedProperties24);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String[] strArray5 = extendedProperties0.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties7.putAll((java.util.Map) extendedProperties8);
        extendedProperties0.addProperty("hi!", (java.lang.Object) extendedProperties8);
        boolean boolean11 = extendedProperties8.isInitialized();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        java.util.Iterator iterator10 = extendedProperties1.getKeys();
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String[] strArray5 = extendedProperties0.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        extendedProperties7.setInclude(",");
        java.lang.String str16 = extendedProperties7.getString("hi!", "hi!");
        byte byte19 = extendedProperties7.getByte("", (byte) 100);
        extendedProperties7.clearProperty("");
        java.lang.Long long24 = extendedProperties7.getLong(",", (java.lang.Long) 0L);
        extendedProperties7.setInclude(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator29 = extendedProperties27.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator32 = extendedProperties30.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties30.combine(extendedProperties33);
        extendedProperties33.basePath = "hi!";
        extendedProperties27.putAll((java.util.Map) extendedProperties33);
        java.lang.Double double40 = extendedProperties27.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator43 = extendedProperties41.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator46 = extendedProperties44.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties44.combine(extendedProperties47);
        extendedProperties47.basePath = "hi!";
        extendedProperties41.putAll((java.util.Map) extendedProperties47);
        java.util.ArrayList arrayList52 = extendedProperties41.keysAsListed;
        extendedProperties27.keysAsListed = arrayList52;
        extendedProperties7.keysAsListed = arrayList52;
        extendedProperties0.keysAsListed = arrayList52;
        // The following exception was thrown during execution in test generation
        try {
            long long57 = extendedProperties0.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(arrayList52);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        java.lang.Object obj12 = extendedProperties1.getProperty(",");
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator7 = extendedProperties5.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties11.basePath = "hi!";
        extendedProperties5.putAll((java.util.Map) extendedProperties11);
        java.lang.String str17 = extendedProperties11.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator24 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.combine(extendedProperties25);
        extendedProperties25.basePath = "hi!";
        extendedProperties19.putAll((java.util.Map) extendedProperties25);
        java.util.ArrayList arrayList30 = extendedProperties19.keysAsListed;
        java.util.List list31 = extendedProperties11.getList("", (java.util.List) arrayList30);
        java.util.List list32 = extendedProperties0.getList("hi!", list31);
        java.lang.Double double35 = extendedProperties0.getDouble("}", (java.lang.Double) (-1.0d));
        java.io.InputStream inputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setProperty("hi!", (java.lang.Object) (-1L));
        extendedProperties12.clearProperty("hi!");
        extendedProperties1.combine(extendedProperties12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = extendedProperties12.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String[] strArray5 = extendedProperties0.getStringArray("");
        extendedProperties0.clearProperty("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        byte byte11 = extendedProperties1.getByte("${", (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        extendedProperties1.clearProperty("/");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties1.save(outputStream12, "${");
        extendedProperties1.clearProperty("hi!");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        byte byte11 = extendedProperties1.getByte("${", (byte) 10);
        extendedProperties1.file = "/";
        boolean boolean14 = extendedProperties1.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator18 = extendedProperties16.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.combine(extendedProperties22);
        extendedProperties22.basePath = "hi!";
        extendedProperties16.putAll((java.util.Map) extendedProperties22);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties27.putAll((java.util.Map) extendedProperties28);
        short short32 = extendedProperties28.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator34 = extendedProperties28.getKeys("hi!");
        java.lang.Short short37 = extendedProperties28.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.putAll((java.util.Map) extendedProperties39);
        short short43 = extendedProperties39.getShort("hi!", (short) (byte) -1);
        extendedProperties39.setInclude(",");
        java.lang.String str46 = extendedProperties39.file;
        extendedProperties28.putAll((java.util.Map) extendedProperties39);
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties49.putAll((java.util.Map) extendedProperties50);
        short short54 = extendedProperties50.getShort("hi!", (short) (byte) -1);
        extendedProperties50.setInclude(",");
        java.lang.String[] strArray58 = extendedProperties50.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties60 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator62 = extendedProperties60.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator65 = extendedProperties63.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties66 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties63.combine(extendedProperties66);
        extendedProperties66.basePath = "hi!";
        extendedProperties60.putAll((java.util.Map) extendedProperties66);
        java.util.Properties properties72 = null;
        java.util.Properties properties73 = extendedProperties66.getProperties("", properties72);
        org.apache.commons.collections.ExtendedProperties extendedProperties74 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties73);
        java.util.Properties properties75 = extendedProperties50.getProperties("}", properties73);
        java.util.Properties properties76 = extendedProperties28.getProperties(",", properties73);
        java.lang.Float float79 = extendedProperties28.getFloat("}", (java.lang.Float) 0.0f);
        extendedProperties22.putAll((java.util.Map) extendedProperties28);
        java.lang.String[] strArray82 = extendedProperties22.getStringArray("hi!");
        extendedProperties1.setProperty("", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) -1 + "'", short32 == (short) -1);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) -1 + "'", short43 == (short) -1);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) -1 + "'", short54 == (short) -1);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertNotNull(extendedProperties74);
        org.junit.Assert.assertNotNull(properties75);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] {});
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        int int5 = extendedProperties1.getInteger("}", 0);
        extendedProperties1.setProperty("", (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = extendedProperties1.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.lang.String[] strArray31 = extendedProperties23.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator35 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator38 = extendedProperties36.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.combine(extendedProperties39);
        extendedProperties39.basePath = "hi!";
        extendedProperties33.putAll((java.util.Map) extendedProperties39);
        java.util.Properties properties45 = null;
        java.util.Properties properties46 = extendedProperties39.getProperties("", properties45);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties46);
        java.util.Properties properties48 = extendedProperties23.getProperties("}", properties46);
        java.util.Properties properties49 = extendedProperties1.getProperties(",", properties46);
        java.lang.Float float52 = extendedProperties1.getFloat("}", (java.lang.Float) 0.0f);
        boolean boolean53 = extendedProperties1.isInitialized;
        java.lang.String str54 = extendedProperties1.file;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(extendedProperties47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.lang.String str21 = extendedProperties12.basePath;
        boolean boolean22 = extendedProperties12.isInitialized;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        float float19 = extendedProperties6.getFloat("", (-1.0f));
        java.util.Vector vector21 = extendedProperties6.getVector("");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNotNull(vector21);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Long long8 = extendedProperties1.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties1.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.putAll((java.util.Map) extendedProperties24);
        short short28 = extendedProperties24.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties24.getVector(",", vector30);
        java.util.Vector vector32 = extendedProperties11.getVector(",", vector31);
        java.util.Iterator iterator34 = extendedProperties11.getKeys("}");
        extendedProperties1.setProperty("/", (java.lang.Object) iterator34);
        long long38 = extendedProperties1.getLong("${", (long) '#');
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 35L + "'", long38 == 35L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str6 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        boolean boolean30 = extendedProperties27.getBoolean("hi!", true);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.String str12 = extendedProperties6.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator19 = extendedProperties17.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.combine(extendedProperties20);
        extendedProperties20.basePath = "hi!";
        extendedProperties14.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList25 = extendedProperties14.keysAsListed;
        java.util.List list26 = extendedProperties6.getList("", (java.util.List) arrayList25);
        long long29 = extendedProperties6.getLong("", (long) 100);
        java.lang.Integer int32 = extendedProperties6.getInteger(",", (java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = extendedProperties1.getInt("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties3.subset("/");
        java.lang.String str22 = extendedProperties3.testBoolean("}");
        java.io.OutputStream outputStream23 = null;
        extendedProperties3.save(outputStream23, "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.putAll((java.util.Map) extendedProperties27);
        short short31 = extendedProperties27.getShort("hi!", (short) (byte) -1);
        extendedProperties27.setInclude(",");
        java.lang.String str36 = extendedProperties27.getString("hi!", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties37.putAll((java.util.Map) extendedProperties38);
        short short42 = extendedProperties38.getShort("hi!", (short) (byte) -1);
        extendedProperties38.setProperty("hi!", (java.lang.Object) (-1L));
        extendedProperties38.clearProperty("hi!");
        extendedProperties27.combine(extendedProperties38);
        extendedProperties3.combine(extendedProperties38);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) -1 + "'", short42 == (short) -1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties0.isInitialized = false;
        extendedProperties0.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties10.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector23 = null;
        java.util.Vector vector24 = extendedProperties17.getVector(",", vector23);
        java.lang.String str25 = extendedProperties13.interpolateHelper("", (java.util.List) vector23);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.putAll((java.util.Map) extendedProperties27);
        short short31 = extendedProperties27.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator33 = extendedProperties27.getKeys("hi!");
        extendedProperties13.putAll((java.util.Map) extendedProperties27);
        java.lang.String str35 = extendedProperties27.getInclude();
        java.lang.String str37 = extendedProperties27.testBoolean("/");
        extendedProperties0.setProperty("", (java.lang.Object) extendedProperties27);
        byte byte41 = extendedProperties27.getByte("/", (byte) 0);
        java.util.Iterator iterator42 = extendedProperties27.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list46 = null;
        java.lang.String str47 = extendedProperties44.interpolateHelper("", list46);
        java.lang.String[] strArray49 = extendedProperties44.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.putAll((java.util.Map) extendedProperties52);
        extendedProperties44.addProperty("hi!", (java.lang.Object) extendedProperties52);
        java.lang.Object obj56 = extendedProperties52.getProperty(",");
        java.lang.String str57 = extendedProperties52.getInclude();
        extendedProperties27.setProperty("", (java.lang.Object) str57);
        java.lang.String str59 = extendedProperties27.file;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(vector24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "/" + "'", str35, "/");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "/" + "'", str57, "/");
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Long long18 = extendedProperties1.getLong(",", (java.lang.Long) 0L);
        extendedProperties1.setInclude(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator26 = extendedProperties24.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.combine(extendedProperties27);
        extendedProperties27.basePath = "hi!";
        extendedProperties21.putAll((java.util.Map) extendedProperties27);
        java.lang.Double double34 = extendedProperties21.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator40 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.combine(extendedProperties41);
        extendedProperties41.basePath = "hi!";
        extendedProperties35.putAll((java.util.Map) extendedProperties41);
        java.util.ArrayList arrayList46 = extendedProperties35.keysAsListed;
        extendedProperties21.keysAsListed = arrayList46;
        extendedProperties1.keysAsListed = arrayList46;
        java.lang.String str49 = extendedProperties1.file;
        boolean boolean52 = extendedProperties1.getBoolean("}", false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float9 = extendedProperties6.getFloat("", (java.lang.Float) 1.0f);
        extendedProperties0.setProperty(",", (java.lang.Object) float9);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        boolean boolean2 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.String str12 = extendedProperties6.getString("hi!");
        java.util.Properties properties14 = extendedProperties6.getProperties("");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties6.getInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        int int5 = extendedProperties1.getInteger("${", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float3 = extendedProperties0.getFloat("", (java.lang.Float) 1.0f);
        java.io.OutputStream outputStream4 = null;
        extendedProperties0.save(outputStream4, "");
        boolean boolean9 = extendedProperties0.getBoolean("}", true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str8 = extendedProperties1.file;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedProperties1.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        java.lang.String str17 = extendedProperties6.file;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.util.Properties properties5 = extendedProperties0.getProperties("/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.util.Iterator iterator21 = extendedProperties12.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator25 = extendedProperties23.getKeys("");
        java.lang.String str26 = extendedProperties23.basePath;
        java.lang.String str28 = extendedProperties23.getString("");
        java.util.Vector vector30 = extendedProperties23.getVector("hi!");
        extendedProperties12.setProperty("${", (java.lang.Object) extendedProperties23);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(vector30);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        float float10 = extendedProperties1.getFloat("", (float) 100L);
        java.lang.Boolean boolean13 = extendedProperties1.getBoolean("${", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str3 = propertiesTokenizer1.nextToken("${");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        java.io.OutputStream outputStream12 = null;
        extendedProperties1.save(outputStream12, "${");
        int int17 = extendedProperties1.getInt("/", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        java.lang.Object obj12 = extendedProperties1.getProperty(",");
        float float15 = extendedProperties1.getFloat(",", (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = extendedProperties1.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        java.util.List list28 = extendedProperties1.getList(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties1.subset("/");
        java.lang.String str32 = extendedProperties1.testBoolean("${");
        java.lang.String str34 = extendedProperties1.getString("hi!");
        java.lang.String str36 = extendedProperties1.getString("");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(extendedProperties30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        extendedProperties17.setInclude(",");
        java.util.Iterator iterator27 = extendedProperties17.getKeys();
        extendedProperties17.isInitialized = false;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        java.util.ArrayList arrayList14 = extendedProperties6.keysAsListed;
        java.lang.Integer int17 = extendedProperties6.getInteger("/", (java.lang.Integer) (-1));
        java.lang.String str19 = extendedProperties6.testBoolean("}");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.String str12 = extendedProperties6.getString("hi!");
        java.util.Properties properties14 = extendedProperties6.getProperties("");
        double double17 = extendedProperties6.getDouble("hi!", (double) 10L);
        java.lang.String str19 = extendedProperties6.testBoolean("${");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.lang.Long long23 = extendedProperties12.getLong("hi!", (java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String[] strArray5 = extendedProperties0.getStringArray("");
        long long8 = extendedProperties0.getLong("}", (long) '4');
        java.util.List list10 = extendedProperties0.getList(",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator18 = extendedProperties12.getKeys("hi!");
        java.lang.Short short21 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.lang.String str30 = extendedProperties23.file;
        extendedProperties12.putAll((java.util.Map) extendedProperties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.putAll((java.util.Map) extendedProperties34);
        short short38 = extendedProperties34.getShort("hi!", (short) (byte) -1);
        extendedProperties34.setInclude(",");
        java.lang.String[] strArray42 = extendedProperties34.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator46 = extendedProperties44.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator49 = extendedProperties47.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.combine(extendedProperties50);
        extendedProperties50.basePath = "hi!";
        extendedProperties44.putAll((java.util.Map) extendedProperties50);
        java.util.Properties properties56 = null;
        java.util.Properties properties57 = extendedProperties50.getProperties("", properties56);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties57);
        java.util.Properties properties59 = extendedProperties34.getProperties("}", properties57);
        java.util.Properties properties60 = extendedProperties12.getProperties(",", properties57);
        java.lang.Float float63 = extendedProperties12.getFloat("}", (java.lang.Float) 0.0f);
        extendedProperties6.putAll((java.util.Map) extendedProperties12);
        java.lang.String[] strArray66 = extendedProperties6.getStringArray("hi!");
        java.lang.Float float69 = extendedProperties6.getFloat("/", (java.lang.Float) 0.0f);
        java.util.Vector vector71 = extendedProperties6.getVector("hi!");
        java.lang.Short short74 = extendedProperties6.getShort("", (java.lang.Short) (short) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(extendedProperties58);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 0.0f + "'", float69 == 0.0f);
        org.junit.Assert.assertNotNull(vector71);
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) 10 + "'", short74 == (short) 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str8 = extendedProperties1.file;
        java.lang.String str9 = extendedProperties1.getInclude();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        byte byte11 = extendedProperties1.getByte("${", (byte) 10);
        java.lang.String str13 = extendedProperties1.testBoolean(",");
        java.io.OutputStream outputStream14 = null;
        extendedProperties1.save(outputStream14, "${");
        java.lang.Object obj18 = extendedProperties1.getProperty("${");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties26);
        java.lang.Short short30 = extendedProperties27.getShort("${", (java.lang.Short) (short) 100);
        java.lang.Long long33 = extendedProperties27.getLong("", (java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(extendedProperties27);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 100 + "'", short30 == (short) 100);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str20 = extendedProperties3.interpolate("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.util.Iterator iterator30 = extendedProperties23.getKeys();
        int int33 = extendedProperties23.getInt("", (int) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties35.combine(extendedProperties38);
        extendedProperties35.isInitialized = false;
        extendedProperties35.clearProperty("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator47 = extendedProperties45.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties45.combine(extendedProperties48);
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.putAll((java.util.Map) extendedProperties52);
        short short56 = extendedProperties52.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector58 = null;
        java.util.Vector vector59 = extendedProperties52.getVector(",", vector58);
        java.lang.String str60 = extendedProperties48.interpolateHelper("", (java.util.List) vector58);
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties62 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties61.putAll((java.util.Map) extendedProperties62);
        short short66 = extendedProperties62.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator68 = extendedProperties62.getKeys("hi!");
        extendedProperties48.putAll((java.util.Map) extendedProperties62);
        java.lang.String str70 = extendedProperties62.getInclude();
        java.lang.String str72 = extendedProperties62.testBoolean("/");
        extendedProperties35.setProperty("", (java.lang.Object) extendedProperties62);
        byte byte76 = extendedProperties62.getByte("/", (byte) 0);
        java.util.List list78 = extendedProperties62.getList("${");
        java.lang.String str79 = extendedProperties23.interpolateHelper("", list78);
        extendedProperties3.addProperty("}", (java.lang.Object) extendedProperties23);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) -1 + "'", short56 == (short) -1);
        org.junit.Assert.assertNotNull(vector59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) -1 + "'", short66 == (short) -1);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "/" + "'", str70, "/");
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 0 + "'", byte76 == (byte) 0);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        java.io.OutputStream outputStream25 = null;
        extendedProperties3.save(outputStream25, "");
        java.lang.String str28 = extendedProperties3.file;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = extendedProperties1.subset("");
        java.lang.String str30 = extendedProperties1.getString("${");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(extendedProperties28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        int int3 = propertiesTokenizer1.countTokens();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        boolean boolean5 = propertiesTokenizer1.hasMoreElements();
        int int6 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "hi!" + "'", obj4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.display();
        int int17 = extendedProperties1.getInteger("hi!", 35);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.String str12 = extendedProperties6.getString("hi!");
        java.util.Properties properties14 = extendedProperties6.getProperties("");
        double double17 = extendedProperties6.getDouble("hi!", (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = extendedProperties6.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float3 = extendedProperties0.getFloat("", (java.lang.Float) 1.0f);
        java.lang.String str4 = extendedProperties0.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties0.subset("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedProperties6.getInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(extendedProperties6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator18 = extendedProperties12.getKeys("hi!");
        java.lang.Short short21 = extendedProperties12.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.lang.String str30 = extendedProperties23.file;
        extendedProperties12.putAll((java.util.Map) extendedProperties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties33.putAll((java.util.Map) extendedProperties34);
        short short38 = extendedProperties34.getShort("hi!", (short) (byte) -1);
        extendedProperties34.setInclude(",");
        java.lang.String[] strArray42 = extendedProperties34.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator46 = extendedProperties44.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator49 = extendedProperties47.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties47.combine(extendedProperties50);
        extendedProperties50.basePath = "hi!";
        extendedProperties44.putAll((java.util.Map) extendedProperties50);
        java.util.Properties properties56 = null;
        java.util.Properties properties57 = extendedProperties50.getProperties("", properties56);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties57);
        java.util.Properties properties59 = extendedProperties34.getProperties("}", properties57);
        java.util.Properties properties60 = extendedProperties12.getProperties(",", properties57);
        java.lang.Float float63 = extendedProperties12.getFloat("}", (java.lang.Float) 0.0f);
        extendedProperties6.putAll((java.util.Map) extendedProperties12);
        boolean boolean65 = extendedProperties6.isInitialized();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -1 + "'", short38 == (short) -1);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(extendedProperties58);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        extendedProperties3.file = "}";
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        double double6 = extendedProperties0.getDouble("hi!", 10.0d);
        short short9 = extendedProperties0.getShort("", (short) 100);
        double double12 = extendedProperties0.getDouble(",", (double) 0.0f);
        short short15 = extendedProperties0.getShort("}", (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        int int5 = extendedProperties1.getInteger("}", 0);
        boolean boolean8 = extendedProperties1.getBoolean("/", false);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator11 = extendedProperties9.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator14 = extendedProperties12.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.combine(extendedProperties15);
        extendedProperties15.basePath = "hi!";
        extendedProperties9.putAll((java.util.Map) extendedProperties15);
        java.lang.String str21 = extendedProperties15.getString("hi!");
        java.lang.String str24 = extendedProperties15.getString("/", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties26.putAll((java.util.Map) extendedProperties27);
        short short31 = extendedProperties27.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator33 = extendedProperties27.getKeys("hi!");
        java.lang.Short short36 = extendedProperties27.getShort("hi!", (java.lang.Short) (short) 10);
        java.lang.Object obj38 = extendedProperties27.getProperty(",");
        java.util.ArrayList arrayList39 = extendedProperties27.keysAsListed;
        java.lang.String str40 = extendedProperties15.interpolateHelper("/", (java.util.List) arrayList39);
        extendedProperties1.keysAsListed = arrayList39;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 10 + "'", short36 == (short) 10);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/" + "'", str40, "/");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str4 = extendedProperties1.interpolate(",");
        java.util.Vector vector6 = extendedProperties1.getVector("${");
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream7, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(vector6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        byte byte11 = extendedProperties1.getByte("${", (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        java.util.Vector vector14 = extendedProperties1.getVector(",");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(vector14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.util.Iterator iterator14 = extendedProperties6.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.combine(extendedProperties21);
        extendedProperties21.basePath = "hi!";
        extendedProperties15.putAll((java.util.Map) extendedProperties21);
        java.lang.String str27 = extendedProperties21.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.ArrayList arrayList40 = extendedProperties29.keysAsListed;
        java.util.List list41 = extendedProperties21.getList("", (java.util.List) arrayList40);
        extendedProperties6.keysAsListed = arrayList40;
        float float45 = extendedProperties6.getFloat("${", 0.0f);
        java.lang.Long long48 = extendedProperties6.getLong("hi!", (java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator7 = extendedProperties5.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties11.basePath = "hi!";
        extendedProperties5.putAll((java.util.Map) extendedProperties11);
        java.lang.String str17 = extendedProperties11.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator24 = extendedProperties22.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.combine(extendedProperties25);
        extendedProperties25.basePath = "hi!";
        extendedProperties19.putAll((java.util.Map) extendedProperties25);
        java.util.ArrayList arrayList30 = extendedProperties19.keysAsListed;
        java.util.List list31 = extendedProperties11.getList("", (java.util.List) arrayList30);
        java.util.List list32 = extendedProperties0.getList("hi!", list31);
        java.lang.Double double35 = extendedProperties0.getDouble("}", (java.lang.Double) (-1.0d));
        java.lang.Byte byte38 = extendedProperties0.getByte("${", (java.lang.Byte) (byte) 0);
        byte byte41 = extendedProperties0.getByte(",", (byte) 1);
        java.lang.Object obj43 = extendedProperties0.getProperty("${");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        extendedProperties1.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.putAll((java.util.Map) extendedProperties18);
        short short22 = extendedProperties18.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator24 = extendedProperties18.getKeys("hi!");
        java.lang.Short short27 = extendedProperties18.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.putAll((java.util.Map) extendedProperties29);
        short short33 = extendedProperties29.getShort("hi!", (short) (byte) -1);
        extendedProperties29.setInclude(",");
        java.lang.String str36 = extendedProperties29.file;
        extendedProperties18.putAll((java.util.Map) extendedProperties29);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties39.putAll((java.util.Map) extendedProperties40);
        short short44 = extendedProperties40.getShort("hi!", (short) (byte) -1);
        extendedProperties40.setInclude(",");
        java.lang.String[] strArray48 = extendedProperties40.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator52 = extendedProperties50.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator55 = extendedProperties53.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties53.combine(extendedProperties56);
        extendedProperties56.basePath = "hi!";
        extendedProperties50.putAll((java.util.Map) extendedProperties56);
        java.util.Properties properties62 = null;
        java.util.Properties properties63 = extendedProperties56.getProperties("", properties62);
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties63);
        java.util.Properties properties65 = extendedProperties40.getProperties("}", properties63);
        java.util.Properties properties66 = extendedProperties18.getProperties(",", properties63);
        java.util.Properties properties67 = extendedProperties1.getProperties(",", properties63);
        boolean boolean68 = extendedProperties1.isInitialized();
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) -1 + "'", short44 == (short) -1);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertNotNull(extendedProperties64);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.putAll((java.util.Map) extendedProperties15);
        short short19 = extendedProperties15.getShort("hi!", (short) (byte) -1);
        extendedProperties15.setInclude(",");
        java.util.Iterator iterator22 = extendedProperties15.getKeys();
        int int25 = extendedProperties15.getInteger("hi!", (int) 'a');
        java.util.Vector vector27 = extendedProperties15.getVector("hi!");
        extendedProperties15.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.putAll((java.util.Map) extendedProperties32);
        short short36 = extendedProperties32.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator38 = extendedProperties32.getKeys("hi!");
        java.lang.Short short41 = extendedProperties32.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties42.putAll((java.util.Map) extendedProperties43);
        short short47 = extendedProperties43.getShort("hi!", (short) (byte) -1);
        extendedProperties43.setInclude(",");
        java.lang.String str50 = extendedProperties43.file;
        extendedProperties32.putAll((java.util.Map) extendedProperties43);
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties53.putAll((java.util.Map) extendedProperties54);
        short short58 = extendedProperties54.getShort("hi!", (short) (byte) -1);
        extendedProperties54.setInclude(",");
        java.lang.String[] strArray62 = extendedProperties54.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator66 = extendedProperties64.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties67 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator69 = extendedProperties67.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties70 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties67.combine(extendedProperties70);
        extendedProperties70.basePath = "hi!";
        extendedProperties64.putAll((java.util.Map) extendedProperties70);
        java.util.Properties properties76 = null;
        java.util.Properties properties77 = extendedProperties70.getProperties("", properties76);
        org.apache.commons.collections.ExtendedProperties extendedProperties78 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties77);
        java.util.Properties properties79 = extendedProperties54.getProperties("}", properties77);
        java.util.Properties properties80 = extendedProperties32.getProperties(",", properties77);
        java.util.Properties properties81 = extendedProperties15.getProperties(",", properties77);
        java.util.Properties properties82 = extendedProperties1.getProperties(",", properties77);
        org.apache.commons.collections.ExtendedProperties extendedProperties84 = extendedProperties1.subset("}");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) -1 + "'", short36 == (short) -1);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 10 + "'", short41 == (short) 10);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -1 + "'", short47 == (short) -1);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) -1 + "'", short58 == (short) -1);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertNotNull(properties77);
        org.junit.Assert.assertNotNull(extendedProperties78);
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNotNull(properties80);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertNotNull(properties82);
        org.junit.Assert.assertNull(extendedProperties84);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        java.util.List list28 = extendedProperties1.getList(",");
        boolean boolean31 = extendedProperties1.getBoolean("/", true);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties3.subset(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.combine(extendedProperties14);
        extendedProperties14.basePath = "hi!";
        extendedProperties8.putAll((java.util.Map) extendedProperties14);
        int int21 = extendedProperties14.getInt(",", (int) (short) 0);
        byte byte24 = extendedProperties14.getByte("", (byte) 0);
        float float27 = extendedProperties14.getFloat("", (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.Properties properties41 = null;
        java.util.Properties properties42 = extendedProperties35.getProperties("", properties41);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties42);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties42);
        java.util.Properties properties45 = extendedProperties14.getProperties("hi!", properties42);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list49 = null;
        java.lang.String str50 = extendedProperties47.interpolateHelper("", list49);
        boolean boolean51 = extendedProperties47.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator55 = extendedProperties53.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator58 = extendedProperties56.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties56.combine(extendedProperties59);
        extendedProperties59.basePath = "hi!";
        extendedProperties53.putAll((java.util.Map) extendedProperties59);
        org.apache.commons.collections.ExtendedProperties extendedProperties65 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties66 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties65.putAll((java.util.Map) extendedProperties66);
        short short70 = extendedProperties66.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector72 = null;
        java.util.Vector vector73 = extendedProperties66.getVector(",", vector72);
        java.util.Vector vector74 = extendedProperties53.getVector(",", vector73);
        java.util.Vector vector75 = extendedProperties47.getVector(",", vector73);
        java.util.Vector vector76 = extendedProperties14.getVector("hi!", vector75);
        java.util.List list77 = extendedProperties3.getList("}", (java.util.List) vector76);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(extendedProperties6);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(extendedProperties43);
        org.junit.Assert.assertNotNull(extendedProperties44);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) -1 + "'", short70 == (short) -1);
        org.junit.Assert.assertNotNull(vector73);
        org.junit.Assert.assertNotNull(vector74);
        org.junit.Assert.assertNotNull(vector75);
        org.junit.Assert.assertNotNull(vector76);
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        extendedProperties0.basePath = "";
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list8 = null;
        java.lang.String str9 = extendedProperties6.interpolateHelper("", list8);
        java.lang.String[] strArray11 = extendedProperties6.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.putAll((java.util.Map) extendedProperties14);
        extendedProperties6.addProperty("hi!", (java.lang.Object) extendedProperties14);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties21.combine(extendedProperties24);
        extendedProperties24.basePath = "hi!";
        extendedProperties18.putAll((java.util.Map) extendedProperties24);
        java.util.List list30 = extendedProperties24.getList("");
        boolean boolean31 = extendedProperties24.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator35 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator38 = extendedProperties36.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.combine(extendedProperties39);
        extendedProperties39.basePath = "hi!";
        extendedProperties33.putAll((java.util.Map) extendedProperties39);
        java.lang.Double double46 = extendedProperties33.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator49 = extendedProperties47.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator52 = extendedProperties50.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties50.combine(extendedProperties53);
        extendedProperties53.basePath = "hi!";
        extendedProperties47.putAll((java.util.Map) extendedProperties53);
        java.util.ArrayList arrayList58 = extendedProperties47.keysAsListed;
        extendedProperties33.keysAsListed = arrayList58;
        java.lang.String str60 = extendedProperties24.interpolateHelper("hi!", (java.util.List) arrayList58);
        java.util.List list61 = extendedProperties14.getList("}", (java.util.List) arrayList58);
        extendedProperties0.keysAsListed = arrayList58;
        // The following exception was thrown during execution in test generation
        try {
            int int64 = extendedProperties0.getInt("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(arrayList58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(list61);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        int int11 = extendedProperties1.getInteger("hi!", (int) 'a');
        java.util.Vector vector13 = extendedProperties1.getVector("hi!");
        extendedProperties1.basePath = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.putAll((java.util.Map) extendedProperties18);
        short short22 = extendedProperties18.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator24 = extendedProperties18.getKeys("hi!");
        java.lang.Short short27 = extendedProperties18.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.putAll((java.util.Map) extendedProperties29);
        short short33 = extendedProperties29.getShort("hi!", (short) (byte) -1);
        extendedProperties29.setInclude(",");
        java.lang.String str36 = extendedProperties29.file;
        extendedProperties18.putAll((java.util.Map) extendedProperties29);
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties39.putAll((java.util.Map) extendedProperties40);
        short short44 = extendedProperties40.getShort("hi!", (short) (byte) -1);
        extendedProperties40.setInclude(",");
        java.lang.String[] strArray48 = extendedProperties40.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties50 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator52 = extendedProperties50.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator55 = extendedProperties53.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties53.combine(extendedProperties56);
        extendedProperties56.basePath = "hi!";
        extendedProperties50.putAll((java.util.Map) extendedProperties56);
        java.util.Properties properties62 = null;
        java.util.Properties properties63 = extendedProperties56.getProperties("", properties62);
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties63);
        java.util.Properties properties65 = extendedProperties40.getProperties("}", properties63);
        java.util.Properties properties66 = extendedProperties18.getProperties(",", properties63);
        java.util.Properties properties67 = extendedProperties1.getProperties(",", properties63);
        java.lang.String str69 = extendedProperties1.testBoolean("}");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) -1 + "'", short44 == (short) -1);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertNotNull(extendedProperties64);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Long long18 = extendedProperties1.getLong(",", (java.lang.Long) 0L);
        extendedProperties1.setInclude(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator26 = extendedProperties24.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.combine(extendedProperties27);
        extendedProperties27.basePath = "hi!";
        extendedProperties21.putAll((java.util.Map) extendedProperties27);
        java.lang.Double double34 = extendedProperties21.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator40 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.combine(extendedProperties41);
        extendedProperties41.basePath = "hi!";
        extendedProperties35.putAll((java.util.Map) extendedProperties41);
        java.util.ArrayList arrayList46 = extendedProperties35.keysAsListed;
        extendedProperties21.keysAsListed = arrayList46;
        extendedProperties1.keysAsListed = arrayList46;
        java.lang.String str49 = extendedProperties1.file;
        java.lang.Boolean boolean52 = extendedProperties1.getBoolean("}", (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Float float3 = extendedProperties0.getFloat("", (java.lang.Float) 1.0f);
        java.io.OutputStream outputStream4 = null;
        extendedProperties0.save(outputStream4, "");
        boolean boolean7 = extendedProperties0.isInitialized;
        java.lang.Float float10 = extendedProperties0.getFloat("}", (java.lang.Float) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = extendedProperties1.subset("");
        java.lang.String str29 = extendedProperties1.fileSeparator;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(extendedProperties28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/" + "'", str29, "/");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Short short8 = extendedProperties1.getShort(",", (java.lang.Short) (short) 0);
        extendedProperties1.fileSeparator = ",";
        java.lang.String str11 = extendedProperties1.basePath;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.lang.String[] strArray31 = extendedProperties23.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator35 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator38 = extendedProperties36.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.combine(extendedProperties39);
        extendedProperties39.basePath = "hi!";
        extendedProperties33.putAll((java.util.Map) extendedProperties39);
        java.util.Properties properties45 = null;
        java.util.Properties properties46 = extendedProperties39.getProperties("", properties45);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties46);
        java.util.Properties properties48 = extendedProperties23.getProperties("}", properties46);
        java.util.Properties properties49 = extendedProperties1.getProperties(",", properties46);
        java.lang.Float float52 = extendedProperties1.getFloat("}", (java.lang.Float) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = extendedProperties1.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(extendedProperties47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        extendedProperties16.basePath = "}";
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator22 = extendedProperties20.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator25 = extendedProperties23.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.combine(extendedProperties26);
        extendedProperties26.basePath = "hi!";
        extendedProperties20.putAll((java.util.Map) extendedProperties26);
        java.util.List list32 = extendedProperties26.getList("");
        java.util.List list33 = extendedProperties16.getList("/", list32);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setProperty("hi!", (java.lang.Object) (-1L));
        extendedProperties1.clearProperty("hi!");
        java.lang.String str11 = extendedProperties1.fileSeparator;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        double double8 = extendedProperties1.getDouble(",", (double) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator15 = extendedProperties13.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.combine(extendedProperties16);
        extendedProperties16.basePath = "hi!";
        extendedProperties10.putAll((java.util.Map) extendedProperties16);
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = extendedProperties16.getProperties("", properties22);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties23);
        extendedProperties1.setProperty(",", (java.lang.Object) extendedProperties25);
        extendedProperties25.setInclude("/");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(extendedProperties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.Integer int5 = extendedProperties0.getInteger("", (java.lang.Integer) 0);
        java.lang.Boolean boolean8 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setProperty("hi!", (java.lang.Object) (-1L));
        java.util.Vector vector10 = extendedProperties1.getVector("}");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = extendedProperties17.getProperties("", properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties24);
        java.util.Properties properties26 = extendedProperties1.getProperties("}", properties24);
        java.util.List list28 = extendedProperties1.getList(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties1.subset("/");
        java.lang.String str32 = extendedProperties1.testBoolean("${");
        java.lang.String str34 = extendedProperties1.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.putAll((java.util.Map) extendedProperties37);
        java.lang.String str40 = extendedProperties37.interpolate(",");
        java.util.Vector vector42 = extendedProperties37.getVector("${");
        java.lang.String str43 = extendedProperties1.interpolateHelper("${", (java.util.List) vector42);
        java.lang.Integer int46 = extendedProperties1.getInteger("}", (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(extendedProperties30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "," + "'", str40, ",");
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "${" + "'", str43, "${");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean("hi!", (java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator8 = extendedProperties6.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator11 = extendedProperties9.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties9.combine(extendedProperties12);
        extendedProperties12.basePath = "hi!";
        extendedProperties6.putAll((java.util.Map) extendedProperties12);
        java.util.ArrayList arrayList17 = extendedProperties6.keysAsListed;
        extendedProperties1.keysAsListed = arrayList17;
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.putAll((java.util.Map) extendedProperties21);
        short short25 = extendedProperties21.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setProperty("hi!", (java.lang.Object) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator30 = extendedProperties28.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator33 = extendedProperties31.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties31.combine(extendedProperties34);
        extendedProperties34.basePath = "hi!";
        extendedProperties28.putAll((java.util.Map) extendedProperties34);
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.putAll((java.util.Map) extendedProperties41);
        short short45 = extendedProperties41.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector47 = null;
        java.util.Vector vector48 = extendedProperties41.getVector(",", vector47);
        java.util.Vector vector49 = extendedProperties28.getVector(",", vector48);
        java.util.Iterator iterator51 = extendedProperties28.getKeys("}");
        extendedProperties1.addProperty(",", (java.lang.Object) iterator51);
        // The following exception was thrown during execution in test generation
        try {
            float float54 = extendedProperties1.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: 'hi!' doesn't map to a Float object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) -1 + "'", short45 == (short) -1);
        org.junit.Assert.assertNotNull(vector48);
        org.junit.Assert.assertNotNull(vector49);
        org.junit.Assert.assertNotNull(iterator51);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.String str12 = extendedProperties6.getString("hi!");
        java.util.Properties properties14 = extendedProperties6.getProperties("");
        java.lang.String str15 = extendedProperties6.getInclude();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/" + "'", str15, "/");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.putAll((java.util.Map) extendedProperties13);
        short short17 = extendedProperties13.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties13.getVector(",", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector(",", vector20);
        boolean boolean22 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties22.putAll((java.util.Map) extendedProperties23);
        short short27 = extendedProperties23.getShort("hi!", (short) (byte) -1);
        extendedProperties23.setInclude(",");
        java.lang.String[] strArray31 = extendedProperties23.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator35 = extendedProperties33.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator38 = extendedProperties36.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties36.combine(extendedProperties39);
        extendedProperties39.basePath = "hi!";
        extendedProperties33.putAll((java.util.Map) extendedProperties39);
        java.util.Properties properties45 = null;
        java.util.Properties properties46 = extendedProperties39.getProperties("", properties45);
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties46);
        java.util.Properties properties48 = extendedProperties23.getProperties("}", properties46);
        java.util.Properties properties49 = extendedProperties1.getProperties(",", properties46);
        java.lang.Float float52 = extendedProperties1.getFloat("}", (java.lang.Float) 0.0f);
        java.lang.Float float55 = extendedProperties1.getFloat("${", (java.lang.Float) 0.0f);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(extendedProperties47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        java.lang.Byte byte14 = extendedProperties1.getByte("}", (java.lang.Byte) (byte) 10);
        short short17 = extendedProperties1.getShort(",", (short) 10);
        java.lang.Boolean boolean20 = extendedProperties1.getBoolean("", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Long long18 = extendedProperties1.getLong(",", (java.lang.Long) 0L);
        extendedProperties1.setInclude(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator26 = extendedProperties24.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.combine(extendedProperties27);
        extendedProperties27.basePath = "hi!";
        extendedProperties21.putAll((java.util.Map) extendedProperties27);
        java.lang.Double double34 = extendedProperties21.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator40 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.combine(extendedProperties41);
        extendedProperties41.basePath = "hi!";
        extendedProperties35.putAll((java.util.Map) extendedProperties41);
        java.util.ArrayList arrayList46 = extendedProperties35.keysAsListed;
        extendedProperties21.keysAsListed = arrayList46;
        extendedProperties1.keysAsListed = arrayList46;
        extendedProperties1.setInclude("/");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(arrayList46);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.putAll((java.util.Map) extendedProperties13);
        short short17 = extendedProperties13.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties13.getVector(",", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector(",", vector20);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties0.subset("hi!");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNull(extendedProperties23);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        java.lang.String str13 = extendedProperties1.getInclude();
        java.io.OutputStream outputStream14 = null;
        extendedProperties1.save(outputStream14, "}");
        java.lang.String str17 = extendedProperties1.file;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/" + "'", str13, "/");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.String[] strArray15 = extendedProperties8.getStringArray("");
        java.util.Iterator iterator16 = extendedProperties8.getKeys();
        java.util.Properties properties18 = extendedProperties8.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.putAll((java.util.Map) extendedProperties21);
        short short25 = extendedProperties21.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator27 = extendedProperties21.getKeys("hi!");
        java.lang.Short short30 = extendedProperties21.getShort("hi!", (java.lang.Short) (short) 10);
        extendedProperties21.display();
        extendedProperties8.addProperty("${", (java.lang.Object) extendedProperties21);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str20 = extendedProperties3.interpolate("hi!");
        java.util.List list22 = extendedProperties3.getList("hi!");
        boolean boolean23 = extendedProperties3.isInitialized;
        java.lang.String str25 = extendedProperties3.getString("}");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        double double6 = extendedProperties0.getDouble("hi!", 10.0d);
        short short9 = extendedProperties0.getShort("", (short) 100);
        extendedProperties0.display();
        boolean boolean13 = extendedProperties0.getBoolean("", false);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        double double8 = extendedProperties1.getDouble(",", (double) '#');
        extendedProperties1.file = "";
        // The following exception was thrown during execution in test generation
        try {
            byte byte12 = extendedProperties1.getByte("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str3 = propertiesTokenizer1.nextToken();
        boolean boolean4 = propertiesTokenizer1.hasMoreElements();
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        java.lang.Object obj6 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        byte byte11 = extendedProperties1.getByte("${", (byte) 10);
        extendedProperties1.file = "/";
        boolean boolean14 = extendedProperties1.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties1.getInt("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        double double8 = extendedProperties1.getDouble(",", (double) '#');
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator15 = extendedProperties13.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.combine(extendedProperties16);
        extendedProperties16.basePath = "hi!";
        extendedProperties10.putAll((java.util.Map) extendedProperties16);
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = extendedProperties16.getProperties("", properties22);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties23);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties23);
        extendedProperties1.setProperty(",", (java.lang.Object) extendedProperties25);
        java.lang.Long long29 = extendedProperties25.getLong("hi!", (java.lang.Long) 35L);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(extendedProperties24);
        org.junit.Assert.assertNotNull(extendedProperties25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Short short8 = extendedProperties1.getShort(",", (java.lang.Short) (short) 0);
        long long11 = extendedProperties1.getLong(",", (long) (-1));
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.util.Iterator iterator14 = extendedProperties6.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.combine(extendedProperties21);
        extendedProperties21.basePath = "hi!";
        extendedProperties15.putAll((java.util.Map) extendedProperties21);
        java.lang.String str27 = extendedProperties21.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.ArrayList arrayList40 = extendedProperties29.keysAsListed;
        java.util.List list41 = extendedProperties21.getList("", (java.util.List) arrayList40);
        extendedProperties6.keysAsListed = arrayList40;
        double double45 = extendedProperties6.getDouble("}", (double) (short) 0);
        java.lang.Boolean boolean48 = extendedProperties6.getBoolean("hi!", (java.lang.Boolean) false);
        java.lang.String[] strArray50 = extendedProperties6.getStringArray("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties51.putAll((java.util.Map) extendedProperties52);
        short short56 = extendedProperties52.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator58 = extendedProperties52.getKeys("hi!");
        java.lang.Short short61 = extendedProperties52.getShort("hi!", (java.lang.Short) (short) 10);
        java.lang.Object obj63 = extendedProperties52.getProperty(",");
        java.util.ArrayList arrayList64 = extendedProperties52.keysAsListed;
        extendedProperties6.keysAsListed = arrayList64;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) -1 + "'", short56 == (short) -1);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 10 + "'", short61 == (short) 10);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(arrayList64);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        double double6 = extendedProperties0.getDouble("hi!", 10.0d);
        short short9 = extendedProperties0.getShort("", (short) 100);
        double double12 = extendedProperties0.getDouble(",", (double) 0.0f);
        java.lang.String str13 = extendedProperties0.basePath;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        int int5 = extendedProperties1.getInteger("}", 0);
        extendedProperties1.setProperty("", (java.lang.Object) (short) 10);
        boolean boolean11 = extendedProperties1.getBoolean("hi!", true);
        double double14 = extendedProperties1.getDouble("/", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        java.lang.String str3 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String str5 = extendedProperties0.getString("");
        long long8 = extendedProperties0.getLong("hi!", 100L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Properties properties9 = extendedProperties1.getProperties("/");
        java.lang.Object obj11 = extendedProperties1.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str8 = extendedProperties1.file;
        java.lang.String str9 = extendedProperties1.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list13 = null;
        java.lang.String str14 = extendedProperties11.interpolateHelper("", list13);
        java.lang.String[] strArray16 = extendedProperties11.getStringArray("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.putAll((java.util.Map) extendedProperties18);
        short short22 = extendedProperties18.getShort("hi!", (short) (byte) -1);
        extendedProperties18.setInclude(",");
        java.lang.String str27 = extendedProperties18.getString("hi!", "hi!");
        byte byte30 = extendedProperties18.getByte("", (byte) 100);
        extendedProperties18.clearProperty("");
        java.lang.Long long35 = extendedProperties18.getLong(",", (java.lang.Long) 0L);
        extendedProperties18.setInclude(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator40 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator43 = extendedProperties41.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties41.combine(extendedProperties44);
        extendedProperties44.basePath = "hi!";
        extendedProperties38.putAll((java.util.Map) extendedProperties44);
        java.lang.Double double51 = extendedProperties38.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator54 = extendedProperties52.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties55 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator57 = extendedProperties55.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties55.combine(extendedProperties58);
        extendedProperties58.basePath = "hi!";
        extendedProperties52.putAll((java.util.Map) extendedProperties58);
        java.util.ArrayList arrayList63 = extendedProperties52.keysAsListed;
        extendedProperties38.keysAsListed = arrayList63;
        extendedProperties18.keysAsListed = arrayList63;
        extendedProperties11.keysAsListed = arrayList63;
        java.util.List list67 = extendedProperties1.getList("", (java.util.List) arrayList63);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 100 + "'", byte30 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNotNull(arrayList63);
        org.junit.Assert.assertNotNull(list67);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        java.lang.String str5 = extendedProperties0.getString("");
        java.util.List list7 = extendedProperties0.getList("");
        extendedProperties0.isInitialized = true;
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.putAll((java.util.Map) extendedProperties14);
        short short18 = extendedProperties14.getShort("hi!", (short) (byte) -1);
        extendedProperties14.setInclude(",");
        java.util.Iterator iterator21 = extendedProperties14.getKeys();
        int int24 = extendedProperties14.getInteger("hi!", (int) 'a');
        java.util.Vector vector26 = extendedProperties14.getVector("hi!");
        extendedProperties14.basePath = "${";
        java.util.Vector vector30 = extendedProperties14.getVector("");
        java.util.List list31 = extendedProperties0.getList("", (java.util.List) vector30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        float float19 = extendedProperties6.getFloat("", (-1.0f));
        extendedProperties6.setInclude("${");
        java.lang.String str23 = extendedProperties6.getString("/");
        // The following exception was thrown during execution in test generation
        try {
            long long25 = extendedProperties6.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        java.lang.Long long18 = extendedProperties3.getLong("hi!", (java.lang.Long) 10L);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties3.subset("/");
        java.lang.String str22 = extendedProperties3.testBoolean("}");
        java.io.OutputStream outputStream23 = null;
        extendedProperties3.save(outputStream23, "}");
        long long28 = extendedProperties3.getLong("hi!", (long) (byte) 0);
        extendedProperties3.isInitialized = false;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.putAll((java.util.Map) extendedProperties13);
        short short17 = extendedProperties13.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties13.getVector(",", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector(",", vector20);
        java.util.Iterator iterator23 = extendedProperties0.getKeys("}");
        java.lang.String str24 = extendedProperties0.fileSeparator;
        java.lang.String str25 = extendedProperties0.basePath;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", "/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.ArrayList arrayList11 = extendedProperties0.keysAsListed;
        extendedProperties0.file = "/";
        java.lang.Long long16 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = extendedProperties0.subset("${");
        byte byte21 = extendedProperties0.getByte("", (byte) 10);
        short short24 = extendedProperties0.getShort("${", (short) (byte) 1);
        float float27 = extendedProperties0.getFloat(",", (float) 35L);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(extendedProperties18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 1 + "'", short24 == (short) 1);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 35.0f + "'", float27 == 35.0f);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.Float float5 = extendedProperties0.getFloat(",", (java.lang.Float) 0.0f);
        java.lang.String str6 = extendedProperties0.getInclude();
        extendedProperties0.display();
        double double10 = extendedProperties0.getDouble(",", (double) (-1L));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties6.putAll((java.util.Map) extendedProperties7);
        short short11 = extendedProperties7.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector13 = null;
        java.util.Vector vector14 = extendedProperties7.getVector(",", vector13);
        java.lang.String str15 = extendedProperties3.interpolateHelper("", (java.util.List) vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties16.putAll((java.util.Map) extendedProperties17);
        short short21 = extendedProperties17.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator23 = extendedProperties17.getKeys("hi!");
        extendedProperties3.putAll((java.util.Map) extendedProperties17);
        extendedProperties17.setInclude(",");
        java.util.Iterator iterator27 = extendedProperties17.getKeys();
        java.lang.String[] strArray29 = extendedProperties17.getStringArray("${");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.lang.String str12 = extendedProperties6.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator19 = extendedProperties17.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties17.combine(extendedProperties20);
        extendedProperties20.basePath = "hi!";
        extendedProperties14.putAll((java.util.Map) extendedProperties20);
        java.util.ArrayList arrayList25 = extendedProperties14.keysAsListed;
        java.util.List list26 = extendedProperties6.getList("", (java.util.List) arrayList25);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = extendedProperties6.getDouble("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(arrayList25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.util.Iterator iterator8 = extendedProperties1.getKeys();
        byte byte11 = extendedProperties1.getByte("${", (byte) 10);
        boolean boolean12 = extendedProperties1.isInitialized();
        java.lang.Boolean boolean15 = extendedProperties1.getBoolean("", (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        float float19 = extendedProperties6.getFloat("", (-1.0f));
        extendedProperties6.setInclude("${");
        java.lang.String str23 = extendedProperties6.getString("/");
        java.lang.Byte byte26 = extendedProperties6.getByte(",", (java.lang.Byte) (byte) 0);
        int int29 = extendedProperties6.getInteger("}", (int) (short) 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.util.Iterator iterator14 = extendedProperties6.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.combine(extendedProperties21);
        extendedProperties21.basePath = "hi!";
        extendedProperties15.putAll((java.util.Map) extendedProperties21);
        java.lang.String str27 = extendedProperties21.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.ArrayList arrayList40 = extendedProperties29.keysAsListed;
        java.util.List list41 = extendedProperties21.getList("", (java.util.List) arrayList40);
        extendedProperties6.keysAsListed = arrayList40;
        double double45 = extendedProperties6.getDouble("}", (double) (short) 0);
        java.util.Properties properties47 = extendedProperties6.getProperties("hi!");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.lang.Long long8 = extendedProperties1.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str9 = extendedProperties1.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator13 = extendedProperties11.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator16 = extendedProperties14.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.combine(extendedProperties17);
        extendedProperties17.basePath = "hi!";
        extendedProperties11.putAll((java.util.Map) extendedProperties17);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties23.putAll((java.util.Map) extendedProperties24);
        short short28 = extendedProperties24.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector30 = null;
        java.util.Vector vector31 = extendedProperties24.getVector(",", vector30);
        java.util.Vector vector32 = extendedProperties11.getVector(",", vector31);
        java.util.Iterator iterator34 = extendedProperties11.getKeys("}");
        extendedProperties1.setProperty("/", (java.lang.Object) iterator34);
        // The following exception was thrown during execution in test generation
        try {
            short short37 = extendedProperties1.getShort(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertNotNull(vector31);
        org.junit.Assert.assertNotNull(vector32);
        org.junit.Assert.assertNotNull(iterator34);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.util.Iterator iterator14 = extendedProperties6.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator17 = extendedProperties15.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator20 = extendedProperties18.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties18.combine(extendedProperties21);
        extendedProperties21.basePath = "hi!";
        extendedProperties15.putAll((java.util.Map) extendedProperties21);
        java.lang.String str27 = extendedProperties21.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator31 = extendedProperties29.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator34 = extendedProperties32.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties32.combine(extendedProperties35);
        extendedProperties35.basePath = "hi!";
        extendedProperties29.putAll((java.util.Map) extendedProperties35);
        java.util.ArrayList arrayList40 = extendedProperties29.keysAsListed;
        java.util.List list41 = extendedProperties21.getList("", (java.util.List) arrayList40);
        extendedProperties6.keysAsListed = arrayList40;
        double double45 = extendedProperties6.getDouble("}", (double) (short) 0);
        java.lang.Boolean boolean48 = extendedProperties6.getBoolean("hi!", (java.lang.Boolean) false);
        float float51 = extendedProperties6.getFloat(",", (float) (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties53 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties52.putAll((java.util.Map) extendedProperties53);
        short short57 = extendedProperties53.getShort("hi!", (short) (byte) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator60 = extendedProperties58.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties61 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator63 = extendedProperties61.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties64 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties61.combine(extendedProperties64);
        extendedProperties64.basePath = "hi!";
        extendedProperties58.putAll((java.util.Map) extendedProperties64);
        java.util.ArrayList arrayList69 = extendedProperties58.keysAsListed;
        extendedProperties53.keysAsListed = arrayList69;
        extendedProperties6.keysAsListed = arrayList69;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(arrayList40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.0f) + "'", float51 == (-1.0f));
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) -1 + "'", short57 == (short) -1);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNotNull(arrayList69);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        boolean boolean3 = extendedProperties0.isInitialized();
        java.lang.String str4 = extendedProperties0.getInclude();
        java.lang.String str5 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/" + "'", str5, "/");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String[] strArray9 = extendedProperties1.getStringArray("");
        extendedProperties1.fileSeparator = "hi!";
        java.lang.String str13 = extendedProperties1.interpolate("${");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "${" + "'", str13, "${");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        float float19 = extendedProperties6.getFloat("", (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.putAll((java.util.Map) extendedProperties21);
        short short25 = extendedProperties21.getShort("hi!", (short) (byte) -1);
        extendedProperties21.setInclude(",");
        java.util.Iterator iterator28 = extendedProperties21.getKeys();
        byte byte31 = extendedProperties21.getByte("${", (byte) 10);
        extendedProperties21.file = "/";
        extendedProperties6.putAll((java.util.Map) extendedProperties21);
        boolean boolean35 = extendedProperties21.isInitialized;
        extendedProperties21.display();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 10 + "'", byte31 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Long long18 = extendedProperties1.getLong(",", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties1.subset("}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = extendedProperties20.getList("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(extendedProperties20);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.lang.Float float16 = extendedProperties6.getFloat("", (java.lang.Float) 10.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        short short11 = extendedProperties1.getShort("hi!", (short) (byte) 10);
        java.lang.Byte byte14 = extendedProperties1.getByte("}", (java.lang.Byte) (byte) 10);
        short short17 = extendedProperties1.getShort(",", (short) 10);
        extendedProperties1.clearProperty("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties20.putAll((java.util.Map) extendedProperties21);
        short short25 = extendedProperties21.getShort("hi!", (short) (byte) -1);
        extendedProperties21.setInclude(",");
        java.lang.String str30 = extendedProperties21.getString("hi!", "hi!");
        byte byte33 = extendedProperties21.getByte("", (byte) 100);
        java.lang.String[] strArray35 = extendedProperties21.getStringArray(",");
        extendedProperties1.combine(extendedProperties21);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 100 + "'", byte33 == (byte) 100);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        int int13 = extendedProperties6.getInt(",", (int) (short) 0);
        byte byte16 = extendedProperties6.getByte("", (byte) 0);
        java.lang.String str18 = extendedProperties6.testBoolean("");
        java.lang.Double double21 = extendedProperties6.getDouble("}", (java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector7 = null;
        java.util.Vector vector8 = extendedProperties1.getVector(",", vector7);
        java.util.Iterator iterator10 = extendedProperties1.getKeys(",");
        java.util.List list12 = extendedProperties1.getList("");
        extendedProperties1.file = ",";
        java.lang.String str15 = extendedProperties1.file;
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties1.load(inputStream16, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.String[] strArray15 = extendedProperties8.getStringArray("");
        java.util.Iterator iterator16 = extendedProperties8.getKeys();
        java.lang.Float float19 = extendedProperties8.getFloat("}", (java.lang.Float) 0.0f);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        java.lang.Integer int16 = extendedProperties6.getInteger("}", (java.lang.Integer) 100);
        java.lang.Byte byte19 = extendedProperties6.getByte(",", (java.lang.Byte) (byte) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        java.lang.String str3 = extendedProperties0.basePath;
        java.lang.String str5 = extendedProperties0.getString("");
        int int8 = extendedProperties0.getInt("hi!", (int) (byte) 100);
        short short11 = extendedProperties0.getShort("/", (short) 0);
        java.lang.String str12 = extendedProperties0.fileSeparator;
        boolean boolean15 = extendedProperties0.getBoolean("${", true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        java.lang.Short short10 = extendedProperties1.getShort("hi!", (java.lang.Short) (short) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties11.putAll((java.util.Map) extendedProperties12);
        short short16 = extendedProperties12.getShort("hi!", (short) (byte) -1);
        extendedProperties12.setInclude(",");
        java.lang.String str19 = extendedProperties12.file;
        extendedProperties1.putAll((java.util.Map) extendedProperties12);
        java.util.Iterator iterator21 = extendedProperties12.getKeys();
        java.lang.Boolean boolean24 = extendedProperties12.getBoolean("/", (java.lang.Boolean) true);
        java.lang.String str25 = extendedProperties12.basePath;
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.String[] strArray15 = extendedProperties8.getStringArray("");
        java.lang.String str18 = extendedProperties8.getString("/", "");
        java.lang.String str19 = extendedProperties8.fileSeparator;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setProperty("hi!", (java.lang.Object) (-1L));
        extendedProperties1.clearProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte byte12 = extendedProperties1.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties12.putAll((java.util.Map) extendedProperties13);
        short short17 = extendedProperties13.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector19 = null;
        java.util.Vector vector20 = extendedProperties13.getVector(",", vector19);
        java.util.Vector vector21 = extendedProperties0.getVector(",", vector20);
        java.lang.Float float24 = extendedProperties0.getFloat("/", (java.lang.Float) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertNotNull(vector20);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        extendedProperties1.setInclude(",");
        java.lang.String str10 = extendedProperties1.getString("hi!", "hi!");
        byte byte13 = extendedProperties1.getByte("", (byte) 100);
        extendedProperties1.clearProperty("");
        java.lang.Long long18 = extendedProperties1.getLong(",", (java.lang.Long) 0L);
        extendedProperties1.setInclude(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator23 = extendedProperties21.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator26 = extendedProperties24.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties24.combine(extendedProperties27);
        extendedProperties27.basePath = "hi!";
        extendedProperties21.putAll((java.util.Map) extendedProperties27);
        java.lang.Double double34 = extendedProperties21.getDouble("/", (java.lang.Double) 0.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator37 = extendedProperties35.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator40 = extendedProperties38.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties38.combine(extendedProperties41);
        extendedProperties41.basePath = "hi!";
        extendedProperties35.putAll((java.util.Map) extendedProperties41);
        java.util.ArrayList arrayList46 = extendedProperties35.keysAsListed;
        extendedProperties21.keysAsListed = arrayList46;
        extendedProperties1.keysAsListed = arrayList46;
        java.lang.Byte byte51 = extendedProperties1.getByte("}", (java.lang.Byte) (byte) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = null;
        java.lang.String str3 = extendedProperties0.interpolateHelper("", list2);
        double double6 = extendedProperties0.getDouble("}", 0.0d);
        short short9 = extendedProperties0.getShort("/", (short) (byte) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator12 = extendedProperties10.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator15 = extendedProperties13.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties13.combine(extendedProperties16);
        extendedProperties16.basePath = "hi!";
        extendedProperties10.putAll((java.util.Map) extendedProperties16);
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = extendedProperties16.getProperties("", properties22);
        java.util.Iterator iterator24 = extendedProperties16.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator27 = extendedProperties25.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator30 = extendedProperties28.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties28.combine(extendedProperties31);
        extendedProperties31.basePath = "hi!";
        extendedProperties25.putAll((java.util.Map) extendedProperties31);
        java.lang.String str37 = extendedProperties31.getString("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator41 = extendedProperties39.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties42 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator44 = extendedProperties42.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties45 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties42.combine(extendedProperties45);
        extendedProperties45.basePath = "hi!";
        extendedProperties39.putAll((java.util.Map) extendedProperties45);
        java.util.ArrayList arrayList50 = extendedProperties39.keysAsListed;
        java.util.List list51 = extendedProperties31.getList("", (java.util.List) arrayList50);
        extendedProperties16.keysAsListed = arrayList50;
        extendedProperties0.keysAsListed = arrayList50;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        boolean boolean3 = extendedProperties0.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties5.putAll((java.util.Map) extendedProperties6);
        short short10 = extendedProperties6.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties6.getVector(",", vector12);
        java.util.Vector vector14 = extendedProperties0.getVector("/", vector13);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator18 = extendedProperties16.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator21 = extendedProperties19.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties19.combine(extendedProperties22);
        extendedProperties22.basePath = "hi!";
        extendedProperties16.putAll((java.util.Map) extendedProperties22);
        int int29 = extendedProperties22.getInt(",", (int) (short) 0);
        byte byte32 = extendedProperties22.getByte("", (byte) 0);
        float float35 = extendedProperties22.getFloat("", (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator39 = extendedProperties37.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties40 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator42 = extendedProperties40.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties40.combine(extendedProperties43);
        extendedProperties43.basePath = "hi!";
        extendedProperties37.putAll((java.util.Map) extendedProperties43);
        java.util.Properties properties49 = null;
        java.util.Properties properties50 = extendedProperties43.getProperties("", properties49);
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties50);
        org.apache.commons.collections.ExtendedProperties extendedProperties52 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties50);
        java.util.Properties properties53 = extendedProperties22.getProperties("hi!", properties50);
        java.util.Properties properties54 = extendedProperties0.getProperties("", properties50);
        java.lang.String str56 = extendedProperties0.getString(",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(vector14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 0 + "'", byte32 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(extendedProperties51);
        org.junit.Assert.assertNotNull(extendedProperties52);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.putAll((java.util.Map) extendedProperties1);
        short short5 = extendedProperties1.getShort("hi!", (short) (byte) -1);
        java.util.Iterator iterator7 = extendedProperties1.getKeys("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties14.putAll((java.util.Map) extendedProperties15);
        short short19 = extendedProperties15.getShort("hi!", (short) (byte) -1);
        java.util.Vector vector21 = null;
        java.util.Vector vector22 = extendedProperties15.getVector(",", vector21);
        java.lang.String str23 = extendedProperties11.interpolateHelper("", (java.util.List) vector21);
        java.lang.Long long26 = extendedProperties11.getLong("hi!", (java.lang.Long) 10L);
        java.lang.String str28 = extendedProperties11.interpolate("hi!");
        extendedProperties1.putAll((java.util.Map) extendedProperties11);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator5 = extendedProperties3.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties3.combine(extendedProperties6);
        extendedProperties6.basePath = "hi!";
        extendedProperties0.putAll((java.util.Map) extendedProperties6);
        java.util.Properties properties12 = null;
        java.util.Properties properties13 = extendedProperties6.getProperties("", properties12);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        java.lang.Double double18 = extendedProperties15.getDouble("/", (java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertNotNull(extendedProperties15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.Object obj4 = propertiesTokenizer1.nextElement();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "/" + "'", obj4, "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator2 = extendedProperties0.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties3 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.combine(extendedProperties3);
        extendedProperties3.basePath = "hi!";
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.Iterator iterator10 = extendedProperties8.getKeys("");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties8.combine(extendedProperties11);
        extendedProperties3.setProperty("}", (java.lang.Object) extendedProperties8);
        java.lang.String[] strArray15 = extendedProperties8.getStringArray("");
        java.util.Iterator iterator16 = extendedProperties8.getKeys();
        java.util.Properties properties18 = extendedProperties8.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties18);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(extendedProperties19);
    }
}

