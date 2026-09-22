package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Class<?> wildcardClass1 = caverphone0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = caverphone0.encode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.Class<?> wildcardClass9 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.Class<?> wildcardClass14 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass11 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass11 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = caverphone0.encode((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        java.lang.Class<?> wildcardClass8 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.Class<?> wildcardClass4 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("");
        boolean boolean21 = caverphone13.isCaverphoneEqual("AA11111111", "");
        java.lang.String str23 = caverphone13.caverphone("AA11111111");
        java.lang.String str25 = caverphone13.caverphone("AA11111111");
        java.lang.Object obj26 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AA11111111" + "'", obj26, "AA11111111");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = caverphone0.encode((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean14 = caverphone11.isCaverphoneEqual("hi!", "");
        java.lang.String str16 = caverphone11.encode("hi!");
        boolean boolean19 = caverphone11.isCaverphoneEqual("AA11111111", "AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = caverphone0.encode((java.lang.Object) caverphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone31 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean34 = caverphone31.isCaverphoneEqual("hi!", "");
        java.lang.String str36 = caverphone31.caverphone("");
        boolean boolean39 = caverphone31.isCaverphoneEqual("AA11111111", "");
        java.lang.String str41 = caverphone31.caverphone("AA11111111");
        java.lang.String str43 = caverphone31.caverphone("AA11111111");
        java.lang.String str45 = caverphone31.caverphone("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = caverphone0.encode((java.lang.Object) caverphone31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean21 = caverphone18.isCaverphoneEqual("hi!", "");
        java.lang.String str23 = caverphone18.encode("hi!");
        java.lang.String str25 = caverphone18.caverphone("1111111111");
        java.lang.String str27 = caverphone18.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = caverphone0.encode((java.lang.Object) caverphone18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("hi!", "");
        java.lang.String str12 = caverphone7.encode("hi!");
        java.lang.String str14 = caverphone7.caverphone("1111111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) str14);
        java.lang.String str17 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "1111111111" + "'", obj15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.caverphone("AA11111111");
        java.lang.String str10 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean14 = caverphone11.isCaverphoneEqual("1111111111", "");
        boolean boolean17 = caverphone11.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str19 = caverphone11.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = caverphone0.encode((java.lang.Object) caverphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "1111111111" + "'", obj11, "1111111111");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.Object obj12 = caverphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = caverphone0.encode((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "1111111111" + "'", obj12, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.Class<?> wildcardClass14 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        boolean boolean14 = caverphone8.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("hi!", "");
        java.lang.String str20 = caverphone15.encode("hi!");
        java.lang.String str22 = caverphone15.caverphone("1111111111");
        java.lang.Object obj23 = caverphone8.encode((java.lang.Object) str22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = caverphone0.encode((java.lang.Object) caverphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "1111111111" + "'", obj23, "1111111111");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "AA11111111" + "'", obj15, "AA11111111");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.Object obj12 = caverphone0.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "1111111111" + "'", obj12, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        java.lang.String str19 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = caverphone0.encode((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.Class<?> wildcardClass17 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.caverphone("");
        boolean boolean17 = caverphone9.isCaverphoneEqual("AA11111111", "");
        java.lang.String str19 = caverphone9.encode("1111111111");
        boolean boolean22 = caverphone9.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str24 = caverphone9.caverphone("hi!");
        java.lang.String str26 = caverphone9.encode("1111111111");
        boolean boolean29 = caverphone9.isCaverphoneEqual("", "AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = caverphone0.encode((java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass15 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.encode("hi!");
        java.lang.Class<?> wildcardClass9 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = caverphone0.encode((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean9 = caverphone6.isCaverphoneEqual("hi!", "");
        java.lang.String str11 = caverphone6.encode("hi!");
        java.lang.String str13 = caverphone6.caverphone("1111111111");
        java.lang.String str15 = caverphone6.encode("1111111111");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "1111111111" + "'", obj16, "1111111111");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("hi!", "");
        java.lang.String str12 = caverphone7.encode("hi!");
        java.lang.String str14 = caverphone7.caverphone("1111111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) str14);
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "1111111111" + "'", obj15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        java.lang.String str9 = caverphone0.encode("1111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = caverphone0.encode((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass8 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("1111111111", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        java.lang.String str13 = caverphone8.caverphone("");
        boolean boolean16 = caverphone8.isCaverphoneEqual("AA11111111", "");
        java.lang.String str18 = caverphone8.caverphone("AA11111111");
        boolean boolean21 = caverphone8.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj22 = caverphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean26 = caverphone23.isCaverphoneEqual("hi!", "");
        java.lang.String str28 = caverphone23.caverphone("");
        boolean boolean31 = caverphone23.isCaverphoneEqual("AA11111111", "");
        java.lang.String str33 = caverphone23.caverphone("AA11111111");
        java.lang.String str35 = caverphone23.caverphone("hi!");
        java.lang.Class<?> wildcardClass36 = caverphone23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = caverphone0.encode((java.lang.Object) caverphone23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "1111111111" + "'", obj22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        java.lang.Class<?> wildcardClass8 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean23 = caverphone20.isCaverphoneEqual("hi!", "");
        java.lang.String str25 = caverphone20.encode("hi!");
        boolean boolean28 = caverphone20.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.Class<?> wildcardClass29 = caverphone20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = caverphone0.encode((java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.caverphone("AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        java.lang.String str9 = caverphone0.encode("");
        java.lang.String str11 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "");
        java.lang.Class<?> wildcardClass18 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass15 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.Class<?> wildcardClass21 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.Class<?> wildcardClass12 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("1111111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("hi!", "");
        java.lang.String str20 = caverphone15.encode("hi!");
        java.lang.String str22 = caverphone15.caverphone("");
        java.lang.Object obj23 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "1111111111" + "'", obj23, "1111111111");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        boolean boolean19 = caverphone13.isCaverphoneEqual("", "hi!");
        java.lang.String str21 = caverphone13.caverphone("");
        boolean boolean24 = caverphone13.isCaverphoneEqual("", "1111111111");
        boolean boolean27 = caverphone13.isCaverphoneEqual("", "");
        java.lang.String str29 = caverphone13.caverphone("hi!");
        java.lang.String str31 = caverphone13.caverphone("");
        java.lang.String str33 = caverphone13.caverphone("hi!");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) str33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str15 = caverphone0.caverphone("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        java.lang.String str9 = caverphone0.caverphone("hi!");
        java.lang.String str11 = caverphone0.caverphone("1111111111");
        java.lang.String str13 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        java.lang.String str23 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("hi!", "");
        java.lang.String str29 = caverphone24.encode("hi!");
        java.lang.String str31 = caverphone24.caverphone("1111111111");
        java.lang.String str33 = caverphone24.encode("1111111111");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "1111111111" + "'", obj34, "1111111111");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        java.lang.String str17 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass18 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("AA11111111");
        java.lang.String str10 = caverphone0.encode("");
        java.lang.String str12 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("hi!", "");
        java.lang.String str20 = caverphone15.caverphone("AA11111111");
        java.lang.String str22 = caverphone15.encode("");
        java.lang.Class<?> wildcardClass23 = caverphone15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = caverphone0.encode((java.lang.Object) caverphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("hi!", "");
        java.lang.String str31 = caverphone26.caverphone("AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = caverphone0.encode((java.lang.Object) caverphone26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str15 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "hi!");
        java.lang.String str24 = caverphone16.caverphone("");
        boolean boolean27 = caverphone16.isCaverphoneEqual("", "1111111111");
        java.lang.String str29 = caverphone16.encode("hi!");
        java.lang.String str31 = caverphone16.encode("");
        org.apache.commons.codec.language.Caverphone caverphone32 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean35 = caverphone32.isCaverphoneEqual("hi!", "");
        java.lang.String str37 = caverphone32.caverphone("");
        boolean boolean40 = caverphone32.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj41 = caverphone16.encode((java.lang.Object) "AA11111111");
        boolean boolean44 = caverphone16.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.Class<?> wildcardClass45 = caverphone16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = caverphone0.encode((java.lang.Object) caverphone16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1111111111" + "'", str31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "AA11111111" + "'", obj41, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("1111111111", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str24 = caverphone16.encode("AA11111111");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str5 = caverphone0.caverphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.encode("1111111111");
        boolean boolean33 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("hi!", "");
        java.lang.String str19 = caverphone14.caverphone("");
        boolean boolean22 = caverphone14.isCaverphoneEqual("AA11111111", "");
        java.lang.String str24 = caverphone14.caverphone("AA11111111");
        java.lang.String str26 = caverphone14.caverphone("AA11111111");
        java.lang.String str28 = caverphone14.caverphone("hi!");
        java.lang.String str30 = caverphone14.caverphone("1111111111");
        java.lang.Object obj31 = caverphone0.encode((java.lang.Object) str30);
        boolean boolean34 = caverphone0.isCaverphoneEqual("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "1111111111" + "'", obj31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1111111111", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass16 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("1111111111", "");
        boolean boolean32 = caverphone26.isCaverphoneEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = caverphone0.encode((java.lang.Object) caverphone26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("1111111111", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = caverphone0.encode((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        java.lang.String str13 = caverphone8.caverphone("");
        boolean boolean16 = caverphone8.isCaverphoneEqual("AA11111111", "");
        java.lang.String str18 = caverphone8.caverphone("AA11111111");
        java.lang.String str20 = caverphone8.caverphone("AA11111111");
        java.lang.String str22 = caverphone8.caverphone("AA11111111");
        boolean boolean25 = caverphone8.isCaverphoneEqual("", "1111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = caverphone0.encode((java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass15 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("");
        java.lang.String str9 = caverphone0.encode("hi!");
        java.lang.String str11 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = caverphone0.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        java.lang.String str13 = caverphone8.caverphone("");
        boolean boolean16 = caverphone8.isCaverphoneEqual("AA11111111", "");
        java.lang.String str18 = caverphone8.caverphone("AA11111111");
        boolean boolean21 = caverphone8.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj22 = caverphone0.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass23 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "1111111111" + "'", obj22, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        java.lang.String str9 = caverphone0.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = caverphone0.encode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "");
        java.lang.Class<?> wildcardClass14 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str16 = caverphone0.caverphone("hi!");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        boolean boolean23 = caverphone0.isCaverphoneEqual("", "");
        java.lang.Class<?> wildcardClass24 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("hi!", "");
        java.lang.String str13 = caverphone8.caverphone("");
        boolean boolean16 = caverphone8.isCaverphoneEqual("AA11111111", "");
        java.lang.String str18 = caverphone8.caverphone("AA11111111");
        boolean boolean21 = caverphone8.isCaverphoneEqual("", "1111111111");
        java.lang.Object obj22 = caverphone0.encode((java.lang.Object) "");
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = caverphone0.encode(obj23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "1111111111" + "'", obj22, "1111111111");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass6 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        java.lang.String str10 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean16 = caverphone13.isCaverphoneEqual("hi!", "");
        java.lang.String str18 = caverphone13.caverphone("");
        boolean boolean21 = caverphone13.isCaverphoneEqual("AA11111111", "");
        java.lang.String str23 = caverphone13.caverphone("AA11111111");
        boolean boolean26 = caverphone13.isCaverphoneEqual("", "1111111111");
        java.lang.String str28 = caverphone13.caverphone("AA11111111");
        boolean boolean31 = caverphone13.isCaverphoneEqual("", "1111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = caverphone0.encode((java.lang.Object) caverphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("hi!");
        java.lang.Class<?> wildcardClass3 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA11111111" + "'", str2, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str19 = caverphone0.caverphone("");
        java.lang.Class<?> wildcardClass20 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.encode("");
        java.lang.Class<?> wildcardClass22 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean28 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str30 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("");
        java.lang.String str10 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean14 = caverphone11.isCaverphoneEqual("hi!", "");
        java.lang.String str16 = caverphone11.caverphone("AA11111111");
        java.lang.String str18 = caverphone11.caverphone("");
        java.lang.String str20 = caverphone11.encode("hi!");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) str20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AA11111111" + "'", obj21, "AA11111111");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("AA11111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean21 = caverphone18.isCaverphoneEqual("hi!", "");
        boolean boolean24 = caverphone18.isCaverphoneEqual("", "hi!");
        java.lang.String str26 = caverphone18.caverphone("");
        boolean boolean29 = caverphone18.isCaverphoneEqual("", "1111111111");
        boolean boolean32 = caverphone18.isCaverphoneEqual("", "");
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str35 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass36 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "1111111111" + "'", obj33, "1111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str16 = caverphone0.caverphone("hi!");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        java.lang.String str22 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("1111111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        java.lang.String str7 = caverphone0.encode("");
        java.lang.String str9 = caverphone0.caverphone("1111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = caverphone0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("hi!", "");
        java.lang.String str24 = caverphone19.caverphone("");
        boolean boolean27 = caverphone19.isCaverphoneEqual("AA11111111", "");
        java.lang.String str29 = caverphone19.caverphone("AA11111111");
        java.lang.String str31 = caverphone19.caverphone("AA11111111");
        java.lang.String str33 = caverphone19.caverphone("hi!");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.String str36 = caverphone0.encode("AA11111111");
        boolean boolean39 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("hi!", "");
        java.lang.String str14 = caverphone9.encode("hi!");
        java.lang.String str16 = caverphone9.caverphone("1111111111");
        java.lang.String str18 = caverphone9.encode("1111111111");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str21 = caverphone0.caverphone("1111111111");
        boolean boolean24 = caverphone0.isCaverphoneEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj18 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "1111111111" + "'", obj18, "1111111111");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        java.lang.String str9 = caverphone0.encode("");
        java.lang.String str11 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass12 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("1111111111");
        java.lang.String str9 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean13 = caverphone10.isCaverphoneEqual("hi!", "");
        boolean boolean16 = caverphone10.isCaverphoneEqual("", "hi!");
        java.lang.String str18 = caverphone10.caverphone("");
        boolean boolean21 = caverphone10.isCaverphoneEqual("", "1111111111");
        java.lang.String str23 = caverphone10.encode("hi!");
        java.lang.String str25 = caverphone10.encode("1111111111");
        java.lang.Class<?> wildcardClass26 = caverphone10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = caverphone0.encode((java.lang.Object) caverphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean13 = caverphone10.isCaverphoneEqual("1111111111", "");
        boolean boolean16 = caverphone10.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str18 = caverphone10.caverphone("AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = caverphone0.encode((java.lang.Object) caverphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.Class<?> wildcardClass14 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.caverphone("AA11111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("hi!", "");
        java.lang.String str24 = caverphone19.caverphone("");
        boolean boolean27 = caverphone19.isCaverphoneEqual("AA11111111", "");
        java.lang.String str29 = caverphone19.caverphone("AA11111111");
        java.lang.String str31 = caverphone19.caverphone("AA11111111");
        java.lang.String str33 = caverphone19.caverphone("hi!");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) "hi!");
        boolean boolean37 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "AA11111111" + "'", obj34, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str19 = caverphone0.caverphone("");
        boolean boolean22 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str24 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str19 = caverphone0.caverphone("");
        java.lang.String str21 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Class<?> wildcardClass14 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean13 = caverphone10.isCaverphoneEqual("1111111111", "");
        boolean boolean16 = caverphone10.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str18 = caverphone10.encode("");
        java.lang.Class<?> wildcardClass19 = caverphone10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = caverphone0.encode((java.lang.Object) caverphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str8 = caverphone0.encode("");
        java.lang.String str10 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.encode("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = caverphone0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        java.lang.String str10 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str5 = caverphone0.caverphone("");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str10 = caverphone0.encode("1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        java.lang.String str17 = caverphone0.encode("1111111111");
        java.lang.String str19 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean10 = caverphone7.isCaverphoneEqual("hi!", "");
        java.lang.String str12 = caverphone7.encode("hi!");
        java.lang.String str14 = caverphone7.caverphone("1111111111");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) str14);
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean26 = caverphone23.isCaverphoneEqual("hi!", "");
        java.lang.String str28 = caverphone23.encode("hi!");
        java.lang.String str30 = caverphone23.caverphone("1111111111");
        java.lang.Object obj31 = caverphone16.encode((java.lang.Object) str30);
        boolean boolean34 = caverphone16.isCaverphoneEqual("1111111111", "1111111111");
        java.lang.String str36 = caverphone16.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = caverphone0.encode((java.lang.Object) caverphone16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "1111111111" + "'", obj15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "1111111111" + "'", obj31, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str8 = caverphone0.caverphone("");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str13 = caverphone0.encode("hi!");
        java.lang.String str15 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!", "");
        java.lang.String str21 = caverphone16.caverphone("");
        boolean boolean24 = caverphone16.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str27 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone28 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean31 = caverphone28.isCaverphoneEqual("hi!", "");
        java.lang.String str33 = caverphone28.caverphone("AA11111111");
        boolean boolean36 = caverphone28.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone37 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean40 = caverphone37.isCaverphoneEqual("hi!", "");
        java.lang.String str42 = caverphone37.encode("hi!");
        java.lang.String str44 = caverphone37.caverphone("1111111111");
        java.lang.String str46 = caverphone37.encode("1111111111");
        java.lang.Object obj47 = caverphone28.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone48 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean51 = caverphone48.isCaverphoneEqual("hi!", "");
        java.lang.String str53 = caverphone48.caverphone("");
        boolean boolean56 = caverphone48.isCaverphoneEqual("AA11111111", "");
        java.lang.String str58 = caverphone48.encode("1111111111");
        java.lang.Object obj59 = caverphone28.encode((java.lang.Object) str58);
        boolean boolean62 = caverphone28.isCaverphoneEqual("", "1111111111");
        java.lang.Class<?> wildcardClass63 = caverphone28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = caverphone0.encode((java.lang.Object) wildcardClass63);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AA11111111" + "'", obj25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AA11111111" + "'", str42, "AA11111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "1111111111" + "'", obj47, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1111111111" + "'", str58, "1111111111");
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "1111111111" + "'", obj59, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }
}

